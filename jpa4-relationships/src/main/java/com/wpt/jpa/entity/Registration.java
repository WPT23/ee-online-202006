package com.wpt.jpa.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Data;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Data
@Entity
@Table(name = "registration")
public class Registration implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private RegistrationPK id;
	
	@ManyToOne
	@JoinColumn(name = "students_id", insertable = false, updatable = false)
	private Student student;
	@ManyToOne
	@JoinColumn(name = "classes_id", insertable = false, updatable = false)
	private ClassRoom classroom;
	
	private LocalDate registrationDate;
	private int paid;
}
