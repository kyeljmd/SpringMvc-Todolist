package com.springexample.controller.impl;

import org.springframework.stereotype.Controller;

import static com.springexample.common.web.RenderMavBuilder.render;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springexample.controller.TaskController;

@Controller
@RequestMapping("/tasks/")
public class TaskControllerImpl implements TaskController {


	public ModelAndView createForm(){
		
		return render("tasks/taskform").toMav();
	}
}
