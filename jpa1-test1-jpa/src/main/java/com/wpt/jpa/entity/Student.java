package com.wpt.jpa.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import static javax.persistence.EnumType.STRING;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import static javax.persistence.TemporalType.DATE;
import javax.persistence.SequenceGenerator;
import javax.persistence.SecondaryTable;

@Entity(name = "stuDB")
@SequenceGenerator(name = "st", allocationSize = 3)
@SecondaryTable(name = "emaildb")
public class Student implements Serializable {
	private enum g {
		Female, Male
	}

	@Id	
	private int id;
	@Column(length = 10)
	private String name;
	private String major;
	@Enumerated(STRING)
	private g gender;
	@Column(unique = true)
	private String year;
	@Column(table = "emaildb")
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(DATE)
	private Date dateofBirth;

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	private String academicYear;
	@Transient
	private boolean selected;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAcademicYear() {
		return this.academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public g getGender() {
		return gender;
	}

	public void setGender(g gender) {
		this.gender = gender;
	}

}
