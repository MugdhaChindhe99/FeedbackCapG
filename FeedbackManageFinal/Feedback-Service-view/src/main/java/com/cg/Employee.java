package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * This is a employee class with fields to save information about employee
 * 
 * @author Deepali Matkar
 *
 */

public class Employee {

	private long employeeId;
	
	private String username;
	
	private String password;
	
	private String role;
	
	/*@OneToOne(mappedBy="trainer")
	private TrainingProgram trainingprogram;
	
	@OneToOne(mappedBy="participant")
	private Feedback feedback;
*/

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long employeeId, String username, String password, String role) {
		super();
		this.employeeId = employeeId;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}




