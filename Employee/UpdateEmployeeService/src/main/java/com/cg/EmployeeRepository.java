package com.cg;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "EmployeeDataProvider")
@RibbonClient(name = "EmployeeDataProvider")
public interface EmployeeRepository{
	@PostMapping(path="/addemp")
	public Employee addEmployee(@RequestBody Employee emp);
	
	@PostMapping("/updateemp/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long employeeId);
}
