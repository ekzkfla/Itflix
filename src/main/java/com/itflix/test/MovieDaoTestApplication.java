package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.MovieDao;
import com.itflix.service.MovieService;

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
		MovieService movieService = context.getBean(MovieService.class);
		 //System.out.println(movieService);
		 //System.out.println(movieService.selectAllNoFilter());
		 //System.out.println(movieService.selectAll());
		 //System.out.println(movieService.movieAllCount());
		 //System.out.println(movieService.selectByNo(1));
		 //System.out.println(movieService.selectCategoryNo(1));
		 //System.out.println(movieService.selectMovieName("정직"));
		 //System.out.println(movieService.selectMovieActor("김"));
		 //System.out.println(movieService.selectMovieRecentReview(1));
		 //System.out.println(movieService.selectMovieCountList());
		 //System.out.println(movieService.selectMovieGradeList());
		 //System.out.println(movieService.selectMovieNewDate());
		 //System.out.println(movieService.selectMovieOldDate());
		 //System.out.println(movieService.selectMovieGradeByNo(1));
		 //System.out.println(movieService.selectMovieCountByNo(1));
		 //System.out.println(movieService.searchActor("라"));
		 //System.out.println(movieService.searchMovie("정"));
//		 System.out.println(movieService.movieCountPlus(1));

	}

}
