package com.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextFactory {

	private static Map<String, ConfigurableApplicationContext> map = new HashMap<String, ConfigurableApplicationContext>();
	
	public static ConfigurableApplicationContext getContext(String key) {
		if(map.containsKey(key) && map.get(key).isActive()) {
			return map.get(key);
		}
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(key);
		map.put(key, context);
		return context;
	}
}
