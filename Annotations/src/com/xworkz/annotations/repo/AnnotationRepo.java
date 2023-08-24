package com.xworkz.annotations.repo;

import java.util.List;

import com.xworkz.annotations.dto.AnnotationDto;

public interface AnnotationRepo {
	
	public boolean save(AnnotationDto dto);
	
	public List<AnnotationDto> read();
	

}
