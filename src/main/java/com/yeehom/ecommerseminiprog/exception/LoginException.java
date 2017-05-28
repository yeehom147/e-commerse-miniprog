package com.yeehom.ecommerseminiprog.exception;

/**
 * @author Yeehom Foo
 * 登陆异常（Spring框架对RuntimeException进行事务回滚而不是Exception）
 */
public class LoginException extends RuntimeException{
	
	private Integer code;

	public LoginException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	
}
