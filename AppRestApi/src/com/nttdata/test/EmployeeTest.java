package com.nttdata.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.nttdata.Model.Employee;
import com.nttdata.dao.EmployeeDao;
import com.nttdata.daoImpl.EmployeeDaoImpl;

public class EmployeeTest {
	public static Employee employee;
	 public static EmployeeDao employeedao;
	
	@BeforeClass
	public  static  void init()
	{
		employeedao=new EmployeeDaoImpl();
	}
	@Ignore
	@Test
	public void testEmployeeInsert()
	{
		Employee employee=new Employee();
		employee.setEmployeeId(456);
		employee.setEmployeeName("shama");
		assertTrue("problem in adding employee" ,employeedao.insertEmployee(employee));
		
	}
	
	
	
}
