package com.example.employee_service;

import com.example.employee_service.test.Department;
import com.example.employee_service.test.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EmployeeServiceApplication  {

	public static void main(String[] args) {
		System.out.println("started");
		ApplicationContext ctx = SpringApplication.run(EmployeeServiceApplication.class, args);


		Student s1 = (Student) ctx.getBean("student");
		System.out.println(s1);
		System.out.println(s1.getAddress());


		Student s2 = (Student) ctx.getBean("student");
		System.out.println(s2);
		System.out.println(s2.getAddress());




		Department d1 = (Department) ctx.getBean("department");
		System.out.println(d1);
		System.out.println(d1.getEmployee());


		Department d2 = (Department) ctx.getBean("department");
		System.out.println(d2);
		System.out.println(d2.getEmployee());
	}

}
