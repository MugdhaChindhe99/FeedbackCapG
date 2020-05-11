package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingProgramController {
	@Autowired
	TrainingProgramRepository trainprogramrepo;
	
	@GetMapping("/trainingprogram")
	public List<TrainingProgram> getAllTrainingProgram(){
		return trainprogramrepo.findAll();
	}
	
	@GetMapping("/trainingprogram/{trainingProgramId}")
	public TrainingProgram getTrainingProgram(@PathVariable long trainingProgramId){
		return trainprogramrepo.findById(trainingProgramId).get();
	}
	
	@PostMapping(path="/addtrainingprogram")
	public TrainingProgram addTrainingProgram(@RequestBody TrainingProgram trainingprog) {
		/*Course tmpCourse=courserepo.findById(courseId).get();
		trainingprog.setCourse(tmpCourse);
		Employee tmptrainer=employeerepo.findById(empId).get();
		trainingprog.setTrainer(tmptrainer);//.setParticipant(tmptrainer);*/
		return trainprogramrepo.save(trainingprog);
	}
	
	@PutMapping("/updatetrainingprogram")
	public TrainingProgram updateTrainingProgram(@RequestBody TrainingProgram trainingprog) {
		return trainprogramrepo.save(trainingprog);
	}
}
