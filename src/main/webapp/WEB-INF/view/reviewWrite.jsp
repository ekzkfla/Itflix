<%@page import="com.itflix.dto.User_Info"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--현재 날짜 구현   -->	
<%@ page import="java.util.Date" %>	
<%@ page import="java.text.SimpleDateFormat" %>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	Date nowTime = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yy년 MM월 dd일");
	User_Info login_user = (User_Info) session.getAttribute("login_user");
%>

<!DOCTYPE html>
<!--[if IE 7]><html class="ie ie7 no-js" lang="en-US"><![endif]-->
<!--[if IE 8]><html class="ie ie8 no-js" lang="en-US"><![endif]-->
<!--[if !(IE 7) | !(IE 8)  ]><!-->
<html lang="en" class="no-js">
<head>
<!-- Basic need -->
<title>Open Pediatrics</title>
<meta charset="UTF-8">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<link rel="profile" href="#">
<!--Google Font-->
<link rel="stylesheet"
	href='http://fonts.googleapis.com/css?family=Dosis:400,700,500|Nunito:300,400,600' />
<!-- Mobile specific meta -->
<meta name=viewport content="width=device-width, initial-scale=1">
<meta name="format-detection" content="telephone-no">
<!-- CSS files -->
<link rel="stylesheet" href="css/plugins.css">
<link rel="stylesheet" href="css/style.css">
<link href="css/star.css" rel="stylesheet"/>
</head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById('reviewWriteBtn').onclick=function(){
			
			document.getElementById('myform').submit();
			
			
			return false;
		}
	}

</script>

<body>


	<!-- BEGIN | Header -->
	<jsp:include page="include_common_top.jsp" />
	<!-- END | Header -->


	<div class="hero mv-single-hero">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<!-- <h1>movie listing - list</h1><ul class="breadcumb"><li class="active"><a href="#">Home</a></li><li><span class="ion-ios-arrow-right"></span>movie listing</li></ul>-->
				</div>
			</div>
		</div>
	</div>
	<div class="page-single movie-single movie_single">
		<div class="container">
			<div class="row ipad-width2">
				
				
				 
				<div class="col-md-2 col-sm-4 col-xs-4">

					<!-- ↓↓↓이미지↓↓↓ -->
					<div class="slide-it">
						<div class="movie-item">
							<div class="mv-img">
								<div class="movie-img sticky-sb">
									<img
										src="images/${movie.category.cg_name}/${movie.m_name}_1.jpg"
										alt="" width="30" height="30">
									
									<div class="hvr-inner">
										<a href="moviesingle?m_no=${movie.m_no}">Read more <i
											class="ion-android-arrow-dropright"></i></a>
									</div>
									
								</div>
							</div>
						</div>
					</div>
					<!-- ↑↑↑이미지↑↑↑ -->

				</div>
				
				<div class="col-md-7 col-sm-4 col-xs-3">
					<div class="movie-single-ct main-content">
						<!-- ↓↓↓영화 타이틀 제목↓↓↓  -->
						<h1 class="bd-hd">${movie.m_name } Review 작성</h1>
						<!-- ↑↑↑영화 타이틀 제목↑↑↑  -->

						<div class="movie-tabs">
							<div class="tabs">
								<div class="tab-content">
									<div id="overview" class="tab active">
										<div class="row">


											<div class="col-md-8 col-sm-12 col-xs-12">
												<!-- 상단 -->
												<div class="title-hd-sm">
													<h4>User reviews</h4>
													<p>글쓴이 : ${loginUser.u_name }</p>
												</div>
												<!-- movie user review -->
												<div class="mv-user-review-item">
												<p  class="time" style="text-align-last: right;">
													날짜 :<%= sf.format(nowTime) %>
												</p>	
												
												<!--별점 구현   -->
											 	<form class="mb-3" name="myform" id="myform" method="post">
											 	
													<fieldset>
														<span class="text-bold">별점을 선택해주세요</span>
														<input type="radio" name="reviewStar" value="5" id="r_grade1"><label
															for="r_grade1">★</label>
														<input type="radio" name="reviewStar" value="4" id="r_grade2"><label
															for="r_grade2">★</label>
														<input type="radio" name="reviewStar" value="3" id="r_grade3"><label
															for="r_grade3">★</label>
														<input type="radio" name="reviewStar" value="2" id="r_grade4"><label
															for="r_grade4">★</label>
														<input type="radio" name="reviewStar" value="1" id="r_grade5"><label
															for="r_grade5">★</label>
													</fieldset>
												<!--리뷰 타이틀 부분   -->
													<div>
														<textarea class="col-auto form-control" type="text" id="${r_title }" 
																  placeholder="제목을입력해주세요!"
																  style="width: 100%; height: 5em; border: none; resize:none;"></textarea>
													</div><br>
													<!--리뷰 내용  -->
													<div>
														<textarea class="col-auto form-control" type="text" id="${r_content}"
																  placeholder="내용을 입력해 주세요!!"
																  style="width: 100%; height: 30em; border: none; resize:none;"></textarea>
													</div>
										<div class="landing-hero">
											<div class="row">
												<button type="submit" id="reviewWriteBtn" style="padding:0px; position: absolute; top:75%; left:35%;">
												<a class="redbtn">영화<br> ${movie.m_name }에 <br> 리뷰 작성</a>
												</button>
											</div>
										</div>
												</form>		
											<!--아래 밑줄  -->	
											<div class="title-hd-sm"></div>
										</div>



									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
					</div>
			</div>
		</div>
	</div>
	<!-- footer section-->
	<jsp:include page="include_common_bottom.jsp"></jsp:include>
	<!-- end of footer section-->
	<script src="js/jquery.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/plugins2.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>