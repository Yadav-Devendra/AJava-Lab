package com.spring.JDBCpractice.prac1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean saveEmployee(final Employee e) {
		String query = "insert into employee(name, salary) values(?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1, e.getName());
				ps.setFloat(2, e.getSalary());
				return ps.execute();
			}
		});
	}

	/*
	 * public int saveEmployee(Employee e) { String query =
	 * "insert into employee(name, salary) values('"+e.getName()+"',"+e.getSalary()+
	 * ")"; return jdbcTemplate.update(query); }
	 */

	/*
	 * public List<Employee> getEmployees() { return
	 * jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
	 * 
	 * public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	 * Employee e = new Employee(); e.setId(rs.getInt("id"));
	 * e.setName(rs.getString("name")); e.setSalary(rs.getInt("salary")); return e;
	 * } }); }
	 */

	public List<Employee> getEmployees() {
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> el = new ArrayList();
				while (rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt("id"));
					e.setName(rs.getString("name"));
					e.setSalary(rs.getInt("salary"));
					el.add(e);
				}
				return el;
			}

		});
	}
}
