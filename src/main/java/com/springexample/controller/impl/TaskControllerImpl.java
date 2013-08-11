package com.springexample.controller.impl;

import static com.springexample.common.web.RenderMavBuilder.render;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springexample.controller.TaskController;
import com.springexample.forms.TaskForm;
import com.springexample.model.TaskModel;
import com.springexample.service.TasksService;

@Controller
@RequestMapping("/tasks/")
public class TaskControllerImpl implements TaskController {

	private static final String FORM_OBJECT = "task";

	private static final String FORM_VIEW = "tasks/taskform";

	@Inject
	private TasksService taskService;

	public ModelAndView createForm() {

		return render(FORM_VIEW).addAttr(FORM_OBJECT, new TaskForm()).toMav();
	}

	public ModelAndView saveTask(@Valid @ModelAttribute("task") TaskForm task,
			BindingResult result) {

		if (!result.hasErrors()) {
			TaskModel res = taskService.save(task.delegate());
			System.out.println("Task ID" + res.getId());
			return render("redirect:task/viewTask/").toMav();
		} else {
			return render(FORM_VIEW).addAttr(FORM_OBJECT, task).toMav();
		}

	}
}
