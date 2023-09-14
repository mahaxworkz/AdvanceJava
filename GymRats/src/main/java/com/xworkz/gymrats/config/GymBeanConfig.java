package com.xworkz.gymrats.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("com.xworkz.gymrats")
@EnableWebMvc
public class GymBeanConfig  implements WebMvcConfigurer {
	
	public GymBeanConfig()  {
		System.out.println("default");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		 
		registry.addRedirectViewController("/", "index.jsp" );
		//registry.addViewController("/").setViewName("index.jsp");
	}
	 @Bean
	public ViewResolver getview() {
		return new InternalResourceViewResolver("/WEB-INF/", ".jsp");
	}

	 
	 
	 
	 
	 
	 
	 
}
