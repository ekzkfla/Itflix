<%@page import="com.itflix.dto.User_Info"%>
<%@page import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<%
User_Info login_user = (User_Info) session.getAttribute("login_user");
%>
<style type="text/css">
input#search {
background:url(images/uploads/topsearch.png);
background-repeat: no-repeat;
background-position: 0px center;
width:45px;
height:45x;
align-items: center;
}
</style>

<script type="text/javascript">
	
function key_word_search(){
		document.div.action="key_word_search_action";
		document.div.method='POST';
		document.div.submit();
	}
	
	
	/* 
	function keyWordSearch(){
		if (document.f.name ==""){
			alert("검색한 내용이 없습니다.");
			return false;
		}
		document.f.action="key_word_search";
		document.f.method='post';
		document.f.submit();
		
	}
	 */
</script>
		
		
		<form action="key_word_search_action" method="POST" name="f">
		<div class="top-search">
			
			<!-- 선택 분류 
			 <select class="form-control"  name="searchField" >
				<option value="0">선택</option>
				<option value="m_name">영화</option>
				<option value="m_actor">감독·출연</option>
			</select>
			  -->
			<input class="form-control" name="searchText" type="text" placeholder="Serch your Movie and enjoy your Life" >
			<button type="button" onclick="key_word_search();">검색</button>
		</div>
		</form>
		
	
	

