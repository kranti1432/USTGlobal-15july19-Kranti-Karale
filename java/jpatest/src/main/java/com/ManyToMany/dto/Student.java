package com.ManyToMany.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column
private int student_id;
	@Column
	private String student_name;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	
	@JoinTable(name="student_cousre",joinColumns = @JoinColumn(name="student_id"),inverseJoinColumns = @JoinColumn(name="course_id"))
	private List<Course> course;
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", course=" + course + "]";
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
}
