package com.springexample.forms;

import com.springexample.model.TaskModel;

public class TaskForm extends WebForm<TaskModel> {

	public TaskForm(){
		this(new TaskModel());
	}
	
	public TaskForm(TaskModel form) {
		super(form);
	}
	
	public void setName(String taskName){
		target.setTaskName(taskName);
	}
	
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
