package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Mayur Mandalik
 *
 */

@RestController
public class UpdateController {
	@Autowired
	UpdateRepository proxy;
	
	@PostMapping(path="/addEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		return proxy.addEmployee(emp);
	}
	
	@PostMapping("/updateEmp/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long employeeId) {
		return proxy.updateEmployee(employee, employeeId);
	}
	
	@PostMapping("/addSkill")
	public Skill addSkill(@RequestBody Skill skill) {
		return proxy.addSkill(skill);
	}
	
	@PostMapping("/updateSkill/{skillId}")
	public Skill updateSkill(@RequestBody Skill skill,@PathVariable long skillId) {
		return proxy.updateSkill(skill, skillId);
	}
	
	@PostMapping(path="/addCourse/{skillId}")
	public Course addCourse(@RequestBody Course course, @PathVariable long skillId) {
		return proxy.addCourse(course, skillId);
	}
	
	@PostMapping("/updateCourse/{courseId}")
	public Course updateCourse(@RequestBody Course course,@PathVariable long courseId) {
		return proxy.updateCourse(course, courseId);
	}
	
	@PostMapping(path="/addTP/{courseId}/{empId}")
	public TrainingProgram addTrainingProgram(@RequestBody TrainingProgram trainingprog, @PathVariable long courseId,@PathVariable long empId) {
		return proxy.addTrainingProgram(trainingprog, courseId, empId);
	}
	
	@PostMapping("/updateTP/{trainingProgramId}")
	public TrainingProgram updateTrainingProgram(@RequestBody TrainingProgram trainingprog,@PathVariable long trainingProgramId) {
		return proxy.updateTrainingProgram(trainingprog, trainingProgramId);
	}
	
	@PostMapping(path="/addFeedback/{empId}/{trainingProgramId}")
	public Feedback addFeedback(@RequestBody Feedback feedback,@PathVariable long empId,@PathVariable long trainingProgramId) {
		return proxy.addFeedback(feedback, empId, trainingProgramId);
	}
	
	@PostMapping("/updateFeedback/{feedbackId}")
	public Feedback updateFeedback(@RequestBody Feedback feedback,@PathVariable long feedbackId) {
		return proxy.updateFeedback(feedback, feedbackId);
	}

}
