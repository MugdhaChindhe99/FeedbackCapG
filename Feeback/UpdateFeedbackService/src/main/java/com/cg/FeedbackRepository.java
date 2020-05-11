package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "FeedbackDataProvider")
@RibbonClient(name = "FeedbackDataProvider")
public interface FeedbackRepository{
	@PostMapping(path="/addfeedback")//{empId}/{trainingProgramId}")
	public Feedback addFeedback(@RequestBody Feedback feedback);//,@PathVariable long empId,@PathVariable long trainingProgramId);
	
	
}
