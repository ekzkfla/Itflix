package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Review;

public interface ReviewDao {

	// 리뷰 전체 출력
	List<Review> selectAll() throws Exception;

	// 본인 리뷰 보기(회원아이디 리뷰 보기)
	List<Review> selectWroteReview(String u_email) throws Exception;
	// 최신 리뷰 출력
	List<Review> selectLatest(int no) throws Exception;

	// 선택한 리뷰출력
	Review selectByNo(int no) throws Exception;

	// 리뷰 추가
	int insertReview(Review review) throws Exception;

	// 리뷰 수정
	int updateReview(String r_title, String r_content, int r_grade,int m_no,int r_no) throws Exception;

	// 리뷰 삭제
	int deleteReview(int no) throws Exception;

	

}
