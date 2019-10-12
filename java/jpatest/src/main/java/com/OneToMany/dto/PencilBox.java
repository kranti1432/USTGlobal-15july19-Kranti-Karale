package com.OneToMany.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pencilbox")
public class PencilBox {
	@Id
	@Column
private int box_no;
	@Column
private String box_name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="box_no",nullable=false)
	List<Pencil> pencil;
	public List<Pencil> getPencil() {
		return pencil;
	}
	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}
	public int getBox_no() {
		return box_no;
	}
	public void setBox_no(int box_no) {
		this.box_no = box_no;
	}
	public String getBox_name() {
		return box_name;
	}
	public void setBox_name(String box_name) {
		this.box_name = box_name;
	}
	
}
