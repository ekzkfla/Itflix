package com.itflix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itflix.dto.Subscription;

@Mapper
public interface Subscription_Mapper {
	
	//전체 구독자리스트
	@Select("select * from Subscription order by s_no ASC")
	public List<Subscription> selectlistAll();
	
	//구독시작날짜 찾기
	@Select("select * from Subscription where u_email = #{u_email}")
	public Subscription selectByStDate(String u_email);
	
	//구독만료날짜 찾기
	@Select("select * from Subscription where u_email = #{u_email}")
	public Subscription selectByEndDate(String u_email);
	
	//구독자 단일 찾기
	@Select("select * from Subscription where u_email = #{u_email}")
	public Subscription selectByNo(String u_email);
}