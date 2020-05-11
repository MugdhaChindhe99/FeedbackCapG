package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "SkillDataProvider")
@RibbonClient(name = "SkillDataProvider")
public interface SkillRepository {
	@GetMapping("/skill")
	public List<Skill> getAllSkill();
	
	@GetMapping("/skill/{skillId}")
	public Skill getSkill(@PathVariable long skillId);
	
}
