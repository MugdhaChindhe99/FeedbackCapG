package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class UserController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/login")
	public List<Employee> retrieve() {
		return repo.findAll();
	}
	
	@GetMapping(path = "/login/{userName}/{password}")
	public Employee findByuserName(@PathVariable String userName,@PathVariable String password){
		Employee tmpList = repo.findByuserNameAndPassword(userName,password);
		return tmpList;
	}	
	
	
	
	
}

 
