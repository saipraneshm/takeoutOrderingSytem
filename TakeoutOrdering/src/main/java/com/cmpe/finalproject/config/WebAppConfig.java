package com.cmpe.finalproject.config;

/*************************************************************
 * Author: Sai Pranesh
 * Description:
 * In this class we are initializing view resolver to render
 * the proper views to the end user. Here we are using Spring
 * annotations to enable the component scan to look for the 
 * required annotations to handle all the web requests.
 *************************************************************/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.cmpe")
public class WebAppConfig {

	 @Bean
	    public ViewResolver internalResourceViewResolver() {
	        InternalResourceViewResolver viewResolver = 
	        		new InternalResourceViewResolver();
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }
	
	
}
