package com.itflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dao.NoticeDao;
import com.itflix.dto.Notice;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private NoticeDao noticeDao;
	
	public NoticeServiceImpl() throws Exception{

	}
	
	public NoticeDao getNoticeDao() {
		return noticeDao;
	}


	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}


	//공지사항 전체 출력
	@Override
	public List<Notice> selectAll() throws Exception {
		return noticeDao.selectAll();
	}
	
	//공지사항 전체 갯수 출력
	@Override
	public List<Notice> totalCount() throws Exception {
		return noticeDao.totalCount();
	}
	
	//공지사항 번호로 검색
	@Override
	public Notice selectByNo(int no) throws Exception {
		return noticeDao.selectByNo(no);
	}
	
	//공지사항 이름으로 검색
	@Override
	public Notice selectByTitle(String title) throws Exception {
		return noticeDao.selectByTitle(title);
	}

	/**************구현 미정**************/
	//공지사항 추가
	@Override
	public int insertNotice(Notice notice) throws Exception {
		return noticeDao.insertNotice(notice);
	}
	
	//공지사항 변경
	@Override
	public int updateNotice(Notice notice) throws Exception {
		return noticeDao.updateNotice(notice);
	}
	
	//공지사항 삭제
	@Override
	public int deleteNotice(int no) throws Exception {
		return noticeDao.deleteNotice(no);
	/**************구현 미정**************/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
