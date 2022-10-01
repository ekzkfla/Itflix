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
		 System.out.println(subscriptionDao.selectListAll());
		 System.out.println(subscriptionDao.selectByStDate("guard1@gmail.com"));
		 System.out.println(subscriptionDao.selectByEndDate("guard1@gmail.com"));
		 System.out.println("update"+subscriptionDao.updateSubscription(1, "guard5@gmail.com"));
		 //System.out.println("check3"+reviewDao.updateReview(new Review(3, "수정확인", "수정확인중", 50, 20220930, 0, 0, 0, 3, null)));
													 /*(int r_no, String r_title, String r_content,
													  *  int r_grade, Date r_date, int r_groupno,
													  *   int r_step, int r_depth, Movie movie, User_Info user_Info)*/
		 //System.out.println(reviewDao.insertReview(new Review(25, "abc", "abdc", 5, "2022/10/11", 1, 1, 1, 3, "guard4@gmail.com")));

	}

}
