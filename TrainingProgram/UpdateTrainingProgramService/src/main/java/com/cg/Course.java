package com.cg;

/**
 * This is a course class with fields to save information about course
 * 
 * @author Mugdha Chindhe
 *
 */


public class Course {

	private long courseId;
	
	private String courseName;
	
	private long duration; //in days
	
	private long skillId;
	
	public Course() {}
	
	public Course(long courseId, String courseName, long duration, long skillId) { 
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.skillId = skillId;
		
	}
	
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
}
