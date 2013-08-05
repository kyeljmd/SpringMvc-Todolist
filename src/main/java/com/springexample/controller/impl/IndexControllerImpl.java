package com.springexample.controller.impl;

import org.springframework.stereotype.Controller;

import com.springexample.controller.IndexController;


@Controller
public class IndexControllerImpl implements IndexController {
	
	public String index() {	
		return "index";
	}
	
}
