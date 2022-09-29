package com.itflix.dto;

public class JjimSQL {
	
/* <필요기능>
 * 회원 영화 찜 목록(나중에볼영화저장)
 * 회원 영화 찜하기 (볼영화저장)
 * 회원 찜영화 삭제하기 (볼영화해제)
 */

/*	
회원영화 찜 목록보기
 - 찜, 무비, 리뷰 테이블 그룹화 및 조인
 - 영화 총평점 동시출력을 위해 reivew 테이블과 조인,
   리뷰가 없어 평점이 null인 영화출력을 위해 left join 진행함
   
*/
public static final String JJIM_SELECT_ALL="";
	
	
	
	
	
/*

-- 회원 영화 찜하기(insert) --
insert into jjim VALUES('guard1@gmail.com',1);

-- 회원 찜 삭제(delete) --
delete from jjim where u_email='guard5@gmail.com' and m_no=3;

-- 회원별 찜저장목록 출력화면 sql문 (찜,무비,리뷰 테이블 그룹화 및 조인) --
-- (출력: 영화등록번호,영화장르,영화이름,영화이미지,영화개봉일,영화클릭수,리뷰평균평점) -- 
select m.m_no,
       m.cg_no,       
       m.m_name,
       m.m_image,
       m.m_link,
       m.m_date,
       m.m_count,
       avg(r.r_grade)"총평점" 
from movie m 
left join review r
on m.m_no=r.m_no
left join jjim j
on m.m_no=j.m_no
where j.u_email='guard5@gmail.com'
group by m.m_no,
         m.cg_no,      
         m.m_name,
         m.m_image,
         m.m_link,
         m.m_date,
         m.m_count;
         
*/

}
