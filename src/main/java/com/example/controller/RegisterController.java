package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "buygoods";
	}

	@RequestMapping("/receive")
	public String receive(Integer goods1, Integer goods2, Integer goods3) {
		Integer total=goods1+goods2+goods3;
		application.setAttribute("totalExcludingTax",total);
		application.setAttribute("totalIncludingTax",total*1.08);
		return "totalprice";

	}
}
