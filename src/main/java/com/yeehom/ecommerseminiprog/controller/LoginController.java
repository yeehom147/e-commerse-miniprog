/**
 * 
 */
package com.yeehom.ecommerseminiprog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeehom.ecommerseminiprog.pojo.UserPojo;
import com.yeehom.ecommerseminiprog.service.ILoginService;
import com.yeehom.ecommerseminiprog.service.LoginServiceImpl;

/**
 * @author YeeHomFoo
 *
 */
@RestController
public class LoginController {
	
	@Autowired
	ILoginService loginService;
	
	@RequestMapping("/usrs")
	public String queryUserByName()
	{
		UserPojo user = loginService.queryUserByName("test");
		return user == null? "null" : user.toString();
	}
}
