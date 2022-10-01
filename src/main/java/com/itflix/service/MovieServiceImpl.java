package com.itflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dao.MovieDao;
import com.itflix.dto.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDao movieDao;
	
	public MovieServiceImpl() throws Exception{
		
	}
	
	public MovieDao getCategoryDao() {
		return movieDao;
	}


	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	//영화 리스트 전체 출력
	@Override
	public List<Movie> selectAll() throws Exception {
		return movieDao.selectAll();
	}

	//영화 번호로 출력
	@Override
	public Movie selectByNo(int no) throws Exception {
		return movieDao.selectByNo(no);
	}

	//카테고리 번호로 출력
	@Override
	public Movie selectCategoryNo(int no) throws Exception {
		return movieDao.selectCategoryNo(no);
	}

	//영화 제목으로 검색
	@Override
	public List<Movie> selectMovieName(String name) throws Exception {
		return movieDao.selectMovieName(name);
	}

	//영화 출연진 이름으로 검색
	@Override
	public List<Movie> selectMovieActor(String name) throws Exception {
		return movieDao.selectMovieActor(name);
	}

	//조회수 높은 순으로 출력
	@Override
	public List<Movie> selectMovieCount() throws Exception {
		return movieDao.selectMovieCount();
	}
	
	//평점 높은 순으로 출력
	@Override
	public List<Movie> selectMovieGrade() throws Exception {
		return movieDao.selectMovieGrade();
	}

	//영화 개봉일 최신순으로 출력
	@Override
	public List<Movie> selectMovieNewDate() throws Exception {
		return movieDao.selectMovieNewDate();
	}

	//영화 개봉일 오래된 순으로 출력
	@Override
	public List<Movie> selectMovieOldDate() throws Exception {
		return movieDao.selectMovieOldDate();
	}

	//영화 번호로 조회수 출력
	@Override
	public Movie selectMovieCountByNo(int no) throws Exception {
		return movieDao.selectMovieCountByNo(no);
	}

	//영화 클릭수 증가
	@Override
	public Movie movieCountPlus(int no) throws Exception {
		return movieDao.movieCountPlus(no);
	}

	//영화 추가
	@Override
	public int insertMovie(Movie movie) throws Exception {
		return movieDao.insertMovie(movie);
	}

	//영화 변경
	@Override
	public int updateMovie(Movie movie) throws Exception {
		return movieDao.updateMovie(movie);
	}

	//영화 삭제
	@Override
	public int deleteMovie(int no) throws Exception {
		return movieDao.deleteMovie(no);
	}

}
