package com.itflix.service;

import java.util.List;

import com.itflix.dto.Notice;

public interface NoticeService {
	
	//공지사항 전체 출력
	List<Notice> selectAll()throws Exception;
	//공지사항 전체 갯수 출력
	List<Notice> totalCount()throws Exception;
	//공지사항 번호로 검색
	Notice selectByNo(int no)throws Exception;
	//공지사항 이름으로 검색
	Notice selectByTitle(String title)throws Exception;
	
	/**************구현 미정**************/
	//공지사항 추가
	int insertNotice(Notice notice)throws Exception;
	//공지사항 변경
	int updateNotice(Notice notice)throws Exception;
	//공지사항 삭제
	int deleteNotice(int no)throws Exception;
	/**************구현 미정**************/
	
}
