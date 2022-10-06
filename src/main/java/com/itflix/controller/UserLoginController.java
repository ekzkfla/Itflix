package com.itflix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itflix.dto.User_Info;
import com.itflix.service.User_InfoService;

@Controller
public class UserLoginController {

	@Autowired
	private User_InfoService user_InfoService;

	/* 로그인 */
	@RequestMapping(value = "user_login_action")
	public String user_login_action(HttpServletRequest request, HttpSession session) {
		String u_email = request.getParameter("u_email");
		String u_pass = request.getParameter("u_pass");
		// System.out.println(u_email);
		// System.out.println(u_pass);
		String forwardPath = "";
		try {
			/*
			 * 1:성공 -1:비번 불일치 -2:email 미존재
			 */
			int result = user_InfoService.login(u_email, u_pass);
			if (result == 1) {
				User_Info loginUser = user_InfoService.selectByEmail(u_email);
				session.setAttribute("login_email", loginUser.getU_email());
				;
				session.setAttribute("login_user", loginUser);
				System.out.println(loginUser);
				forwardPath = "main";
			} else if (result == -1) {
				// request.setAttribute("login_id", u_email);
				forwardPath = "ssss";
			} else if (result == -2) {
				// request.setAttribute("login_id", u_email);
				forwardPath = "xxxx";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "404";
		}
		return forwardPath;
	}

	/* 회원가입 */
	@RequestMapping("CreateUser_action")
	public String CreateUser(HttpServletRequest request) {
		String u_email = request.getParameter("u_email");
		String u_pass = request.getParameter("u_pass");
		String u_name = request.getParameter("u_name");
		String u_phone = request.getParameter("u_phone");
		User_Info user = new User_Info(u_email, u_pass, u_name, u_phone);
		String forwardPath = "";
		
		try {
			int result = user_InfoService.insertUser_Info(user);
			if(result == -1) {
				//중복일 시 -1 반환
				request.setAttribute("msg", "이메일 중복");
				forwardPath = "xxx";
				
			}else {
				//회원가입 성공
				request.setAttribute("msg", "가입 성공, 짝짝짝");
				forwardPath = "main";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "404";
		}
		return forwardPath;
	}

}//
