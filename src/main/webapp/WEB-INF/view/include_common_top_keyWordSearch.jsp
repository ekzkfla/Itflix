<%@page import="com.itflix.dto.User_Info"%>
<%@page import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	function keywordCheck() {
		var str_keyword = window.searchform.keyword.value;
		if (!str_keyword || str_keyword === "") {
			window.alert("검색어를 입력하세요.");
			window.searchform.keyword.focus();
			return false;
		}
		window.searchform.submit();
	}
	
</script>


	
		<form action="movieSearch" method="get">
		<div class="top-search">
			<select data-trigger="" name="searchType" >
				<option value="name">영화</option>
				<option value="actor">감독·출연</option>
			</select> 
			<input name="" type="text" placeholder="Serch your Movie and enjoy your Life" >
			<input type="submit" id="search"  >
		</div>
		</form>
	

