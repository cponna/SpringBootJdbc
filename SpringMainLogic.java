package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMainLogic {
	public static void main(String args[]) {

		ConfigurableApplicationContext ca = SpringApplication.run(SpringMainLogic.class, args);
		EmployeeDao ed = ca.getBean(EmployeeDao.class, args);
		Employee ee = new Employee();
		ee.setEid(45);
		ee.setEname("kumari");
		ee.setEsalary(23000);

		ed.insert(ee);

	}

}