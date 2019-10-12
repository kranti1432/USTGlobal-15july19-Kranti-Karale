package com.usttyspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usttyspringboot.dao.EmployeeDAo;
import com.usttyspringboot.dto.Employee;

//@Service("hibernate")
public class EmployeeServiceImpl implements EmployeeService {

	//@Autowired
	private EmployeeDAo dao;
	
	@Override
	public boolean addEmployee(Employee employee) {

		return dao.addEmployee(employee);
	}

	@Override
	public boolean removeEmployee(int id) {

		return dao.removeEmployee(id);
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
return dao.modifyEmployee(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		return dao.getEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
return dao.getAllEmployee();
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
