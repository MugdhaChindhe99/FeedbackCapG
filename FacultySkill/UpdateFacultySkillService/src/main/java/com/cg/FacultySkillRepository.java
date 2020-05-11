package com.cg;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import org.springframework.data.jpa.repository.JpaRepository;
@FeignClient(name = "FacultySkillDataProvider")
@RibbonClient(name = "FacultySkillDataProvider")
public interface FacultySkillRepository{
	@PostMapping(path="/addfacultyskill")
	public FacultySkill addFacultySkill(@RequestBody FacultySkill facultyskill);
	
	@PutMapping("/updatefacultyskill")
	public FacultySkill updateFacultySkill(@RequestBody FacultySkill facultyskill);
}
