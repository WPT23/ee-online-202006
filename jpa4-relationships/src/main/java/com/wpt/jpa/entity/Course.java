package com.wpt.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Data
@Table(name = "course")
public class Course implements Serializable{
	private static final long serialVersionUID = 1L;
@Id
	private int id;
private String name;
private double duration;
@Column(length = 11)
private int fees;

}
