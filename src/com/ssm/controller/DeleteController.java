package com.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.UserList;
import com.ssm.service.DeleteService;
import com.ssm.service.ListService;

@Controller
public class DeleteController {
	@Autowired
	private DeleteService deleteservice;
	@ResponseBody
	@RequestMapping("delete.do")
	public String deleteByid(String username,String password,HttpServletResponse rep,HttpServletRequest req) throws ServletException, IOException{
		HttpSession session = req.getSession();
		session.setAttribute("username", username);
		session.setAttribute("username", username);
		String id=req.getParameter("id");
		System.out.println(id);
		deleteservice.deleteuser(id);
		return "Success";
	}
	
}
