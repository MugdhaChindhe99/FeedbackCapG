package com.cg;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "CourseDataProvider")
@RibbonClient(name = "CourseDataProvider")
public interface CourseRepository {
	
	@PostMapping(path="/addcourse")
	public Course addCourse(@RequestBody Course course);
	
	@PutMapping("/updatecourse")
	public Course updateCourse(@RequestBody Course course);

	/*@PostMapping(path="/addcourse/{skillId}")
	public Course addCourse(@RequestBody Course course,@RequestBody Skill skill,@PathVariable long skillId);*/
	
	/*@PostMapping(path="/addcourse")
	public Course addCourse(@RequestBody Course course,@RequestBody Skill skill);*/
}
