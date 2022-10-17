package com.itflix.controller;

import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.expr.NewArray;
import org.apache.jasper.tagplugins.jstl.core.If;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.itflix.controller.interceptor.LoginCheck;
import com.itflix.dto.Movie;
import com.itflix.dto.Notice;
import com.itflix.dto.Review;
import com.itflix.dto.Subscription;
import com.itflix.dto.Ticket;
import com.itflix.dto.User_Info;
import com.itflix.service.CategoryService;
import com.itflix.service.JjimService;
import com.itflix.service.MovieService;
import com.itflix.service.NoticeService;
import com.itflix.service.ReviewService;
import com.itflix.service.SubscriptonService;
import com.itflix.service.User_InfoService;


@Controller
public class MainController {
	
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private User_InfoService user_InfoService;
	@Autowired
	private JjimService jjimService;
	@Autowired
	private SubscriptonService subscriptonService;
	
	public MainController() {
		System.out.println("기본!!!");
	}
	//ItFlix 메인페이지
		@RequestMapping(value = "/main")
	public String itflix_main(Model model ) {
		String forwardPath = "";
		try {
			
			List<Movie> movieList = movieService.selectAll();
			List<Movie> movieCountList = movieService.selectMovieCountList();
			List<Movie> movieCountNewDate = movieService.selectMovieNewDate();
			List<Movie> movieGradeList = movieService.selectMovieGradeList();
			//List<Category> categoryList = categoryService.selectByNoMovieList();
			System.out.println(movieList);
			Notice noticeOne = noticeService.noticeOne();
			model.addAttribute("movieList",movieList);
			model.addAttribute("movieCountList", movieCountList);
			model.addAttribute("movieCountNewDate", movieCountNewDate);
			model.addAttribute("movieGradeList", movieGradeList);
			model.addAttribute("notice", noticeOne);
			//model.addAttribute("categoryList", categoryList);
			forwardPath = "main";
		}catch (Exception e) {
			e.printStackTrace();
		}

		return forwardPath;
	}
		
