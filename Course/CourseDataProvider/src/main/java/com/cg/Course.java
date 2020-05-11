package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
 * This is a course class with fields to save information about course
 * 
 * @author Mugdha Chindhe
 *
 */

@Entity
public class Course {
	@Id
	private long courseId;
	
	@Column
	private String courseName;
	
	@Column
	private long duration; //in days
	
	@Column
	private long skillId;
	
	public Course() {}
	
	public Course(long courseId, String courseName, long duration, long skillId) {//,Skill skill) { 
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


	/*public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	*/
}
