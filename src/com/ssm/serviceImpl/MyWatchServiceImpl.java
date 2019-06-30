package com.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.MyWatchDao;
import com.ssm.entity.WatchInf;
import com.ssm.service.MyWatchService;
@Service("MyWatchService")
public class MyWatchServiceImpl implements MyWatchService{
	@Autowired
	private MyWatchDao mywatch;//数据库层面

	@Override
	public List<WatchInf> Mywatch(String loginusername) {
		return mywatch.myWatch(loginusername);
	}
	

}
