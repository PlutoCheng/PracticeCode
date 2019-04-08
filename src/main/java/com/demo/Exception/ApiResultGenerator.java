package com.demo.Exception;

import java.util.List;

import com.demo.domain.ApiResult;

public final class ApiResultGenerator {

	public static ApiResult result(boolean flag,String msg,Object result,String jumpUrl,int rows,Throwable throwable) {
		
		ApiResult apiResult = ApiResult.newInstance();
		apiResult.setFlag(flag);
		apiResult.setJumpUrl(jumpUrl);
		apiResult.setMsg(msg);
		apiResult.setResult(result);
		apiResult.setRows(rows);
		apiResult.setTime(System.currentTimeMillis());
		return apiResult;
		
	}
	
	public static ApiResult successResult(Object result) {
		
		int rows = 0;
		if(result instanceof List) {
			rows = ((List)result).size();
		}
		return result(true,"",result,"",rows,null);	
	}
	public static ApiResult errorResult(String msg,Throwable throwable) {
		
		return result(false,msg,"","",0,throwable);	
	}
}
