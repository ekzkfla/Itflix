package com.itflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itflix.dto.Movie;
import com.itflix.mapper.Movie_Mapper;

@Repository
public class MovieDaoImpl implements MovieDao {
	
	@Autowired
	private Movie_Mapper movie_Mapper;

	public MovieDaoImpl() {
	}
	
	public MovieDaoImpl(Movie_Mapper movie_Mapper){
		this.movie_Mapper=movie_Mapper;
	}
	
	public void setMovie_Mapper(Movie_Mapper movie_Mapper) {
		this.movie_Mapper = movie_Mapper;
	}
	
	
	@Override
	public List<Movie> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie selectByNo(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie selectCategoryNo(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie selectMovieName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie selectMovieActor(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> selectMovieCount() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> selectMovieNewDate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> selectMovieOldDate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie selectMovieCountByNo(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie movieCountPlus(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMovie(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMovie(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMovie(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
