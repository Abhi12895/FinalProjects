package com.tcs.mvcjsp;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
   
	@GetMapping
	public String login(Model map) {
		
		ArrayList<String> products=new ArrayList<>();
		products.add("television");
		products.add("Laptop");
		products.add("Smartphone");
		products.add("SmartWatch");
		products.add("television2");
		products.add("television3");
		
		map.addAttribute("catalog",products);
		return "success";
	}
}
