package com.itflix.service;

import java.util.List;

import com.itflix.dto.Category;

public interface CategoryService {
	
	//카테고리 번호를 이용한 해당 영화 리스트 출력
	List<Category> selectByNoMovieList(int no) throws Exception;
	//카테고리 전체 출력
	List<Category> selectAll() throws Exception;
	//카테고리 번호를 이용한 찾기
	Category selectByNo(int no) throws Exception;
	//카테고리 이름을 이용한 찾기
	Category selectByName(String name) throws Exception;
	//카테고리 추가
	int insertCategory(Category category) throws Exception;
	//카테고리 변경
	int updateCategory(Category category) throws Exception;
	//카테고리 삭제
	int deleteCategory(int no) throws Exception;

}
