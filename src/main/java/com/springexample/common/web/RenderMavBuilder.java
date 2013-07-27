package com.springexample.common.web;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

public class RenderMavBuilder {
	
	private final ModelAndView mav;

	public static RenderMavBuilder render(String viewname){
		RenderMavBuilder target = new RenderMavBuilder(viewname);		
		return target;
	}
	
	public RenderMavBuilder addAttr(String attrName, Object value){
		mav.addObject(attrName, value);
		return this;
	}
	
	public RenderMavBuilder addAttrs(Map<String , ?> attrs){
		mav.addAllObjects(attrs);
		return this;
	}
	
	private RenderMavBuilder(String viewName){
		this.mav = new ModelAndView(viewName);
	}
	
	public ModelAndView toMav(){
		return mav;
	}
}
