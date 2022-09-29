package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
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
	
	
	//카테고리 번호를 이용하여 해당 카테고리에 영화 리스트 출력
	@Select("select c.cg_name, m.m_image, m.m_name, m.m_actor, m.m_info, m.m_date, avg(r.r_grade) \"총평점\" from movie m join category c on m.cg_no=c.cg_no join review r  on m.m_no =r.m_no where m.cg_no=#{cg_no}\n"
			+ "group by c.cg_name, m.m_image, m.m_name, m.m_actor, m.m_info, m.m_date")
	public List<Category> selectByNoMovieList(int cg_no);

}