package com.itflix.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itflix.dto.Category;
import com.itflix.dto.Movie;
import com.itflix.dto.Notice;
import com.itflix.dto.Review;
import com.itflix.service.CategoryService;
import com.itflix.service.MovieService;
import com.itflix.service.NoticeService;
import com.itflix.service.ReviewService;


@Controller
public class controllerTest_so {
	
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private CategoryService categoryService;

	
	
	public controllerTest_so() {
		System.out.println("기본!!!");
	}
	//ItFlix 메인페이지
	
	@RequestMapping(value = "/main")
	public String itflix_main(Model model) {
		String forwardPath = "";
		try {
			List<Movie> movieList = movieService.selectAll();
			model.addAttribute("movieList", movieList);
			forwardPath = "main";
		}catch (Exception e) {
			e.printStackTrace();
			forwardPath="404";
		}

		return forwardPath;
	}
	
//	@RequestMapping(value = "main")
//	public String  itflix_main() throws Exception{
//		List<Movie> movieList= movieService.selectAll();
//		System.out.println(movieList);
//		
//		//model.addAttribute("movieList",movieList);
//		return "main";
//	}
	
	//영화 리스트 페이지
	@RequestMapping(value = "moviegridfw")
	public String moviegridfw() {
		String forwardPath="";
		forwardPath = "moviegridfw";
		
		return forwardPath;
	}
	//카테고리별 영화 리스트 
	@RequestMapping(value = "categoryMoviegrid",params = "cg_no")
	public String categoryMoviegrid(String cg_no)throws Exception {
		List<Category> category = categoryService.selectByNoMovieList(Integer.parseInt(cg_no));
		System.out.println(category);
		return "categoryMoviegrid";
	}

	
	//영화 detail 페이지
	@RequestMapping(value = "moviesingle")
	public String moviesingle() { 
		String forwardPath="";
		forwardPath = "moviesingle";
		
		return forwardPath;
	}
	
	//리뷰 리스트 페이지
	@RequestMapping(value = "reviewlist")
	public String reviewlist(Model model)throws Exception{
		String forwardPath="";
		List<Review> reviewList = reviewService.selectAll();
		model.addAttribute("reviewList", reviewList);
		forwardPath="reviewlist";
		return forwardPath;
	}
	
	//공지사항 페이지
		@RequestMapping(value = "bloglist")
		public String bloglist(Model model)throws Exception {
			String forwardPath="";
	
					List<Notice> noticeList = noticeService.selectAll();
					model.addAttribute("noticeList", noticeList);
					forwardPath = "bloglist";
			
					
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
