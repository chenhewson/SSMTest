package com.ssm.service;

import java.util.List;

import com.ssm.entity.UserInf;
import com.ssm.entity.WatchInf;

public interface MyWatchService {

	List<WatchInf> Mywatch(String loginusername);

}
