/**
 * 
 */
package com.yeehom.ecommerseminiprog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author YeeHomFoo
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping(value = {"/{say}", "/say"}, method = RequestMethod.GET)
	public String getId(@PathVariable("say") String say) {
		System.out.println("Say:" + say);
		return "index";
	}
	
	@GetMapping(value = "/param")
	public String getIdByParam(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
		System.out.println("Id:" + id);
		return "index";
	}
}
