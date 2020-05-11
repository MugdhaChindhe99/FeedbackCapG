package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int employeeId;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String role;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
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
	public Employee(int employeeId, String userName, String password, String role) {
		super();
		this.employeeId = employeeId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [employeeId=" + employeeId + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ "]";
	}
	
		
}


