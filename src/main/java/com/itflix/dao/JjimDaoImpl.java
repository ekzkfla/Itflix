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

	@Override
	public List<Jjim> jjimList(Jjim jjim) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int jjimInsert(Jjim jjim) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int jjimDelete(Jjim jjim) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
