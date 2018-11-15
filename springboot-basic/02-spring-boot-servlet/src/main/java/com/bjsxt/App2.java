package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.bjsxt.servlet.SecondServlet;

@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
      SpringApplication.run(App2.class, args);
	}
   
	@Bean
	public ServletRegistrationBean getServletRegistrationBean(){
		ServletRegistrationBean bean = new ServletRegistrationBean();
		bean.setServlet(new SecondServlet());
		bean.addUrlMappings("/second");
		return bean;
	}
}
