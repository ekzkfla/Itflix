package com.itflix.dto;

import java.util.Date;

public class Movie {
	
	private int m_no;
	private String m_name;
	private String m_actor;
	private String m_info;
	private String m_image;
	private int m_count;
	private Date m_date;
	private int m_groupno;
	private int m_step;
	private int m_depth;
	private Category category;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(int m_no, String m_name, String m_actor, String m_info, String m_image, int m_count, Date m_date,
			int m_groupno, int m_step, int m_depth, Category category) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_actor = m_actor;
		this.m_info = m_info;
		this.m_image = m_image;
		this.m_count = m_count;
		this.m_date = m_date;
		this.m_groupno = m_groupno;
		this.m_step = m_step;
		this.m_depth = m_depth;
		this.category = category;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_actor() {
		return m_actor;
	}

	public void setM_actor(String m_actor) {
		this.m_actor = m_actor;
	}

	public String getM_info() {
		return m_info;
	}

	public void setM_info(String m_info) {
		this.m_info = m_info;
	}

	public String getM_image() {
		return m_image;
	}

	public void setM_image(String m_image) {
		this.m_image = m_image;
	}

	public int getM_count() {
		return m_count;
	}

	public void setM_count(int m_count) {
		this.m_count = m_count;
	}

	public Date getM_date() {
		return m_date;
	}

	public void setM_date(Date m_date) {
		this.m_date = m_date;
	}

	public int getM_groupno() {
		return m_groupno;
	}

	public void setM_groupno(int m_groupno) {
		this.m_groupno = m_groupno;
	}

	public int getM_step() {
		return m_step;
	}

	public void setM_step(int m_step) {
		this.m_step = m_step;
	}

	public int getM_depth() {
		return m_depth;
	}

	public void setM_depth(int m_depth) {
		this.m_depth = m_depth;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie [m_no=" + m_no + ", m_name=" + m_name + ", m_actor=" + m_actor + ", m_info=" + m_info
				+ ", m_image=" + m_image + ", m_count=" + m_count + ", m_date=" + m_date + ", m_groupno=" + m_groupno
				+ ", m_step=" + m_step + ", m_depth=" + m_depth + ", category=" + category + "]";
	}
	
	
}
