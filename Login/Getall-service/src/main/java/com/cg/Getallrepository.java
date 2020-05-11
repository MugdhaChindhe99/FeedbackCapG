package com.cg;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * @author Aditya Ghogale
 *
 */
@FeignClient(name = "logindataprovider")
@RibbonClient(name = "logindataprovider")
public interface Getallrepository {

  @GetMapping("/login")
	public List<GetUser> retrieve();

  @GetMapping(path = "/login/{userName}/{password}")
	public GetUser findByuserNameAndPassword(@PathVariable String userName,@PathVariable String password);
	
}