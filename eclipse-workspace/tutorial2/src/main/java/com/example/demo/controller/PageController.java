package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/hello")
	public String index ()
	{
		return "hello";
	}
	
	@RequestMapping("/perkalian")
	public int perkalian() {
		int a, b;
		a = 0;
		b = 0;
		return a*b;
		
	}
}
