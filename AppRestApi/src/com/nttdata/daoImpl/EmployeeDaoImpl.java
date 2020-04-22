package com.nttdata.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.nttdata.Model.Employee;
import com.nttdata.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
SessionFactory sessionFactory=com.nttdata.DBConfig.DBConfigure.sessionFactory(); 
	
	@Override
	public boolean insertEmployee(Employee employee) {
	try{
	  Session session=sessionFactory.openSession();
	  Transaction tx=session.beginTransaction();
	  session.save(employee);
	  tx.commit();
	  //session.close();
	return true;
	}
	catch(Exception e)
	{
		return false;
		
	}
	  
	}
	
	
	@Override
	public boolean updateEmployee(Employee employee) {
		try{
		  Session session=sessionFactory.openSession();
		  Transaction tx=session.beginTransaction();
		  session.update(employee);
		  tx.commit();
		  session.close();
		 return true;
		}
		catch(Exception e)
		{
			return false;
			
		}
	}

	@Override
	public boolean deleteEMployee(int id) {
		
		try{
		 Session session=sessionFactory.openSession();
		  Transaction tx=session.beginTransaction();
		  
		    Object o=session.load(Employee.class,new Integer(id));
		    Employee p=(Employee)o;
		    session.delete(p);
		    tx.commit();
		    session.close();
		return true;
		} catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<Employee> listEmployee() {
		 /*Session session=sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
		 
		 //Query q=session.createQuery(" from Employee");
		 Query q=session.createQuery(" select e.employeeId ,e.employeeName from Employee e");
		 List<Employee> lt=q.list();
		 
		 Iterator< Employee > itr=lt.iterator();
		 
		 while(itr.hasNext()){
			 
			 System.out.println(itr.next());
			 
		 }
		 return q.list();*/
		return null;
	}


	@Override
	public Employee getEmployeeById(int id) {
		
		return null;
	}


	@Override
	public Employee updateEmployeeWithMock(Employee employee) {
	
		return null;
	}

	
	

}
