package com.itflix.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itflix.dto.Jjim;
import com.itflix.dto.User_Info;
import com.itflix.service.JjimService;
import com.itflix.service.User_InfoService;

@Controller
public class UserLoginController2 {

	@Autowired
	private User_InfoService user_InfoService;
	@Autowired
	private JjimService jjimService;
	
	/*찜리스트*/
	@RequestMapping("jjimList")
	public String jjimList(HttpServletRequest request,String u_email) {
		String forwardPath = "";
		try {
			List<Jjim> jjimList = jjimService.jjimList("guard1@gmail.com");
			request.setAttribute("jjimList", jjimList);
			forwardPath = "zzzz";
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "xxx";
		}
		return forwardPath;
	}

	


}//
