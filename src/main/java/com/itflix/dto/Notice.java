package com.itflix.dto;

import java.util.Date;

public class Notice {

	private int n_no;	
	private Date n_date;	
	private String n_title;	
	private String n_content;
	private int n_gropno;
	private int n_step;
	private int n_depth;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}

	public Notice(int n_no, Date n_date, String n_title, String n_content, int n_gropno, int n_step, int n_depth) {
		super();
		this.n_no = n_no;
		this.n_date = n_date;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_gropno = n_gropno;
		this.n_step = n_step;
		this.n_depth = n_depth;
	}

	public int getN_no() {
		return n_no;
	}

	public void setN_no(int n_no) {
		this.n_no = n_no;
	}

	public Date getN_date() {
		return n_date;
	}

	public void setN_date(Date n_date) {
		this.n_date = n_date;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public int getN_gropno() {
		return n_gropno;
	}

	public void setN_gropno(int n_gropno) {
		this.n_gropno = n_gropno;
	}

	public int getN_step() {
		return n_step;
	}

	public void setN_step(int n_step) {
		this.n_step = n_step;
	}

	public int getN_depth() {
		return n_depth;
	}

	public void setN_depth(int n_depth) {
		this.n_depth = n_depth;
	}

	@Override
	public String toString() {
		return "Notice [n_no=" + n_no + ", n_date=" + n_date + ", n_title=" + n_title + ", n_content=" + n_content
				+ ", n_gropno=" + n_gropno + ", n_step=" + n_step + ", n_depth=" + n_depth + "]";
	}
	
	
}
