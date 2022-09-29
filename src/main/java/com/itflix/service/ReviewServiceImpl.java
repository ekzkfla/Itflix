package com.itflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dao.ReviewDao;
import com.itflix.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewDao reviewDao;
	
	public ReviewServiceImpl(){
		
	}
	
	//리뷰 전체리스트 출력
	
	@Override
	public List<Review> selectAll() throws Exception{
		return reviewDao.selectAll();
	}
	
	//리뷰 번호를 이용한 선택 출력

	//리뷰 수정

	//리뷰 삭제

	//회원 아이디로 리뷰보이기

	//리뷰 추가

	//최신 리뷰

	//리뷰 찾기
	
}
