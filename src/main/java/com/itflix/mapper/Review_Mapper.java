package com.itflix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.itflix.dto.Review;

@Mapper
public interface Review_Mapper {

	// 리뷰 목록 전체 출력
	@Select("select * from review")
	public List<Review> selectAll();

	// 본인 리뷰 보기(회원아이디 리뷰 보기)
	@Select("select r.r_no,r.r_title, r.r_content, r.r_grade, r.r_date ,u.u_email from review r join user_info u on u.u_email=r.u_email where u.u_email = #{u_email}")
	@ResultMap("ReviewWithUserList")
	public List<Review> selectWroteReview(String u_email);

	/*
	 * // 최신 리뷰 출력
	 * 
	 * @Select("select r.r_no, u.u_email, r.r_title, r.r_content, r.r_grade, r.r_date from user_info u join review r on u.u_email = r.u_email order by r.r_date desc"
	 * ) public List<Review> selectLatest();
	 */
	// 리뷰 번호를 선택하여 1개 출력
	@Select("select * from review where r_no=#{r_no}")
	public Review selectByNo(int r_no);

	// 리뷰 삭제
	@Delete("delete from review where r_no=#{r_no}")
	public int deleteReview(int no);
	
	// 리뷰 추가
	@Insert("insert into review VALUES(#{r_no},'#{r_title}','#{r_content}',#{r_grade},#{r_date},#{r_groupno},#{r_step},#{r_depth},#{m_no},'#{u_email}')")
	//@SelectKey(statement = "select REVIEW_R_NO_SEQ.nextval from dual", keyProperty = "r_no",before = true, resultType = Integer.class)
	@ResultMap("ReviewWithMovieandUser")
	public int insertReview(Review review);
	
	// 리뷰 수정
	@Update("update review set r_title='#{r_title}',r_content='#{r_content}',r_grade=#{r_grade},m_no=#{m_no} where r_no=#{r_no}")
	@ResultMap("Review_Update")
	public int updateReview(int r_no);
	
	// -- 각 영화 별 최신 리뷰
	@Select("select  r.r_no, m.m_no, u.u_email, r.r_title, r.r_content, r.r_grade, r.r_date from user_info u left join review r on u.u_email = r.u_email left join movie m on m.m_no=r.m_no where m.m_no=#{r_no} order by r.r_date desc")
	@ResultMap("ReviewWithLatest")
	public List<Review> selectLatest(int no);
	

}