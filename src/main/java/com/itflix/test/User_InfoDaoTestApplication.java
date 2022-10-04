package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.User_InfoDao;
import com.itflix.dto.User_Info;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class User_InfoDaoTestApplication {

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
				new SpringApplication(User_InfoDaoTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		User_InfoDao user_InfoDao = context.getBean(User_InfoDao.class);
		 System.out.println(user_InfoDao);
		 //System.out.println(user_InfoDao.user_InfoSelectAll());
		 //System.out.println(user_InfoDao.selectByEmail("admin@gmail.com"));
		 //System.out.println(user_InfoDao.deleteUser_Info("guard4@gmail.com"));
		 //System.out.println("Check" + user_InfoDao.insertUser_Info(new User_Info("guard4@gmail.com","1111", "김희철", "01055555555")));
		 //System.out.println("Check : "+user_InfoDao.updateUser_Info(new User_Info("guard4@gmail.com", "1234", "희철김", "01012341234")) );
		 /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑테스트 완↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
		 System.out.println("아이디존재여부>>>"+user_InfoDao.existedUser("guard1@gmail.com"));
		 

	}

}
