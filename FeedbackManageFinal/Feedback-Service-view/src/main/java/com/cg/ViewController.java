package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Deepali Matkar
 *
 */

@CrossOrigin(origins = {"http://localhost:4200"}, allowCredentials = "false")
@RestController
public class ViewController {
	@Autowired
	EmployeeRepository proxy;
	
	/**************************VIEW SERVICE of EMPLOYEE********************/
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		List<Employee>	get= proxy.getAllEmployee();
		return get;	
	}
	
	@GetMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable long employeeId){
		Optional<Employee> id= proxy.getEmployee(employeeId);
		return id;
	}
	
	
	/**************************VIEW SERVICE of SKILL********************/
	@GetMapping("/skill")
	public List<Skill> getAllSkill(){
		return proxy.getAllSkill();//  .findAll();
	}
	
	@GetMapping("/skill/{skillId}")
	public Optional<Skill> getSkill(@PathVariable long skillId){
		return proxy.getSkill(skillId);//.findById(skillId);
	}
	
	
	/**************************VIEW SERVICE of COURSE********************/
	@GetMapping("/course")
	public List<Course> getAllCourse(){
		List<Course> cour=proxy.getAllCourse();
		return cour;
	}
	
	@GetMapping("/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable long courseId){
		Optional<Course> coursid=proxy.getCourse(courseId);
		return coursid;
	}
	
	
	/**************************VIEW SERVICE of TRAINING PROGRAM********************/
    @GetMapping("/trainingprogram")
	public List<TrainingProgram> getAllTrainingProgram(){
		return proxy.getAllTrainingProgram();
	}
	
	@GetMapping("/trainingprogram/{trainingProgramId}")
	public Optional<TrainingProgram> getTrainingProgram(@PathVariable long trainingProgramId){
		return proxy.getTrainingProgram(trainingProgramId);
	}
	
	
	/**************************VIEW SERVICE of FEEDBACK********************/
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback(){
		return proxy.getAllFeedback();	
	}
	
	@GetMapping("/feedback/{feedbackId}")
	public Optional<Feedback> getFeedback(@PathVariable long feedbackId){
		return proxy.getFeedback(feedbackId);
	}
	
}
