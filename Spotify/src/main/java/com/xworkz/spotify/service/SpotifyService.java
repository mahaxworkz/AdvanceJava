package com.xworkz.spotify.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SongDto;

public interface SpotifyService {

	public boolean saveSong(SongDto dto ,Model model);
	public boolean validateSong(SongDto dto ,Model model);
	public List<SongDto> ReadSong();
	public SongDto FindByName(String name,Model models); 
	
}
