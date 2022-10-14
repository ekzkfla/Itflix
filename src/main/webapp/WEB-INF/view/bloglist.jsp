<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<!-- Basic need -->
<title>공지사항</title>
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
</head>
<body>
	<!-- BEGIN | Header -->
	<jsp:include page="include_common_top.jsp" />
	<!-- END | Header -->
	<!--중앙 타이틀 화면 -->
	<div class="hero common-hero">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="hero-ct">
						<h1>공지사항</h1>
						<ul class="breadcumb">
							<li class="active"><a href="main">Home</a></li>
							<li><span class="ion-ios-arrow-right"></span>공지사항</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--중앙 타이틀 화면 -->
	<!-- 메인 공지사항 리스트  -->
	<div class="page-single">
		<div class="container">
			<div class="row">
				<div class="col-md-9 col-sm-12 col-xs-12">
					<!--분류 보드바 -->
					<div class="topbar-filter">
						<p>Found <span>${noticeTotal}개 </span>in total	</p>
						<select>
							<option value="popularity">공지사항</option>
							<option value="popularity">신규</option>
							<option value="rating">긴급</option>
							<option value="rating">점검</option>
							<option value="date">주의사항</option>
							<option value="date">구독권</option>
						</select>
					</div>
					<!--분류 보드바 -->
					<!--공지사항 리스트   -->	
					<form name="f" method="Post">
					<c:forEach items="${noticeList}" var ="notice"> 
						<div class="blog-item-style-1 blog-item-style-3">
							<img src="images//mylogo.png">
								<div class="blog-it-infor">
									<h3><a href="blogdetail?n_no=${notice.n_no}"  class="notice">${notice.n_title }</a></h3>
									<span class="time"><fmt:formatDate value="${notice.n_date}" pattern="yyyy/MM/dd"/></span>
									<p>${notice.n_content}</p>
								</div>
						</div>
					</c:forEach>
					</form>
					<!--공지사항 리스트   -->	
					<!--페이징 구현  -->
					<ul class="pagination">
						<li class="icon-prev">
							<a href="#"><i class="ion-ios-arrow-left"></i></a>
						</li>
						<li class="active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">...</a></li>
						<li><a href="#">21</a></li>
						<li><a href="#">22</a></li>
						<li class="icon-next"><a href="#"><i
								class="ion-ios-arrow-right"></i></a></li>
					</ul>
					<!--페이징 구현  -->
				</div>
			 <!--분류 우측 보드바  -->	
			  	<div class="col-md-3 col-sm-12 col-xs-12">
					<div class="sidebar">
						<div class="sb-search sb-it">
							<h4 class="sb-title">Search</h4>
							<input type="text" placeholder="Enter keywords">
						</div>
						<div class="sb-cate sb-it">
							<h4 class="sb-title">Categories</h4>
							<ul>
								<li><a href="#">Awards (50)</a></li>
								<li><a href="#">Box office (38)</a></li>
								<li><a href="#">Film reviews (72)</a></li>
								<li><a href="#">News (45)</a></li>
								<li><a href="#">Global (06)</a></li>
							</ul>
						</div>
					</div>
				</div>
			 <!--분류 우측 보드바  -->	
			</div>
		</div>
	</div>
	<!-- 메인 공지사항 리스트  -->
	
	
	<!-- footer section-->
	<jsp:include page="include_common_bottom.jsp"></jsp:include>
	<!-- end of footer section-->
	<script src="js/jquery.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/plugins2.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>