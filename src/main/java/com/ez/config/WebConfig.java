package com.ez.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// web.xml
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer { 
	
	@Override
	protected Class<?>[] getRootConfigClasses() { // root-context.xml
		return new Class[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
	
	@Override
	protected String[] getServletMappings() {
		return null;
	}
}
