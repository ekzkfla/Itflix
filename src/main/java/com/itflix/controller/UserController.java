package com.itflix.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itflix.controller.interceptor.LoginCheck;
import com.itflix.dto.Jjim;
import com.itflix.dto.Movie;
import com.itflix.dto.User_Info;
import com.itflix.service.JjimService;
import com.itflix.service.User_InfoService;

@Controller
public class UserController {

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
			if (result == -1) {
				// 중복일 시 -1 반환
			} else {
				// 회원가입 성공
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
		System.out.println(u_email);
		System.out.println(u_pass);
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
				forwardPath = "moviesingle?m_no=27";
			} else if (result == -1) {
				// request.setAttribute("login_id", u_email);
				// forwardPath = "ssss";
			} else if (result == -2) {
				// request.setAttribute("login_id", u_email);
				// forwardPath = "xxxx";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "404";
		}
		return forwardPath;
	}
	
	/* 로그아웃 */
	@RequestMapping("user_logout_action")
	public String user_logout_action(HttpSession session) {
		session.invalidate();
		return "redirect:main";
	}
	
	//유저 계정찾기 페이지
	@RequestMapping("userSearch")
	public String userSearch() {
		String forwardPath="";
		forwardPath="userSearch";
		return forwardPath;
	}
	
	//유저 아이디 찾기 새창 
	@RequestMapping(value = "/searchId")
	public String searchId(HttpServletRequest request) throws Exception {
		String forwardPath="";
		String u_name =request.getParameter("u_name1");
		String u_phone = request.getParameter("u_phone");
		User_Info user_Info =user_InfoService.selectByNameAndPhone(u_name, u_phone);
		System.out.println(user_Info);
		request.setAttribute("user_Info", user_Info);
		forwardPath="searchId";
		return forwardPath;
	}
	
	//유저 비밀번호 찾기 새창 
	@RequestMapping(value = "/searchPass")
	public String searchPass(HttpServletRequest request) throws Exception {
		String forwardPath="";
		String u_name =request.getParameter("u_name2");
		String u_email = request.getParameter("u_email");
		User_Info user_Info=user_InfoService.selectByEmailAndName(u_email, u_name);
		System.out.println(user_Info);
		request.setAttribute("user_Info", user_Info);
		forwardPath="searchPass";
		return forwardPath;
	}
	
	
	
	
	
	
	
	/* 찜리스트 */
	@LoginCheck
	@RequestMapping("userfavoritegrid")
	public String jjimList(HttpServletRequest request, @RequestParam String u_email) {
		String forwardPath = "";
		try {
			List<Jjim> jjimList = jjimService.jjimList(u_email);
			int jjimCount = jjimService.jjimCount(u_email);
			request.setAttribute("jjimList", jjimList);
			request.setAttribute("jjimCount", jjimCount);
			//System.out.println("보여죠>>"+jjimList);
			//System.out.println("나오나?>>"+jjimCount);
			forwardPath = "userfavoritegrid";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPath;
	}
	
	//유저의 카테고리별 찜 리스트
	@LoginCheck
	@RequestMapping("userfavoriteCategorygrid")
	public String jjimCategoryList(HttpServletRequest request,String cg_no) throws Exception {
		String forwardPath="";
		User_Info user_Info=(User_Info) request.getSession().getAttribute("login_user");
		String u_email=user_Info.getU_email();
		List<Jjim>jjimList= jjimService.jjimCategoryList(u_email,Integer.parseInt(cg_no));
		request.setAttribute("jjimList", jjimList);
		forwardPath = "userfavoriteCategorygrid";
		return forwardPath;
	}
	
	

	/* 찜하기*/
	@RequestMapping(value = "/jjim_insert_action", method = RequestMethod.POST)
	public String jjim_insert_action(HttpServletRequest request) {
		String forwardPath = "";
		String msg = "";
		try {
			String u_email=request.getParameter("u_email");
			String m_no=request.getParameter("m_no");
			System.out.println(m_no);
			int jjimInsert = jjimService.jjimInsert(u_email,Integer.parseInt(m_no));
			request.setAttribute("jjimInsert", jjimInsert);
			System.out.println(jjimInsert);
			forwardPath = "redirect:moviesingle?m_no="+m_no;
			msg = "성공";
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
			msg = "실패";
			System.out.println(msg);
		}
		return forwardPath;
	}
	
	/* 찜 취소 하기*/
	@RequestMapping(value = "/jjim_delete_action", method = RequestMethod.POST)
	public String jjim_delete_action(HttpServletRequest request) {
		String forwardPath = "";
		String msg = "";
		try {
			String u_email=request.getParameter("u_email");
			String m_no=request.getParameter("m_no");
			System.out.println(m_no);
			int jjimDelete = jjimService.jjimDelete(u_email,Integer.parseInt(m_no));
			request.setAttribute("jjimDelete", jjimDelete);
			System.out.println(jjimDelete);
			forwardPath = "redirect:moviesingle?m_no="+m_no;
			msg = "성공";
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			msg = "실패";
			System.out.println(msg);
		}
		return forwardPath;
	}
	
	/*회원탈퇴하기*/
	@RequestMapping(value = "/removeUser")
	public String removeUser(HttpServletRequest request, HttpSession session) {
		String msg = "";
		try {
			String u_email = request.getParameter("u_email");
			user_InfoService.removeUser(u_email);
			session.invalidate();
			msg = "탈퇴성공";
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:main";
	}

	
}//