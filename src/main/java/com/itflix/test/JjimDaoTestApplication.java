package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.JjimDao;
import com.itflix.dto.Jjim;
import com.itflix.dto.Movie;
import com.itflix.dto.User_Info;


@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class JjimDaoTestApplication {
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
				new SpringApplication(JjimDaoTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		JjimDao jjimDao = context.getBean(JjimDao.class);
		System.out.println(jjimDao);

		/* 리뷰의 총평점 조인안하고 불러오기 성공*/
		//System.out.println(jjimDao.jjimListTest5("guard1@gamil.com"));
		
		//System.out.println("삭제>>>"+jjimDao.jjimDelete("guard1@gmail.com",8));
		
		/*-----------------성공하고싶어요---------------------*/
		
		/*
		System.out.println(jjimDao.jjimInsert(new Jjim(0, 0, 0,"guard1@gmail.com",9));
				System.out.println(jjimDao.jjimInsert(new Jjim(0, 0, 0,
											new User_Info("guard1@gmail.com", null, null, null),
											new Movie(8, null, null, null, null, 0, null, null, 0, 0, 0, null))));
		*/		
		
		/* guard1@gmail.com */
		
	}
}