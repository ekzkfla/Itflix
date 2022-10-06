package com.itflix.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itflix.dto.User_Info;
import com.itflix.service.User_InfoService;

@RestController
public class UserLoginRestController {

	@Autowired
	private User_InfoService user_InfoService;

	/*로그인*/
	@RequestMapping(value = "rest_user_login_action")
	public Map rest_user_login_action(HttpSession session, @RequestParam String u_email, @RequestParam String u_pass) {

		System.out.println(u_email);
		System.out.println(u_pass);
		Map resultMap = new HashMap();
		int code = 0;
		String msg = "";
		List data = new ArrayList();

		try {
			/*  1:성공 
			 * -1:비번 불일치 
			 * -2:email 미존재
			 */
			int result = user_InfoService.login(u_email, u_pass);
			if (result == 1) {
				User_Info loginUser = user_InfoService.selectByEmail(u_email);
				session.setAttribute("login_email", loginUser.getU_email());
				code=1;
				msg="성공";
				session.setAttribute("login_user", loginUser);
			} else if (result == -1) {
				code=2;
				msg="비빌번호 불일치";
			} else if (result == -2) {
				code=3;
				msg="아이디존재안함";
			}
		} catch (Exception e) {
			e.printStackTrace();
			code=4;
			msg="듣보잡";
		}
		
		resultMap.put("code", code);
		resultMap.put("msg", msg);
		resultMap.put("data", data);
		
		
		
		
		return resultMap;
	}

}//
