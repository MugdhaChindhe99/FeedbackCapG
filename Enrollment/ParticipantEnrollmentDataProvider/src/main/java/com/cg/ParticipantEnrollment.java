package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParticipantEnrollment {
	@Id
	//@Column
	private long trainingId;
	
	@Column
	private String participantId;

	public ParticipantEnrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParticipantEnrollment(long trainingId, String participantId) {
		super();
		this.trainingId = trainingId;
		this.participantId = participantId;
	}

	public long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
	
	

	/*public ParticipantEnrollment(long trainingId, long participantId) {
		super();
		this.trainingId = trainingId;
		this.participantId = participantId;
	}

	public long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}

	public long getParticipantId() {
		return participantId;
	}

	public void setParticipantId(long participantId) {
		this.participantId = participantId;
	}
	*/
	
}
