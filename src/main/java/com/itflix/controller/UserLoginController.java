package com.itflix.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itflix.controller.interceptor.LoginCheck;
import com.itflix.dto.Jjim;
import com.itflix.dto.User_Info;
import com.itflix.service.JjimService;
import com.itflix.service.User_InfoService;

@Controller
public class UserLoginController {

	@Autowired
	private User_InfoService user_InfoService;
	@Autowired
	private JjimService jjimService;
	
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
			}else {
				//회원가입 성공
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "404";
		}
		return forwardPath;
	}

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
				session.setAttribute("login_user", loginUser);
				System.out.println(loginUser);
				forwardPath = "main";
			} else if (result == -1) {
				//request.setAttribute("login_id", u_email);
				//forwardPath = "ssss";
			} else if (result == -2) {
				//request.setAttribute("login_id", u_email);
				//forwardPath = "xxxx";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "404";
		}
		return forwardPath;
	}
	
	/*로그아웃*/
	@RequestMapping("user_logout_action")
	public String user_logout_action(HttpSession session) {
		session.invalidate();
		return "forward:main";
	}

	
	/*찜리스트*/
	
	@RequestMapping("userfavoritegrid")
	public String jjimList(HttpServletRequest request,@RequestParam String u_email) {
		String forwardPath = "";
		try {
			List<Jjim> jjimList = jjimService.jjimList(u_email);
			request.setAttribute("jjimList", jjimList);
			System.out.println("너니>>"+jjimList);
			forwardPath = "userfavoritegrid";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPath;
	}

}//
