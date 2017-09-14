package com.fashiongo.cms.config;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Converter(autoApply = true)
public class DateEntityConverter implements AttributeConverter <Date, Date>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Date convertToDatabaseColumn(Date attribute) {
		return attribute;
	}

	@Override
	public Date convertToEntityAttribute(Date dbData) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		logger.info("============================================================================");
		logger.info(dbData == null ? "null" : "not null");
		if(dbData != null) {
			logger.info(sdf.format(dbData));
		}
		logger.info("============================================================================");
		return dbData;
	}

}
	
