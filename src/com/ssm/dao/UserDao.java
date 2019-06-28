package com.ssm.dao;

import com.ssm.entity.UserInf;

public interface UserDao {

	UserInf findByName(String username);
	
}
