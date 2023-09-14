package com.xworkz.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.spotify.dto.SongDto;
import com.xworkz.spotify.service.SpotifyService;

@Controller
public class SpotifyController {
	
	@Autowired
	private SpotifyService service;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addSong(SongDto dto ,Model model) {
		
	boolean  status= service.saveSong(dto, model);
		if(status) {
			model.addAttribute("save", dto);
			return "success";
		}
		
		return "addsong";
		
		
		
	}
	@RequestMapping(value = "/read",method = RequestMethod.GET)
	public String readSong(  Model model) {
		List<SongDto>  dto=service.ReadSong();
		model.addAttribute("listing", dto);
		return "read";
		 
	}
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	public String findSong( @RequestParam String name, Model model) {
		 SongDto  dto=service.FindByName( name, model);
		 model.addAttribute("check", dto);
	 
		return "read";
		 
	}

}
