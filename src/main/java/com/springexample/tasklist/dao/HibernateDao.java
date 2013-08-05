package com.springexample.tasklist.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class HibernateDao<T> implements BaseDao<T> {
	
	@Inject	
	protected SessionFactory session;
	
	/*
	 * Short hand method to get The Current Session
	 */
	protected Session sess(){
		return session.getCurrentSession();
	}
}
