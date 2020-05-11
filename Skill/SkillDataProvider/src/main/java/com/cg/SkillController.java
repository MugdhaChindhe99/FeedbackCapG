package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
	@Autowired
	SkillRepository skillrepo;
	
	@GetMapping("/skill")
	public List<Skill> getAllSkill(){
		return skillrepo.findAll();
	}
	
	@GetMapping("/skill/{skillId}")
	public Skill getSkill(@PathVariable long skillId){
		return skillrepo.findById(skillId).get();
	}
	
	@PostMapping("/addskill")
	public Skill addSkill(@RequestBody Skill skill){
		return skillrepo.save(skill);
	}
	
	@PutMapping("/updateskill/{skillId}")
	public Skill updateSkill(@RequestBody Skill skill,@PathVariable long skillId) {
		skillrepo.delete(skillrepo.findById(skillId).get());
		return skillrepo.save(skill);
	}
}
