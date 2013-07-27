package com.springexample.forms;

public abstract class WebForm<T> {

	protected T target;

	public WebForm() {
	}

	public WebForm(T form) {
		target = form;
	}

	protected void setWebForm(T form) {
		target = form;
	}

	protected T delegate() {
		return target;
	}
}
