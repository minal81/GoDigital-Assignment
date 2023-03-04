package com.user.service;

import com.user.entity.User;

public interface UserService {
	
	//To Create User
	User CreateUser(User user);
	
	//To View User 
	User ViewUser(int id);
	
	//To Update User
	User UpdateUser(User user,int id);
	
	
	//To Delete User
	public String DeleteUser(int id);

}
