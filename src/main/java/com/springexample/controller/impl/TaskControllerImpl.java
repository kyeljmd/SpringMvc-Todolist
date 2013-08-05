package com.springexample.controller.impl;

import static com.springexample.common.web.RenderMavBuilder.render;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springexample.controller.TaskController;
import com.springexample.forms.TaskForm;

@Controller
@RequestMapping("/tasks/")
public class TaskControllerImpl implements TaskController {
	
	private static final String FORM_OBJECT = "task";
	
	private static final String FORM_VIEW =  "tasks/taskform";
	
	public ModelAndView createForm(){
		return render(FORM_VIEW).
					addAttr(FORM_OBJECT, new TaskForm()).
					toMav();
	}


	public ModelAndView saveTask(TaskForm task) {
		// TODO Auto-generated method stub
		System.out.println(task.getDescription());
		
		return  render(FORM_VIEW).
				addAttr(FORM_OBJECT,task).
				toMav();
	}
}
