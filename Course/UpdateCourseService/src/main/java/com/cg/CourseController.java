package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"}, allowCredentials = "false")
@RestController
public class CourseController {
	@Autowired
	CourseRepository proxy;
	
	@Autowired
	SkillRepository skillproxy;
	
	
	@PostMapping(path="/addcourse")
	public Course addCourse(@RequestBody Course course) {
		long skillId=course.getSkillId();
		Skill tmpskill=skillproxy.getSkill(skillId);
		if(tmpskill!=null)
		{
			course.setSkillId(skillId);
		}
		
		//course.setSkill(tmpskill);
		Course tmpCourse=proxy.addCourse(course);
		return tmpCourse;
	}
	
	
	@PutMapping("/updatecourse")
	public Course updateCourse(@RequestBody Course course) {
		Course tmpCourse=proxy.updateCourse(course);
		return tmpCourse;
	}
}
