/**
 * 
 */
package com.yeehom.ecommerseminiprog.controller;

import com.yeehom.ecommerseminiprog.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yeehom.ecommerseminiprog.pojo.User;
import com.yeehom.ecommerseminiprog.service.ILoginService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author YeeHomFoo
 *
 */
@RestController()
public class LoginController {
	
	@Autowired
	ILoginService loginService;

	@RequestMapping(value = "/user",method=POST)
	public String queryUserByName(@RequestParam(value = "userName") String userName)
	{
		User user = loginService.queryUserByName(userName);

		return JsonUtil.Serialize(user);
	}
}
