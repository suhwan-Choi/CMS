package com.fashiongo.cms.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fashiongo.cms.model.CMSAdminUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTTokenUtil {
	private static final String CLAIM_KEY_USER_ID 		= "userId";
	private static final String CLAIM_KEY_USER_NAME 	= "userName";
	private static final String CLAIM_KEY_USER_ACCOUNT 	= "userAccount";
	private static final String CLAIM_KEY_GROUP_ID 		= "groupId";
	private static final String CLAIM_KEY_GROUP_NAME 	= "groupName";
	private static final String CLAIM_KEY_ROLE_ID		= "roleId";
	private static final String CLAIM_KEY_CREATED 		= "created";
	private static final String CLAIM_KEY_SESSION_ID	= "sessionId";
	
	@Value("${cms.jwt.expiration.value}")
	private long expiration;
	
	@Value("${cms.jwt.secret.value}")
	private String secret;
	
	@Value("${cms.jwt.refresh-minute.value}")
	private Integer refreshMinute;

	public JWTTokenUtil() {
		super();
	}

	/**
	 * Extracts the username from the token.
	 * 
	 * @param token
	 *            to be analised.
	 * @return the username or null if not found.
	 */
	public String getUsernameFromToken(String token) throws Exception {
		String username;
		try {
			final Claims claims = getClaimsFromToken(token);
			username = claims.getSubject();
		} catch (Exception e) {
			username = null;
		}
		return username;
	}

	/**
	 * Extracts the generated date from the token.
	 * 
	 * @param token
	 *            to be analised.
	 * @return the generated date or null if not found.
	 */
	public Date getCreatedDateFromToken(String token) throws Exception {
		Date created;
		try {
			final Claims claims = getClaimsFromToken(token);
			created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
		} catch (Exception e) {
			created = null;
		}
		return created;
	}

	/**
	 * Extracts the expiration date from the token.
	 * 
	 * @param token
	 *            to be analised.
	 * @return the expiration date or null if not found.
	 */
	public Date getExpirationDateFromToken(String token) throws Exception {
		Date expirationDate;
		try {
			final Claims claims = getClaimsFromToken(token);
			expirationDate = claims.getExpiration();
		} catch (Exception e) {
			expirationDate = null;
		}
		return expirationDate;
	}
	
	/**
	 * Get token refresh date.
	 * 
	 * @param expirationDate
	 *            to be expired date.
	 * @return the refresh date.
	 */
	private Date getBaseRefreshDate(String token) throws Exception {
		Date expirationDate = getExpirationDateFromToken(token);
	
		Calendar cal = Calendar.getInstance();
		cal.setTime(expirationDate);
		cal.add(Calendar.MINUTE, refreshMinute);
		return cal.getTime();
	}

	/**
	 * Extracks the claims from token.
	 * 
	 * @param token
	 *            to be analised.
	 * @return the username or null if not found.
	 */
	private Claims getClaimsFromToken(String token) throws Exception {
		Claims claims;
		try {
			claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			claims = null;
		}
		return claims;
	}

	/**
	 * Generates an expiration date since the current expiration amount.
	 * 
	 * @return the date to be expired.
	 */
	private Date generateExpirationDate() {
		return new Date(System.currentTimeMillis() + expiration * 1000);
	}

	/**
	 * Checks if the token has expired.
	 * 
	 * @param token
	 *            to be analised.
	 * @return the check result.
	 */
	private Boolean isTokenExpired(String token) throws Exception {
		final Date expirationDate = getExpirationDateFromToken(token);
		return expirationDate.before(new Date());
	}
	
	/**
	 * Checks if the token was created before the last pass reset time.
	 * 
	 * @param created
	 *            time.
	 * @param lastPasswordReset
	 *            time.
	 * @return true if it was created before the last pass reset time.
	 */
	private Boolean isCreatedBeforeLastPasswordReset(Date lastPasswordReset) throws Exception {
		return lastPasswordReset.before(new Date());
	}

	/**
	 * Generate a new token.
	 * 
	 * @param adminUser
	 *            of the user to generate the token.
	 * @return the generated token.
	 */
	public String generateToken(CMSAdminUser adminUser) throws Exception {
		Map<String, Object> claims = new HashMap<String, Object>();
		claims.put(CLAIM_KEY_USER_NAME, adminUser.getUserName());
		claims.put(CLAIM_KEY_USER_ID, adminUser.getUserId());
		claims.put(CLAIM_KEY_USER_ACCOUNT, adminUser.getUserAccount());
		claims.put(CLAIM_KEY_GROUP_ID, adminUser.getGroupId());
		claims.put(CLAIM_KEY_GROUP_NAME, adminUser.getGroupName());
		claims.put(CLAIM_KEY_ROLE_ID, adminUser.getRoleId());
		claims.put(CLAIM_KEY_SESSION_ID, adminUser.getSessionId());
		claims.put(CLAIM_KEY_CREATED, new Date());

		return generateToken(claims);
	}

	/**
	 * Generate a new token.
	 * 
	 * @param claims
	 *            to be used for creation.
	 * @return the new token.
	 */
	private String generateToken(Map<String, Object> claims) throws Exception {
		return Jwts.builder().setClaims(claims).setExpiration(generateExpirationDate())
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}

	/**
	 * Checks if a token ca be refreshed.
	 * 
	 * @param token
	 *            to be analised.
	 * @param lastPasswordReset
	 *            date.
	 * @return the result of the check.
	 */
	public Boolean canTokenBeRefreshed(String token) throws Exception {
		final Date lastPasswordReset = getBaseRefreshDate(token);
		return isCreatedBeforeLastPasswordReset(lastPasswordReset) && !isTokenExpired(token);
	}

	/**
	 * Refreshes the token returning a new one.
	 * 
	 * @param token
	 *            to be analised
	 * @return the new token.
	 */
	public String refreshToken(String token) throws Exception {
		String refreshedToken;
		try {
			final Claims claims = getClaimsFromToken(token);
			claims.put(CLAIM_KEY_CREATED, new Date());
			refreshedToken = generateToken(claims);
		} catch (Exception e) {
			refreshedToken = null;
		}
		return refreshedToken;
	}

	/**
	 * Checks if the token is valid.
	 * 
	 * @param token
	 *            to be analised.
	 * @return the truth of validation.
	 */
	public Boolean validateToken(String token) throws Exception {
		return !isTokenExpired(token);
	}
	
	/**
	 * Extracts the CMSAdminUser from the token.
	 * 
	 * @param token
	 *            to be analised.
	 * @return the result of CMSAdminUser.
	 */
	public CMSAdminUser getAdminUserFromToken(String token) throws Exception {
		CMSAdminUser adminUser = new CMSAdminUser();
		
		Claims claims = getClaimsFromToken(token);
		adminUser.setUserId((Integer)claims.get(CLAIM_KEY_USER_ID));
		adminUser.setUserName((String)claims.get(CLAIM_KEY_USER_NAME));
		adminUser.setGroupId((Integer)claims.get(CLAIM_KEY_GROUP_ID));
		adminUser.setGroupName((String)claims.get(CLAIM_KEY_GROUP_NAME));
		adminUser.setUserAccount((String)claims.get(CLAIM_KEY_USER_ACCOUNT));
		adminUser.setRoleId((Integer)claims.get(CLAIM_KEY_ROLE_ID));
		adminUser.setSessionId((String)claims.get(CLAIM_KEY_SESSION_ID));
		
		return adminUser;
	}
}
