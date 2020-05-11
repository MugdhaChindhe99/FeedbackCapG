package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * This is a employee class with fields to save information about employee
 * 
 * @author Mugdha Chindhe
 *
 */

@Entity
public class Employee {
	@Id
	private long employeeId;
	
	@Column
	private String userName;
	
	@Column
	private String password;
	
	@Column
	private String role;
	
	/*@OneToOne(mappedBy="trainer")
	private TrainingProgram trainingprogram;
	
	@OneToOne(mappedBy="participant")
	private Feedback feedback;*/

	/*@OneToOne(mappedBy = "employee")
    private Employee employee;*/
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long employeeId, String userName, String password, String role) {
		super();
		this.employeeId = employeeId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
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





