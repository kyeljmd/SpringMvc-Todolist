package com.springexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springexample.forms.TaskForm;


@Controller
@SessionAttributes(types = {TaskForm.class})
public interface TaskController {

	@RequestMapping(value = "create" ,method = RequestMethod.GET)
	ModelAndView createForm();
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	ModelAndView saveTask(@ModelAttribute("task") TaskForm task);
}
