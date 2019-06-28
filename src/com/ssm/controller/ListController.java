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
import com.ssm.service.ListService;
import com.ssm.service.UserService;

@Controller
public class ListController {
	@Autowired
	private ListService listservice;
	@ResponseBody
	@RequestMapping("showlist.do")
	public void showlist(String username,String password,HttpServletResponse rep,HttpServletRequest req) throws ServletException, IOException{
		HttpSession session = req.getSession();
		List<UserList> list=listservice.showlist();
		req.setAttribute("list", list);
		req.getRequestDispatcher("\\WEB-INF\\jsp\\UserList.jsp").forward(req, rep);
	}
}
