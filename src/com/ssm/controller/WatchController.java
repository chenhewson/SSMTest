package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.WatchService;


@Controller
public class WatchController {
	@Autowired
	private WatchService watchservice;
	@ResponseBody
	@RequestMapping("watch.do")
	public String WatchUser(String username,String id,HttpServletResponse rep,HttpServletRequest req)
	{
		String loginusername=(String)req.getSession().getAttribute("loginusername");
		System.out.println("loginusername="+loginusername);
		watchservice.watchuser(loginusername,username,id);
		return "Success";
	}
}
