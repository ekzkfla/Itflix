package com.itflix.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.itflix.dto.User_Info;


public class User_InfoDaoImpl implements User_InfoDao{
	@Autowired
	private DataSource dataSource;
	
	public User_InfoDaoImpl() throws Exception{
		 
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	// 회원 추가
	@Override
	public int insertUser_Info(User_Info User_Info) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into User_Info values(?,?,?,?)");
		pstmt.setString(1,User_Info.getU_email());
		pstmt.setString(2,User_Info.getU_pass());
		pstmt.setString(3,User_Info.getU_name());
		pstmt.setString(4,User_Info.getU_phone());
		int insertRowCount=pstmt.executeUpdate();
		con.close();
		return insertRowCount;
	}
	
	// 이메일이랑 이름으로 비밀번호 찾기.
	@Override
	public User_Info selectByEmailAndName(String u_email, String u_name) throws Exception {
		User_Info User_info=null;
		Connection con = 
				dataSource.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement("select u_pass from user_info where u_email = ? and u_name = ?");
		pstmt.setString(1, u_email);
		pstmt.setString(2, u_name);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			User_info=new User_Info(rs.getString("u_email"),
							rs.getString("u_pass"),
							rs.getString("u_name"),
							rs.getString("u_phone"));
			
		}
		con.close();
		
		return User_info ;
	}
	
	// 이름이랑 핸드폰 번호로 이메일 찾기.
	@Override
	public User_Info selectByNameAndPhone(String u_name, String u_phone) throws Exception {
		User_Info User_info=null;
		Connection con = 
				dataSource.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement("select u_email from user_info where u_name = ? and u_phone = ?");
		pstmt.setString(1, u_name);
		pstmt.setString(2, u_phone);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			User_info=new User_Info(rs.getString("u_email"),
					rs.getString("u_pass"),
					rs.getString("u_name"),
					rs.getString("u_phone"));
			
		}
		con.close();
		
		return User_info ;
	}
	
	// 이메일로 회원 찾기.
	@Override
	public User_Info selectByEmail(String u_email) throws Exception {
		User_Info User_info=null;
		Connection con = 
				dataSource.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement("select * from user_info where u_email = ?");
		pstmt.setString(1, u_email);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			User_info=new User_Info(rs.getString("u_email"),
					rs.getString("u_pass"),
					rs.getString("u_name"),
					rs.getString("u_phone"));
			
		}
		con.close();
		
		return User_info ;
	}

	// 전체회원찾기. 안쓸듯.
	@Override
	public ArrayList<User_Info> user_InfoSelectAll() throws Exception {
		System.out.println(">>GuestDaoImpl");
		ArrayList<User_Info> User_infoList=new ArrayList<User_Info>();
		
		Connection con = 
				dataSource.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement("select * from user_info");
		ResultSet rs=pstmt.executeQuery();
		while (rs.next()) {
			User_infoList.add(
					new User_Info(rs.getString("u_email"),
							rs.getString("u_pass"),
							rs.getString("u_name"),
							rs.getString("u_phone")));
		}
		con.close();
		return User_infoList;
	}
	
	// 회원수정
	@Override
	public int updateUser_Info(User_Info user_info) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement("update user_info set u_pass = ?, u_name = ?, u_phone = ?, where u_email = ?");
		pstmt.setString(1,user_info.getU_email());
		pstmt.setString(2,user_info.getU_pass());
		pstmt.setString(3,user_info.getU_name());
		pstmt.setString(4,user_info.getU_phone());
		int updateRowCount=pstmt.executeUpdate();
		con.close();
		return updateRowCount;
	}
	
	// 회원탈퇴
	@Override
	public int deleteUser_Info(String u_email) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement("delete from user_info where u_email = ?");
		pstmt.setString(1, u_email);
		int deleteRowCount=pstmt.executeUpdate();
		con.close();
		return deleteRowCount;
	}

}
