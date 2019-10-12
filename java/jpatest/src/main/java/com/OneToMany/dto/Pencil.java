package com.OneToMany.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
@Entity
@Table(name="pencil")
public class Pencil {
	@Id
	@Column
private int p_id;
	@Column
private String name;
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
