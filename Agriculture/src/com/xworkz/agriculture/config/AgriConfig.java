package com.xworkz.agriculture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.agriculture.dept.AgriEconomics;
import com.xworkz.agriculture.dept.AgriExtension;
import com.xworkz.agriculture.dept.AgriStatistics;
import com.xworkz.agriculture.dept.AgricultureEng;
import com.xworkz.agriculture.dept.Agronomy;
import com.xworkz.agriculture.dept.BioTech;
import com.xworkz.agriculture.dept.Entomonology;
import com.xworkz.agriculture.dept.IABM;
import com.xworkz.agriculture.dept.Microbiology;
import com.xworkz.agriculture.dept.appiculture;
 
@Configuration
public class AgriConfig {
	
	
	@Bean
	public AgricultureEng getAgricultureEng() {
		return new AgricultureEng();
		
	}
	@Bean
	public  AgriEconomics  getAgriEconomics() {
		return new AgriEconomics();
		
	}
	
	@Bean
	public  AgriExtension getAgriExtension() {
		return new  AgriExtension();
		
	}
	@Bean
	public  AgriStatistics getAgriStatistics() {
		return new  AgriStatistics();
		
	}
	@Bean
	public  Agronomy getAgronomy() {
		return new  Agronomy();
		
	}
	@Bean
	public  appiculture getappiculture() {
		return new appiculture();
		
	}
	@Bean
	public   BioTech getBioTech() {
		return new  BioTech();
		
	}
	@Bean
	public   Entomonology getEntomonology() {
		return new  Entomonology();
		
	}
	@Bean
	public  IABM getIABM () {
		return new IABM();
		
	}
	@Bean
	public   Microbiology getMicrobiology() {
		return new Microbiology();
		
	}
	 
	

}
