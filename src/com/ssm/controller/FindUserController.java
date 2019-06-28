package com.ssm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ssm.service.UserService;

@Controller
public class FindUserController {
	@Autowired
	private UserService userService;
	@ResponseBody
	@RequestMapping("find.do")
	public void login(String username,String password,HttpServletResponse rep,HttpServletRequest req,HttpSession session) throws ServletException, IOException{
		System.out.println(username + password);
		String result=userService.findUser(username,password);
		if (result.equals("successed")){
			session.setAttribute("username", username);
			req.getRequestDispatcher("\\WEB-INF\\jsp\\success.jsp").forward(req, rep);
		}
		if (result.equals("无效用户名")){
			session.setAttribute("msg", "无效用户名");
			req.getRequestDispatcher("\\WEB-INF\\jsp\\fail.jsp").forward(req, rep);
		}
		if (result.equals("密码错误")){
			session.setAttribute("msg", "密码错误");
			req.getRequestDispatcher("\\WEB-INF\\jsp\\fail.jsp").forward(req, rep);
		}
		if (result.equals("未知原因")){
			session.setAttribute("msg", "未知原因");
			req.getRequestDispatcher("\\WEB-INF\\jsp\\fail.jsp").forward(req, rep);
		}
		
	}
}
