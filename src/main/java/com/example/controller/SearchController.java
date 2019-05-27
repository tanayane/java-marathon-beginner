package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.UserRepository;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private UserRepository repository;

	@RequestMapping("")
	public String index() {
		return "userinfosearch";
	}

	@RequestMapping("/receive")
	public String receive(Integer id, Model model) {
		model.addAttribute("user", repository.load(id));
		return "userinfoview";
	}
}
