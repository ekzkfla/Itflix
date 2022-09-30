package com.itflix.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dto.Subscription;
import com.itflix.dao.SubscriptionDao;

@Service
public class SubscriptionServiceImpl implements SubscriptonService {
	
	@Autowired
	private Subscription subscription;
	
	public SubscriptionServiceImpl() throws Exception {
		
	}
	
	public Subscription getSubscription() {
		return subscription;
	}
	
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	

}
