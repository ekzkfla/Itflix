package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.itflix.dto.Jjim;

@Mapper
public interface Jjim_Mapper {
	
	/* 1명 회원 영화 찜 목록보기 */
	@Select("select m.m_no,"
			+ "     m.cg_no,"
			+ "     m.m_name,"
			+ "     m.m_i`mage,"
			+ "     m.m_date,"
			+ "     m.m_count,"
			+ "     avg(r.r_grade)"
			+ "from movie m"
			+ "left join review r"
			+ "on m.m_no=r.m_no"
			+ "left join jjim j"
			+ "on m.m_no=j.m_no"
			+ "where j.u_email='guard1@gmail.com'"
			+ "group by m.m_no,"
			+ "         m.cg_no,"
			+ "         m.m_image,"
			+ "         m.m_date,"
			+ "         m.m_count")
	public List<Jjim> jjimList(String u_email);
	
	/* 영화 찜하기*/
	@Insert("insert into jjim VALUES(0,0,0,'guard1@gmail.com',8)")
	public int jjimInsert(Jjim jjim);
	
	/* 영화 찜하기 해제*/
	@Delete("delete from jjim where u_email='guard1@gmail.com' and m_no=8")
	public int jjimDelete(String u_email,int m_no);

	
	
	
	@Select("select j.u_email from jjim j join user_info u on j.u_email = u.u_email")
	@ResultMap("jjimListTest")
	public List<Jjim> jjimListTest();
	
	
	@Select("select j.u_email, j.m_no from jjim j join user_info u on j.u_email = u.u_email join movie m on j.m_no = m.m_no")
	@ResultMap("jjimListTest2")
	public List<Jjim> jjimListTest2();
	 
	
	
	  @Select("select j.u_email, j.m_no, m.m_name, m.m_image, m.m_date, m.m_count from jjim j join user_info u on j.u_email = u.u_email join movie m on j.m_no = m.m_no")
	  @ResultMap("jjimListTest3")
	  public List<Jjim> jjimListTest3();
	 
	  
	  @Select("select j.u_email, j.m_no, m.m_name, m.m_image, m.m_date, m.m_count, m.cg_no from jjim j join user_info u on j.u_email = u.u_email join movie m on j.m_no = m.m_no")
	  @ResultMap("jjimListTest4")
	  public List<Jjim> jjimListTest4();
	 
	  
	  @Select("select j.u_email, j.m_no, m.m_name, m.m_image, m.m_date, m.m_count, m.cg_no from jjim j join user_info u on j.u_email = u.u_email join movie m on j.m_no = m.m_no where j.u_email='guard1@gmail.com'")
	  @ResultMap("jjimListTest4")
	  public List<Jjim> jjimListTest5(String u_email);
	
	
	
	
	 @Select("select * from jjim")
	 public List<Jjim> jjimListAll();
	
	 /*
	 * @Select("select j.u_email," + "     m.m_no," + "     m.m_name," +
	 * "     m.m_image," + "     m.m_date," + "     m.m_count" + "from jjim j " +
	 * "join movie m" + "on j.m_no = m.m_no;")
	 * 
	 * @ResultMap("jjimWithMovieResultMap") public List<Jjim> jjimListAll2();
	 */

	
}