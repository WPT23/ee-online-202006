package com.wpt.jpa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import javax.persistence.Column;

@Data
@Embeddable
public class RegistrationPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "students_id")
	private int studentId;
	@Column(name = "classes_id")
	private int classId;
}
