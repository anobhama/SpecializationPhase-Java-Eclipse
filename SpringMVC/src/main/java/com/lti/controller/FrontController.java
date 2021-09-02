package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	@RequestMapping("/hello")
	public String show()
	{
		//String msg="My 1st MVC demo";
		//return msg;
		
		return "hello";
	}

}
