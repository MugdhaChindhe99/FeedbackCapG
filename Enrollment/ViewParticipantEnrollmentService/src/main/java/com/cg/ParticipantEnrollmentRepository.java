package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ParticipantEnrollmentDataProvider")
@RibbonClient(name = "ParticipantEnrollmentDataProvider")
public interface ParticipantEnrollmentRepository {
	@GetMapping("/enrollment")
	public List<ParticipantEnrollment> getAllParticipantEnrollment();
	
	@GetMapping("/enrollment/{trainingId}")
	public Optional<ParticipantEnrollment> getParticipantEnrollment(@PathVariable long trainingId);
}
