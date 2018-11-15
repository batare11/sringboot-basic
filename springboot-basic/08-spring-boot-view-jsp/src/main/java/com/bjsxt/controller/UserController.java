package com.bjsxt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjsxt.pojo.User;

@Controller
public class UserController {
   
	@RequestMapping("/showUser")
	public String showUser(Model model){
		
		List<User> userList = new ArrayList<>();
		userList.add(new User(1, "张三", 20));
		userList.add(new User(2, "李四", 18));
		userList.add(new User(3, "王五", 22));
		
		model.addAttribute("list",userList);
		
		return "userList";
	}
	
}
