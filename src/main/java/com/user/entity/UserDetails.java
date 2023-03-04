package com.user.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="userdeatils")
public class UserDetails {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int userdeatilsId;
	
	@Column(name="fname",length=10)
	private String FName;
	
	@Column(name="Lname",length=10)
	private String LName;
	
	@Column(name="gender")
	private String Gender;
	
	@Column(name="department")
	private String Department;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userDetails")
	@JoinColumn(name="userId")
	private User user;

	public int getUserdeatilsId() {
		return userdeatilsId;
	}

	public void setUserdeatilsId(int userdeatilsId) {
		this.userdeatilsId = userdeatilsId;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDetails(int userdeatilsId, String fName, String lName, String gender, String department, User user) {
		super();
		this.userdeatilsId = userdeatilsId;
		FName = fName;
		LName = lName;
		Gender = gender;
		Department = department;
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDetails [userdeatilsId=" + userdeatilsId + ", FName=" + FName + ", LName=" + LName + ", Gender="
				+ Gender + ", Department=" + Department + ", user=" + user + "]";
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
