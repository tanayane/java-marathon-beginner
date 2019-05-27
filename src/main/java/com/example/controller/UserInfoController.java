package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	
	@RequestMapping("/receive")
	public String receive(String name,Integer age,String address,Model model) {
		User user=new User();
		user.setName(name);
		user.setAge(age);
		user.setAddress(address);
		model.addAttribute("user",user);
		return "outputuserinfo";
	}
}
