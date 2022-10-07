<%@page import="com.itflix.dto.User_Info"%>
<%@page
	import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<%
//String sUserId = (String) session.getAttribute("sUserId");
User_Info login_user = (User_Info) session.getAttribute("login_user");
%>



<header class="ht-header">
	<!--start of loading<로딩페이지 로고 사진 >-->
	<div id="preloader">
		<img class="logo" src="images/mylogo.png" alt="" width="119"
			height="58">
		<div id="status">
			<span></span><span></span>
		</div>
	</div>
	<!--end of loading<로딩페이지 로고 사진 >-->

	<!--login form popup-->
	<div class="login-wrapper" id="login-content">
		<div class="login-content">
			<a href="#" class="close">x</a>
			<h3>Login</h3>
			<form method="post" action="user_login_action" id="login_form"
				name="login_form">
				<div class="row">
					<label for="email">Email:<input type="text" name="u_email"
						id="u_email" placeholder="example@itflix.com"
						pattern="^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$"
						required="required" value="guard1@gmail.com" />
					</label>
				</div>
				<div class="row">
					<label for="password"> Password:<input type="password"
						name="u_pass" id="u_pass" placeholder="영문자,숫자,특수문자 포함(최소8자리)"
						pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$"
						required="required" value="a123123!" /></label>
				</div>
				<div class="row">
					<div class="remember">
						<div>
							<input type="checkbox" name="remember" value="Remember me"><span>Remember
								me</span>
						</div>
						<a href="#">Forget password ?</a>
					</div>
				</div>
				<div class="row">
					<button type="submit">Login</button>
				</div>
			</form>
			<!-- 
			<div class="row">
				<p>Or via social</p>
				<div class="social-btn-2">
					<a class="fb" href="#"><i class="ion-social-facebook"></i>Facebook</a><a
						class="tw" href="#"><i class="ion-social-twitter"></i>twitter</a>
				</div>
			</div>
			 -->
		</div>
	</div>
	<!--end of login form popup-->
	<!--signup form popup-->
	<div class="login-wrapper" id="signup-content">
		<div class="login-content">
			<a href="#" class="close">x</a>
			<h3>sign up</h3>

			<form method="post" action="CreateUser_action">
				<div class="row">
					<label for="email">Email:<input type="text" name="u_email"
						id="u_email" placeholder="example@itflix.com"
						pattern="^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$"
						required="required" /></label>
				</div>
				<div class="row">
					<label for=userName>Name:<input type="text" name="u_name"
						id="u_name" placeholder="홍길동" pattern="^[(가-힣)(a-zA-Z)]{2,}$"
						required="required" /></label>
				</div>
				<div class="row">
					<label for=phone>Phone:<input type="text" name="u_phone"
						id="u_phone" placeholder="010-0000-0000"
						pattern="^(?:\d{3}|\(\d{3}\))([-\/\.])\d{4}\1\d{4}$"
						required="required" /></label>
				</div>
				<div class="row">
					<label for="password"> Password:<input type="password"
						name="u_pass" id="u_pass" placeholder="영문자,숫자,특수문자 포함(최소8자리)"
						pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$"
						required="required" /></label>
				</div>
				<div class="row">
					<label for="repassword"> re-type Password:<input
						type="password" name="u_pass" id="password" placeholder="비밀번호 재확인"
						pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$"
						required="required" /></label>
				</div>
				<div class="row">
					<button type="submit">sign up</button>
				</div>
			</form>
		</div>
	</div>
	<!--end of signup form popup-->

	<div class="container">
		<nav class="navbar navbar-default navbar-custom">

			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header logo">
				<div class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<div id="nav-icon1">
						<span></span><span></span><span></span>
					</div>
				</div>
				<a href="main"><img class="logo" src="images/mylogo.png" alt=""
					width="70" height="58"></a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse flex-parent"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav flex-child-menu menu-left">
					<li class="hidden"><a href="#page-top"></a></li>
					<li class="home"><a href="main">Home </a></li>
					<li class="dropdown first"><a href="moviegridfw"> movies</a></li>
					<li class="dropdown first"><a
						class="btn btn-default dropdown-toggle lv1" data-toggle="dropdown"
						data-hover="dropdown"> Categories <i class="fa fa-angle-down"
							aria-hidden="true"></i>
					</a> <!--카테고리 dropdown 설정 부분 -->
						<ul class="dropdown-menu level1">
							<li><a href="categoryMoviegrid?cg_no=1">액션</a></li>
							<li class="it-last"><a href="categoryMoviegrid?cg_no=2">코미디</a></li>
							<li class="it-last"><a href="categoryMoviegrid?cg_no=3">로맨스</a></li>
							<li class="it-last"><a href="categoryMoviegrid?cg_no=4">공포/미스터리</a></li>
							<li class="it-last"><a href="categoryMoviegrid?cg_no=5">SF/판타지</a></li>
							<li class="it-last"><a href="categoryMoviegrid?cg_no=6">드라마</a></li>
						</ul></li>
					<li class="dropdown first"><a href="bloglist">Notice</a></li>

				</ul>
				<ul class="nav navbar-nav flex-child-menu menu-right">

					<%
					if (login_user == null) {
					%>
					<li class="btn signupLink"><a href="#">회원가입</a></li>
					<li class="loginLink"><a href="">로그인</a></li>
					<%
					} else {
					%>
					<li class="btn"><a href="userprofile">마이페이지</a></li>
					<li><a href="user_logout_action">로그아웃</a></li>

					<%
					}
					%>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
		<!-- top search form -->
		<form action="movieSearch" method="get">
		<div class="top-search">
			<select data-trigger="" name="searchType" >
				<option value="name">영화</option>
				<option value="actor">감독●출연</option>
			</select> 
			<input name="" type="text" placeholder="Serch your Movie and enjoy your Life" >
			<input type="submit" id="search" value="" >
		</div>
		</form>
	</div>
</header>
