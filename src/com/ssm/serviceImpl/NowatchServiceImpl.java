package com.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.NoMatchDao;
import com.ssm.service.NowatchService;
@Service("NowatchService")
public class NowatchServiceImpl implements NowatchService{
	@Autowired
	private NoMatchDao nomatch;//数据库层面
	@Override
	public String deletewatch(String nowatchid) {
		nomatch.noMatch(nowatchid);
		return "Success";
	}

}
