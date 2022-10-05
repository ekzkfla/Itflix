<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<jsp:include page = "include_common_top.jsp"/>
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
					<div class="movie-img sticky-sb">
						<img src="images/${movie.category.cg_name}/${movie.m_name}_1.jpg" alt="">
					</div>
				</div>
				<div class="col-md-7 col-sm-4 col-xs-3">
					<div class="movie-single-ct main-content">
					
						<%-- <c:forEach items="${reviewLatest }" var="review"> --%>
						<!-- ↓↓↓영화 타이틀 제목↓↓↓  -->
						<h1 class="bd-hd">
							${movie.m_name } Review
						</h1>
						<!-- ↑↑↑영화 타이틀 제목↑↑↑  -->
						
						<div class="movie-tabs">
							<div class="tabs">
								<div class="tab-content">
									<div id="overview" class="tab active">
										<div class="row">
											
											
											<div class="col-md-8 col-sm-12 col-xs-12">
											
												<!-- 상단 -->
												<div class="title-hd-sm" >
													<h4>User reviews</h4>
												</div>
												
												
												<!-- movie user review -->
												<c:forEach items="${reviewLatest }" var="review">
												<div class="mv-user-review-item">
													<h3>${review.r_title }</h3>
													<div class="no-star">
														<i class="ion-android-star"></i>
														<i class="ion-android-star"></i>
														<i class="ion-android-star"></i>
														<i class="ion-android-star"></i>
														<i class="ion-android-star last"></i>
													</div>
													<!-- 날짜 -->
													<p class="time">
													<fmt:formatDate value="${review.r_date}" pattern="yyyy/MM/dd"></fmt:formatDate> 
													</p>
													<!-- 내용 -->
														<p>${review.r_content }</p><hr>
													<div class="title-hd-sm"></div>
														<p>${review.user_Info.u_email }</p>
													<div class="title-hd-sm"></div>
												</div>
												
												</c:forEach>
												
												
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<%-- </c:forEach> --%>
					</div>
					
					<!-- ↓↓↓하단 페이지↓↓↓ -->
												<div class="topbar-filter">
												<label>Reviews per page:</label>
												<label> 5 Reviews</label>
													<div class="pagination2">
														<span>Page 1 of 5:</span><a class="active" href="#">1</a><a
															href="#">1</a><a href="#">2</a><a href="#">3</a><a
															href="#">4</a><a href="#">5</a><a href="#"><i
															class="ion-arrow-right-b"></i></a>
													</div>
												</div>
												<!-- ↑↑↑하단 페이지↑↑↑ -->
					
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