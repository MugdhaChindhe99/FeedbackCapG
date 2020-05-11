package com.cg;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long>{
	//Skill findbyId(long skillId);
}
