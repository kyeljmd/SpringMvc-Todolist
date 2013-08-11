package com.springexample.forms;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.springexample.model.TaskModel;

public class TaskForm extends WebForm<TaskModel> {

	public TaskForm() {
		this(new TaskModel());
	}

	public TaskForm(TaskModel form) {
		super(form);
	}

	public void setName(String taskName) {
		target.setTaskName(taskName);
	}

	public void setDescription(String description) {
		target.setDescription(description);
	}

	public void setStartDate(DateTime startDate) {
		target.setStartDate(startDate);
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past
	public DateTime getStartDate() {
		return target.getStartDate();
	}

	public void setEndDate(DateTime endDate) {
		target.setEndDate(endDate);
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Future
	public DateTime getEndDate() {
		return target.getEndDate();
	}

	@NotNull
	@NotEmpty(message = "There should be a task name")
	public String getName() {
		return target.getTaskName();
	}

	@NotNull
	@NotEmpty(message = "There should be a task description")
	public String getDescription() {
		return target.getDescription();
	}

}
