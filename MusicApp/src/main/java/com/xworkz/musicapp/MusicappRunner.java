package com.xworkz.musicapp;

import java.util.List;

import com.xworkz.musicapp.dto.MusicDto;
import com.xworkz.musicapp.service.MusicService;
import com.xworkz.musicapp.service.MusicServiceImpl;

public class MusicappRunner {

	public static void main(String[] args) {
	 MusicDto music = new MusicDto(4, "Wink", "rap", true, 48.7f, 4.1f);
    MusicService service = new MusicServiceImpl();

   // service.save(music);
   // MusicDto find= service.FindByName("YtMusic");
   // System.out.println(find);
    
   // service.updateAppsizeAndRatingByName(45f, 4.3f,"YtMusic" );
   //  service.Deletebyid(4);
    List<MusicDto> list= service.Readall();
    list.forEach((i)->{System.out.println(i);});
    
	}

}
