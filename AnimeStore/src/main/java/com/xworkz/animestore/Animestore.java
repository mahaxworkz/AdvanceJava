package com.xworkz.animestore;

  
 
import java.util.List;

import com.xworkz.animestore.dto.AnimeDto;
import com.xworkz.animestore.service.AnimeService;
import com.xworkz.animestore.service.AnimeserviceImpl;

public class Animestore {

	public static void main(String[] args) {
		 
		AnimeDto anime= new AnimeDto( 1,"TokyoAV", "chennai", 3, true, "murali");
		AnimeDto anime2= new AnimeDto( 2,"AnimeLand", "theni", 2, false, "sam");
		AnimeDto anime3= new AnimeDto( 3,"cartoonExpo", "CBE", 3, true, "vikram");
		AnimeDto anime4= new AnimeDto( 4,"xyzshop", "ooty", 1, true, "sid");
		
		
      AnimeService service = new AnimeserviceImpl();
    //  service.Save(anime4);
     // service.findByname("'AnimeLand'");
     // service.updatebranchesById(1, 4);
     // service.DeleteById(4);
//      List<AnimeDto> list=  service.Readall();
//      list.forEach((i)-> { System.out.println(i);});
      service.UpdateAreaByname("trichy","'TokyoAV'" );
      
      
      
      
  
 
	}

}
