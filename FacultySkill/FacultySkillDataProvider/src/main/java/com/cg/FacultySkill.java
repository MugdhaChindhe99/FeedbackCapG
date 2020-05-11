package com.cg;

//import java.util.List;

import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Transient;

@Entity
public class FacultySkill {
	
	@Id
	private long facultyId; 
	
	@Column
	private String skillName;

	public FacultySkill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacultySkill(long facultyId, String skillName) {
		super();
		this.facultyId = facultyId;
		this.skillName = skillName;
		//this.courseName= courseName;
	}

	public long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(long facultyId) {
		this.facultyId = facultyId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	/*public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}*/
	
	
}
