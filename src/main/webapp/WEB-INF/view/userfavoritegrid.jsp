<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
</head>
<body>


	<!-- BEGIN | Header -->
	<jsp:include page="include_common_top.jsp" />
	<!-- END | Header -->

	<div class="hero user-hero">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="hero-ct">
						<h2 style="color: white;">내가 찜한 콘텐츠</h2>
						<br>
						<ul class="breadcumb">
							<li class="active"><a href="main">Home</a></li>
							<li><span class="ion-ios-arrow-right"></span>Favorite movies</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Start | user left menu bar-->
	<jsp:include page="include_user_menu.jsp" />
	<!-- End | user left menu bar-->

	<div class="col-md-9 col-sm-12 col-xs-12">
		<div class="topbar-filter user">
			<p>
				Found <span>${jjimCount} movies</span> in total
			</p>
			<label>Sort by:</label><select><option value="popularity">카테고리</option>
				<option value="cg_no=1">액션</option>
				<option value="cg_no=2">코미디</option>
				<option value="cg_no=3">로맨스</option>
				<option value="cg_no=4">공포/미스터리</option>
				<option value="cg_no=5">SF/판타지</option>
				<option value="cg_no=6">드라마</option>
			</select>
		</div>
		<div class="flex-wrap-movielist grid-fav">
 
			<c:forEach var="jjim" items="${jjimList}" >

 				<!-- start  -->
				<div class="movie-item-style-2 movie-item-style-1 style-3">
					<img
						src="images/${jjim.movieList[0].category.cg_name}/${jjim.movieList[0].m_name}_1.jpg"
						alt="">
					<div class="hvr-inner">
						<a href="moviesingle?m_no=${jjim.movieList[0].m_no}">Read
							more <i class="ion-android-arrow-dropright"></i>
						</a>
					</div>
					<div class="mv-item-infor">
						<h6>
							<a href="moviesingle?m_no=${jjim.movieList[0].m_no}">${jjim.movieList[0].m_name}</a>
						</h6>
						<p class="rate">
							<i class="ion-android-star"></i><span>${jjim.movieList[0].reviewList[0].r_grade }</span>/5
						</p>
					</div>
				</div>
 				<!-- END  -->
			</c:forEach>

			
		</div>
		<div class="topbar-filter">
			<label>Movies per page:</label><select><option value="range">20
					Movies</option>
				<option value="saab">10 Movies</option></select>
			<div class="pagination2">
				<span>Page 1 of 2:</span><a class="active" href="#">1</a><a href="#">2</a><a
					href="#">3</a><a href="#">...</a><a href="#">78</a><a href="#">79</a><a
					href="#"><i class="ion-arrow-right-b"></i></a>
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