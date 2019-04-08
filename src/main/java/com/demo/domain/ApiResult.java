package com.demo.domain;

import lombok.Data;

@Data
public class ApiResult {

	private ApiResult() {}
	public static ApiResult newInstance() {
		return new ApiResult();
	}
	private String msg;
	private boolean flag = true;
	private Object result;
	private int rows;
	private String jumpUrl;
	private long time;
}
