package com.cg;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * This is a trainingprogram class with fields to save information about trainingprogram
 * 
 * @author Mugdha Chindhe
 *
 */

@Entity
public class TrainingProgram {
	@Id
	private long trainingProgramId;
	
	@Column
	private LocalDate startDate;
	
	@Column
	private LocalDate endDate;
	
	@OneToOne
	@JoinColumn(name="COURSE_ID")
	private Course course;
	
	@OneToOne(mappedBy="trainingProgram")
	private Feedback feeedback;
	
	@OneToOne
	@JoinColumn(name="EMP_ID")
	private Employee trainer;
	
	//@OneToOne(mappedBy="trainingProgramConducted")
	/*@Transient
	private Employee employee;*/
	
	public TrainingProgram() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TrainingProgram(long trainingProgramId, LocalDate startDate, LocalDate endDate,Course course,Employee trainer ) {
		super();
		this.trainingProgramId = trainingProgramId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.trainer=trainer;
	}
	
	public long getTrainingProgramId() {
		return trainingProgramId;
	}
	public void setTrainingProgramId(long trainingProgramId) {
		this.trainingProgramId = trainingProgramId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	public Employee getTrainer() {
		return trainer;
	}

	public void setTrainer(Employee trainer) {
		this.trainer = trainer;
	}
	
}
