package com.cg;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "SkillDataProvider")
@RibbonClient(name = "SkillDataProvider")
public interface SkillRepository {
	
	@PostMapping("/addskill")
	public Skill addSkill(@RequestBody Skill skill);
	
	@PostMapping("/updateskill/{skillId}")
	public Skill updateSkill(@RequestBody Skill skill,@PathVariable long skillId);
}
