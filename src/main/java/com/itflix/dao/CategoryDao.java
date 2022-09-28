package com.itflix.dao;

import java.util.List;

import com.itflix.dto.Category;

public interface CategoryDao {
	
	List<Category> selectAll() throws Exception;
	
	Category selectByNo(int no) throws Exception;
	
	Category selectByName(String name) throws Exception;
	
	int insertCategory(Category category)throws Exception;
	
	int updateCategory(Category category)throws Exception;
	
	int deleteCategory(int no)throws Exception;
}
