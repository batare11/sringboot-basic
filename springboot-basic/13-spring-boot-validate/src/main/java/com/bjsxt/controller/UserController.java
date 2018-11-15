package com.bjsxt.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.User;

@Controller
public class UserController {

	/*@RequestMapping("/addUser")
	public String thymeleaf(Model model,User user){
		return "addUser";
	}
	@RequestMapping("/save")
	public String saveUser(@Valid User user,BindingResult result){
		if (result.hasErrors()) {
			return "addUser";
		}
		System.out.println(user.toString());
		return "ok";
	}
	*/
	@RequestMapping("/addUser")
	public String thymeleaf(Model model,@ModelAttribute("aa")User user){
		return "addUser";
	}
	@RequestMapping("/save")
	public String saveUser(@ModelAttribute("aa")@Valid User user,BindingResult result){
		if (result.hasErrors()) {
			return "addUser";
		}
		System.out.println(user.toString());
		return "ok";
	}
}
