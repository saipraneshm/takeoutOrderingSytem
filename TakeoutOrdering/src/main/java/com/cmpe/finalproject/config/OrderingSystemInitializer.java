package com.cmpe.finalproject.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cmpe.finalproject.dao.config.OrderingDaoAndServiceConfig;


public class OrderingSystemInitializer 
	extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//Add dao and service class definitions inside new Class array . 
		//eg: { YOUR_CLASS_NAME_1.class, YOUR_CLASS_NAME_2.class }
		return new Class<?>[] {};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Add your Web.xml definitions in this class.
		return new Class<?>[] {WebAppConfig.class};
	}

	//We are setting the root url of the application.
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
