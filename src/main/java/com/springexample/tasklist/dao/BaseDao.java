package com.springexample.tasklist.dao;

public interface BaseDao<T extends Object> {
	T save(T object);
	
	T delete(T object);
	
	T get(Long id);
	
	T update (T object);
}
