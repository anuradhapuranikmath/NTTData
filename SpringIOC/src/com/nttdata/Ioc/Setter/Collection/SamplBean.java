package com.nttdata.Ioc.Setter.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SamplBean {
	private Set studentsData;
	private List<String> message;
	
	private Map data;
		public Map getData() {
		return data;
	}
	public void setData(Map data) {
		this.data = data;
	}
		public List<String> getMessage() {
		return message;
	}
	public void setMessage(List<String> message) {
		this.message = message;
	}
		public Set getStudentsData() {
		return studentsData;
	}
	public void setStudentsData(Set studentsData) {
		this.studentsData = studentsData;
	}
	
	void print()
	{
	  Set s=data.entrySet();
	  Iterator it=s.iterator();
	  while(it.hasNext())
	  {
		  Map.Entry m=(Map.Entry)it.next();
		  System.out.println(m.getKey()+"  "+m.getValue());
	  }
	}
}
