package com.user.entity;

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
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="userName",length=20)
	private String UserName;
	
	@Column(name="userPosition")
	private String Position;
	
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userDetailsId")
	private UserDetails userDetails ;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + ", Position=" + Position + ", getUserId()="
				+ getUserId() + ", getUserName()=" + getUserName() + ", getPosition()=" + getPosition()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	public User(int userId, String userName, String position, UserDetails userDetails) {
		super();
		this.userId = userId;
		UserName = userName;
		Position = position;
		this.userDetails = userDetails;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPosition() {
		return Position;
	}


	public void setPosition(String position) {
		Position = position;
	}


	public UserDetails getUserDetails() {
		return userDetails;
	}


	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

}
