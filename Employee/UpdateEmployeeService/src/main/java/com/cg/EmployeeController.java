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
public class EmployeeController {
	@Autowired
	EmployeeRepository proxy;
	
	@PostMapping(path="/addemp")
	public Employee addEmployee(@RequestBody Employee emp){
		return proxy.addEmployee(emp);
	}
	
	@PostMapping("/updateemp/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long employeeId){
		return proxy.updateEmployee(employee, employeeId);
	}
	
	
}
