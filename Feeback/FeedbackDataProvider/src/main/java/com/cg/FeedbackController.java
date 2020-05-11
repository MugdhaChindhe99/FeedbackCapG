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

@RestController
public class FeedbackController {
	@Autowired
	FeedbackRepository feedbackrepo;
	
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback(){
		return feedbackrepo.findAll();
	}
	
	@GetMapping("/feedback/{feedbackId}")
	public Optional<Feedback> getFeedback(@PathVariable long feedbackId){
		return feedbackrepo.findById(feedbackId);
	}
	
	@PostMapping(path="/addfeedback")//{empId}/{trainingProgramId}")
	public Feedback addFeedback(@RequestBody Feedback feedback) {//,@PathVariable long empId,@PathVariable long trainingProgramId) {
		/*Employee tmpparticipant=employeerepo.findById(empId).get();
		feedback.setParticipant(tmpparticipant);
		TrainingProgram tmptrainingprogram=trainprogramrepo.findById(trainingProgramId).get();
		feedback.setTrainingProgram(tmptrainingprogram);*/
		return feedbackrepo.save(feedback);
	}
	
}
