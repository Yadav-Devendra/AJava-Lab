package com.spring.jdbc.spring.jdbc;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Prac4.Employee;
import com.spring.jdbc.Prac4.EmployeeDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dbConfig.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("rowdao");

		// Read Operation (R)
		System.out.println("Listing Employee Records");
		List<Employee> emps = dao.listEmployees();

		for (Employee record : emps) {
			System.out.print("ID: " + record.getId());
			System.out.print(", Name:" + record.getName());
			System.out.println(", Salary:" + record.getSalary());
		}
	}
}