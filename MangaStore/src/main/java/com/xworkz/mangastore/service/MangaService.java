package com.xworkz.mangastore.service;

import com.xworkz.mangastore.dto.MangaDto;


public interface MangaService {
	
	public boolean save(MangaDto dto);
	
	public boolean DoPost(MangaDto dto) ;

}
