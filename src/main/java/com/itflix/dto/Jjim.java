package com.itflix.dto;

public class Jjim {
	
	private int j_groupno;
	private int j_step;
	private int j_depth;
	private User_Info user_Info;
	private Movie movie;
	
	public Jjim() {
		// TODO Auto-generated constructor stub
	}

	public Jjim(int j_groupno, int j_step, int j_depth, User_Info user_Info, Movie movie) {
		super();
		this.j_groupno = j_groupno;
		this.j_step = j_step;
		this.j_depth = j_depth;
		this.user_Info = user_Info;
		this.movie = movie;
	}

	public int getJ_groupno() {
		return j_groupno;
	}

	public void setJ_groupno(int j_groupno) {
		this.j_groupno = j_groupno;
	}

	public int getJ_step() {
		return j_step;
	}

	public void setJ_step(int j_step) {
		this.j_step = j_step;
	}

	public int getJ_depth() {
		return j_depth;
	}

	public void setJ_depth(int j_depth) {
		this.j_depth = j_depth;
	}

	public User_Info getUser_Info() {
		return user_Info;
	}

	public void setUser_Info(User_Info user_Info) {
		this.user_Info = user_Info;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Jjim [j_groupno=" + j_groupno + ", j_step=" + j_step + ", j_depth=" + j_depth + ", user_Info="
				+ user_Info + ", movie=" + movie + "]";
	}
	
}
