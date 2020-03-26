package com.nttdata.DaoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nttdata.DBConfigure.DBConfigure;
import com.nttdata.Dao.EmployeeDao;
import com.nttdata.model.Employee;

public class EmployeeDaoImpl  implements EmployeeDao {

	 SessionFactory sessionFactory=DBConfigure.sessionFactory(); 
	
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
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
		 
		 //Query q=session.createQuery(" from Employee");
		 Query q=session.createQuery("  select e.employeeId ,e.employeeName from Employee e");
		 List<String> lt=q.list();
		 
		 Iterator< String > itr=lt.iterator();
		 
		 while(itr.hasNext()){
			 
			 System.out.println(itr.next());
			 
		 }
		 return q.list();
	}

}
