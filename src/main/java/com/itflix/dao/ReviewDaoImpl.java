package com.itflix.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itflix.mapper.Review_Mapper;

@Repository
public class ReviewDaoImpl {
	
	@Autowired
	private Review_Mapper review_Mapper;
	
}
