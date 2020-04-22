package com.nttdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.nttdata.Model.Employee;
import com.nttdata.dao.EmployeeDao;
import com.nttdata.daoImpl.EmployeeDaoImpl;

@RestController
public class HomeController {

	EmployeeDao employeedao =new EmployeeDaoImpl();
	@RequestMapping("/")
	public String page()
	{
		return "index";
	}
	@RequestMapping(value = "/getemployess",method=RequestMethod.GET)
	public String getJobList() {
		List<Employee> employees = employeedao.listEmployee();
		if (employees != null) {
			Gson gson = new Gson();
			return gson.toJson(employees);
		} else {
			return null;
		}
	}
	@RequestMapping(value = "/updateUser",method=RequestMethod.PUT)
	public String updateEmployee( @RequestBody Employee employee) {
		if (employeedao. updateEmployee(employee)){
			Gson gson = new Gson();
			return gson.toJson(employee);
		} else {
			return null;
		}
	}
	@RequestMapping(value = "/insertEmployee",method=RequestMethod.POST)
	public String registerUser( @RequestBody Employee employee) {
		if (employeedao.insertEmployee(employee) ){
			Gson gson = new Gson();
			return gson.toJson(employee);
		} else {
			return null;
		}
	}
	
	@RequestMapping(value = "/deleteEmployee/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
		boolean b= employeedao.deleteEMployee(id);
		if (b==true) {
			return new ResponseEntity<String>("Successfull", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Unsuccessfull", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
