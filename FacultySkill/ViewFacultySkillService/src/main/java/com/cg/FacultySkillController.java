package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"},allowCredentials = "true")
@RestController
public class FacultySkillController {
	
	@Autowired
	FacultySkillRepository proxy;
	
	@GetMapping("/facultyskill")
	public List<FacultySkill> getAllFacultySkill(){
		return proxy.getAllFacultySkill();
	}
	
	@GetMapping("/facultyskill/{facultyId}")
	public FacultySkill getFacultySkill(@PathVariable long facultyId){
		return proxy.getFacultySkill(facultyId);
	}
}
