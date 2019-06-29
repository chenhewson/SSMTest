package com.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ShowList;
import com.ssm.entity.UserList;
import com.ssm.service.ListService;

@Service("ListService")
public class ListServiceImpl implements ListService{
	@Autowired
	private ShowList showlist;
	@Override
	public List<UserList> showlist() {
		List<UserList> list=showlist.showlist();
		return list;
	}
}
