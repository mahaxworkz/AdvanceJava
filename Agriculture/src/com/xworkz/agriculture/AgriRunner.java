package com.xworkz.agriculture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.agriculture.config.AgriConfig;
import com.xworkz.agriculture.dept.AgriEconomics;
import com.xworkz.agriculture.dept.AgriExtension;
import com.xworkz.agriculture.dept.AgriStatistics;
import com.xworkz.agriculture.dept.AgricultureDepartment;
import com.xworkz.agriculture.dept.AgricultureEng;
import com.xworkz.agriculture.dept.Agronomy;
import com.xworkz.agriculture.dept.BioTech;
import com.xworkz.agriculture.dept.Entomonology;
import com.xworkz.agriculture.dept.IABM;
import com.xworkz.agriculture.dept.Microbiology;
import com.xworkz.agriculture.dept.appiculture;

public class AgriRunner {
	
	  public static void main(String[] args) {
		  
		 ApplicationContext context= new AnnotationConfigApplicationContext(AgriConfig.class);
		 
		AgricultureDepartment dept1= context.getBean(AgriEconomics.class);
		AgricultureDepartment dept2= context.getBean(AgricultureEng.class);
		AgricultureDepartment dept3= context.getBean(AgriExtension.class);
		AgricultureDepartment dept4= context.getBean(AgriStatistics.class);
		AgricultureDepartment dept5= context.getBean( Agronomy.class);
		AgricultureDepartment dept6= context.getBean( BioTech.class);
		AgricultureDepartment dept7= context.getBean( Entomonology.class);
		AgricultureDepartment dept8= context.getBean( IABM.class);
		AgricultureDepartment dept9= context.getBean( Microbiology.class);
		AgricultureDepartment dept10= context.getBean( appiculture.class);
		
		
		dept1.AboutDept();
		dept1.AboutFee();
		System.out.println("dept 2");
		dept2.AboutDept();
		dept2.AboutFee();
		System.out.println("dept 3");
		dept3.AboutDept();
		dept3.AboutFee();
		System.out.println("dept 4");
		dept4.AboutDept();
		dept4.AboutFee();
		System.out.println("dept 5");
		dept5.AboutDept();
		dept5.AboutFee();
		System.out.println("dept 6");
		dept6.AboutDept();
		dept6.AboutFee();
		System.out.println("dept 7");
		dept7.AboutDept();
		dept7.AboutFee();
		System.out.println("dept 8");
		dept8.AboutDept();
		dept8.AboutFee();
		System.out.println("dept 9");
		dept9.AboutDept();
		dept9.AboutFee();
		System.out.println("dept 10");
		dept10.AboutDept();
		dept10.AboutFee();
		 
		 
	  }
 

}
