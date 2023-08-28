package com.xworkz.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.employee.config.EmployeeConfig;
import com.xworkz.employee.dto.Address;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import com.xworkz.employee.service.EmployeeServiceImpl;

public class EmployeeRunner {

	public static void main(String[] args) {

		ApplicationContext con = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeService service = con.getBean(EmployeeServiceImpl.class);

//	Address add= new Address(23, "nehru street",  "CBE",  "TN", 65784);
		EmployeeDto dto = new EmployeeDto(5, "siddarth", "male", "vikash", 20, "B.Sc", "23-09=2001", "trichy",
				"priya@gmail.com", 345612316);

		// service.save(dto);
		// EmployeeDto storing = service.findByName("Kavya");
		// System.out.println(storing);
		// }

//	EmployeeDto storing =service.findByNameAndEmail("Karunya", "ravi@gmail.com");
//	System.out.println(storing);

//	service.updateageByName("Kavya", 20);

		// service.updateAddressByNameandid("vanitha", 3, "Ramnadhapuram");
//boolean delete=	service.deleteByName("vanitha");
//System.out.println();

//	service.deleteByNameandemail("siddarth", "priya@gmail.com");

		List<EmployeeDto> list = service.readAll();

		list.forEach((i) -> {
			System.out.println(i);
		});

	}

}
