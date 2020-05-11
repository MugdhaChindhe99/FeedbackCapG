package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FeedbackDataProvider")
@RibbonClient(name = "FeedbackDataProvider")
public interface FeedbackRepository{
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback();
	
	@GetMapping("/feedback/{feedbackId}")
	public Optional<Feedback> getFeedback(@PathVariable long feedbackId);
}
