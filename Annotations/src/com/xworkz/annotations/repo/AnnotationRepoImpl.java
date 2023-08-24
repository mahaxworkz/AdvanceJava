package com.xworkz.annotations.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.annotations.dto.AnnotationDto;
@Component
public class AnnotationRepoImpl implements AnnotationRepo {
     @Autowired
	private List<AnnotationDto> list;
	@Override
	public boolean save(AnnotationDto dto) {
		 list.add(dto);
		 System.out.println("saved");
		return  true;
	}
	@Override
	public List<AnnotationDto> read() {
		 System.out.println("read");
		return list;
	}

}
