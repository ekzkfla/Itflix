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

	@Autowired
	private User_InfoService user_InfoService;
	

}
