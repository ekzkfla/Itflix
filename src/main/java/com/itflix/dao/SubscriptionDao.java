package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Subscription;

public interface SubscriptionDao {

	//전체 구독자리스트
	List<Subscription> selectListAll() throws Exception;
		
	//구독시작날짜 찾기
	Subscription selectByStDate(String email) throws Exception;
		
	//구독만료날짜 찾기
	Subscription selectByEndDate(String email) throws Exception;
		
	//구독자 단일 찾기
	Subscription selectByNo(String email) throws Exception;
	
	//구독 추가
	Subscription insertSubscription(Subscription subscription) throws Exception;
	
	//구독 업데이트
	Subscription updateSubscription(int t_no, String u_email) throws Exception;
}
