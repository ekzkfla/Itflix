package com.itflix.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.itflix.dto.Subscription;
import com.itflix.dto.Ticket;
import com.itflix.dto.User_Info;

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
	@Insert("insert into Subscription values(#{s_no},sysdate,sysdate+30,#{s_cardName},#{cardNumber},#{t_no},#{u_email}")
	@SelectKey(statement = "select Subscription_S_NO_SEQ.nextval from dual", keyProperty = "s_no",before = true, resultType = Integer.class)
	public Subscription insertSubscription(int s_no, Date s_start, Date s_end, String s_cardName, String s_cardNumber, int t_no, String u_email);
	
	//구독권 업데이트
	@Update("update subscription set t_no = #{t_no} where u_email = #{u_email}")
	@ResultMap("SubscriptionWithUpdate")
	public Subscription updateSubscription(int t_no, String u_email);
}