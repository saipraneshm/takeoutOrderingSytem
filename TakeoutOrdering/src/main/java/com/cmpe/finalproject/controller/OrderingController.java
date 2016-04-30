package com.cmpe.finalproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class OrderingController {
	
	
	//Rendering the home page of the application.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String startApp( Model model) 
	{
		System.out.println("Started Final Project");
		return "index";
	} 
	
	
	
}
