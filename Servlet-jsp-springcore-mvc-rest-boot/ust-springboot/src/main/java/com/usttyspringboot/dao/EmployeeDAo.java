package com.usttyspringboot.dao;

import java.util.List;

import com.usttyspringboot.dto.Employee;

public interface EmployeeDAo {
	public boolean addEmployee(Employee employee);
	public boolean removeEmployee(int id);
	public boolean modifyEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();

}
