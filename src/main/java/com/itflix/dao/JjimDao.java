package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Jjim;

public interface JjimDao {
	
	/* 1명 회원 영화 찜 목록보기 */
	List<Jjim> jjimList(Jjim jjim) throws Exception;
		
	/* 영화 찜하기*/
	int jjimInsert(Jjim jjim) throws Exception;
	
	/* 영화 찜하기 해제*/
	int jjimDelete(Jjim jjim) throws Exception;

}
