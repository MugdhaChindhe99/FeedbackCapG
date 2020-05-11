package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	CourseRepository courserepo;
	
	//Skill skill;
	
	@GetMapping("/course")
	public List<Course> getAllCourse(){
		return courserepo.findAll();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable long courseId){
		return courserepo.findById(courseId).get();
	}
	
	@PostMapping(path="/addcourse")
	public Course addCourse(@RequestBody Course course) {
		/*Skill tmpSkill = skillrepo.findById(skillId).get();
		course.setSkill(tmpSkill);*/
		
		return courserepo.save(course);
	}
	
	/*@PostMapping(path="/addcourse/{skillId}")
	public Course addCourse(@RequestBody Course course,@RequestBody Skill skill,@PathVariable long skillId) {
		/*Skill tmpSkill = skillrepo.findById(skillId).get();
		course.setSkill(tmpSkill);
		return courserepo.save(course);
	}*/
	
	@PutMapping("/updatecourse")
	public Course updateCourse(@RequestBody Course course) {
		return courserepo.save(course);
	}
}
