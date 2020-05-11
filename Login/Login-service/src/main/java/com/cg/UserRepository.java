package com.cg;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<Employee, Long> {
	
	public Employee findByuserNameAndPassword(@Param("userName") String userName,@Param("password") String password);
}
