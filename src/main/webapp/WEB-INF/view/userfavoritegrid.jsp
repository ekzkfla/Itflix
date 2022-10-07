<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<h2 style="color: white;">${login_user.u_name}님의찜한 영화</h2>
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
	
	<!-- Start | user leff menu bar-->
	<jsp:include page="include_user_menu.jsp" />
	<!-- End | user leff menu bar-->
	
	<div class="col-md-9 col-sm-12 col-xs-12">
		<div class="topbar-filter user">
			<p>
				Found <span>1,608 movies </span>in total
			</p>
			<label>Sort by:</label><select><option value="popularity">카테고리</option>
				<option value="cg=1">액션</option>
				<option value="cg=2">로맨스</option>
				<option value="cg=3">SF/미스터리</option>
				<option value="cg=4">코미디</option>
				<option value="date">드라마</option></select>
		</div>

		<div class="flex-wrap-movielist grid-fav">
			<!-- jjim movie list start  -->
			<div class="movie-item-style-2 movie-item-style-1 style-3">
				<img src="images/uploads/mv1.jpg" alt="">
				<div class="hvr-inner">
					<a href="moviesingle">Read more <i
						class="ion-android-arrow-dropright"></i></a>
				</div>
				<div class="mv-item-infor">
					<h6>
						<a href="moviesingle">${m_name}</a>
					</h6>
					<p class="rate">
						<i class="ion-android-star"></i><span>8.1</span>/10
					</p>
				</div>
			</div>
			<!-- jjim movie list end  -->
		</div>

		<!-- page option start -->
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
		<!-- page option end -->
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