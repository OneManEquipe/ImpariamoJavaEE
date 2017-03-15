package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContext {
	
	private static SpringContext instance = null;
	
	
	
	public static ConfigurableApplicationContext getSpringContext(){
		return new ClassPathXmlApplicationContext("");
	}
	
}
