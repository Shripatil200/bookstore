package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/about")
	public String aboutPage() {
	    return "about";
	}

	@RequestMapping("/services")
	public String servicesPage() {
	    return "services";
	}
	
}
