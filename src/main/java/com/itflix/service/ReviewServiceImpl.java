package com.itflix.service;

import java.awt.print.Printable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dao.ReviewDao;
import com.itflix.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewDao reviewDao;

	public ReviewServiceImpl() {
		System.out.println("R_Serviceimpl test");
	}

	public ReviewServiceImpl(ReviewDao reviewDao) {
		System.out.println("R_ServiceImpl test2");
		this.reviewDao = reviewDao;
	}

	// 리뷰 전체 출력
	@Override
	public List<Review> selectAll() throws Exception {
		return reviewDao.selectAll();
	}

	// 본인 리뷰 보기(회원아이디 리뷰 보기)
	@Override
	public List<Review> selectWroteReview() throws Exception {
		return reviewDao.selectWroteReview();
	}

	// 최신 리뷰 출력
	@Override
	public List<Review> selectLatest() throws Exception {
		return reviewDao.selectLatest();
	}

	// 선택한 리뷰 출력
	@Override
	public Review selectByNo(int no) throws Exception {
		return reviewDao.selectByNo(no);
	}

	// 리뷰 추가
	@Override
	public int insertReview(Review review) throws Exception {
		return reviewDao.insertReview(review);
	}

	// 리뷰 수정
	@Override
	public int updateReview(Review review) throws Exception {
		return reviewDao.updateReview(review);
	}

	// 리뷰 삭제
	@Override
	public int deleteReview(int no) throws Exception {
		return reviewDao.deleteReview(no);
	}

}
