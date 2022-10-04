package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.CategoryDao;
import com.itflix.dto.Category;
import com.itflix.dto.Notice;
import com.itflix.service.CategoryService;
import com.itflix.service.NoticeService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class NoticeDaoTestApplication {
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
				new SpringApplication(NoticeDaoTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		NoticeService noticeService = context.getBean(NoticeService.class);
		   //System.out.println(noticeService);
		   //System.out.println(noticeService.selectAll());
		   //System.out.println(noticeService.totalCount());
			System.out.println(noticeService.noticeOne());
			//System.out.println(noticeService.selectByNo(2));
		   //System.out.println(noticeService.selectByTitle("긴급"));
		   //System.out.println(noticeService.insertNotice(new Notice(0,null, "newTitle2", "newContent2", 0, 0, 0)));
		   //System.out.println(noticeService.updateNotice(new Notice(10, null, "change", "change", 0, 0, 0)));
		   //System.out.println(noticeService.deleteNotice(11));
		 /**************************테스트 완료 *****************************************/
		
	}
}