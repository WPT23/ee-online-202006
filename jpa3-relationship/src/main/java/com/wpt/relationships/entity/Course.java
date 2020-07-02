package com.wpt.relationships.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Lessons>lesson;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
