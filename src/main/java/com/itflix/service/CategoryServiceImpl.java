package com.itflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itflix.dao.CategoryDao;
import com.itflix.dto.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao categoryDao;
	
	public CategoryServiceImpl() {
		
	}
	
	public List<Category> selectByNoMovieList(int no) throws Exception{
		return categoryDao.selectByNoMovieList(no);
	}
	
	public List<Category> selectAll() throws Exception{
		return categoryDao.selectAll();
	}
	
	public Category selectByNo(int no)throws Exception {
		return categoryDao.selectByNo(no);
	}
	
	
	
	
}
