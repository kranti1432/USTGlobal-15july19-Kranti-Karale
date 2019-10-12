package com.many.dto;

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
@Table(name="university")
public class University {
	public int getUniversity_id() {
		return university_id;
	}
	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}
	public String getUniversity_name() {
		return university_name;
	}
	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Id
	@Column
	private int university_id;
	@Column
	private String university_name;
	@Column
	private int rank;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="uni_student",joinColumns = @JoinColumn(name="university_id"),inverseJoinColumns = @JoinColumn(name="student_id"))
	private List<Student> student;

}
