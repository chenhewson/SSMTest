package com.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.UserInf;
import com.ssm.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public String findUser(String username, String password) {
		UserInf user=userDao.findByName(username);
		if(user==null)
			return "无效用户名";
		if((user.getUsername().equals(username))&&(!user.getPassword().equals(password)))
			return "密码错误";
		if((user.getUsername().equals(username))&&(user.getPassword().equals(password)))
			return "successed";
		else
			return "未知原因";
	
	}
}
