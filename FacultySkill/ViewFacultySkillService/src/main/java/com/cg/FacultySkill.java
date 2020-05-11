package com.cg;

//import java.util.List;

//import javax.persistence.Transient;


public class FacultySkill {
	
	private long facultyId; 
	
	private String skillName;

	public FacultySkill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacultySkill(long facultyId, String skillName) {
		super();
		this.facultyId = facultyId;
		this.skillName = skillName;
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

}
