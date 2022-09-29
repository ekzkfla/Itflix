package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itflix.dto.Jjim;
import com.itflix.dto.User_Info;

@Mapper
public interface JJim_Mapper {
	
	/* 1명 회원 영화 찜 목록보기 */
	public List<Jjim> jjimList(User_Info user_info);
		
	/* 영화 찜하기*/
	public int jjimInsert(Jjim jjim);
	
	/* 영화 찜하기 해제*/
	public int jjimDelete(Jjim jjim);

}