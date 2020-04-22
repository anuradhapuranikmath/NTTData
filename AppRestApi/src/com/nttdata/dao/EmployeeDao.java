package com.nttdata.dao;

import java.util.List;

import com.nttdata.Model.Employee;

public interface EmployeeDao {
	
	boolean updateEmployee(Employee employee);
	public Employee updateEmployeeWithMock(Employee employee);
	boolean deleteEMployee(int id);
	List<Employee> listEmployee();// dao
    public Employee getEmployeeById(int id);
	boolean insertEmployee(Employee employee);

}
