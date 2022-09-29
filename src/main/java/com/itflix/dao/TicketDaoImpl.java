package com.itflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itflix.dto.Ticket;
import com.itflix.mapper.Ticket_Mapper;

@Repository
public class TicketDaoImpl implements TicketDao {

	@Autowired
	private Ticket_Mapper ticket_Mapper;

	public TicketDaoImpl() {
		System.out.println("T_DaoImpl test3");
	}

	public TicketDaoImpl(Ticket_Mapper ticket_Mapper) throws Exception {
		System.out.println("T_DaoImpl test4");
		this.ticket_Mapper = ticket_Mapper;
	}

	public void setTicket_Mapper(Ticket_Mapper ticket_Mapper) {
		this.ticket_Mapper = ticket_Mapper;
	}

	@Override
	public int insertTicket(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTicket(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTicket(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Ticket> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
