package com.user.serviceImpl;

import org.springframework.stereotype.Service;
import com.user.entity.UserDetails;
import com.user.service.UserDetailsService;
import com.user.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
	
	@Autowired
	UserDetailsRepository UserDetailsRepository;

	@Override
	public UserDetails CreateUserDetails(UserDetails userD) {
		// TODO Auto-generated method stub
		return UserDetailsRepository.save(userD);
	}

	@Override
	public UserDetails ViewUserDEtails(int id) {
		// TODO Auto-generated method stub
		return UserDetailsRepository.findById(id).get();
	}

	@Override
	public String DeleteUserDetails(int id) {
		UserDetailsRepository.findById(id).get();
		UserDetailsRepository.deleteById(id);
		return "DELETED!!!!!!";
	} 

	

}
