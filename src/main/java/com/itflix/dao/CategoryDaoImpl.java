package com.itflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itflix.dto.Category;
import com.itflix.mapper.Category_Mapper;

@Repository
public class CategoryDaoImpl implements CategoryDao{
	
	@Autowired
	private Category_Mapper category_Mapper;

	public CategoryDaoImpl() {
	}
	
	public CategoryDaoImpl(Category_Mapper category_Mapper)throws Exception {
		this.category_Mapper=category_Mapper;
	}
	 
	@Override
	public List<Category> selectAll() throws Exception {
		List<Category> categoryList= category_Mapper.selectAll();
		return categoryList;
	}

	@Override
	public Category selectByNo(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category selectByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCategory(Category category) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCategory(Category category) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCategory(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
