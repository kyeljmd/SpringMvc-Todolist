package com.springexample.controller.impl;

import static com.springexample.common.web.RenderMavBuilder.render;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.springexample.controller.IndexController;
import com.springexample.model.TaskModel;
import com.springexample.service.TasksService;


@Controller
public class IndexControllerImpl implements IndexController {
	
	@Inject
	private TasksService taskService;
	
	public ModelAndView index() {	
		List<TaskModel> tasks = taskService.getTasks(0, 10);
		return render("index").addAttr("tasks", tasks).toMav();
	}
	
}
