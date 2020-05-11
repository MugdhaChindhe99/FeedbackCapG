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
public class ParticipantEnrollmentController {
	
	@Autowired
	ParticipantEnrollmentRepository enrollmentrepo;
	
	@GetMapping("/enrollment")
	public List<ParticipantEnrollment> getAllParticipantEnrollment(){
		return enrollmentrepo.findAll();
	}
	
	@GetMapping("/enrollment/{trainingId}")
	public Optional<ParticipantEnrollment> getParticipantEnrollment(@PathVariable long trainingId){
		return enrollmentrepo.findById(trainingId);
	}
	
	@PostMapping(path="/addenrollment")
	public ParticipantEnrollment addParticipantEnrollment(@RequestBody ParticipantEnrollment enrollment) {
		return enrollmentrepo.save(enrollment);
	}
	
	@PutMapping("/updateenrollment")
	public ParticipantEnrollment updateParticipantEnrollment(@RequestBody ParticipantEnrollment enrollment) {
	
		return enrollmentrepo.save(enrollment);
	}
}
