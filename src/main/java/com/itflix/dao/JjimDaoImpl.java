package com.itflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.itflix.dto.Jjim;
import com.itflix.dto.User_Info;
import com.itflix.mapper.Jjim_Mapper;

public class JjimDaoImpl implements JjimDao {
	
	@Autowired
	private Jjim_Mapper jjim_Mapper;
	
	public JjimDaoImpl() {
	
	}
	
	public JjimDaoImpl(Jjim_Mapper jjim_Mapper) {
		this.jjim_Mapper = jjim_Mapper;
	}
	
	public void setJjim_Mapper(Jjim_Mapper jjim_Mapper) {
		this.jjim_Mapper = jjim_Mapper;
	}

		
	/* 1명 회원 영화 찜 목록보기 (u_email 조회) */
	@Override
	public List<Jjim> jjimList(Jjim jjim) throws Exception {
		List<Jjim> jjimList =jjim_Mapper.jjimList(jjim);
		return jjimList;
	}
	/* 영화 찜하기 (u_email 에 m_no로 저장*)*/
	@Override
	public int jjimInsert(Jjim jjim) throws Exception {
		int jjimInsert = jjim_Mapper.jjimInsert(jjim);
		return jjimInsert;
	}
	
	/* 영화 찜하기 해제 (u_email 에서 m_no 로 삭제)*/
	@Override
	public int jjimDelete(Jjim jjim) throws Exception {
		int jjimDelete = jjim_Mapper.jjimDelete(jjim);
		return jjimDelete;
	}

}
