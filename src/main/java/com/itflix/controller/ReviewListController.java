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
	private MovieService movieService;
	@Autowired
	private ReviewService reviewService;
	
	
	//리뷰 리스트 페이지
		@RequestMapping(value = "reviewlist")
		public String reviewlist(Model model)throws Exception{
			String forwardPath="";
			List<Movie> movieList = movieService.selectAll();
			model.addAttribute("movieList", movieList);
			//Movie movieSelectByNo = movieService.selectByNo(no);
			//model.addAttribute("movieSelectByNo", movieSelectByNo);
			List<Review> reviewList = reviewService.selectAll();
			model.addAttribute("reviewList", reviewList);
			forwardPath="reviewlist";
			return forwardPath;
		}
}
