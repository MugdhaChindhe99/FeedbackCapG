package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
/**
 * This is a skill class with fields to save information about skill
 * 
 * @author Mugdha Chindhe
 *
 */

@Entity(name="skill")
public class Skill {
	@Id
	private long skillId;
	
	@Column
	private String skillName;
	
	//@OneToOne(mappedBy="skillId")
	@OneToOne(mappedBy="skill")
	private Course course;
	
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
	
	
	
	/*@OneToOne(mappedBy="skill")
	private Course course;
	
	//@OneToOne(mappedBy="skills")
	@Transient
	private Employee employee;
	
	public Skill() {}
	
	public Skill(long skillId, String title) {
		super();
		this.skillId = skillId;
		this.title = title;
	}
	
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", title=" + title + "]";
	}*/

}
