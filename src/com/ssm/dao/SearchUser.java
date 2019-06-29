package com.ssm.dao;

import java.util.List;

import com.ssm.entity.UserList;

public interface SearchUser {

	List<UserList> search(String username, String id);

}
