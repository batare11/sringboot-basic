package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/show")
	public String thymeleaf(Model model){
		String str = null;
		str.substring(0);
		return "thymeleaf";
	}
	@RequestMapping("/show2")
	public String thymeleaf2(Model model){
		int a = 10/0;
		return "thymeleaf";
	}
}
