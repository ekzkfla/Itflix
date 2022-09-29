package com.itflix.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Ticket_Mapper {
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
	public Ticket_Mapper selectByNo(int no);
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