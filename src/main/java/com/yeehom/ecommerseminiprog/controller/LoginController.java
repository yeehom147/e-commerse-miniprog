/**
 * 
 */
package com.yeehom.ecommerseminiprog.controller;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeehom.ecommerseminiprog.entity.Result;
import com.yeehom.ecommerseminiprog.enums.ResultEnum;
import com.yeehom.ecommerseminiprog.pojo.User;
import com.yeehom.ecommerseminiprog.util.ResultUtil;

/**
 * @author YeeHomFoo
 *
 */
@RestController()
public class LoginController {
	
//	@Autowired
//	ILoginService loginService;
//	
//	@GetMapping(value="/user/{id}")
//	public User queryUserById(@PathParam("id") Integer id) {
//		return loginService.queryUserByName(id.toString());
//	}
//
//	@GetMapping(value = "/user/{userName}")
//	public User queryUserByName(@PathParam("userName") String userName)
//	{
//		return loginService.queryUserByName(userName);
//	}
//	
//	@PostMapping(value = "/user")
//	public Result<User> addUser(@Valid User user, BindingResult bindingResult)
//	{
//		if (bindingResult.hasErrors()) {
//			String errorMsg = bindingResult.getFieldError().getDefaultMessage();
//			System.out.println(errorMsg);
//			return ResultUtil.failure(ResultEnum.INVALID_PARAM.setMessage(errorMsg));
//		}
//		
//		user.setId(user.getId());
//		user.setUserName(user.getUserName());
//		
//		return ResultUtil.success(user);
//	}
}
