package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "CourseDataProvider")
@RibbonClient(name = "CourseDataProvider")
public interface CourseRepository {
	@GetMapping("/course")
	public List<Course> getAllCourse();
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable long courseId);
	
	
}
