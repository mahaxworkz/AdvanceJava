package com.xworkz.annotations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.annotations.dto.AnnotationDto;
import com.xworkz.annotations.repo.AnnotationRepo;
@Component
public class AnnotationServiceImpl implements AnnotationService {

	@Autowired
	private AnnotationRepo repo;
	@Override
	public boolean save(AnnotationDto dto) {
		 repo.save(dto);
		 System.out.println("service");
		return false;
	}
	@Override
	public List<AnnotationDto> read() {
		List<AnnotationDto> listing=repo.read();
		 
		return listing ;
	}

}
