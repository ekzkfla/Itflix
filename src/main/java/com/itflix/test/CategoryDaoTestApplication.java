package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.CategoryDao;
import com.itflix.dto.Category;
import com.itflix.service.CategoryService;
import com.itflix.service.NoticeService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class CategoryDaoTestApplication {
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
				new SpringApplication(CategoryDaoTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		CategoryDao categoryDao = context.getBean(CategoryDao.class);
		 //System.out.println(categoryDao);
		 //System.out.println(categoryDao.selectAll());
		 //System.out.println(categoryDao.selectByName("액션"));
		 //System.out.println(categoryDao.insertCategory(new Category(0,"새로운카테고리", null)));
		 //System.out.println(categoryDao.updateCategory(new Category(7, "변경된 카테고리")));
		 //System.out.println(categoryDao.deleteCategory(7));
		 //System.out.println(categoryDao.selectByNoMovieList(1));
		 //System.out.println(categoryDao.selectByNoMovieList(1));
		 /**************************테스트 완료 *****************************************/
		
	}
}