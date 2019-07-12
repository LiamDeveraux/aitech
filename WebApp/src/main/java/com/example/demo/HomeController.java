package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//	@RequestMapping("home")
//	public Home home(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return new Home(name);
//	}
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping("login")
	public String login(@RequestParam("username") String name, @RequestParam("password") String password, Model model) {
		model.addAttribute("username", name);
		model.addAttribute("password",password);
		return "login.jsp";
	}
}
