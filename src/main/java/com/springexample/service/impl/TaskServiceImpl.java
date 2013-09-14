package com.springexample.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springexample.model.TaskModel;
import com.springexample.service.TasksService;
import com.springexample.tasklist.dao.TaskDao;

@Service
@Transactional
public class TaskServiceImpl implements TasksService {
	
	@Inject 
	private TaskDao taskDao;
	
	public TaskModel save(TaskModel tasks) {
 		taskDao.save(tasks);
		return tasks;
	}

	public TaskModel get(Long id) {
		return taskDao.get(id);
	}
	
	public TaskModel edit(TaskModel task){
		return taskDao.update(task);
	}

	public List<TaskModel> getTasks(int start, int max) {
		return taskDao.getTasks(start, max);
	}
}
