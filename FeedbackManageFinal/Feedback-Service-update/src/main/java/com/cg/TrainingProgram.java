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
 * @author Mayur Mandalik
 *
 */

public class TrainingProgram {
	
	private long trainingProgramId;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private Course course;
	
	private Employee trainer;
	
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
