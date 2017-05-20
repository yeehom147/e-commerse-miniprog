/**
 * 
 */
package com.yeehom.ecommerseminiprog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YeeHomFoo
 *
 */
@RestController
public class IndexController {
	@RequestMapping("/")
	public String index() {
		String test;
		test = "1";
		System.out.println(test);
		Integer i = null;
		return "hello, there";
	}
}
