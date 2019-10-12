package com.dev.Collection;

public class Employee implements Comparable<Employee> {


private String name;
private String email_id;
private String password;
private int id ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", email_id=" + email_id + ", password=" + password + ", id=" + id + "]";
}
@Override
public int compareTo(Employee e) {
	// TODO Auto-generated method stub
	return (this.id-e.id);
}



	}


