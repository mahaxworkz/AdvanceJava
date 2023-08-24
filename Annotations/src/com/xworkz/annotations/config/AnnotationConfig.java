package com.xworkz.annotations.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

import com.xworkz.annotations.dto.AnnotationDto;
@Lazy
@ComponentScan("com.xworkz.annotations")
public class AnnotationConfig {
	@Bean
	public List<AnnotationDto> getList(){
		return new ArrayList<AnnotationDto>();
		
	}
	

}
