package com.itflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itflix.controller.interceptor.LoginCheck;
import com.itflix.dto.User_Info;
import com.itflix.service.User_InfoService;


@Controller
public class UserProfileController {
/*
	@Autowired
	private User_InfoService user_InfoService;
	//로그인 세션 체크
	@LoginCheck
	@PostMapping("/user_session_check")
	public Map user_session_check(HttpSession session) throws Exception {
		Map resultMap = new HashMap();
		int code = 1;
		String url = "main";
		String msg = "세션존재";
		List<User> resultList = new ArrayList<User>();

		String sUserId = (String) session.getAttribute("sUserId");
		User sUser = userService.findUser(sUserId);
		resultList.add(sUser);

		resultMap.put("code", code);
		resultMap.put("url", url);
		resultMap.put("msg", msg);
		resultMap.put("data", resultList);
		return resultMap;
	}
			
		
		
		return forwardPath;
	}
*/
}
