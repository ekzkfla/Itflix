package com.itflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dao.JjimDao;
import com.itflix.dto.Jjim;

@Service
public class JjimServiceImpl implements JjimDao{
	
	@Autowired
	private JjimDao jjimDao;
	
	public JjimServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public JjimServiceImpl(JjimDao jjimDao) {
		this.jjimDao = jjimDao;
	}

	public void setJjimDao(JjimDao jjimDao) {
		this.jjimDao = jjimDao;
	}
	
	/* 영화 찜하기 */
	@Override
	public int jjimInsert(String u_email, int m_no) throws Exception {
		return jjimDao.jjimInsert(u_email, m_no);
	}

	/* 영화 찜하기 해제 */
	@Override
	public int jjimDelete(String u_email, int m_no) throws Exception {
		return jjimDao.jjimDelete(u_email, m_no);
	}
	
	/* 리뷰의 총평점 조인안하고 불러오기*/
	@Override
	public List<Jjim> jjimListTest5(String u_email) throws Exception {
		return jjimDao.jjimListTest5(u_email);
	}

	

}
