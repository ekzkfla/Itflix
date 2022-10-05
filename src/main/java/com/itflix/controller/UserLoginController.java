package com.itflix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itflix.dto.User_Info;
import com.itflix.service.User_InfoService;

@Controller
public class UserLoginController {
	
	@Autowired
	private User_InfoService user_InfoService;
	
	/*로그인*/
	@RequestMapping(value = "user_login_action")
	public String user_login_action(HttpServletRequest request, HttpSession session) {
		String u_email = request.getParameter("u_emil");
		String u_pass = request.getParameter("u_pass");
		String forwardPath = "";
		try {
			/*
			 *  1:성공 
			 * -1:비번 불일치 
			 * -2:email 미존재
			 */
		int result = user_InfoService.login(u_email, u_pass);
		if(result == 1) {
			User_Info loginUser = user_InfoService.selectByEmail(u_email);
			session.setAttribute("login_email", loginUser.getU_email());;
			session.setAttribute("login_user", loginUser);			
			forwardPath = "";
		} else if (result == -1) {
			request.setAttribute("login_id", u_email);
		} else if(result == -2) {
			request.setAttribute("login_id", u_email);
		}
	} catch (Exception e) {
		e.printStackTrace();
		return "error";
	}
		return forwardPath;	

	}
	

}//
