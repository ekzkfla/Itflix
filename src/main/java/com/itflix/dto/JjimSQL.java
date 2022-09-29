package com.itflix.dto;

public class JjimSQL {
	
/* <필요기능>
 * 회원 영화 찜 목록(나중에볼영화저장)
 * 회원 영화 찜 (볼영화저장)
 * 회원 찜영화 삭제 (볼영화해제)
 */

/* 회원영화 찜 목록보기
   - 찜, 무비, 리뷰 테이블 그룹화 및 조인
   - 영화 총평점 동시출력을 위해 리뷰 테이블과 조인,
     리뷰가 없어 평점이 null인 영화출력을 위해 left join 진행함 */
public static final String JJIM_SELECT_ALL=
          "select m.m_no,\r\n"
		+ "       m.cg_no, \r\n"
		+ "       m.m_name,\r\n"
		+ "       m.m_image,\r\n"
		+ "       m.m_date,\r\n"
		+ "       m.m_count,\r\n"
		+ "       avg(r.r_grade) \r\n"
		+ "from movie m \r\n"
		+ "left join review r\r\n"
		+ "on m.m_no=r.m_no\r\n"
		+ "left join jjim j\r\n"
		+ "on m.m_no=j.m_no\r\n"
		+ "where j.u_email=? \r\n"
		+ "group by m.m_no,\r\n"
		+ "         m.cg_no,      \r\n"
		+ "         m.m_name,\r\n"
		+ "         m.m_image,\r\n"
		+ "         m.m_date,\r\n"
		+ "         m.m_count";

/* 영화 찜하기 (나중에 볼 영화 저장 기능)
   - SQL문 컬럼순서 -> U_EMAIL , M_NO */
public static final String JJIM_INSERT=
		"insert into jjim VALUES(?,?)";
	
/* 영화 찜하기 해제 (나중에 볼 영화 삭제 기능)
   - SQL문 컬럼순서 -> U_EMAIL , M_NO */
public static final String JJIM_DELETE=
		"delete from jjim where u_email=? and m_no=?";


}
