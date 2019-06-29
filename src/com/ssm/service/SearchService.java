package com.ssm.service;

import java.util.List;

import com.ssm.entity.UserList;

public interface SearchService {

	List<UserList> searchuser(String username, String id);
}
