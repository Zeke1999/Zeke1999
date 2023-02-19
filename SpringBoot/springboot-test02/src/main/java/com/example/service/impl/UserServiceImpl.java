package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public Boolean verifyUser(User user) {
		// TODO Auto-generated method stub
		String username = user.getUsername();
		String password= user.getPassword();
		User user2=userMapper.getUser(username);
		if(user2==null) {
			return false;
		}else if(password.equals(user2.getPassword())){
			return true;
		}else {
			return false;
		}
	}
	
}
