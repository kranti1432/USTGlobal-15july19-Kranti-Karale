package com.ust.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_info")
public class EmployeeInfoBean {
	@Id
	@Column
private int emp_id;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Column
private String emp_name;
@Column
private String designation;
@Column
private double salary;
@Column
private int age;
@Column
private String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}//
