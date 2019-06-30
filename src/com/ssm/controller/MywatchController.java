package com.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.WatchInf;
import com.ssm.service.MyWatchService;
@Controller
public class MywatchController {
	@Autowired
	private MyWatchService mywatchservice;
	@ResponseBody
	@RequestMapping("Mywatch.do")
	public void MyWatch(HttpServletResponse rep,HttpServletRequest req) throws ServletException, IOException
	{
		String loginusername=(String)req.getSession().getAttribute("loginusername");
		System.out.println(loginusername);
		List<WatchInf> my=mywatchservice.Mywatch(loginusername);
		req.setAttribute("MyWatchList", my);
		req.getRequestDispatcher("Mywatch.jsp").forward(req, rep);
	}
}
