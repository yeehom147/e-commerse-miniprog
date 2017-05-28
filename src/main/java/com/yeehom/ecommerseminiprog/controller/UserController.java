/**
 * 
 */
package com.yeehom.ecommerseminiprog.controller;

import com.yeehom.ecommerseminiprog.entity.Result;
import com.yeehom.ecommerseminiprog.pojo.User;
import com.yeehom.ecommerseminiprog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yeehom Foo
 *
 */
@RestController
public class UserController {

	@Autowired
	IUserService userService;
	
	/*@GetMapping(value = "/users")
	public Result<User> queryUserList() {
		return ResultUtil.success(userService.queryUserList());
	}*/

	@PostMapping(value = "/users")
	public Result<Boolean> userLogin(User user){
		return userService.Login(user);
	}

}
