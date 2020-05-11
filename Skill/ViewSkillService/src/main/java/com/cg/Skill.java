package com.cg;

/**
 * This is a skill class with fields to save information about skill
 * 
 * @author Mugdha Chindhe
 *
 */


public class Skill {

	private long skillId;

	private String skillName;
	
	//@OneToOne(mappedBy="skillId")
	/*@OneToOne(mappedBy="skill")
	private Course course;*/
	
	public Skill() {}
	
	public Skill(long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
}
