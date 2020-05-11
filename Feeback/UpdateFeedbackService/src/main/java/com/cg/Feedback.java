package com.cg;

/**
 * This is a feedback class with fields to save information about feedback
 * 
 * @author Mugdha Chindhe
 *
 */


public class Feedback {
	
	private long feedbackId;

	private int personalCommunication;

	private int clarifyDoubts;

	private int timeManagement;

	private int hndOut;

	private int networkAvailability;

	private String comments;

	private String suggestions;

	private long trainingprogramId;

	private long participantId;
	
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Feedback(long feedbackId, int personalCommunication, int clarifyDoubts, int timeManagement, int hndOut,
			int networkAvailability, String comments, String suggestions, long trainingprogramId, long participantId) {
		super();
		this.feedbackId = feedbackId;
		this.personalCommunication = personalCommunication;
		this.clarifyDoubts = clarifyDoubts;
		this.timeManagement = timeManagement;
		this.hndOut = hndOut;
		this.networkAvailability = networkAvailability;
		this.comments = comments;
		this.suggestions = suggestions;
		this.trainingprogramId = trainingprogramId;
		this.participantId = participantId;
	}


	public long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getPersonalCommunication() {
		return personalCommunication;
	}
	public void setPersonalCommunication(int personalCommunication) {
		this.personalCommunication = personalCommunication;
	}
	public int getClarifyDoubts() {
		return clarifyDoubts;
	}
	public void setClarifyDoubts(int clarifyDoubts) {
		this.clarifyDoubts = clarifyDoubts;
	}
	public int getTimeManagement() {
		return timeManagement;
	}
	public void setTimeManagement(int timeManagement) {
		this.timeManagement = timeManagement;
	}
	public int getHndOut() {
		return hndOut;
	}
	public void setHndOut(int hndOut) {
		this.hndOut = hndOut;
	}
	public int getNetworkAvailability() {
		return networkAvailability;
	}
	public void setNetworkAvailability(int networkAvailability) {
		this.networkAvailability = networkAvailability;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	public long getTrainingprogramId() {
		return trainingprogramId;
	}
	public void setTrainingprogramId(long trainingprogramId) {
		this.trainingprogramId = trainingprogramId;
	}
	public long getParticipantId() {
		return participantId;
	}
	public void setParticipantId(long participantId) {
		this.participantId = participantId;
	}
	
}
