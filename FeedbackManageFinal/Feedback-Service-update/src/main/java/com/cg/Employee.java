package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * This is a employee class with fields to save information about employee
 * 
 * @author Mayur Mandalik
 *
 */

public class Employee {

	private long employeeId;
	
	private String employeeName;
	
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

	public Employee(long employeeId, String employeeName, String password, String role) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.role = role;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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




