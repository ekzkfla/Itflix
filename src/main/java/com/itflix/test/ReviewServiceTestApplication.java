package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

import com.itflix.controller.controller;
import com.itflix.dao.CategoryDao;
import com.itflix.dao.ReviewDao;
import com.itflix.dto.Review;
import com.itflix.mapper.Review_Mapper;
import com.itflix.service.CategoryService;
import com.itflix.service.NoticeService;
import com.itflix.service.ReviewService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class ReviewServiceTestApplication {
	public static void main(String[] args) throws Exception {
		/****************case1********************/
		/*
		 * application.properties에 설정추가
		 *    spring.main.web-application-type=none
		 */
		/*
		ConfigurableApplicationContext context = 
				SpringApplication.run(GuestDaoSpringBootTestApplication.class, args);
		GuestDao guestDao = (GuestDao) context.getBean(GuestDao.class);
		System.out.println(guestDao.selectAll());
		System.out.println(guestDao.selectByNo(881));
		*/
		
		SpringApplication application = 
				new SpringApplication(ReviewServiceTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		ReviewDao reviewDao = context.getBean(ReviewDao.class);
		 System.out.println(reviewDao);
		 System.out.println(reviewDao.selectAll());
		 //System.out.println(reviewDao.selectByNo(3));
		 //System.out.println(reviewDao.deleteReview(11));
		 //System.out.println("check"+reviewDao.selectWroteReview("guard2@gmail.com"));
		 //System.out.println("check2"+reviewDao.selectLatest(10));
		 /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑테스트완↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
		 
		 System.out.println("check3"+reviewDao.updateReview("수정은 이렇게", "그런데 수정이 안대부러쓰~", 13, 3, 12));
													 /*(int r_no, String r_title, String r_content,
													  *  int r_grade, Date r_date, int r_groupno,
													  *   int r_step, int r_depth, Movie movie, User_Info user_Info)*/
		 //System.out.println(reviewDao.insertReview(new Review(0, "null", "null", 0, null, 0, 0, 0, null, "null")));
		 
	}
}