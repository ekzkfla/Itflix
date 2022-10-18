<%@page import="com.itflix.dto.User_Info"%>
<%@page import="org.apache.coyote.RequestGroupInfo"%>
<%@page import="java.io.Console"%>
<%@page import="com.itflix.dto.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
User_Info login_user = (User_Info) session.getAttribute("login_user");
%>

<!DOCTYPE html>
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
	<script type="text/javascript">
		function insert() {
			document.jjim.action = "jjim_insert_action";
			document.jjim.method = 'POST';
			document.jjim.submit();
		}

		function deleteJjim() {
			document.jjim.action = "jjim_delete_action";
			document.jjim.method = 'POST';
			document.jjim.submit(); 
		}
		
		function subscriptionTicketNo(){
			document.subscription.action = "moviesingle";
			document.subscription.method = "POST";
			document.subscription.submit();
		}
	</script>


	<!-- BEGIN | Header -->
	<jsp:include page="include_common_top.jsp" />
	<!-- END | Header -->
	<div class="hero mv-single-hero">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
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
							<c:if test="${login_user != null }">
								<!--구독권 결제가 완료 되고 기간이 남은 경우  -->
								<c:if test="${subscription.ticket.t_no == 1}">
								<div class="btn-transform transform-vertical red">
									<div>
										<a href="#" class="item item-1 redbtn"><i class="ion-play"></i>영화 시청</a>
									</div>
									<div>
										<a href="${movie.m_url}" class="item item-2 redbtn fancybox-media hvr-grow"><i class="ion-play"></i></a>
									</div>
								</div>
								</c:if>
								
									<!--구독권 연장을 안한 경우  -->
								<c:if test="${subscription.ticket.t_no == 0 }">
									<a onclick="alert('구독권을 구매해주세요');" class="item item-1 redbtn" style="position: relative; display: inline-block; height: 45px; transition: background-color 0.3s ease; cursor: pointer;"><i class="ion-play"></i>영화 시청</a>
								</c:if>
								<!--구독권 구매를 안한 경우  -->
								<c:if test="${subscription== null }">
									<a onclick="alert('구독권을 구매해주세요');" class="item item-1 redbtn" style="position: relative; display: inline-block; height: 45px; transition: background-color 0.3s ease; cursor: pointer;"><i class="ion-play"></i>영화 시청</a>
								</c:if>
						
							</c:if>
							
							<c:if test="${login_user == null }">
									<a onclick="alert('로그인을 해주세요');" class="item item-1 redbtn" style="position: relative; display: inline-block; height: 45px; transition: background-color 0.3s ease; cursor: pointer;"><i class="ion-play"></i>영화 시청</a>
							</c:if>
						</div>
						
					</div>
				</div>
				<!--왼쪽 영화 포스터 및 영상 시청바  -->
				<!--중앙 상세 페이지  -->
				<div class="col-md-7 col-sm-4 col-xs-3">
					<form name="jjim" >
						<div class="movie-single-ct main-content">
							<input name="u_email" value="${login_user.u_email }"
								type="hidden" /> <input name="m_no" value="${movie.m_no }"
								type="hidden" />
							<h1 class="bd-hd">
								${movie.m_name} <span style="font-size: 15pt; color: #0DEEC9"><fmt:formatDate
										value="${movie.m_date}" pattern="yyyy/MM/dd" /></span>
							</h1>
							<!-- 찜하기버튼 START -->
							<!--찜 하기!  -->
							<c:if test="${jjim==false }">
								<div class="social-btn">
									<button type="button" onclick="insert()"
										style="background-color:transparent; border: none;">
										<a class="parent-btn" > <i class="ion-heart"></i>Add to
											Favorite
										</a>
									</button>
								</div>
							</c:if>
							<!--찜 취소   -->
							<c:if test="${jjim==true }">
								<div class="social-btn">
									<button type="button" onclick="deleteJjim();"
										style="background-color:transparent; border: none;">
										<a class="parent-btn"> <i class="ion-heart"></i>찜 취소
										</a>
									</button>
								</div>
							</c:if>










							<!-- 찜하기버튼 END -->
							<div class="movie-rate">
								<div class="rate">
									<i class="ion-android-star"></i>
									<p style="font-size: 12pt">
										<span> <jsp:include page="TotalAvg.jsp" />
										</span>/5<br> <span class="rv">${review} Reviews</span>
									</p>
								</div>
								<div class="rate-star">
									<p>Rate This Movie:</p>
									<!--평점 별계산 include <StarImage>  -->
									<jsp:include page="StarImage.jsp" />
									<!--평점 별계산 include <StarImage>  -->
								</div>
							</div>
							<div>
								<h6 style="color: #47B5FF">출연진: ${movie.m_actor}</h6>
							</div>
							<div class="movie-tabs">
								<div class="tabs">
									<ul class="tab-links tabs-mv">
										<li class="active"><a href="#overview">Overview</a></li>
									</ul>
									<hr>
									<div class="tab-content">
										<div id="overview" class="tab active">
											<div class="row">
												<div class="col-md-8 col-sm-12 col-xs-12">
													<div>
														<p
															style="font-size: 12pt; word-breka: keep-all; text-overflow: ellipsis">
															${movie.m_info }</p>
													</div>

													<hr>

													<div class="mvsingle-item ov-item">
														<a class="img-lightbox" data-fancybox-group="gallery"
															href="images/${movie.category.cg_name}/${movie.m_name }_1.jpg">
															<img
															src="images/${movie.category.cg_name}/${movie.m_name }_1.jpg"
															style="width: 70px">
														</a> <a class="img-lightbox" data-fancybox-group="gallery"
															href="images/${movie.category.cg_name}/${movie.m_name }_2.jpg">
															<img
															src="images/${movie.category.cg_name}/${movie.m_name }_2.jpg"
															style="width: 70px">
														</a> <a class="img-lightbox" data-fancybox-group="gallery"
															href="images/${movie.category.cg_name}/${movie.m_name }_3.jpg">
															<img
															src="images/${movie.category.cg_name}/${movie.m_name }_3.jpg"
															style="width: 70px">
														</a>

														<div class="vd-it">
															<img class="vd-img"
																src="images/${movie.category.cg_name}/${movie.m_name }_2.jpg"
																style="width: 70px"> <a
																class="fancybox-media hvr-grow" href="${movie.m_url }">
																<img src="images/uploads/play-vd.png">
															</a>
														</div>
													</div>
													<div class="title-hd-sm">
														<h3>가장 최신 리뷰</h3>
														<c:if test="${login_user != null }">
															<a href="reviewWrite?m_no=${movie.m_no}" class="time"
																style="right: 500px">리뷰 작성</a>
														</c:if>
														<c:if test="${login_user == null }">
															<a onclick="alert('로그인을 해주세요');" style="cursor:pointer">리뷰 작성</a>
														</c:if>
																
														<a href="reviewlist?m_no=${movie.m_no }" class="time">See
															All Reviews <i class="ion-ios-arrow-right"></i>
														</a>
													</div>
													<!-- movie user review -->
													<div class="mv-user-review-item">
														<h3>${movie2.review.r_title }</h3>
														<!-- ↓↓↓평점↓↓↓ -->
														<div class="no-star">
															평점 : ${movie2.review.r_grade }
															<!--ReviewList 페이지 별점 계산 -->
															<c:set var="grade" value="${movie2.review.r_grade}" />
															<!--평점이 없는경우  -->
															<c:if test="${grade==null }">
																<a style="font-size: 15pt; color: #0DEEC9">리뷰가 없어요!</a>
															</c:if>
															<!--평점 0점 이상 20점 미만일 경우  -->
															<c:if test="${grade ge 0 && grade lt 1}">
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
															</c:if>
															<!--평점 20점 이상 40점 미만일 경우  -->
															<c:if test="${grade ge 1 && grade lt 2}">
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
															</c:if>
															<!--평점 40점 이상 60점 미만일 경우  -->
															<c:if test="${grade ge 2 && grade lt 3}">
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
															</c:if>
															<!--평점 60점 이상 80점 미만일 경우  -->
															<c:if test="${grade ge 3 && grade lt 4}">
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star-outline"></i>
																<i class="ion-ios-star-outline"></i>
															</c:if>
															<!-- 평점 80점 이상인 경우 -->
															<c:if test="${grade ge 4 && grade lt 5}">
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star-outline"></i>
															</c:if>
															<c:if test="${grade eq 5}">
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
																<i class="ion-ios-star"></i>
															</c:if>
														</div>
														<p class="time">
															<fmt:formatDate value="${movie2.review.r_date}"
																pattern="yyyy/MM/dd" />
														</p>
														<p>${movie2.review.r_content}</p>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form>
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