package com.ssm.dao;

import java.util.List;

import com.ssm.entity.UserInf;
import com.ssm.entity.WatchInf;

public interface MyWatchDao {

	List<WatchInf> myWatch(String loginusername);
}
