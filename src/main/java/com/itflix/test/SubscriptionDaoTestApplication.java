package com.itflix.test;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.SubscriptionDao;
import com.itflix.dto.Subscription;
import com.itflix.dto.Ticket;
import com.itflix.dto.User_Info;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class SubscriptionDaoTestApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication application = 
				new SpringApplication(ReviewServiceTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		SubscriptionDao subscriptionDao = context.getBean(SubscriptionDao.class);
		 System.out.println(subscriptionDao);
		 //전체 구독자 리스트
		 System.out.println("전체 구독자 리스트"+subscriptionDao.selectListAll());
		 // 구독 시작 날짜 찾기
		 System.out.println("구독 시작 날짜 찾기"+subscriptionDao.selectByStDate("guard1@gmail.com"));
		 // 구독 마지막 날짜 찾기
		 System.out.println("구독 마지막 날짜 찾기"+subscriptionDao.selectByEndDate("guard1@gmail.com"));
		 // 구독자 단일 찾기
		 System.out.println("구독자 단일 찾기"+subscriptionDao.selectByNo("guard1@gmail.com"));
		 //구독권 업데이트
		 System.out.println("update"+subscriptionDao.updateSubscription(1, "guard4@gmail.com"));
		 //구독권 추가
		 //System.out.println("insert"+subscriptionDao.insertSubscription(null));

	}

}
