package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	
	@RequestMapping("/index/{number}")
	public String index(@PathVariable int number) {
		System.out.println(20/number);
		return "successfully";
	}
}
