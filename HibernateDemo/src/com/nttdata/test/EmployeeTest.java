package com.nttdata.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.nttdata.Dao.EmployeeDao;
import com.nttdata.DaoImpl.EmployeeDaoImpl;
import com.nttdata.model.Employee;

public class EmployeeTest {
   public static Employee employee;
   public static EmployeeDao employeedao;
	
	@BeforeClass
	public static void init()
	{
		employee=new Employee();
		employeedao=new EmployeeDaoImpl();
		
	}

	
	@AfterClass
	public static void done()
	{
		System.out.println(" after all test method exccuted ");
	}
	List<Employee> e=employeedao.listEmployee();
	
	@Ignore
	@Test
	public void testListEmployee()
	{
	  assertEquals(4,e.size());	
	}
	
	@Test
	public void testAddEmployee()
	{
		Employee e=new Employee();
		e.setEmployeeAddress("mysore");
		e.setEmployeeId(67);
		e.setEmployeeName("ramaa");
		assertTrue("problem adding employee", employeedao.insertEmployee(e));
	}
	
}
