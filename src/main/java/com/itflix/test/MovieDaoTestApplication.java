package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.MovieDao;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class MovieDaoTestApplication {

	public static void main(String[] args) throws Exception{
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
				new SpringApplication(MovieDaoTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		MovieDao movieDao = context.getBean(MovieDao.class);
		 System.out.println(movieDao);
		 System.out.println(movieDao.selectAll());
		 System.out.println(movieDao.selectByNo(1));
		 System.out.println(movieDao.selectCategoryNo(1));
		 System.out.println(movieDao.selectMovieName("정직"));
		 System.out.println(movieDao.selectMovieActor("라"));
		 System.out.println(movieDao.selectMovieRecentReview(10));
		 System.out.println(movieDao.selectMovieCount());
		 System.out.println(movieDao.selectMovieGrade());
		 System.out.println(movieDao.selectMovieNewDate());
		 System.out.println(movieDao.selectMovieOldDate());
		 System.out.println(movieDao.selectMovieCountByNo(1));
		 
		 //System.out.println(movieDao.movieCountPlus(1));

	}

}
