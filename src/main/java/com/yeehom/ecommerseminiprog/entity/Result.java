package com.yeehom.ecommerseminiprog.entity;

/**
 * @author Yeehom Foo
 * http请求返回的最外层对象
 */
public class Result<T> {

	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 提示信息
	 */
	private String message;
	
	/**
	 * 具体数据
	 */
	private T data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", message=" + message + ", data=" + data + "]";
	}

}
