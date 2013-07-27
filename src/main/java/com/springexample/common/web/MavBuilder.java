package com.springexample.common.web;

public class MavBuilder {
	
	private MavBuilder(){ }
	
	public static RenderMavBuilder render(String viewName){
		return MavBuilder.render(viewName);
	}
	
}
