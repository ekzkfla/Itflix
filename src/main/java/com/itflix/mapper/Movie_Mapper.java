package com.itflix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itflix.dto.Movie;

@Mapper
public interface Movie_Mapper {
		//영화 리스트 전체 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date,m.m_url, c.cg_no,c.cg_name, avg(r.r_grade) as r_grade \n"
				+ "from movie m \n"
				+ "right outer join Review r on m.m_no=r.m_no  \n"
				+ "join category c on m.cg_no = c.cg_no \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date,m.m_url, c.cg_no,c.cg_name  \n"
				+ "ORDER BY m.m_no ASC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectAll();
		
		//영화 번호로 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "       avg(r.r_grade) as r_grade \n"
				+ "from movie m \n"
				+ "right outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "where m.m_no = #{m.m_no} \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no\n"
				+ "ORDER BY m.m_no ASC")
		@ResultMap("selectMovieResultMap")
		public Movie selectByNo(int m_no);
		
		//카테고리 번호로 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "       avg(r.r_grade) as r_grade \n"
				+ "from movie m \n"
				+ "right outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "where m.cg_no = #{m.cg_no} \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no\n"
				+ "ORDER BY m.m_no ASC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectCategoryNo(int cg_no);
		
		//영화 제목으로 검색
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "       avg(r.r_grade) as r_grade \n"
				+ "from Movie m \n"
				+ "left outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "where m_name LIKE '%'||#{m.m_name}||'%' \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no\n"
				+ "ORDER BY m.m_no ASC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectMovieName(String m_name);
		
		//영화 출연진 이름으로 검색
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "       avg(r.r_grade) as r_grade \n"
				+ "from Movie m \n"
				+ "left outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "where m_actor LIKE '%'||#{m.m_actor}||'%' \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no\n"
				+ "ORDER BY m.m_no ASC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectMovieActor(String m_actor);
		
		/*
		//백업용
		//가장 최근 작성된 리뷰 평점 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "r.r_no, r.r_title, r.r_content, r.r_date, r.u_email \n"
				+ "from movie m \n"
				+ "left outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "where m.m_no = #{m.m_no} and rownum = 1 \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "r.r_no, r.r_title, r.r_content, r.r_date, r.u_email \n"
				+ "ORDER BY r.r_date DESC")
		@ResultMap("selectMovieRecentReviewResultMap")
		public Movie selectMovieRecentReview(Integer m_no);
		*/
		
		//가장 최근 작성된 리뷰 평점 출력
		@Select("select * from(select m.m_no, m.m_name, m.m_actor, m.m_image, m.cg_no, \n"
				+ "c.cg_name, r.r_no, r.r_title, r.r_content, r.r_grade, r.r_date, r.u_email \n"
				+ "from Movie m join Review r on m.m_no = r.m_no\n"
				+ "left JOIN Category c on c.cg_no = m.cg_no \n"
				+ "where m.m_no = #{m.m_no} \n"
				+ "GROUP BY m.m_no, m.m_name, m.m_actor, m.m_image, m.cg_no, \n"
				+ "c.cg_name, r.r_no, r.r_title, r.r_content, r.r_grade, r.r_date, r.u_email \n"
				+ "ORDER BY r.r_date DESC) where ROWNUM <= 1")
		@ResultMap("selectMovieRecentReviewResultMap")
		public Movie selectMovieRecentReview(Integer m_no);
		
		//조회수 높은 순으로 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,c.cg_name, avg(r.r_grade) as r_grade \n"
				+ "from movie m \n"
				+ "left outer join Review r on m.m_no=r.m_no \n"
				+ "join category c on m.cg_no = c.cg_no \n"
				+ "where ROWNUM <=14\n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,c.cg_name \n"
				+ "ORDER BY m_count DESC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectMovieCount();
		
		//평점 높은 순으로 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "       avg(r.r_grade) as r_grade \n"
				+ "from movie m \n"
				+ "left outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "where r_grade is not null \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no\n"
				+ "ORDER BY m_count DESC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectMovieGrade();
		
		//영화 개봉일 최신순으로 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "       avg(r.r_grade) as r_grade \n"
				+ "from movie m \n"
				+ "left outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no\n"
				+ "ORDER BY m_date DESC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectMovieNewDate();
		
		//영화 개봉일 오래된 순으로 출력
		@Select("select m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no,\n"
				+ "       avg(r.r_grade) as r_grade \n"
				+ "from movie m \n"
				+ "left outer join Review r \n"
				+ "on m.m_no=r.m_no \n"
				+ "group by m.m_no, m.m_name, m.m_actor, m.m_info, m.m_image, m.m_count, m.m_date, m.cg_no\n"
				+ "ORDER BY m_date ASC")
		@ResultMap("selectMovieResultMap")
		public List<Movie> selectMovieOldDate();
		
		//영화 정보 변경 
		@Update("update Movie set m_name = #{m_name}, m_actor = #{m_actor}, m_info = #{m_info},\n"
				+ "m_date = #{m_date}, m_url = #{m_url}, cg_no = #{cg_no} where m_no = #{m_no}")
		public int updateMovie(Movie movie);
		
		//영화 번호로 조회수 출력
		@Select("select m_count from Movie where m_no = #{m_no}")
		public Movie selectMovieCountByNo(int m_no);
		
		//영화 클릭수 증가 
		@Update("update Movie set m_count = m_count+1 where m_no = #{m_no}")	
		public Movie movieCountPlus(int m_no);
		
		//영화 추가 
		@Insert("insert into Movie values(#{m_no}, #{m_name}, #{m_actor}, #{m_info}, #{m_image},\n"
				+ "#{m_count}, #{m_date}, #{m_url}, #{m_groupno}, #{m_step}, #{m_depth}, #{cg_no})")
		public int insertMovie(Movie movie);
		
		//영화 삭제
		@Delete("delete from Movie where m_no = #{m_no} ")
		public int deleteMovie(int m_no);
		
	//public movie_Mapper selectByNo(int no);
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