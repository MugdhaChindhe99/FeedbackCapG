package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"},allowCredentials = "true")
@RestController
public class ParticipantEnrollmentController {
	@Autowired
	ParticipantEnrollmentRepository  proxy;
	
	@GetMapping("/enrollment")
	public List<ParticipantEnrollment> getAllParticipantEnrollment(){
		return proxy.getAllParticipantEnrollment();
	}
	
	@GetMapping("/enrollment/{trainingId}")
	public Optional<ParticipantEnrollment> getParticipantEnrollment(@PathVariable long trainingId){
		return proxy.getParticipantEnrollment(trainingId);
	}
	
}
