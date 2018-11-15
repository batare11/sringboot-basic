package com.bjsxt.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class ExceptionHandle {
	
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
		
		SimpleMappingExceptionResolver smer = new SimpleMappingExceptionResolver();
		
		Properties mappings = new Properties();
		mappings.put("java.lang.ArithmeticException", "error1");
		mappings.put("java.lang.NullPointerException", "error2");
		
		smer.setExceptionMappings(mappings);
		
		return smer;
	}
	
}
