package com.EssPortal.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Employee_Info")
public class Employee_Info {
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public String getEmployee_password() {
		return employee_password;
	}
	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}
	@Id
	@Column
	private int employee_id;
	@Column
	private String employee_name;
	@Column
	private String employee_type;
	@Column
	private String employee_email;
	@Column
	private String employee_password;
	/*
	 * @OneToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="employee_id1") private Employee_Leave_info employee_leave;
	 * public Employee_Leave_info getEmployee_leave() { return employee_leave; }
	 * public void setEmployee_leave(Employee_Leave_info employee_leave) {
	 * this.employee_leave = employee_leave; }
	 */

}
