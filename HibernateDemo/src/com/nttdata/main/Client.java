package com.nttdata.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nttdata.DBConfigure.DBConfigure;
import com.nttdata.Dao.EmployeeDao;
import com.nttdata.DaoImpl.EmployeeDaoImpl;
import com.nttdata.model.Employee;

public class Client {
	
	public static void main(String[] args) {
		
		
		 
	     Employee employee=new Employee();
	     employee.setEmployeeId(678);
	     employee.setEmployeeAddress("Hubli");
	     employee.setEmployeeName("Rajitha R");
	      
	     EmployeeDao employeeDao=new EmployeeDaoImpl();
	     
	    // employeeDao.insertEmployee(employee);// insert in to db
	     
	     employee.setEmployeeAddress("Tumkur");
	     
	     //employeeDao.updateEmployee(employee);//updating employee
	     
	     //employeeDao.deleteEMployee(345);
	     
	     List<Employee> list=employeeDao.listEmployee();//listing Employees
	     
	     for(Employee e :list)
	     {
	    	 System.out.println(e);
	     }
	    
	  
	}

}
