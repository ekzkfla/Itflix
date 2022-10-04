package com.itflix.controller;

import java.io.Console;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itflix.dto.Notice;
import com.itflix.service.NoticeService;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Controller
public class controller {
	
	@Autowired
	private NoticeService noticeService;
	
	public controller() {
		System.out.println("기본!!!");
	}
	//ItFlix 메인페이지
	@RequestMapping(value = "main")
	public String  itflix_main() {
		
		return "main";
	}
	
	//영화 리스트 페이지
	@RequestMapping(value = "moviegridfw")
	public String moviegridfw() {
		String forwardPath="";
		forwardPath = "moviegridfw";
		
		return forwardPath;
	}
	

	
	//영화 detail 페이지
	@RequestMapping(value = "moviesingle")
	public String moviesingle() { 
		String forwardPath="";
		forwardPath = "moviesingle";
		
		return forwardPath;
	}
	
	//공지사항 페이지
	@RequestMapping(value = "bloglist")
	public String bloglist(HttpServletRequest request) {
		String forwardPath="";
			try {
				List<Notice> noticeList = noticeService.selectAll();
				int noticeTotal= noticeService.totalCount();
				request.setAttribute("noticeList", noticeList);
				request.setAttribute("noticeTotal", noticeTotal);
				forwardPath = "bloglist";
			}catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("error", e.getMessage());
				forwardPath= "404";
				}
			return forwardPath;
	}
	
	//공지사항 상세페이지
	@RequestMapping(value = "blogdetail", params = "n_no")
	public String blogdetail(@RequestParam int n_no, Model model)throws Exception {
		Notice notice=noticeService.selectByNo(n_no);
		model.addAttribute("notice",notice);
		return "blogdetail";
	}

	//마이페이지 
	@RequestMapping(value = "userprofile")
	public String userprofile() {
		String forwardPath="";
		forwardPath = "userprofile";
		
		return forwardPath;
	}
	
	//회원 프로필 수정페이지 
	@RequestMapping(value = "userModify")
	public String userModify() {
		String forwardPath="";
		forwardPath = "userModify";
		
		return forwardPath;
	}

	
	//회원 찜 영화 페이지
	@RequestMapping(value = "userfavoritegrid")
	public String userfavoritegrid() {
		String forwardPath="";
		forwardPath = "userfavoritegrid";
		
		return forwardPath;
	}
	
	//회원 선호 영화 페이지 
	@RequestMapping(value = "userrate")
	public String userrate() {
		String forwardPath="";
		forwardPath = "userrate";
		
		return forwardPath;
	}


	//구독권 안내 페이지 
	@RequestMapping(value ="landing" )
	public String landing() {
		String forwardPath="";
		forwardPath = "landing";
		
		return forwardPath;
	}
	
	//구독권 결제 페이지 
		@RequestMapping(value ="landing2" )
		public String landing2() {
			String forwardPath="";
			forwardPath = "landing2";
			
			return forwardPath;
		}



}
