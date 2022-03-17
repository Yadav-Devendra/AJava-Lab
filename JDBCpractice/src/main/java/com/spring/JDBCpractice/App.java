package com.spring.JDBCpractice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.JDBCpractice.prac1.Employee;
import com.spring.JDBCpractice.prac1.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/JDBCpractice/prac1/config.xml");
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
        employeeDao.saveEmployee(new Employee("rahul", 300000));
        List<Employee> el = employeeDao.getEmployees();
        for(Employee e: el) {
        	System.out.print("ID: " + e.getId());
			System.out.print(", Name:" + e.getName());
			System.out.println(", Salary:" + e.getSalary());
        }
    }
}
