package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.UpdataUserService;
import com.ssm.service.WatchService;

@Controller
public class UpdataUserController {
	@Autowired
	private UpdataUserService updatauser;
	@ResponseBody
	@RequestMapping("updatauser.do")
	public String updatauser(String username,String id,HttpServletResponse rep,HttpServletRequest req)
	{
		String updataid=req.getParameter("updataid");
		String newusername=req.getParameter("newusername");
		String newpassword=req.getParameter("newpassword");
		System.out.println("updataid="+updataid);
		System.out.println("newusername="+newusername);
		System.out.println("newpassword="+newpassword);
		updatauser.updatauser(updataid,newusername,newpassword);
		return "Success";
	}
	
}
