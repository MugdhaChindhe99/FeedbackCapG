package com.cg;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "FeedbackDataProvider")
@RibbonClient(name = "FeedbackDataProvider")
public interface UpdateRepository {
	@PostMapping(path="/addEmp")
	public Employee addEmployee(@RequestBody Employee emp);
	
	@PostMapping("/updateEmp/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long employeeId);
	
	@PostMapping("/addSkill")
	public Skill addSkill(@RequestBody Skill skill);
	
	@PostMapping("/updateSkill/{skillId}")
	public Skill updateSkill(@RequestBody Skill skill,@PathVariable long skillId);
	
	@PostMapping(path="/addCourse/{skillId}")
	public Course addCourse(@RequestBody Course course, @PathVariable long skillId);
	
	@PostMapping("/updateCourse/{courseId}")
	public Course updateCourse(@RequestBody Course course,@PathVariable long courseId);
	
	@PostMapping(path="/addTP/{courseId}/{empId}")
	public TrainingProgram addTrainingProgram(@RequestBody TrainingProgram trainingprog, @PathVariable long courseId,@PathVariable long empId);
	
	@PostMapping("/updateTP/{trainingProgramId}")
	public TrainingProgram updateTrainingProgram(@RequestBody TrainingProgram trainingprog,@PathVariable long trainingProgramId);
	
	@PostMapping(path="/addFeedback/{empId}/{trainingProgramId}")
	public Feedback addFeedback(@RequestBody Feedback feedback,@PathVariable long empId,@PathVariable long trainingProgramId);
	
	@PostMapping("/updateFeedback/{feedbackId}")
	public Feedback updateFeedback(@RequestBody Feedback feedback,@PathVariable long feedbackId);
}
