package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:4200"},allowCredentials = "true")
@RestController
public class FeedbackController {
	@Autowired
	FeedbackRepository proxy;
	
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback(){
		return proxy.getAllFeedback();
	}
	
	@GetMapping("/feedback/{feedbackId}")
	public Optional<Feedback> getFeedback(@PathVariable long feedbackId){
		return proxy.getFeedback(feedbackId);
	}
	
	/*@PostMapping(path="/addfeedback/{empId}/{trainingProgramId}")
	public Feedback addFeedback(@RequestBody Feedback feedback,@PathVariable long empId,@PathVariable long trainingProgramId) {
		return feedbackrepo.save(feedback);
	}
	
	@PutMapping("/updatefeedback/{feedbackId}")
	public Feedback updateFeedback(@RequestBody Feedback feedback,@PathVariable long feedbackId) {
		feedbackrepo.delete(feedbackrepo.findById(feedbackId).get());
		return feedbackrepo.save(feedback);
	}*/
}
