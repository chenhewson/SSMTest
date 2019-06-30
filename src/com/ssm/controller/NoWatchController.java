package com.ssm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.NowatchService;

@Controller
public class NoWatchController {
	@Autowired NowatchService nowatch;
	@ResponseBody
	@RequestMapping("nowatch.do")
	public String NoWatch(HttpServletResponse rep,HttpServletRequest req) throws ServletException, IOException {
		String nowatchid=req.getParameter("nowatchid");
		System.out.println("nowatchid="+nowatchid);
		String result=nowatch.deletewatch(nowatchid);
		if(result.equals("Success"))
		{
			return "Success";
		}
		else
		{
			return "fail";
		}
	}
}
