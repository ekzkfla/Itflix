package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;


import com.itflix.controller.MainController;
import com.itflix.dao.CategoryDao;
import com.itflix.dao.MovieDao;
import com.itflix.dao.ReviewDao;
import com.itflix.dto.Movie;
import com.itflix.dto.Review;
import com.itflix.dto.User_Info;
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
		 //System.out.println(reviewDao.selectAll());
		 //System.out.println(reviewDao.selectByNo(3));
		 //System.out.println(reviewDao.deleteReview(11));
		 //System.out.println("check"+reviewDao.selectWroteReview("guard2@gmail.com"));
		 //System.out.println("check2"+reviewDao.selectLatest(6));
		 System.out.println("check3"+reviewDao.updateReview("수정은 이렇게", "드디어 된거 같소?", 3, 17));
		 //System.out.println(reviewDao.insertReview(0, "우리 팀원들 화이팅!", "다 할 수 있어!", 100, null, 0, 0, 0, 23, "guard4@gmail.com"));
		 //System.out.println(reviewDao.reviewCount(1));
		 /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑테스트완↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
		 //System.out.println(reviewDao.insertReview2(new Review(0, "1", "2", 0, null, 0, 0, 0, new Movie(4, null, null, null, null, 0, null, null, 0, 0, 0, null, null, null, null), null, new User_Info("guard4@gmail.com", null, null, null))));
		 
	}
}