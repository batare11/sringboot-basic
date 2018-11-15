package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController2 {

	@RequestMapping("/showUser")//java.lang.NullPointerException
	public String thymeleaf(Exception e){
		String str = null;
		str.substring(2);
		return "index";
	}
	@RequestMapping("/showUser2")//java.lang.ArithmeticException
	public  String thymeleaf2(Exception e){
		int a = 100/0;
		return "index";
	}
}
