package com.fashiongo.cms.param;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GroupManagerListParam {
	private Integer page;
	private Integer pageSize;
	private String groupName;
	private boolean active;
}
