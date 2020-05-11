package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"},allowCredentials = "true")
@RestController
public class FacultySkillController {
	
	@Autowired
	FacultySkillRepository proxy;
	
	@PostMapping(path="/addfacultyskill")
	public FacultySkill addFacultySkill(@RequestBody FacultySkill facultyskill){
		return proxy.addFacultySkill(facultyskill);
	}
	
	@PutMapping("/updatefacultyskill")
	public FacultySkill updateFacultySkill(@RequestBody FacultySkill facultyskill){
		return proxy.updateFacultySkill(facultyskill);
	}
}
