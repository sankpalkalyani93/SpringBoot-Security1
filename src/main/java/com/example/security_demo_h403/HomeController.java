package com.example.security_demo_h403;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/public")
	public String publicpage(Model model) {
		model.addAttribute("message", "Welcome to The Public page.");
		return "public";
	}
	
	@GetMapping("/secure")
	public String securepage(Model model) {
		model.addAttribute("message", "Welcome to The Secure page.");
		return "secure";
	}
	
	@GetMapping("/login")
	public String loginpage() {
		return "login";
	}
}
