package com.springexample.forms;

import org.hibernate.validator.constraints.NotEmpty;

import com.springexample.model.TaskModel;

public class TaskForm extends WebForm<TaskModel> {

	public TaskForm(){
		this(new TaskModel());
	}
	
	public TaskForm(TaskModel form) {
		super(form);
	}
	
	@NotEmpty
	public void setName(String taskName){
		target.setTaskName(taskName);
	}
	
	@NotEmpty
	public void setDescription(String description){
		target.setDescription(description);
	}
	
	public String getName(){
		return target.getTaskName();
	}
	
	public String getDescription(){
		return target.getDescription();
	}

}
