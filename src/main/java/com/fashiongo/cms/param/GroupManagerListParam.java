package com.fashiongo.cms.param;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GroupManagerListParam {
	private Integer page = 1;
	private Integer pageSize = 10;
	private String groupName;
	private Boolean active;
}
