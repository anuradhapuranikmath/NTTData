package com.nttdata.CreationalDesginPattern.PrototypePattern;

public class Student implements Prototype{
	int studentId;
	String studentName;
	String address;
	
	public Student()
	{
		System.out.println("  Records of Students ");  
        System.out.println("---------------------------------------------");  
        System.out.println("studentId"+"\t"+"studentNname"+"\t"+"address");  
	}
	
	public Student(int id,String name,String address)
	{
	this();
	this.studentId=id;
	this.studentName=name;
	this.address=address;
	}
	
	public void showDetails()
	{
		System.out.println(studentId+"\t\t"+studentName+"\t\t"+address);
	}
	@Override
	public Prototype getClone() {
		
		return new Student(studentId, studentName, address);
	}

}
