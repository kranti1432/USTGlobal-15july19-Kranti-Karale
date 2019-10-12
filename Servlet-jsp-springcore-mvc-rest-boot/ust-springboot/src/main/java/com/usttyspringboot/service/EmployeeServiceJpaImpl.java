package com.usttyspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usttyspringboot.dto.Employee;
import com.usttyspringboot.repository.EmployeeRepository;

@Service("jpa")
public class EmployeeServiceJpaImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repositoy;

	@Override
	public boolean addEmployee(Employee employee) {
		repositoy.save(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		repositoy.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		repositoy.update(employee.getName(), employee.getPassword(), employee.getId());
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		return repositoy.findById(id).get();

	}

	@Override
	public List<Employee> getAllEmployee() {
		return repositoy.findAll();
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
	
		return repositoy.findByName(name);
	}

}
