package com.many.dto;

import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column
	private int student_id;
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
	public int getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}
	public List<University> getUniversity() {
		return university;
	}
	public void setUniversity(List<University> university) {
		this.university = university;
	}
	@Column
	private String student_name;
	@Column
	private int studentRank;
	@ManyToMany(mappedBy = "student")
	//@JoinTable(name="uni_student",joinColumns = @JoinColumn(name="university_id"),inverseJoinColumns = @JoinColumn(name="student_id"))
	private List<University> university;


}
