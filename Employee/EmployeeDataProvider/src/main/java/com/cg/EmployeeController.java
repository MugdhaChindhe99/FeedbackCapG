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
	EmployeeRepository employeerepo;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeerepo.findAll();
	}
	
	@GetMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable long employeeId){
		return employeerepo.findById(employeeId);
	}
	
	@PostMapping(path="/addemp")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeerepo.save(emp);
	}
	
	@PostMapping("/updateemp/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long employeeId) {
		employeerepo.delete(employeerepo.findById(employeeId).get());
		return employeerepo.save(employee);
	}
	
	
}
