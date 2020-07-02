package com.wpt.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import javax.persistence.Table;
import javax.persistence.Column;

@Data
@Entity
@Table(name = "address")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 11)
	private int id;
	private String phone;
	private String email;
	private String address;
	@OneToOne(mappedBy = "address")
	private Student student;
}
