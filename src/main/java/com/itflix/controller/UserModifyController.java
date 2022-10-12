package com.itflix.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itflix.dto.User_Info;
import com.itflix.service.User_InfoService;

@Controller
public class UserModifyController {
	
	@Autowired
	private User_InfoService user_InfoService;
	
	@RequestMapping(value = "/user_Update_action" ,method = RequestMethod.POST)
	public String user_Update_action(HttpServletRequest request){
		String forwardPath="";
		String u_email = (String) request.getAttribute("u_email");
		String u_name = (String) request.getAttribute("u_name");
		String u_pass = request.getParameter("userPass");
		String u_phone = request.getParameter("u_phone");
		String u_newPass1 = request.getParameter("userPass1");
		String u_newPass2 = request.getParameter("userPass2");
		
		try {
			
			int login_user=user_InfoService.updateUser_Info(new User_Info(u_email, u_newPass1, u_name, u_phone));
			request.setAttribute("login_user", login_user);
			forwardPath="userprofile";
			
		}catch(Exception e){
			
			e.printStackTrace();
			forwardPath="404";
			
		}
		
		
		
		return forwardPath;
	}
	
	

}
