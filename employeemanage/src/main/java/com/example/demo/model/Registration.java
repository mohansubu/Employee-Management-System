package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;

@Entity
@ToString
public class Registration {
	
	
	@Id
	private Long E_id;
	private String first_name;
	private String last_name;
	private String designation;
	private String qualification;
	private int salary;
	private String dob;
	private String blood_group;
	private String age;
	private String gender;
	private String address;
	private String phone_number;
	private String email;
	
	public Registration(){}
	public Registration(Long e_id, String first_name, String last_name, String designation, String qualification,
			int salary, String dob, String blood_group, String age, String gender, String address, String phone_number,String email) {
		super();
		E_id = e_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.designation = designation;
		this.qualification = qualification;
		this.salary = salary;
		this.dob = dob;
		this.blood_group = blood_group;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone_number = phone_number;
		this.email = email;
	}

	public Long getE_id() {
		return E_id;
	}

	public void setE_id(Long e_id) {
		E_id = e_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
