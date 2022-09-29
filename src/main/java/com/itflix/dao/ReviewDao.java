package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Review;

public interface ReviewDao {

	// 리뷰 전체 출력
	List<Review> selectAll() throws Exception;

	// 본인 리뷰 보기(회원아이디 리뷰 보기)
	List<Review> selectWroteReview() throws Exception;

	// 최신 리뷰 출력
	List<Review> selectLatest() throws Exception;

	// 선택한 리뷰출력
	Review selectByNo(int no) throws Exception;

	// 리뷰 추가
	int insertReview(Review review) throws Exception;

	// 리뷰 수정
	int updateReview(Review review) throws Exception;

	// 리뷰 삭제
	int deleteReview(int no) throws Exception;

}
