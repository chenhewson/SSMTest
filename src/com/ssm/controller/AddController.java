package com.ssm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
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
	public String addUser(String username,String password,HttpServletResponse rep,HttpServletRequest req) throws ServletException, IOException {
		System.out.println(username);
		int id=addservice.adduser(username,password);
		System.out.println("新增的用户id="+id);
		return "Success";
	}
}
