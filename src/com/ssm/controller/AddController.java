package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.AddService;
import com.ssm.service.DeleteService;

@Controller
public class AddController {
	@Autowired
	private AddService addservice;
	@ResponseBody
	@RequestMapping("add.do")
	public String addUser(String username,String password,HttpServletResponse rep,HttpServletRequest req) {
		int id=addservice.adduser(username,password);
		System.out.println("id="+id);
		if(id==1)
		{
			return "success";
		}
		else
			return "fail";
	}
}
