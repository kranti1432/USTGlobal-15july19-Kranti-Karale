package com.EssPortal.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_leave_info")
public class Employee_Leave_info {
	
	public String getLeave_date() {
		return leave_date;
	}
	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}
	public String getLeave_status() {
		return leave_status;
	}
	public void setLeave_status(String leave_status) {
		this.leave_status = leave_status;
	}

	/*
	 * public Employee_Info getEmployee_info() { return employee_info; } public void
	 * setEmployee_info(Employee_Info employee_info) { this.employee_info =
	 * employee_info; }
	 */
	@Id
	@Column
	private int employee_id;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id1) {
		this.employee_id = employee_id;
	}
	@Column
	private String leave_date;
	@Column
	private String leave_status;
	/*
	 * @OneToOne(mappedBy="employee_leave") private Employee_Info employee_info;
	 */

}
