package com.nttdata.main;

import java.util.List;

import com.nttdata.Model.Employee;
import com.nttdata.dao.EmployeeDao;
import com.nttdata.daoImpl.EmployeeDaoImpl;


public class Client {
	
	public static void main(String[] args) {
		
		
		 
	     Employee employee=new Employee(123,"banu");
	    
	      
	     EmployeeDao employeeDao=new EmployeeDaoImpl();
	     
	    employeeDao.insertEmployee(employee);
	     
	    
	  
	}

}