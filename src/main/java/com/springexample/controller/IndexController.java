package com.springexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public interface IndexController {
	
	@RequestMapping(method = RequestMethod.GET) 
	ModelAndView index();
	
	
}
