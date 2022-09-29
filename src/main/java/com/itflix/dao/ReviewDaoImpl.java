package com.itflix.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itflix.mapper.review_Mapper;

@Repository
public class ReviewDaoImpl {
	
	@Autowired
	private review_Mapper review_Mapper;
	
}
