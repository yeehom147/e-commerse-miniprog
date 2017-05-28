/**
 * 
 */
package com.yeehom.ecommerseminiprog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeehom.ecommerseminiprog.entity.Result;
import com.yeehom.ecommerseminiprog.pojo.User;
import com.yeehom.ecommerseminiprog.service.IUserService;
import com.yeehom.ecommerseminiprog.util.ResultUtil;

/**
 * @author Yeehom Foo
 *
 */
@RestController
public class UserController {

	@Autowired
	IUserService userService;
	
	@GetMapping(value = "/users")
	public Result<User> queryUserList() {
		return ResultUtil.success(userService.queryUserList());
	}
}
