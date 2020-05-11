package com.cg;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CourseDataProvider")
@RibbonClient(name = "CourseDataProvider")
public interface CourseRepository {
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable long courseId);
}
