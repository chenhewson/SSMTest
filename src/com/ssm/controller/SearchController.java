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

import com.ssm.entity.UserList;
import com.ssm.service.SearchService;




@Controller
public class SearchController {
	@Autowired
	private SearchService searchservice;
	@ResponseBody
	@RequestMapping("search.do")
	public String searchuser(HttpServletResponse rep,HttpServletRequest req) throws ServletException, IOException {
		String username=req.getParameter("infomation");
		String id=req.getParameter("infomation");
		System.out.println("id="+id);
		System.out.println("username="+username);
		
		List<UserList> ui=searchservice.searchuser(username,id);
		if(ui.size()!=0)
		{System.out.println(ui.size());
		req.getSession().setAttribute("searchlist", ui);
//		req.getRequestDispatcher("\\WEB-INF\\jsp\\SearchUser.jsp").forward(req, rep);
		return "Success";
		}
		else
			return "fail";

	}
}
