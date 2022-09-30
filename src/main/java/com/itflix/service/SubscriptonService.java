package com.itflix.service;

import java.util.List;
import java.util.Date;

import com.itflix.dto.Subscription;
import com.itflix.dto.User_Info;
import com.itflix.dto.Ticket;

public interface SubscriptonService {

	//전체 구독자리스트
	List<Subscription> selectlistAll() throws Exception;
	
	//구독시작날짜 찾기
	Subscription selectByStDate(String email) throws Exception;
	
	//구독만료날짜 찾기
	Subscription selectByEndDate(String email) throws Exception;
	
	//구독자 단일 찾기
	Subscription selectByNo(String email) throws Exception;

	
}
