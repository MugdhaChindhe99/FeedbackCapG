package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"}, allowCredentials = "false")
@RestController
public class SkillController {
	@Autowired
	SkillRepository proxy;
	
	@GetMapping("/skill")
	public List<Skill> getAllSkill(){
		return proxy.getAllSkill();
	}
	
	@GetMapping("/skill/{skillId}")
	public Skill getSkill(@PathVariable long skillId){
		return proxy.getSkill(skillId);
	}
	
}
