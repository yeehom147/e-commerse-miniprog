package com.yeehom.ecommerseminiprog.enums;

/**
 * @author Yeehom Foo
 * 返回结果枚举
 */
public enum ResultEnum {
	UNKNOW_ERROR("unknow", "unknow error"),
	SUCCESS("success", "success"),
	FAILURE("failure", "failure"),
	INVALID_PARAM("invalid param", "invalid param error"),
	;

	private String status;
	
	private String message;

	private ResultEnum(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public ResultEnum setStatus(String status) {
		this.status = status;
		
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResultEnum setMessage(String message) {
		this.message = message;
		
		return this;
	}

	
}
