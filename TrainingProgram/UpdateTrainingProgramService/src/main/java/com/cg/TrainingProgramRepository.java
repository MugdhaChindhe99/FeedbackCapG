package com.cg;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "TrainingProgramDataProvider")
@RibbonClient(name = "TrainingProgramDataProvider")
public interface TrainingProgramRepository{
	@PostMapping(path="/addtrainingprogram")
	public TrainingProgram addTrainingProgram(@RequestBody TrainingProgram trainingprog);
	
	@PutMapping("/updatetrainingprogram")
	public TrainingProgram updateTrainingProgram(@RequestBody TrainingProgram trainingprog);
}
