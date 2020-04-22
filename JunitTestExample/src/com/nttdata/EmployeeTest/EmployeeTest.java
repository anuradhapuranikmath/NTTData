package com.nttdata.EmployeeTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.nttdata.Dao.EmployeeDao;
import com.nttdata.DaoImpl.EmployeeDaoImpl;
import com.nttdata.Model.Employee;

public class EmployeeTest {

	 static EmployeeDao employeeDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		employeeDao=new EmployeeDaoImpl();
	}
     
	@Test(timeout=2)
	public void testListEmployee()
	{
		assertEquals("List of employees ",8, employeeDao.getEmployees().size());
	}
	
	@Test
	public void deleteEmployee()
	{
		
		assertTrue("Remove Employee ", employeeDao.deleteEmployee(2));
	}

}
