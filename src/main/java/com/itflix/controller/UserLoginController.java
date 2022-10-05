package com.itflix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itflix.service.User_InfoService;

@Controller
public class UserLoginController {
	/*
	@Autowired
	private User_InfoService user_InfoService;
	
	/*로그인*/
	@RequestMapping(value = "user_login_action")
	public String user_login_action(HttpServletRequest request, HttpSession session) {
		String u_email = request.getParameter("u_emil");
		
		
		
		
		return null;
	}
	

}//
