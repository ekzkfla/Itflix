package com.itflix.service;

import java.util.List;

import com.itflix.dto.Jjim;

public interface JjimService {
	
	/* 영화 찜하기 */
	int jjimInsert(String u_email,int m_no) throws Exception;

	/* 영화 찜하기 해제 */
	int jjimDelete(String u_email,int m_no) throws Exception;

	/* 리뷰의 총평점 조인안하고 불러오기*/
	List<Jjim> jjimListTest5(String u_email) throws Exception;
	

}
