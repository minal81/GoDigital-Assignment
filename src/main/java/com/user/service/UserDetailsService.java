package com.user.service;


import com.user.entity.UserDetails;


public interface UserDetailsService {
	
	    //To Create UserDetails
		UserDetails CreateUserDetails(UserDetails userD);
		
		//To View UserDetails 
		UserDetails ViewUserDEtails(int id);
		
		
		
		//To Delete UserDetails
		public String DeleteUserDetails(int id);

}
