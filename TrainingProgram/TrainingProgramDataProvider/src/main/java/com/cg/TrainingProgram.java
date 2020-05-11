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
	private long courseId;
	
	@Column
	private long trainerId;
	
	@Column
	private LocalDate startDate;
	
	@Column
	private LocalDate endDate;
	
	public TrainingProgram() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TrainingProgram(long trainingProgramId, long courseId, long trainerId, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.trainingProgramId = trainingProgramId;
		this.courseId = courseId;
		this.trainerId = trainerId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getTrainingProgramId() {
		return trainingProgramId;
	}

	public void setTrainingProgramId(long trainingProgramId) {
		this.trainingProgramId = trainingProgramId;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public long getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
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
	
}
