package com.wpt.jpa.entity;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import javax.persistence.CollectionTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinTable;

@Entity
@Data
@Table(name = "classroom")
public class ClassRoom implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 11)
	private int id;

	@ElementCollection
	@CollectionTable(name = "class_days", joinColumns = @JoinColumn(name = "class_id"))
	private List<DayOfWeek> days;
	private LocalDate startDate;
	private LocalDate timeFrom;
	private LocalDate timeTo;
	@ManyToOne
	private Course course;

	@ManyToMany
	@JoinTable(name = "registration", inverseJoinColumns = @JoinColumn(name = "students_id"), joinColumns = @JoinColumn(name = "classes_id", referencedColumnName = "id"))
	private List<Student> student;
}
