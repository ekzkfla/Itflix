package com.itflix.dto;

public class Prefer {
	
	private int p_groupno;
	private int p_step;
	private int p_depth;
	private User_Info user_Info;
	private Category category;
	
	public Prefer() {
		// TODO Auto-generated constructor stub
	}

	public Prefer(int p_groupno, int p_step, int p_depth, User_Info user_Info, Category category) {
		super();
		this.p_groupno = p_groupno;
		this.p_step = p_step;
		this.p_depth = p_depth;
		this.user_Info = user_Info;
		this.category = category;
	}

	public int getP_groupno() {
		return p_groupno;
	}

	public void setP_groupno(int p_groupno) {
		this.p_groupno = p_groupno;
	}

	public int getP_step() {
		return p_step;
	}

	public void setP_step(int p_step) {
		this.p_step = p_step;
	}

	public int getP_depth() {
		return p_depth;
	}

	public void setP_depth(int p_depth) {
		this.p_depth = p_depth;
	}

	public User_Info getUser_Info() {
		return user_Info;
	}

	public void setUser_Info(User_Info user_Info) {
		this.user_Info = user_Info;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Prefer [p_groupno=" + p_groupno + ", p_step=" + p_step + ", p_depth=" + p_depth + ", user_Info="
				+ user_Info + ", category=" + category + "]";
	}

	
	
}
