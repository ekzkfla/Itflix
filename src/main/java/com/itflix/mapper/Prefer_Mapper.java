package com.itflix.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.itflix.dto.Prefer;

@Mapper
public interface Prefer_Mapper {

	//회원별 prefer 조회(선호카테고리 조회)
	@Select("select u_email, cg_no from prefer where u_email = #{u_email}")
	@ResultMap("selecCgByEmail")
	public List<Prefer> selecCgByEmail(String u_email);
	//선호카테고리 삭제
	@Delete("delete from prefer where u_email=#{u_email} and cg_no=#{cg_no}")
	public int preferDelete(String u_email,int cg_no);
	//선호카테고리 선택
	@Insert("insert into prefer values (1,0,0,#{u_email},#{cg_no})")
	public int preferInsert(String u_email,int cg_no);
	
	
	//총평점없이 회원선호카테고리 영화리스트 불러오기
	@Select("select p.cg_no,"
			+ "       m.m_no,"
			+ "       m.m_name,"
			+ "       m.m_image,"
			+ "       m.m_date,"
			+ "       m.m_count"
			+ "from prefer p LEFT join movie m"
			+ "on p.cg_no=m.cg_no"
			+ "where p.u_email=#{u_email} and p.cg_no=#{cg_no};")
	@ResultMap("selectPreferCgMovieList")
	public List<Prefer> selectPreferCgMovieList(String u_email,int cg_no);

}