package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

	@RequestMapping("/show")//java.lang.NullPointerException
	@ExceptionHandler(value=java.lang.NullPointerException.class)
	public ModelAndView thymeleaf(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",e.toString());
		mv.setViewName("error2");
		return mv;
	}
	@RequestMapping("/show2")//java.lang.ArithmeticException
	@ExceptionHandler(value=java.lang.ArithmeticException.class)
	public  ModelAndView thymeleaf2(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",e.toString());
		mv.setViewName("error1");
		return mv;
	}
}
