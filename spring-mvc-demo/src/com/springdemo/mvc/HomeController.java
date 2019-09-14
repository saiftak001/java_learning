package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showMapping")
	public String helloPage() {
		return "helloworld-form";
	}
	
	//@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//@RequestMapping("/processForm")
	public String makeItAllCaps(HttpServletRequest request, Model model) {
		
		String theName= request.getParameter("studentName");
		
		theName= theName.toUpperCase();
		
		String result="Hey "+theName;
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processForm")
	public String checkRequestParam(@RequestParam("studentName") String theName, Model model) {
		
		String result= "Hello my friend "+theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
