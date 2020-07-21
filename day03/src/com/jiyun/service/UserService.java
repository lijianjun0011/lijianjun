package com.jiyun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiyun.bean.User;
import com.jiyun.mapper.UserMapper;
@Service
public class UserService {
	@Autowired
	private UserMapper um;
	public int toLogin(User user) {
		int i = um.toLogin(user);
		return i;
	}

}
