package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Jjim;

public interface JjimDao {

	/* 1명 회원 영화 찜 목록보기 */
	List<Jjim> jjimList(String u_email) throws Exception;

	/* 영화 찜하기 */
	int jjimInsert(String u_email,int m_no) throws Exception;

	/* 영화 찜하기 해제 */
	int jjimDelete(String u_email,int m_no) throws Exception;

	/* 리뷰의 총평점 조인안하고 불러오기*/
	List<Jjim> jjimListTest5(String u_email) throws Exception;


}
