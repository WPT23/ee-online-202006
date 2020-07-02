package com.wpt.jpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 11)
	private int id;
	private String name;
	@OneToOne
	private Address address;
	
	@ElementCollection
	@OneToMany
	private List<Course> course;
	
	@ManyToMany(mappedBy = "student")
	private List<ClassRoom> classroom;
	

}
