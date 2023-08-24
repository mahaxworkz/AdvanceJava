package com.xworkz.annotations;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.annotations.config.AnnotationConfig;
import com.xworkz.annotations.dto.AnnotationDto;
import com.xworkz.annotations.service.AnnotationService;
 
public class AnnotationRunner {

	public static void main(String[] args) {
	ApplicationContext con=    new AnnotationConfigApplicationContext(AnnotationConfig.class);
 
	AnnotationService service =con.getBean(AnnotationService.class);
	AnnotationDto  dto=new  AnnotationDto(2, "Annotation",  "Spring", true,  2) ;
	
	service.save(dto);
	List<AnnotationDto> reading= service.read();
	reading.forEach((i)->{System.out.println(i);});
	
	
	
	}

}
