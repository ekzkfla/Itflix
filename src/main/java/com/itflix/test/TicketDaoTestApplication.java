package com.itflix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.itflix.dao.TicketDao;
import com.itflix.dto.Ticket;
import com.itflix.service.CategoryService;
import com.itflix.service.NoticeService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itflix"})
public class TicketDaoTestApplication {
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
				new SpringApplication(TicketDaoTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		TicketDao ticketDao = context.getBean(TicketDao.class);
		 System.out.println(ticketDao);
		 System.out.println(ticketDao.selectAll());
		 //Ticket ticket = new Ticket(17,"15123");
		 //System.out.println(ticketDao.insertTicket(ticket));
		 //System.out.println(ticketDao.insertTicket(new Ticket(30, "19900원")));
		 //System.out.println("delete"+ticketDao.deleteTicket(3));
	}
}