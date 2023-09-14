package com.xworkz.spotify.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SongDto;
import com.xworkz.spotify.repo.SpotifyRepo;
  @Component
public class SpotifyServiceImpl implements SpotifyService {

	 @Autowired
	 private SpotifyRepo repo;
	@Override
	public boolean saveSong(SongDto dto, Model model) {
		 if(validateSong(dto, model)) {
			 System.out.println("3");
			 return repo.saveSong(dto) ;
		 }
		 System.out.println("not saved");
		return false;
	}
	@Override
	public boolean validateSong(SongDto dto, Model model) {
		 boolean valid = true; 
		    System.out.println("method validation");
		    if (dto.getSongName() != null && dto.getArtistName() != null) {
		        if (dto.getArtistName().length() <= 3 || dto.getArtistName().isEmpty()) {
		            model.addAttribute("IsArtistnameValid", "Artist name is not valid");
		            valid = false;  
		        }
		        
		        if (dto.getSongName().length() <= 3 || dto.getSongName().isEmpty()) {
		            model.addAttribute("IsSongValid", " Song name is not valid");
		            valid = false;  
		        }
		        
		        if (dto.getReleasedIn() <= 1900) {
		            model.addAttribute("IsYearValid", "Year not valid");
		            valid = false;  
		        }
		        if (dto.getRating() <= 2) {
		            model.addAttribute("IsratingValid", "LowRating");
		            valid = false;  
		        }
		        
		        if (dto.getAlbum().isEmpty() || dto.getAlbum().length() <= 3 ) {
		            model.addAttribute("IsAlbumValid", "Album not Valid");
		            valid = false;  
		        }
		    } else {
		        System.out.println("null value");
		        valid = false;  
		    }

		    if (!valid) {
		        System.out.println("false scenario: " + model.asMap());
		    }
		    
		    return valid; 
			 
	 
		 
	}
	@Override
	public List<SongDto> ReadSong() {
		List<SongDto> list=repo.ReadSong();
		
		return list;
	}
	
	public SongDto FindByName(String name,Model models) throws NoResultException {
		
		if(name != null && !name.isEmpty()) {
			try {
				SongDto dto=	repo.FindByName(name);
				models.addAttribute("find", dto);
				return dto;
			} catch (NoResultException e) {
				models.addAttribute("NoResult", "No song present in the playlist");
				e.printStackTrace();
				return null;
			}
			
		}
		models.addAttribute("isvalid", "enter valid song name");
		return null;
		
		
	}

}
