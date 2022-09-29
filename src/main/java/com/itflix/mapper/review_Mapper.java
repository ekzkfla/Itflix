package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itflix.dto.Review;

@Mapper
public interface review_Mapper {
	
	//리뷰 목록 전체 출력
	@Select("select * from review")
	public List<Review> selectAll();
	
	//리뷰 번호를 선택하여 1개 출력
	//@Select("select * from review where r_no=#{r_no}")
	//public Review selectByNo(int r_no);
	
	
	/*
	 * 메쏘드이름은 	GuestMapper.xml 파일의 id와일치
	 * 메쏘드인자타입은 GuestMapper.xml 파일의 parameterType 와일치
	 * 메쏘드리턴타입은 GuestMapper.xml 파일의 resultType 와일치
	 */
	/*
	<select id="selectByNo" resultType="com.itwill.guest.Guest" 
	parameterType="_int">
		select * from guest where guest_no=#{guest_no}
	</select>
	 */
	public review_Mapper selectByNo(int no);
	/*
	<select id="selectAll" resultType="com.itwill.guest.Guest">
		select * from guest
	</select>
	 */
	/*
	public List<user_info> selectAll();
	public int insertGuest(user_info guest);
	public int deleteGuest(int guest_no);
	public int updateGuest(Guest guest);
	*/
}