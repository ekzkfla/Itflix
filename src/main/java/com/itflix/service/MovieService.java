package com.itflix.service;

import java.util.List;

import com.itflix.dto.Movie;

public interface MovieService {
	
	//영화 리스트 전체 출력
	List<Movie> selectAll() throws Exception;
	//영화 번호로 출력
	Movie selectByNo(int no) throws Exception;
	//카테고리 번호로 출력
	Movie selectCategoryNo(int no) throws Exception;
	//영화 제목으로 검색
	List<Movie> selectMovieName(String name) throws Exception;
	//영화 출연진 이름으로 검색
	List<Movie> selectMovieActor(String name) throws Exception;
	//조회수 높은 순으로 출력
	List<Movie> selectMovieCount() throws Exception;
	//평점 높은 순으로 출력
	List<Movie> selectMovieGrade() throws Exception;
	//영화 개봉일 최신순으로 출력
	List<Movie> selectMovieNewDate() throws Exception;
	//영화 개봉일 오래된 순으로 출력
	List<Movie> selectMovieOldDate() throws Exception;
	//영화 번호로 조회수 출력
	Movie selectMovieCountByNo(int no) throws Exception;
	//영화 클릭수 증가
	Movie movieCountPlus(int no) throws Exception;
	
	//영화 추가
	int insertMovie(Movie movie)throws Exception;
	//영화 변경
	int updateMovie(Movie movie)throws Exception;
	//영화 삭제
	int deleteMovie(int no)throws Exception;

}
