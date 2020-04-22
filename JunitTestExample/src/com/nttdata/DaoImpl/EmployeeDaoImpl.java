package com.nttdata.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.nttdata.Dao.EmployeeDao;
import com.nttdata.Model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	List<Employee> list;
	@Override
	public List<Employee> getEmployees() {
		
		list=new ArrayList<Employee>();
		list.add(new Employee(234, "Anuradha", 1000));
		list.add(new Employee(456, "Preeti", 3000));
		list.add(new Employee(789, "chandu", 5000));
		list.add(new Employee(890, "pooja", 7000));
		list.add(new Employee(345, "pavitra", 8000));
		list.add(new Employee(678, "Raj", 9000));
		list.add(new Employee(245, "priya", 2000));
		list.add(new Employee(787, "pushpa", 4000));
		
		return list;
	}
	@Override
	public boolean  deleteEmployee(int id) {
	  if(id<0)
	  {
		  return false;
	  }
	  else
	  {
		  list.remove(id);
		  
		  return true;
	  }
		
	}

}
