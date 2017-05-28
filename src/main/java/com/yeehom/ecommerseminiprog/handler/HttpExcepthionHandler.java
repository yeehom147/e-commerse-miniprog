package com.yeehom.ecommerseminiprog.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeehom.ecommerseminiprog.entity.Result;
import com.yeehom.ecommerseminiprog.util.ResultUtil;

/**
 * @author Yeehom Foo
 * HTTP 异常捕获
 */
@ControllerAdvice
public class HttpExcepthionHandler {

	private static final Logger logger = LoggerFactory.getLogger(HttpExcepthionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result<Object> handle(Exception e) {
		logger.error("【Http请求处理异常】{}", e);
		return ResultUtil.failure("exception", e.getMessage());
	}
}
