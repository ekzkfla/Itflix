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
		System.out.println("C_DaoImpl");
	}
	
	public CategoryDaoImpl(Category_Mapper category_Mapper){
		this.category_Mapper=category_Mapper;
	}
	
	public void setCategory_Mapper(Category_Mapper category_Mapper) {
		this.category_Mapper = category_Mapper;
	}

	//카테고리 번호를 이용한 해당 영화 리스트 출력 
	@Override
	public List<Category> selectByNoMovieList(int cg_no)throws Exception{
		List<Category> selectByNoMovieList = category_Mapper.selectByNoMovieList(cg_no);
		return selectByNoMovieList;
	}
	
	//카테고리 전체 출력 
	@Override
	public List<Category> selectAll() throws Exception {
		List<Category> categoryList= category_Mapper.selectAll();
		return categoryList;
	}
	
	//카테고리 번호를 이용한 찾기
	@Override
	public Category selectByNo(int cg_no) throws Exception {
		Category category = category_Mapper.selectByNo(cg_no); 
		return category;
	}
	
	//카테고리 이름을 이용한 찾기
	@Override
	public Category selectByName(String cg_name) throws Exception {
		Category category = category_Mapper.selectByName(cg_name);
		return category;
	}
	
	//카테고리 추가
	@Override
	public int insertCategory(Category category) throws Exception {
		int insertCategory = category_Mapper.insertCategory(category);
		return insertCategory;
	}
	
	//카테고리 변경
	@Override
	public int updateCategory(Category category) throws Exception {
		int updateCateogory = category_Mapper.updateCategory(category);
		return updateCateogory;
	}
	
	//카테고리 삭제 
	@Override
	public int deleteCategory(int cg_no) throws Exception {
		int deleteCateogory = category_Mapper.deleteCategory(cg_no);
		return deleteCateogory;
	}
	
		
}
