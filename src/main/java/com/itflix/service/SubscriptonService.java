package com.itflix.service;

import java.util.List;
import java.util.Date;

import com.itflix.dto.Subscription;
import com.itflix.dto.Ticket;

public interface SubscriptonService {

	//전체 구독자리스트
	List<Subscription> selectListAll() throws Exception;
	
	//구독시작날짜 찾기
	Subscription selectByStDate(String email) throws Exception;
	
	//구독만료날짜 찾기
	Subscription selectByEndDate(String email) throws Exception;
	
	//구독자 단일 찾기
	Subscription selectByNo(String email) throws Exception;

	//구독권 추가
	Subscription insertSubscription(Subscription subscription) throws Exception;
	
	//구독권 업데이트
	Subscription updateSubscription(Date s_start, Date s_end, String s_cardName, int s_cardNumber, Ticket ticket, String u_email) throws Exception;
	//Subscription updateSubscription(int t_no, String u_email) throws Exception;
	
	//구독권 구매자 찾기
	List<Subscription> selectBuyTicket(int t_no) throws Exception;
}
