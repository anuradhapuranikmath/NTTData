package com.nttdata.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

 private int employeeId;
 private String employeeName;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}

@JsonCreator
public Employee(@JsonProperty("employeeId") int employeeId, @JsonProperty("employeeName") String employeeName)
{
 this.employeeId = employeeId;
 this.employeeName=employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
 public Employee() {
	
}
@Override
public String toString() {
 StringBuilder str = new StringBuilder();
 str.append("Employee Id:- " + getEmployeeId());
 str.append(" First Name:- " + getEmployeeId());

 
 return str.toString();
}
 
}
