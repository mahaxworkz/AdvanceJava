package com.xworkz.spotify.repo;

import java.util.List;

import com.xworkz.spotify.dto.SongDto;

public interface SpotifyRepo {
	
	public boolean saveSong(SongDto dto);
	public List<SongDto> ReadSong();
	public SongDto FindByName(String name);

}
