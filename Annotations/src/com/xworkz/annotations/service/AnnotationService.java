package com.xworkz.annotations.service;

import java.util.List;

import com.xworkz.annotations.dto.AnnotationDto;

public interface AnnotationService {
	public boolean save(AnnotationDto dto);
	public List<AnnotationDto> read();

}
