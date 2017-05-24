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
		return "hello world";
	}
}
