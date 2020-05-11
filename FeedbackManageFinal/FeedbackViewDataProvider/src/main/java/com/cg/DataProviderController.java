package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * Contains body of all methods
 * 
 * @author Mugdha Chindhe
 *
 */

@RestController
public class DataProviderController {
	@Autowired
	EmployeeRepository employeerepo;
	
	@Autowired
	SkillRepository skillrepo;
	
	@Autowired
	CourseRepository courserepo;
	
	@Autowired
	TrainingProgramRepository trainprogramrepo;
	
	@Autowired
	FeedbackRepository feedbackrepo;
	
	/****************CRUD of EMPLOYEE*************************/
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeerepo.findAll();
	}
	
	@GetMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable long employeeId){
		return employeerepo.findById(employeeId);
	}
	
	@PostMapping(path="/addEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeerepo.save(emp);
	}
	
	@PostMapping("/updateEmp/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long employeeId) {
		employeerepo.delete(employeerepo.findById(employeeId).get());
		return employeerepo.save(employee);
	}
	
	/****************CRUD of SKILL*************************/
	@GetMapping("/skill")
	public List<Skill> getAllSkill(){
		return skillrepo.findAll();
	}
	
	@GetMapping("/skill/{skillId}")
	public Optional<Skill> getSkill(@PathVariable long skillId){
		return skillrepo.findById(skillId);
	}
	
	@PostMapping("/addSkill")
	public Skill addSkill(@RequestBody Skill skill){
		return skillrepo.save(skill);
	}
	
	@PostMapping("/updateSkill/{skillId}")
	public Skill updateSkill(@RequestBody Skill skill,@PathVariable long skillId) {
		skillrepo.delete(skillrepo.findById(skillId).get());
		return skillrepo.save(skill);
	}
	
	/****************CRUD of COURSE*************************/
	@GetMapping("/course")
	public List<Course> getAllCourse(){
		return courserepo.findAll();
	}
	
	@GetMapping("/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable long courseId){
		return courserepo.findById(courseId);
	}
	
	@PostMapping(path="/addCourse/{skillId}")
	public Course addCourse(@RequestBody Course course, @PathVariable long skillId) {
		Skill tmpSkill = skillrepo.findById(skillId).get();
		course.setSkill(tmpSkill);
		return courserepo.save(course);
	}
	
	@PostMapping("/updateCourse/{courseId}")
	public Course updateCourse(@RequestBody Course course,@PathVariable long courseId) {
		courserepo.delete(courserepo.findById(courseId).get());
		return courserepo.save(course);
	}
	
	
	/****************CRUD of TRAINING PROGRAM*************************/
	@GetMapping("/trainingprogram")
	public List<TrainingProgram> getAllTrainingProgram(){
		return trainprogramrepo.findAll();
	}
	
	@GetMapping("/trainingprogram/{trainingProgramId}")
	public Optional<TrainingProgram> getTrainingProgram(@PathVariable long trainingProgramId){
		return trainprogramrepo.findById(trainingProgramId);
	}
	
	@PostMapping(path="/addTP/{courseId}/{empId}")
	public TrainingProgram addTrainingProgram(@RequestBody TrainingProgram trainingprog, @PathVariable long courseId,@PathVariable long empId) {
		Course tmpCourse=courserepo.findById(courseId).get();
		trainingprog.setCourse(tmpCourse);
		Employee tmptrainer=employeerepo.findById(empId).get();
		trainingprog.setTrainer(tmptrainer);//.setParticipant(tmptrainer);
		return trainprogramrepo.save(trainingprog);
	}
	
	@PostMapping("/updateTP/{trainingProgramId}")
	public TrainingProgram updateTrainingProgram(@RequestBody TrainingProgram trainingprog,@PathVariable long trainingProgramId) {
		trainprogramrepo.delete(trainprogramrepo.findById(trainingProgramId).get());
		return trainprogramrepo.save(trainingprog);
	}
	
	
	/****************CRUD of FEEDBACK*************************/
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback(){
		return feedbackrepo.findAll();
	}
	
	@GetMapping("/feedback/{feedbackId}")
	public Optional<Feedback> getFeedback(@PathVariable long feedbackId){
		return feedbackrepo.findById(feedbackId);
	}
	
	@PostMapping(path="/addFeedback/{empId}/{trainingProgramId}")
	public Feedback addFeedback(@RequestBody Feedback feedback,@PathVariable long empId,@PathVariable long trainingProgramId) {
		Employee tmpparticipant=employeerepo.findById(empId).get();
		feedback.setParticipant(tmpparticipant);
		TrainingProgram tmptrainingprogram=trainprogramrepo.findById(trainingProgramId).get();
		feedback.setTrainingProgram(tmptrainingprogram);
		return feedbackrepo.save(feedback);
	}
	
	@PostMapping("/updateFeedback/{feedbackId}")
	public Feedback updateFeedback(@RequestBody Feedback feedback,@PathVariable long feedbackId) {
		feedbackrepo.delete(feedbackrepo.findById(feedbackId).get());
		return feedbackrepo.save(feedback);
	}
}
