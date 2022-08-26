package com.in.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String name;
	private String city;
	
	
	@JsonIgnore
	@JoinTable( name="student_course", joinColumns= {@JoinColumn(name="si")}, inverseJoinColumns= {@JoinColumn(name="ci")})
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Course> lc;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Course> getLc() {
		return lc;
	}

	public void setLc(List<Course> lc) {
		this.lc = lc;
	}
	
}
