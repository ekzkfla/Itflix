package com.itflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itflix.dto.Movie;
import com.itflix.dto.Review;
import com.itflix.dto.User_Info;
import com.itflix.service.MovieService;
import com.itflix.service.ReviewService;
import com.itflix.service.User_InfoService;

public class ReviewListController {
//	
//	@Autowired
//	private MovieService movieService;
//	@Autowired
//	private ReviewService reviewService;
//	
//	
//	//리뷰 리스트 페이지
//		@RequestMapping(value = "reviewlist",params = "m_no")
//		public String reviewlist(@RequestParam int m_no, Model model)throws Exception{
//			String forwardPath="";
//			Movie movie = movieService.selectByNo(m_no);
//			model.addAttribute("movie", movie);
//			//Movie movieSelectByNo = movieService.selectByNo(m_no);
//			//model.addAttribute("movieSelectByNo", movieSelectByNo);
//			
//			List<Review> reviewLatest = reviewService.selectLatest(m_no);
//			System.out.println(reviewLatest);
//			List<Review> reviewList = reviewService.selectAll();
//			model.addAttribute("reviewList", reviewList);
//			model.addAttribute("reviewLatest", reviewLatest);
//			forwardPath="reviewlist";
//			
//			return forwardPath;
//		}
}
