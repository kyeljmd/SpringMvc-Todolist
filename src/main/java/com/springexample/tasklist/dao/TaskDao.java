package com.springexample.tasklist.dao;

import org.springframework.stereotype.Repository;

import com.springexample.model.TaskModel;

@Repository
public class TaskDao extends HibernateDao<TaskModel> {
	
	public TaskModel save(TaskModel object) {
		sess().save(object);
		return object;
	}

	public TaskModel delete(TaskModel object) {
		// TODO Auto-generated method stub
		return null;
	}

	public TaskModel get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public TaskModel update(TaskModel object) {
		// TODO Auto-generated method stub
		return null;
	}

}
