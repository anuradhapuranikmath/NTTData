package com.nttdata.Dao;

import java.util.List;

import com.nttdata.model.Employee;

public interface EmployeeDao {
	
	boolean insertEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteEMployee(int id);
	List<Employee> listEmployee();

}
