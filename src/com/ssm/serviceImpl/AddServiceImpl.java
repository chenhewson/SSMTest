package com.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.AddUser;
import com.ssm.service.AddService;
@Service("AddService")
public class AddServiceImpl implements AddService{
	@Autowired
	private AddUser addUser;//dao层接口
	@Override
	public int adduser(String username, String password) {
		int id=-1;
		id=addUser.add(username,password);
		System.out.println(id);
		return id;
	}

}
