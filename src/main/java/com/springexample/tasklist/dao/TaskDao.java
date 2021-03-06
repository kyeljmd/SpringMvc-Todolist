package com.springexample.tasklist.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.springexample.model.TaskModel;

@Repository
public class TaskDao extends HibernateDao<TaskModel> {
	
	public TaskModel save(TaskModel object) {
		sess().save(object);
		return object;
	}

	public void delete(TaskModel object) {
		sess().delete(object);
	}

	public TaskModel get(Long id) {
		return (TaskModel) sess().get(TaskModel.class, id);
	}

	public TaskModel update(TaskModel object) {
		sess().update(object);;
		return object;
	}

	public List<TaskModel> getTasks(int start, int max){
		Criteria criteria = sess().createCriteria(TaskModel.class);
		criteria.setMaxResults(max);
		criteria.setFirstResult(start);
		return criteria.list();
	}
}
