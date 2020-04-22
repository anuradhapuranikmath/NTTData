package com.nttdata.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.nttdata.Model.Employee;
import com.nttdata.dao.EmployeeDao;

public class EmployeeTestWithMock {
	@Mock
	EmployeeDao employeedao1;
	
	@Mock
	Employee employee;
	@Test
	public void testEmployeeInsertWithMockito()
	{
		employeedao1=Mockito.mock(EmployeeDao.class);
		Mockito.when(employeedao1.getEmployeeById(2)).thenReturn(new Employee(12,"abc"));
		Employee e=employeedao1.getEmployeeById(2);
		assert(e.getEmployeeId()==12);
		assert(e.getEmployeeName().equals("abc"));
	
	}
	
	@Test
	public void listEmployees()
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(34,"anu"));
		list.add(new Employee(67,"tanu"));
		list.add(new Employee(56,"manu"));
		list.add(new Employee(45,"sanu"));
		employeedao1=Mockito.mock(EmployeeDao.class);
		Mockito.when(employeedao1.listEmployee()).thenReturn(list);
		assertEquals(4,list.size());
	}
	
	
	@Test
	public void deleteEmployee()
	{
		employeedao1=Mockito.mock(EmployeeDao.class);
		Mockito.when(employeedao1.deleteEMployee(101)).thenReturn(true);
		boolean b=employeedao1.deleteEMployee(101);
		assertTrue(b);
	}
	@Test
	public void updateEMployeeWithMock(){
		
		employeedao1=Mockito.mock(EmployeeDao.class);
		employee=Mockito.mock(Employee.class);
		Mockito.when(employeedao1.updateEmployeeWithMock(employee)).thenReturn(new Employee(90,"nmj"));
		Employee e=employeedao1.updateEmployeeWithMock(employee);
		assert(e.getEmployeeName().equals("nmj"));
		assert(e.getEmployeeId()==90);
	}
	
}
