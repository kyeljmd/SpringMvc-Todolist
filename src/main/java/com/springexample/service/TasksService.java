package com.springexample.service;

import com.springexample.model.TaskModel;

public interface TasksService {
	TaskModel save(TaskModel tasks);
	
	TaskModel get(Long id);
}
