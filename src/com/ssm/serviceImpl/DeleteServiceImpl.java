package com.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.DeleteUser;
import com.ssm.dao.ShowList;
import com.ssm.entity.UserList;
import com.ssm.service.DeleteService;
@Service("DeleteService")
public class DeleteServiceImpl implements DeleteService{
	@Autowired
	private DeleteUser deleteUser;//dao层接口
	@Override
	public void deleteuser(String id) {
		int a=Integer.parseInt(id);
		deleteUser.DeleteByID(a);
	}
}
