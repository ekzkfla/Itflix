package com.itflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itflix.dto.Movie;
import com.itflix.dto.Review;
import com.itflix.dto.User_Info;
import com.itflix.service.MovieService;
import com.itflix.service.ReviewService;
import com.itflix.service.User_InfoService;

public class ReviewListController {
	
	@Autowired
	private User_InfoService user_InfoService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private ReviewService reviewService;
	
	
	//리뷰 리스트 페이지
		@RequestMapping(value = "reviewlist")
		public String reviewlist(Model model)throws Exception{
			String forwardPath="";
			List<User_Info> userSelectAll = user_InfoService.selectAll();
			Movie selectByNo1 = movieService.selectByNo(1);
			List<Movie> movieList = movieService.selectAll();
			List<Movie> movieCountList = movieService.selectMovieCount();
			List<Review> reviewList = reviewService.selectAll();
			List<Review> reviewTest1 = reviewService.selectLatest(1);
			int reviewCount = reviewService.reviewCount(6);
			model.addAttribute("userSelectAll", userSelectAll);
			model.addAttribute("movieList", movieList);
			model.addAttribute("selectByNo1", selectByNo1);
			model.addAttribute("movieCountList", movieCountList);
			model.addAttribute("reviewList", reviewList);
			model.addAttribute("reviewCount", reviewCount);
			model.addAttribute("reviewTest1", reviewTest1);
			forwardPath="reviewlist";
			return forwardPath;
		}
}
