package com.springexample.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springexample.controller.TaskController;

@Controller
@RequestMapping("/tasks/")
public class TaskControllerImpl implements TaskController {

	public String createForm() {
		return "tasks/taskform";
	}

}
