package mjk.hellospring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Model class for Employee. Contains basic bio and employment details. Emails specified here will be used for 
 * password reset.
 * 
 * @author mjkulkarni
 * @version 0.0
 */

@Entity
@Table(name="tbl_employee")
public class Employee {

	private String primaryEmailId;
	private String secondaryEmailId;
	private String dateOfBirth;
	private String firstName;
	private String lastName;
	private String department;
	private String designation;
	
	public Employee(){}
	
	//TODO Constructor for dev only. Remove in release build.
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * 
	 * @param primaryEmailId
	 * @param secondaryEmailId
	 * @param dateOfBirth
	 * @param firstName
	 * @param lastName
	 * @param department
	 * @param designation
	 * 
	 */
	//TODO Constructor for dev only. Remove in release build.
	public Employee(String primaryEmailId, String secondaryEmailId, String dateOfBirth, String firstName,
			String lastName, String department, String designation) {
		super();
		this.primaryEmailId = primaryEmailId;
		this.secondaryEmailId = secondaryEmailId;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}

	public void setSecondaryEmailId(String secondaryEmailId) {
		this.secondaryEmailId = secondaryEmailId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}