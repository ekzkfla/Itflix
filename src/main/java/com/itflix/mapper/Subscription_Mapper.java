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
	@ResultMap("SubscriptionResultMap")
	public List<Subscription> selectListAll();
	
	//구독시작날짜 찾기
	@Select("select * from Subscription where u_email = #{u_email}")
	public Subscription selectByStDate(String u_email);
	
	//구독만료날짜 찾기
	@Select("select * from Subscription where u_email = #{u_email}")
	public Subscription selectByEndDate(String u_email);
	
	//구독자 단일 찾기
	@Select("select * from Subscription where u_email = #{u_email}")
	public Subscription selectByNo(String u_email);
	
	//구독권 추가
	@Select("insert into Subscription values(SUBSCRIPTION_S_NO_SEQ.nextval,sysdate,sysdate+30,#{s_cartName},#{cardNumber},#{t_no},#{u_email}")
	public Subscription insertSubscription(Subscription subscription);
	
	//구독권 업데이트
	@Select("update subscription set t_no = #{t_no} where u_email = #{u_email}")
	public Subscription updateSubscription(int t_no, String u_email);
}