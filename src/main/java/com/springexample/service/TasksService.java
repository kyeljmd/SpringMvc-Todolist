package com.springexample.service;

import java.util.List;

import com.springexample.model.TaskModel;

public interface TasksService {
	TaskModel save(TaskModel tasks);
	
	TaskModel get(Long id);
	
	List<TaskModel>	 getTasks(int start, int max);
}
