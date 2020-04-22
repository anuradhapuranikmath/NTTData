package com.nttdata.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Client {
public static void main(String[] args) {
	
	/*TreeSet<Employee> set=new TreeSet<>(new SortByName());
	set.add(new Employee(101,"Anuradha"));
	set.add(new Employee(189,"Rosy"));
	set.add(new Employee(145,"Rajesh"));
	set.add(new Employee(134,"Preeti"));
	set.add(new Employee(101,"Anuradha"));
	 
	 Iterator<Employee> itr=set.iterator();
	 System.out.println("Forward Traversing");
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }*/
	
	PriorityQueue<Employee> priorityQueue=new PriorityQueue<>(new SortByName());
	
	priorityQueue.add(new Employee(101,"Anuradha"));
	priorityQueue.add(new Employee(189,"Rosy"));
	priorityQueue.add(new Employee(145,"Rajesh"));
	priorityQueue.add(new Employee(134,"Preeti"));
	
	 Iterator<Employee> itr=	priorityQueue.iterator();
	 System.out.println("Forward Traversing");
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	
	 
}
}
