package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Review;

public interface ReviewDao {
	
	//리뷰 전체 출력
	List<Review> selectAll() throws Exception;
	
	

}
