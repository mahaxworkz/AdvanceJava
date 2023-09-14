package com.xworkz.gymrats.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FirstControllerConfig  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 
		return new Class[] {GymBeanConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		 
		return  new String[] {"/"};
	}

}
