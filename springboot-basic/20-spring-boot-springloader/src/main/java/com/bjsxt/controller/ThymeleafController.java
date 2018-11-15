package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/show")
	public String thymeleaf(Model model){
		System.out.println("this....hello");
		return "thymeleaf";
	}
	
}
