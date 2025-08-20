package com.dcl.sdb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int id;
	
	@Column(name = "first_Name")
	private String firstName;
	
	@Column(name = "last_Name")
	private String lastName;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "phone_no", nullable = false)
	private long phoneNo;
	
	@Column(name = "city")
	private String city;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
	private List<ProfileUrl> profileUrls;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<ProfileUrl> getProfileUrls() {
		return profileUrls;
	}

	public void setProfileUrls(List<ProfileUrl> profileUrls) {
		this.profileUrls = profileUrls;
	}

	
}
