package com.ust.ustspring.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.ustspring.dto.Employee;
import com.ust.ustspring.dto.EmployeeResponse;
import com.ust.ustspring.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(path = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		Employee employee= service.getEmployee(id);
		EmployeeResponse response =new EmployeeResponse();
		
		if(employee==null) {
			response.setStatusCode(401);
			response.setMessage("Failure!!");
			response.setDescription("No data Found");
			
		}else {
		response.setStatusCode(201);
		response.setMessage("Suceess!!");
		response.setDescription("data Found");
		response.setEmployees(Arrays.asList(employee));
		
	}
		return response;
	}
	
	@GetMapping(path = "/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	
	@PostMapping(path = "/add",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.addEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("successful!!");
			response.setDescription("data added to DB");
		}else {
			response.setStatusCode(400);
			response.setMessage("failed!!");
			response.setDescription("data not added to DB");
			
		}
		return response;
	}
	
	@PutMapping(path = "/modify",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee( @RequestBody Employee employee) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Successful!!");
			response.setDescription("data modified");
		}else {
			response.setStatusCode(400);
			response.setMessage("failed!!");
			response.setDescription("data not modify");
		}
	 return response;
	}
	
	@DeleteMapping(path = "/remove/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id")int id) {
		EmployeeResponse response=new EmployeeResponse();
		if( service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Successful!!");
			response.setDescription("data removed");
		}else {
			response.setStatusCode(400);
			response.setMessage("Failed!!");
			response.setDescription("not removed");
		}
		return response;
	}

}
