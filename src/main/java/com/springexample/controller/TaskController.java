package com.springexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface TaskController {

	@RequestMapping(value = "create" ,method = RequestMethod.GET)
	String createForm();

}
