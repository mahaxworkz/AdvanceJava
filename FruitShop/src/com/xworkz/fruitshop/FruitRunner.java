package com.xworkz.fruitshop;

import java.text.Annotation;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.fruitshop.config.FruitConfig;
import com.xworkz.fruitshop.dto.FruitShopDto;
import com.xworkz.fruitshop.service.FruitService;
import com.xworkz.fruitshop.service.FruitServiceImpl;

public class FruitRunner {

	public static void main(String[] args) {
		
	ApplicationContext con=	new AnnotationConfigApplicationContext(FruitConfig.class);
	
	   FruitService service=    con.getBean(FruitServiceImpl.class);
	   
	  FruitShopDto dto= new FruitShopDto(7, "FreshFruits", "varun", 4, "good");
	 //  service.checkExists("hgkgfk");
	 service.save(dto);
	   
//     List<FruitShopDto> find=   service.FindByName("hgkgfk");
//	   System.out.println(find);
//	   
		 

	}

}
