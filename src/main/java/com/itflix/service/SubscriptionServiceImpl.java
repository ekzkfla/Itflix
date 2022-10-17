package com.itflix.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dto.Subscription;
import com.itflix.dto.Ticket;
import com.itflix.dao.SubscriptionDao;

@Service
public class SubscriptionServiceImpl implements SubscriptonService {
	
	@Autowired
	private SubscriptionDao subscriptionDao;
	
	public SubscriptionServiceImpl() throws Exception {
		
	}
	
	public SubscriptionDao getSubscriptionDao() {
		return subscriptionDao;
	}
	
	public void setSubscriptionDao(SubscriptionDao subscriptionDao) {
		this.subscriptionDao = subscriptionDao;
	}

	//전체 구독자리스트
	@Override
	public List<Subscription> selectListAll() throws Exception {
		return subscriptionDao.selectListAll();
	}

	//구독시작날짜 찾기
	@Override
	public Subscription selectByStDate(String u_email) throws Exception {
		return subscriptionDao.selectByStDate(u_email);
	}

	//구독만료날짜 찾기
	@Override
	public Subscription selectByEndDate(String u_email) throws Exception {
		return subscriptionDao.selectByEndDate(u_email);
	}

	//구독자 단일 찾기
	@Override
	public Subscription selectByNo(String u_email) throws Exception {
		return subscriptionDao.selectByNo(u_email);
	}
	
	//구독권 추가
	@Override
	public Subscription insertSubscription(Subscription subscription) throws Exception {
		return subscriptionDao.insertSubscription(subscription);
	}
	
	//구독권 업데이트
	@Override
	/*
	 * public Subscription updateSubscription(int t_no, String u_email) throws
	 * Exception { return subscriptionDao.updateSubscription(t_no, u_email); }
	 */
	public Subscription updateSubscription(Date s_start, Date s_end, String s_cardName, int s_cardNumber,Ticket ticket, String u_email) throws Exception {
		return subscriptionDao.updateSubscription(s_start,s_end,s_cardName,s_cardNumber,ticket, u_email);
	}
	
	//구독권 구매자 찾기
	@Override
	public Subscription selectBuyTicket(String u_email) throws Exception {
		return subscriptionDao.selectBuyTicket(u_email);
	}

}
