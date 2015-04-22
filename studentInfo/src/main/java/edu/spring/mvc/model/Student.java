package edu.spring.mvc.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.log4j.Logger;
import org.hibernate.validator.constraints.Email;

import edu.spring.mvc.customValidator.IsValidHobby;


public class Student {
	
	private static final Logger logger = Logger.getLogger(Student.class);
	public Student() {
		logger.debug("enters Student constructor");
	}
	
	@NotNull
	private int id;
	@Pattern(regexp="[^0-9]*")
	private String firstName;
	@Pattern(regexp="[^0-9]*")
	private String lastName;
	private String gender;
	@Past
	private Date dob;
	@Email
	private String email;
	private Long mobile;
	@Size(min=4,max=10)
	@IsValidHobby(hobbies="Music|music|MUSIC|Cricket|Football|Hockey|Reading|Snooker|Table Tennis")
	private String hobby;
	private List<String> skills;
	private Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