	//검색결과페이지
	@RequestMapping(value = "/key_word_search_action",method = RequestMethod.POST)
	public String search(HttpServletRequest request){
		String forwardPath="";
		String msg="";
		try {
			String searchKey = request.getParameter("searchText");
			System.out.println(searchKey);
			List<Movie>movieList=movieService.selectMovieName(searchKey);
			request.setAttribute("movieList", movieList);
			System.out.println(movieList);
			msg = "성공";
			System.out.println(msg);
			forwardPath="searchPage";
		} catch (Exception e) {
			e.printStackTrace();
			msg= "실패";
			System.out.println(msg);
		
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
	@RequestMapping(value = "categoryMoviegrid")
	public String moviegridfw(Model model,String cg_no) {
		String forwardPath="";
		try {
			int categoryCount = categoryService.countCategory(Integer.parseInt(cg_no));
			List<Movie> movieList = movieService.selectCategoryNo(Integer.parseInt(cg_no));
			model.addAttribute("movieList", movieList);
			model.addAttribute("categoryCount", categoryCount);
			forwardPath = "categoryMoviegrid";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return forwardPath;
	}
	
	//영화 detail 페이지
	@RequestMapping(value = "moviesingle",params = "m_no")
	public String moviesingle(@RequestParam int m_no, Model model,HttpSession session)throws Exception { 
			Movie movie = movieService.selectByNo(m_no);
			Movie movie2= movieService.selectMovieRecentReview(m_no);
			Movie movieGrade = movieService.selectMovieGradeByNo(m_no);
			movieService.movieCountPlus(m_no);
			User_Info user_Info=(User_Info)session.getAttribute("login_user");
			Subscription subscription = subscriptonService.selectByNo(null);
			
			if(user_Info != null) {
				boolean jjim = jjimService.jjimUser(user_Info.getU_email(), m_no);
				model.addAttribute("jjim", jjim);
				System.out.println(jjim);
			}
			int review= reviewService.reviewCount(m_no);
			
			
			model.addAttribute("movie",movie );
			model.addAttribute("movie2",movie2 );
			model.addAttribute("movieGrade",movieGrade );
			model.addAttribute("review",review );
			model.addAttribute("subscription", subscription);
			
			
			
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

	//마이페이지 (로그인한 세션을 불러와야함)
	@RequestMapping(value = "userprofile")
	public String userprofile(HttpServletRequest request, HttpSession session )  {
		String forwardPath="";
		//session(로그인계정)값을 가져와 user_Info에 저장 
		//User_Info user_Info=(User_Info) request.getSession().getAttribute("login_user");
		User_Info user_Info=(User_Info)session.getAttribute("login_user");
		
		System.out.println(user_Info);
		request.setAttribute("user_Info", user_Info);
		forwardPath = "userprofile";
		
		return forwardPath;
	}
	
	
	//구독권 안내 페이지 
	@RequestMapping(value ="landing" )
	public String landing(HttpServletRequest request, HttpSession session) throws Exception {
		String forwardPath="";
		User_Info user_Info=(User_Info)session.getAttribute("login_user");
		//비로그인시 alert 표출 후 메인페이지로 이동
		if (user_Info == null) {
			request.setAttribute("msg", "로그인이 필요합니다.");
			request.setAttribute("url", "main");
			return "alert";
		}else if(user_Info != null) {
			//로그인시 계정이 있을 경우 계정 정보 출력 
			
			request.setAttribute("user_Info", user_Info);
			forwardPath = "landing";
			
		}
		return forwardPath;
	}
	
	//구독권 결제 action
	@RequestMapping(value = "subscriptPay_action")
	public String subscriptPay(HttpServletRequest request,HttpSession session) throws Exception {
		String forwardPath="";
		String msg="";
		String s_cardName=request.getParameter("s_cardName");
		String s_cardNumberfirst=request.getParameter("s_cardNumber");
		String s_cardMonth=request.getParameter("s_cardMonth");
		String s_cardYear=request.getParameter("s_cardYear");
		String s_CVV=request.getParameter("s_CVV");
		String s_cardNumber = s_cardNumberfirst+s_cardMonth+s_cardYear+s_CVV;
		
		User_Info user_Info =(User_Info) request.getSession().getAttribute("login_user");
		
		Subscription subscriptUser=subscriptonService.selectByNo(user_Info.getU_email());
		if(subscriptUser==null) {
			//구독권이 없는 경우 
			int t_no=1;

			subscriptonService.insertSubscription(new Subscription(0, null, null, s_cardName,Integer.parseInt( s_cardNumberfirst),new Ticket(t_no, "19870"), new User_Info(user_Info.getU_email(), user_Info.getU_pass(), user_Info.getU_name(),null )));
			msg ="결제 완료";
			forwardPath="404";
		}else if(subscriptUser !=null) {
			//구독권이 있거나 예전에 구매한 기록이 있을 경우
			int t_no=1;
			subscriptonService.updateSubscription(null, null, s_cardName,Integer.parseInt(s_cardNumberfirst),new Ticket(t_no, "19870"), user_Info.getU_email());
			msg ="연장 완료";
			forwardPath="main";
			
		}
		
		return forwardPath;
	}
	
	
	
	
	
	
	//리뷰 작성 페이지 
	@RequestMapping(value = "reviewWrite")
	public String reviewWrite(@RequestParam int m_no ,Model model,HttpServletRequest request, HttpSession session) throws Exception {
		String forwardPath="";
		
		User_Info user_Info=(User_Info)session.getAttribute("login_user");
		
		//비로그인시 alert 표출 후 메인페이지로 이동
		if (user_Info == null) {
			request.setAttribute("msg", "로그인이 필요합니다.");
			request.setAttribute("url", "main");
			return "alert";
		}
		Movie movie=movieService.selectByNo(m_no);
		model.addAttribute("movie", movie);
		forwardPath="reviewWrite";
		System.out.println("실행?");
		return forwardPath;
	}
	
	//리뷰 수정 페이지 
	@LoginCheck
	@RequestMapping(value = "reviewModify")
	public String reviewModify(@RequestParam int m_no ,Model model,HttpServletRequest request, HttpSession session) throws Exception {
		String forwardPath="";
		
		User_Info user_Info=(User_Info)session.getAttribute("login_user");
		
		//비로그인시 alert 표출 후 메인페이지로 이동
		if (user_Info == null) {
			request.setAttribute("msg", "로그인이 필요합니다.");
			request.setAttribute("url", "main");
			return "alert";
		}
		String r_no =request.getParameter("r_no");
		String r_title =request.getParameter("r_title");
		String r_content = request.getParameter("r_content");
		String u_email = request.getParameter("u_email");
		Movie movie=movieService.selectByNo(m_no);
		Review review=new Review(Integer.parseInt(r_no), r_title, r_content, 0, null, 0, 0,0, 
								new Movie(m_no, null, null, null, null, 0, null, null, 0, 0, 0, null, null, null, null), null,
								new User_Info(u_email, null, null, null));
		model.addAttribute("review", review);
		model.addAttribute("movie", movie);
		forwardPath="reviewModify";
		System.out.println("수정실행?");
		return forwardPath;
	}
	
	//리뷰 수정 액션
	@RequestMapping(value = "/reviewModify_action",method = RequestMethod.POST)
	public String reviewModify_action(@RequestParam int m_no,HttpServletRequest request,Model model) {
		String forwardPath="";
		try {
			String r_no = request.getParameter("r_no");
			String r_title =request.getParameter("r_title");
			String r_content = request.getParameter("r_content");
			String u_email = request.getParameter("u_email");
			String r_grade=request.getParameter("reviewStar");
			reviewService.updateReview(r_title, r_content,Integer.parseInt(r_grade),Integer.parseInt(r_no));
			List<Review> myReview = reviewService.selectWroteReview(u_email);
			model.addAttribute("myReview", myReview);
			forwardPath = "redirect:userrate?u_email="+u_email;
			System.out.println("수정성공!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("수정실패...");
		}
		return forwardPath;
	}
	
	
	
	//리뷰 작성 액션 페이지
	@RequestMapping(value = "/reviewWrite_action",method = RequestMethod.POST)
	public String reviewWrite_action(@RequestParam int m_no,HttpServletRequest request) {
		String forwardPath="";
		try {
			String reviewStar=request.getParameter("reviewStar");
			int r_grade = Integer.parseInt(reviewStar);
			String r_title =request.getParameter("r_title");
			String r_content = request.getParameter("r_content");
			String u_email = request.getParameter("u_email");
			int reviewAdd = reviewService.insertReview(0, r_title, r_content, r_grade, null, 0, 0, 0, m_no, u_email);
			request.setAttribute("reviewAdd", reviewAdd);
			forwardPath = "redirect:reviewlist?m_no="+m_no;
			System.out.println(">>>>>>"+reviewAdd);
			System.out.println("리뷰작성!!");
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath="404";
		}
		return forwardPath;
	}
		

	
	
	

}
