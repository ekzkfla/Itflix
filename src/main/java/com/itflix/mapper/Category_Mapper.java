package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itflix.dto.Category;

@Mapper
public interface Category_Mapper {
	
	//카테고리 목록 전체 출력
	@Select("select * from Category")
	public List<Category> selectAll();
	
	//카테고리 번호를 이용하여 1개 출력
	@Select("select * from Category where cg_no=#{cg_no}")
	public Category selectByNo(int cg_no);
	
	//카테고리 이름을 이용하여 1개 출력 
	@Select("select * from Category where cg_name = #{cg_name}")
	public Category selectByName(String cg_name);
	
	//카테고리 1개 추가 
	@Insert("insert into category values(#{cg_no},#{cg_name})")
	public int insertCategory(Category category);
	
	//카테고리 이름을 변경 
	@Update("update Category set cg_name = #{cg_name} where cg_no = #{cg_no}")	
	public int updateCategory(Category category);
	
	//카테고리 1개 삭제 
	@Delete("delete from movie where m_no = #{cg_no} ")
	public int deleteCategory(int cg_no);
	
	
	/*
	 * //카테고리 번호를 이용하여 해당 카테고리에 영화 리스트 출력
	 * 
	 * @Select("select c.cg_name,m.m_name,m.m_image, avg(r.r_grade) from category c join movie m on c.cg_no= m.cg_no join review r on r.m_no =m.m_no where c.cg_no=#{cg_no} GROUP BY c.cg_name,m.m_name,m.m_image ;"
	 * ) public List<Category> selectByNoMovieList(Integer cg_no);
	 */

}