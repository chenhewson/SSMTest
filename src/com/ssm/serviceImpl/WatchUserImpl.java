package com.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.WatchUser;
import com.ssm.service.WatchService;
@Service("WatchService")
public class WatchUserImpl implements WatchService{
	@Autowired
	private WatchUser watchuser;//数据库层面

	@Override
	public void watchuser(String loginusername, String username, String id) {
		System.out.println("loginusername="+loginusername);
		System.out.println("username="+username);
		System.out.println("username="+id);
		watchuser.watchUser(loginusername, username, id);
	}
	
}
