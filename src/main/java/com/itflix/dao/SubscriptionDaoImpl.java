package com.itflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itflix.dto.Subscription;
import com.itflix.mapper.Subscription_Mapper;

@Repository
public class SubscriptionDaoImpl implements SubscriptionDao{

	@Autowired
	private Subscription_Mapper subscruption_Mapper;
	
	public SubscriptionDaoImpl() {
		
	}
	
	public SubscriptionDaoImpl(Subscription_Mapper subscription_Mapper) {
		this.subscruption_Mapper = subscription_Mapper;
	}
	
	public void setSubscription_Mapper(Subscription_Mapper subscription_Mapper) {
		this.subscruption_Mapper = subscription_Mapper;
	}

	//전체 구독자리스트
	@Override
	public List<Subscription> selectlistAll() throws Exception {
		List<Subscription> subscriptionList = subscruption_Mapper.selectlistAll();
		return subscriptionList;
	}
	

	//구독시작날짜 찾기
	@Override
	public Subscription selectByStDate(String u_email) throws Exception {
		Subscription s_start = subscruption_Mapper.selectByStDate(u_email);
		return s_start;
	}

	//구독만료날짜 찾기
	@Override
	public Subscription selectByEndDate(String u_email) throws Exception {
		Subscription s_end = subscruption_Mapper.selectByStDate(u_email);
		return s_end;
	}

	//구독자 단일 찾기
	@Override
	public Subscription selectByNo(String u_email) throws Exception {
		Subscription s_no = subscruption_Mapper.selectByStDate(u_email);
		return s_no;
	}
	
	
}
