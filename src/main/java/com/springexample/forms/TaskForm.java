package com.springexample.forms;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

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
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public void setStartDate(DateTime startDate){
		target.setStartDate(startDate);
	}
	
	public DateTime getStartDate(){
		return target.getStartDate();
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public void setEndDate(DateTime endDate){
		target.setEndDate(endDate);
	}
	
	public DateTime getEndDate(){
		return target.getEndDate();
	}
	
	public String getName(){
		return target.getTaskName();
	}
	
	public String getDescription(){
		return target.getDescription();
	}
}
