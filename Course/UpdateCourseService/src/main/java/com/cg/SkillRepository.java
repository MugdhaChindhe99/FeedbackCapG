package com.cg;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SkillDataProvider")
@RibbonClient(name = "SkillDataProvider")
public interface SkillRepository {
	@GetMapping("/skill/{skillId}")
	public Skill getSkill(@PathVariable long skillId);
}
