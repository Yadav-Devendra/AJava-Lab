package com.spring.jdbc.Prac1;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee(name, salary) values('" + e.getName() + "'," + e.getSalary() + ")";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary=" + e.getSalary() + "where id=" + e.getId()
				+ " ";
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e){
	  String query="delete from employee where name='"+e.getName()+"'";
	  return jdbcTemplate.update(query);
	}
	
	/*
	 * public List<Employee> listEmployees() { String SQL =
	 * "select * from employee"; List <Employee> emps = jdbcTemplate.query(SQL, new
	 * EmployeeMapper()); return emps; }
	 */
	
	public List<Employee> listEmployees() {
		   String SQL = "select * from employee";
		   List <Employee> emps = jdbcTemplate.query(SQL, new EmployeeMapper()); 
		   return emps;
		 }
}
