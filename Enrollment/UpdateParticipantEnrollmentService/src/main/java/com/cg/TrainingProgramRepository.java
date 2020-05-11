package com.cg;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "TrainingProgramDataProvider")
@RibbonClient(name = "TrainingProgramDataProvider")
public interface TrainingProgramRepository{
	/*@GetMapping("/trainingprogram")
	public List<TrainingProgram> getAllTrainingProgram();*/
	
	@GetMapping("/trainingprogram/{trainingProgramId}")
	public TrainingProgram getTrainingProgram(@PathVariable long trainingProgramId);
}
