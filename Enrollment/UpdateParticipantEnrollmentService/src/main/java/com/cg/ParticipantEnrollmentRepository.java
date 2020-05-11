package com.cg;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ParticipantEnrollmentDataProvider")
@RibbonClient(name = "ParticipantEnrollmentDataProvider")
public interface ParticipantEnrollmentRepository {
	
	@PostMapping(path="/addenrollment")
	public ParticipantEnrollment addParticipantEnrollment(@RequestBody ParticipantEnrollment enrollment);
	
	@PutMapping("/updateenrollment")
	public ParticipantEnrollment updateParticipantEnrollment(@RequestBody ParticipantEnrollment enrollment);
}
