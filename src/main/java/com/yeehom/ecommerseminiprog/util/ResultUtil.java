/**
 * 
 */
package com.yeehom.ecommerseminiprog.util;

import com.yeehom.ecommerseminiprog.entity.Result;
import com.yeehom.ecommerseminiprog.enums.ResultEnum;

/**
 * @author Yeehom Foo
 *
 */
public class ResultUtil {

	public static Result success(Object object) {
		Result result = new Result();
		result.setStatus("ok");
		result.setMessage("success");
		result.setData(object);
		
		return result;
	}
	
	public static Result success() {
		return success(null);
	}
	
	public static Result failure(String status, String message) {
		Result result = new Result();
		result.setStatus(status);
		result.setMessage(message);
		
		return result;
	}
	
	public static Result failure(ResultEnum resultEnum) {
		return failure(resultEnum.getStatus(), resultEnum.getMessage());
	}
}
