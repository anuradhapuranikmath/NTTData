package com.nttdata.Collection.Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client {
public static void main(String[] args) {
	
	/*
	TreeMap<Integer,String>map=new TreeMap<>();
	map.put(2,"piano");
	map.put(7, null);
	map.put(3,"violin");
	
	for(Map.Entry map1:map.entrySet())
	{
		System.out.println(map1.getKey()+" "+map1.getValue());
	}*/
	
	Hashtable<Integer,Student> hashMap=new Hashtable<>();
	hashMap.put(2
	,new Student(145, "mnp", "D"));
	hashMap.put(8,new Student(345, "jkl", "A"));
	hashMap.put(5,new Student(234, "sdf", "E"));
	hashMap.put(4,new Student(781, "rty", "C"));
	 for(Map.Entry map:hashMap.entrySet())
	 {  
		 
		System.out.println(map.getKey()+" "+map.getValue());
	 }
	
}
}
