package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FeedbackDataProvider")
@RibbonClient(name = "FeedbackDataProvider")
public interface EmployeeRepository {
	@GetMapping("/employee")
	public List<Employee> getAllEmployee();
	
	@GetMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable long employeeId);
	
	@GetMapping("/skill")
	public List<Skill> getAllSkill();
	
	@GetMapping("/skill/{skillId}")
	public Optional<Skill> getSkill(@PathVariable long skillId);
	
	@GetMapping("/course")
	public List<Course> getAllCourse();
	
	@GetMapping("/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable long courseId);
	
	@GetMapping("/trainingprogram")
	public List<TrainingProgram> getAllTrainingProgram();
	
	@GetMapping("/trainingprogram/{trainingProgramId}")
	public Optional<TrainingProgram> getTrainingProgram(@PathVariable long trainingProgramId);
	
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback();
	
	@GetMapping("/feedback/{feedbackId}")
	public Optional<Feedback> getFeedback(@PathVariable long feedbackId);
	
	
}
