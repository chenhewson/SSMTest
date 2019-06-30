package com.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UpdataUserDao;
import com.ssm.service.UpdataUserService;
@Service("UpdataUserService")
public class UpdataUserServiceImpl implements UpdataUserService{
	@Autowired
	private UpdataUserDao updatauser;
	@Override
	public void updatauser(String updataid, String newusername, String newpassword) {
		System.out.println("updataid="+updataid);
		System.out.println("newusername="+newusername);
		System.out.println("newpassword="+newpassword);
		updatauser.updata(updataid,newusername,newpassword);
		// TODO Auto-generated method stub
		
	}

}
