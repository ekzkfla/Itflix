<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<!-- Basic need -->
<title>신규 영화 생성</title>
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
				<div class="col-md-2 col-sm-4 col-xs-4">
				</div>
				<div class="col-md-7 col-sm-4 col-xs-3">
					<div class="movie-single-ct main-content">

						<!-- ↓↓↓영화 타이틀 제목↓↓↓  -->
						<h1 class="bd-hd">신규 영화 생성</h1>
						<!-- ↑↑↑영화 타이틀 제목↑↑↑  -->

						<div class="movie-tabs">
							<div class="tabs">
								<div class="tab-content">
									<div id="overview" class="tab active">
										<div class="row">


											<div class="col-md-8 col-sm-12 col-xs-12">

												<!-- 상단 -->
												<div class="title-hd-sm">
													<h4>신규 영화 작성</h4>
													<h4>
														<c:if test="${login_user.u_email == 'admin@gmail.com' }">
															<a href="reviewWrite?m_no=${movie.m_no}" class="time"
																style="right: 500px">리뷰 작성</a>
														</c:if>
														
													</h4>
												</div>


												<!-- movie user review -->

												<div class="mv-user-review-item">
													
													<!-- ↓↓↓영화 이름(m_name)↓↓↓ -->
													<h3>제목 : </h3>
													<input type="text" placeholder="영화 제목을 입력해주세요.">
													<!-- ↓↓↓영화 카테고리(cg_no)↓↓↓ -->
													<div class="">
													<h3>카테고리 :</h3>
														<select name="cg_no" >
															<option selected="selected">선택</option>
															<option value="1">액션</option>
															<option value="2">코미디</option>
															<option value="3">로맨스</option>
															<option value="4">공포</option>
															<option value="5">SF/판타지</option>
															<option value="6">드라마</option>
														</select>
													</div>
													<!-- ↓↓↓영화 감독및 배우(m_actor)↓↓↓ -->
													<h3>출연진 :</h3>
													<input type="text" placeholder="출연진을 작성해주세요.">
													<!-- ↓↓↓영화 개봉일(m_date)↓↓↓ -->
													<p class="time" style="text-align-last: left;">날짜 :</p>
													<input type="text" placeholder="yyyy/MM/dd">
													<!-- ↓↓↓영화 정보(m_info)↓↓↓ -->
													<p>내용 :</p>
													<input type="text" placeholder="줄거리를 넣어주세요">
													<!-- ↓↓↓영화 이미지(m_image)↓↓↓ -->
													<label>
														 <input type="file" value="사진 추가하기">
													</label><br><br>
													<!-- ↓↓↓영화 url(m_url)↓↓↓ -->
													<input type="url" value="영상정보를 넣어주세요">
													
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