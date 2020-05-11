package com.cg;

import java.util.List;
import java.util.Optional;

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
	FacultySkillRepository facultyskillrepo;
	
	@GetMapping("/facultyskill")
	public List<FacultySkill> getAllFacultySkill(){
		return facultyskillrepo.findAll();
	}
	
	@GetMapping("/facultyskill/{facultyId}")
	public FacultySkill getFacultySkill(@PathVariable long facultyId){
		return facultyskillrepo.findById(facultyId).get(); //employeerepo.findById(employeeId);
	}
	
	@PostMapping(path="/addfacultyskill")
	public FacultySkill addFacultySkill(@RequestBody FacultySkill facultyskill) {
		return facultyskillrepo.save(facultyskill);
	}
	
	@PutMapping("/updatefacultyskill")
	public FacultySkill updateFacultySkill(@RequestBody FacultySkill facultyskill) {
		//employeerepo.delete(employeerepo.findById(employeeId).get());
		return facultyskillrepo.save(facultyskill);
	}
}
