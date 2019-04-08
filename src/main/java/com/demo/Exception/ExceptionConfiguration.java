package com.demo.Exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.demo.domain.ApiResult;

@ControllerAdvice(annotations = Controller.class)
@ResponseBody
public class ExceptionConfiguration {
	
	@ExceptionHandler
	@ResponseStatus
	public ApiResult RuntimeException(Exception e) {
		return ApiResultGenerator.errorResult(e.getMessage(), e);
	}
}
