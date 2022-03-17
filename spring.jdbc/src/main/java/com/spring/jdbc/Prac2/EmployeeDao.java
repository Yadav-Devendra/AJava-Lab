package com.spring.jdbc.Prac2;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import java.util.List;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean saveEmployee(final Employee e) {
		String query = "insert into employee(name, salary) values(?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			// @Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1, e.getName());
				ps.setFloat(2, e.getSalary());
				return ps.execute();
			}
		});
	}

	public Boolean updateEmployee(final Employee e) {
		String query = "update employee set name=?,salary=? where id=?";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			// @Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1, e.getName());
				ps.setFloat(2, e.getSalary());
				ps.setFloat(3, e.getId());
				return ps.execute();
			}
		});
	}

	public Boolean deleteEmployee(final Employee e) {
		String query = "delete from employee where id=?";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			// @Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, e.getId());
				return ps.execute();
			}
		});
	}
	
	public List<Employee> listEmployees() { 
			String SQL="select * from employee";
			List<Employee> emps=jdbcTemplate.query(SQL, new EmployeeMapper());
			return emps;
		}
}
