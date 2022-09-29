package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itflix.dto.Jjim;

@Mapper
public interface JJim_Mapper {
	
	/* 1명 회원 영화 찜 목록보기 */
	@Select("select m.m_no,"
			+ "     m.cg_no,"
			+ "     m.m_name,"
			+ "     m.m_image,"
			+ "     m.m_date,"
			+ "     m.m_count,"
			+ "     avg(r.r_grade)"
			+ "from movie m"
			+ "left join review"
			+ "on m.m_no=r.m_no"
			+ "left join jjim j"
			+ "on m.m_no=j.m_no"
			+ "where j.u_email=#{u_email}"
			+ "group by m.m_no,"
			+ "         m.cg_no,"
			+ "         m.m_image,"
			+ "         m.m_date,"
			+ "         m.m_count")
	public List<Jjim> jjimList(Jjim jjim);
		
	/* 영화 찜하기*/
	@Insert("insert into jjim "
			+ "VALUES(#{j_groupno},"
			+ "	      #{j_step},"
			+ "		  #{j_depth}"
			+ "       #{u_email},"
			+ "       #{m_no})")
	public int jjimInsert(Jjim jjim);
	
	/* 영화 찜하기 해제*/
	@Delete("delete from jjim where u_email=#{u_email} and m_no=#{m_no}")
	public int jjimDelete(Jjim jjim);

	
}