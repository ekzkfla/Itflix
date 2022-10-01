package com.itflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itflix.dto.Review;
import com.itflix.mapper.Review_Mapper;

@Repository
public class ReviewDaoImpl implements ReviewDao {

	@Autowired
	private Review_Mapper review_Mapper;

	public ReviewDaoImpl() {
		System.out.println("R_DaoImpl test3");
	}

	public ReviewDaoImpl(Review_Mapper review_Mapper) {
		System.out.println("R_DaoImpl test4");
		this.review_Mapper = review_Mapper;
	}

	public void setReview_Mapper(Review_Mapper review_Mapper) {
		this.review_Mapper = review_Mapper;
	}

	// 리뷰 전체리스트 출력
	@Override
	public List<Review> selectAll() throws Exception {
		List<Review> ReviewList = review_Mapper.selectAll();
		return ReviewList;
	}

	// 본인 리뷰 보기(회원아이디 리뷰 보기)
	@Override
	public List<Review> selectWroteReview(String u_email) throws Exception {
		List<Review> selectWroteReview = review_Mapper.selectWroteReview(u_email);
		return selectWroteReview;
	}

	// 최신 리뷰 출력
	@Override
	public List<Review> selectLatest(int no) throws Exception {
		List<Review> selectLatest = review_Mapper.selectLatest(no);
		return selectLatest;
	}

	// 선택한 리뷰출력
	@Override
	public Review selectByNo(int no) throws Exception {
		Review selectByNo = review_Mapper.selectByNo(no);
		return selectByNo;
	}

	// 리뷰 추가
	@Override
	public int insertReview(Review review) throws Exception {
		int insertByNo = review_Mapper.insertReview(review);
		return insertByNo;
	}

	// 리뷰 수정
	@Override
	public int updateReview(Review review) throws Exception {
		int updateReview = review_Mapper.updateReview(review);
		return updateReview;
	}

	// 리뷰 삭제
	@Override
	public int deleteReview(int no) throws Exception {
		int deleteReview = review_Mapper.deleteReview(no);
		return deleteReview;
	}

}
