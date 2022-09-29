package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itflix.dto.Jjim;
import com.itflix.dto.User_Info;

@Mapper
public interface JJim_Mapper {
	
	/* 1명 회원 영화 찜 목록보기 */
	@Select("select m.m_no,"
			+ "       m.cg_no,"
			+ "       m.m_name,"
			+ "       m.m_image,"
			+ "       m.m_date,"
			+ "       m.m_count,"
			+ "       avg(r.r_grade)"
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
	//@insert("insert into jjim VALUES(#{u_email},#{m_mo})")
	public int jjimInsert(Jjim jjim);
	
	
	/* 영화 찜하기 해제*/
	public int jjimDelete(Jjim jjim);


		
	/* 영화 찜하기 해제 (나중에 볼 영화 삭제 기능)
	   - SQL문 컬럼순서 -> U_EMAIL , M_NO */
	public static final String JJIM_DELETE=
			"delete from jjim where u_email=? and m_no=?";


	
}