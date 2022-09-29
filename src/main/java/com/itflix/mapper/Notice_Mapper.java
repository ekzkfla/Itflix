package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itflix.dto.Category;
import com.itflix.dto.Notice;

@Mapper
public interface Notice_Mapper {
	
	//공지사항 전체 출력
	@Select("select * from notice")
	public List<Notice> selectAll();
	
	//공지사항 전체 갯수 출력
	@Select("select count(*) from Notice")
	public List<Notice> totalCount();
	
	//공지사항 번호로 검색
	@Select("select * from notice where n_no = #{n_no}")
	public Notice selectByNo(int n_no);
	
	//공지사항 이름으로 검색
	@Select("select * from notice where n_title like '%#{n_title}%'")
	public Notice selectByTitle(String n_title);
	
	
	/**************구현 미정**************/
	//공지사항 추가 
	@Insert("insert into notice (n_no,n_date,n_title,n_content,n_groupno,n_step,n_depth)values(NOTICE_N_NO_SEQ.nextval,#{n_date},#{n_title},#{n_content},#{n_groupno},#{n_step},#{n_depth})")
	public int insertNotice(Notice notice);
	
	//공지사항 변경 
	@Update("update notice set n_date=#{n_date},n_title=#{n_title},n_content=#{n_content},n_groupno=#{n_groupno},n_step=#{n_step},n_depth=#{n_depth} where n_no =#{n_no} ")
	public int updateNotice(Notice notice);
	
	//공지사항 삭제 
	@Delete("delete from notice where n_no= #{n_no}")
	public int deleteNotice(int n_no);
	/**************구현 미정**************/
	
	
	
	
}