package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Jjim;

public interface JjimDao {

	/* 1명 회원 영화 찜 목록보기 */
	List<Jjim> jjimList(String u_email) throws Exception;

	/* 영화 찜하기 */
	int jjimInsert(Jjim jjim) throws Exception;

	/* 영화 찜하기 해제 */
	int jjimDelete(Jjim jjim) throws Exception;

	/*
	 * 회원 전체보기 */
	 List<Jjim> jjimListAll() throws Exception; 
	 /*
	 * List<Jjim> jjimListAll2()
	 * throws Exception;
	 */
	
	 List<Jjim> jjimListTest() throws Exception;
	 
	 
	 //List<Jjim> jjimListTest2() throws Exception;
}
