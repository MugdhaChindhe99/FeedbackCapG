package com.cg;

public class ParticipantEnrollment {
	
	private long trainingId;
	
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
	
	
	
}
