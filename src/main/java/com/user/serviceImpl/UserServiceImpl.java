package com.user.serviceImpl;

import com.user.entity.User;
import com.user.service.UserService;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired 
	UserRepository userRepository; 
	
	
	@Override
	public User CreateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User ViewUser(int id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User UpdateUser(User user, int id) {
		User u=userRepository.findById(id).get();
		u.setPosition(user.getPosition());
		
		
		return userRepository.save(u);
	}

	@Override
	public String DeleteUser(int id) {
		User u=userRepository.findById(id).get();
		userRepository.delete(u);
		return "DELETED !!!!";
	}

}
