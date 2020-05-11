package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:4200"},allowCredentials = "true")
@RestController
public class FeedbackController {
	@Autowired
	FeedbackRepository proxy;
	
	@Autowired
	EmployeeRepository empproxy;
	
	@Autowired
	TrainingProgramRepository trainingprogramproxy;
	
	@PostMapping(path="/addfeedback")//{empId}/{trainingProgramId}")
	public Feedback addFeedback(@RequestBody Feedback feedback) {//,@PathVariable long empId,@PathVariable long trainingProgramId) {
		Employee tmpemployee = empproxy.getEmployee(feedback.getParticipantId()).get();
		TrainingProgram tmptrainprog = trainingprogramproxy.getTrainingProgram(feedback.getTrainingprogramId());
		if(tmpemployee!=null && tmptrainprog!=null) {
			feedback.setParticipantId(feedback.getParticipantId());
			feedback.setTrainingprogramId(feedback.getTrainingprogramId());
		}
		return proxy.addFeedback(feedback);//, feedback.getParticipantId(), feedback.getTrainingprogramId());
	}
	
	
}
