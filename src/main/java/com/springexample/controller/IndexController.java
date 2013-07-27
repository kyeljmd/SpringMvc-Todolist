package com.springexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public interface IndexController {
	
	@RequestMapping(method = RequestMethod.GET) 
	String index();
	
}
