package com.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.SearchUser;
import com.ssm.dao.ShowList;
import com.ssm.entity.UserInf;
import com.ssm.entity.UserList;
import com.ssm.service.SearchService;

@Service("SearchService")
public class SearchServiceImpl implements SearchService{
	@Autowired
	private SearchUser searchuser;//数据库层面

	@Override
	public List<UserList> searchuser(String username, String id) {
		
		return searchuser.search(username,id);
	}

	
}
