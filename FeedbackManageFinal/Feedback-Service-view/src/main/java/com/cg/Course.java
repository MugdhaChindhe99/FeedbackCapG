package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
 * This is a course class with fields to save information about course
 * 
 * @author Deepali Matkar
 *
 */
public class Course {

	private long courseId;

	private String courseName;
	
	private long duration; //in days
	
	private Skill skill;
	//private long skillId;
	
	public Course() {}
	
	public Course(long courseId, String courseName, long duration,Skill skill) { //long skillId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.skill = skill;
		//this.skillId=skillId;
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

	/*public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}*/

	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
}
