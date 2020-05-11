package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:4200"},allowCredentials = "true")
@RestController
public class TrainingProgramController {
	@Autowired
	TrainingProgramRepository proxy;
		
	
	@PostMapping(path="/addtrainingprogram")
	public TrainingProgram addTrainingProgram(@RequestBody TrainingProgram trainingprog) {
		
		return proxy.addTrainingProgram(trainingprog);
	}
	
	@PutMapping("/updatetrainingprogram")
	public TrainingProgram updateTrainingProgram(@RequestBody TrainingProgram trainingprog) {
		return proxy.updateTrainingProgram(trainingprog);
	}
}
