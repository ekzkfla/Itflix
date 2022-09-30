package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.JjimDao;
import com.itflix.dto.Jjim;
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
		User_Info user = new User_Info();
		user.getU_email();
		Jjim jjim = new Jjim();
		System.out.println(jjimDao.jjimList(jjim));
		
	}
}