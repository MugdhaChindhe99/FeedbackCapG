package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "EmployeeDataProvider")
@RibbonClient(name = "EmployeeDataProvider")
public interface EmployeeRepository{
	@GetMapping("/employee")
	public List<Employee> getAllEmployee();
	
	@GetMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable long employeeId);
}
