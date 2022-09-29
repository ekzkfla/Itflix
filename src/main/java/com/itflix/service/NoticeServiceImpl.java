package com.itflix.service;

import java.util.List;

import com.itflix.dao.NoticeDao;
import com.itflix.dto.Notice;

public class NoticeServiceImpl implements NoticeDao{
	
	private NoticeDao noticeDao;
	
	public NoticeServiceImpl() {

	}
	
	public List<Notice> selectAll(){
		return null;
	}
	
}
