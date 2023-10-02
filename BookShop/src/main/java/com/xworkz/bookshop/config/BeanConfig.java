package com.xworkz.bookshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz.bookshop")
@EnableWebMvc
public class BeanConfig  implements WebMvcConfigurer{
	
	public BeanConfig() {
		 System.out.println("default");
	}
	@Bean
	public ViewResolver getViewResolver() {
		return  new InternalResourceViewResolver("/", ".jsp") ;
		
	}
	 
@Override
public void addViewControllers(ViewControllerRegistry registry) {
	 registry.addRedirectViewController("/", "index.jsp");
}


	
	

}

