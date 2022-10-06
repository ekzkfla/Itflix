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
public class controller {
	
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private CategoryService categoryService;

	
	
	public controller() {
		System.out.println("기본!!!");
	}
	//ItFlix 메인페이지
	
	@RequestMapping(value = "/main")
	public String itflix_main(Model model ) {
		String forwardPath = "";
		try {
			
			List<Movie> movieList = movieService.selectAll();
			List<Movie> movieCountList = movieService.selectMovieCount();
			//List<Category> categoryList = categoryService.selectByNoMovieList();
			Notice noticeOne = noticeService.noticeOne();
			model.addAttribute("movieList",movieList);
			model.addAttribute("movieCountList", movieCountList);
			model.addAttribute("notice", noticeOne);
			//model.addAttribute("categoryList", categoryList);
			forwardPath = "main";
		}catch (Exception e) {
			e.printStackTrace();
		}

		return forwardPath;
	}
	
	
	//영화 리스트 페이지
	@RequestMapping(value = "moviegridfw")
	public String moviegridfw(Model model) {
		String forwardPath="";
		try {
			int movieCount = movieService.movieAllCount();
			List<Movie> movieList = movieService.selectAllNoFilter();
			model.addAttribute("movieCount", movieCount);
			model.addAttribute("movieList", movieList);
			forwardPath = "moviegridfw";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return forwardPath;
	}
	
	//카테고리별 영화 리스트 
	@RequestMapping(value = "categoryMoviegridfw")
	public String moviegridfw(Model model,String cg_no) {
		String forwardPath="";
		try {
			List<Movie> movieList = movieService.selectCategoryNo(Integer.parseInt(cg_no));
			model.addAttribute("movieList", movieList);
			forwardPath = "categoryMoviegridfw";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return forwardPath;
	}
	
	//영화 detail 페이지
	@RequestMapping(value = "moviesingle",params = "m_no")
	public String moviesingle(@RequestParam int m_no, Model model)throws Exception { 
			Movie movie = movieService.selectByNo(m_no);
			Movie movie2= movieService.selectMovieRecentReview(m_no);
			int review= reviewService.reviewCount(m_no);
			
			model.addAttribute("movie",movie );
			model.addAttribute("movie2",movie2 );
			model.addAttribute("review",review );
			
			System.out.println(movie2);
		
		return "moviesingle";
	}
	
	//리뷰 리스트 페이지
	@RequestMapping(value = "reviewlist",params = "m_no")
	public String reviewlist(@RequestParam int m_no, Model model)throws Exception{
		String forwardPath="";
		Movie movie = movieService.selectByNo(m_no);
		model.addAttribute("movie", movie);
		//Movie movieSelectByNo = movieService.selectByNo(m_no);
		//model.addAttribute("movieSelectByNo", movieSelectByNo);
		
		List<Review> reviewLatest = reviewService.selectLatest(m_no);
		System.out.println(reviewLatest);
		List<Review> reviewList = reviewService.selectAll();
		model.addAttribute("reviewList", reviewList);
		model.addAttribute("reviewLatest", reviewLatest);
		forwardPath="reviewlist";
		return forwardPath;
	}
	
	//공지사항 페이지
		@RequestMapping(value = "bloglist")
		public String bloglist(Model model)throws Exception {
			String forwardPath="";
	
					List<Notice> noticeList = noticeService.selectAll();
					int noticeTotal = noticeService.totalCount();
					model.addAttribute("noticeTotal", noticeTotal);
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
