package com.springexample.controller.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springexample.controller.IndexController;

@Controller
public class IndexControllerImpl implements IndexController {
	
	@Autowired
	public SessionFactory sessionFactory;
	public String index() {
		
		return "index";
	}

}
