<%@page import="org.apache.coyote.RequestGroupInfo"%>
<%@page import="java.io.Console"%>
<%@page import="com.itflix.dto.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
<!DOCTYPE html>
<!--[if IE 7]><html class="ie ie7 no-js" lang="en-US"><![endif]-->
<!--[if IE 8]><html class="ie ie8 no-js" lang="en-US"><![endif]-->
<!--[if !(IE 7) | !(IE 8)  ]><!-->
<html lang="en" class="no-js">
<head>
<!-- Basic need -->
<title>영화 상세페이지</title>
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
				<!--왼쪽 영화 포스터 및 영상 시청바  -->
					<div class="col-md-4 col-sm-12 col-xs-12">
						<div class="movie-img sticky-sb">
							<img src="images/${movie.category.cg_name}/${movie.m_name}_1.jpg" alt="">
							<div class="movie-btn">
								<div class="btn-transform transform-vertical red">
									<div>
										<a href="#" class="item item-1 redbtn"><i class="ion-play"></i>Watch
											Trailer</a>
									</div>
									<div>
										<a href="${movie.m_url}"
											class="item item-2 redbtn fancybox-media hvr-grow"><i
											class="ion-play"></i></a>
									</div>
								</div>
							</div>
						</div>
					</div>
				<!--왼쪽 영화 포스터 및 영상 시청바  -->
				<!--중앙 상세 페이지  -->
				<div class="col-md-7 col-sm-4 col-xs-3">
					<div class="movie-single-ct main-content">
						<h1 class="bd-hd">
							${movie.m_name} <span style="font-size: 15pt; color:#0DEEC9"><fmt:formatDate  value="${movie.m_date}" pattern="yyyy/MM/dd"/></span>
						</h1>
						<div class="social-btn">
							<a href="#" class="parent-btn"><i class="ion-heart"></i>Add
								to Favorite</a>
						</div>
						<div class="movie-rate">
							<div class="rate">
								<i class="ion-android-star"></i>
								<p style="font-size: 12pt">
									<span>
									<jsp:include page="TotalAvg.jsp"/>
									</span>/5<br> 
									<span class="rv">56 Reviews</span>
								</p>
							</div>
							<div class="rate-star">
								<p>Rate This Movie:</p>
								<!--평점 별계산 include <StarImage>  -->
								<jsp:include page="StarImage.jsp"/>
								<!--평점 별계산 include <StarImage>  -->
							</div>
						</div>
						<div class="movie-tabs">
							<div class="tabs">
								<ul class="tab-links tabs-mv">
									<li class="active"><a href="#overview">Overview</a></li>
								</ul><hr>
								<div class="tab-content">
									<div id="overview" class="tab active">
										<div class="row">
											<div class="col-md-8 col-sm-12 col-xs-12">
												<div>
													<p style="font-size: 12pt;  word-breka:keep-all; text-overflow:ellipsis"> ${movie.m_info }</p>
												</div>
												
												<hr>
												
												<div class="mvsingle-item ov-item">
													<a class="img-lightbox" data-fancybox-group="gallery"
														href="images/${movie.category.cg_name}/${movie.m_name }_1.jpg">
														<img src="images/${movie.category.cg_name}/${movie.m_name }_1.jpg" style="width: 70px">
													</a>
													<a class="img-lightbox" data-fancybox-group="gallery"
														href="images/${movie.category.cg_name}/${movie.m_name }_2.jpg">
														<img src="images/${movie.category.cg_name}/${movie.m_name }_2.jpg" style="width: 70px">
													</a>
													<a class="img-lightbox" data-fancybox-group="gallery"
														href="images/${movie.category.cg_name}/${movie.m_name }_3.jpg">
														<img src="images/${movie.category.cg_name}/${movie.m_name }_3.jpg" style="width: 70px">
													</a>
											
													<div class="vd-it">
														<img class="vd-img" src="images/${movie.category.cg_name}/${movie.m_name }_2.jpg" style="width: 70px">
															<a class="fancybox-media hvr-grow" href="${movie.m_url }">
																<img src="images/uploads/play-vd.png" >
															</a>
													</div>
												</div>
											
												<div class="title-hd-sm">
													<h3>가장 최신 리뷰</h3>
													<a href="reviewlist?m_no=${movie.m_no }" class="time">See All Reviews <i
														class="ion-ios-arrow-right"></i></a>
												</div>
												<!-- movie user review -->
												<div class="mv-user-review-item">
													<h3>${movie2.review.r_title }</h3>
													<div class="no-star">
														<jsp:include page="StarImage.jsp"/>
													</div>
													<p class="time">
														<fmt:formatDate  value="${movie2.review.r_date}" pattern="yyyy/MM/dd"/>
													</p>
													<p>
														${movie2.review.r_content}
													</p>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--중앙 상세 페이지  -->
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