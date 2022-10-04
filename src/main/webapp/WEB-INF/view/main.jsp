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
	
	<!--메인 영화 리스트   -->
	<form name="f" method="Post">
	<div class="slider movie-items">
		<div class="container">
			<div class="row">
				<div class="slick-multiItemSlider">
					<c:forEach items="${movieList}" var ="movie"> 
						<div class="movie-item">
							<div class="mv-img">
								<a href=""><img src="images/${movie.category.cg_name}/${movie.m_name}_1.jpg" alt=""	width="285" height="437"></a>
							</div>
							<div class="title-in">
								<div class="cate">
									<span class="blue"><a href="#">${movie.category.cg_name}</a></span>
								</div>
								<h6>
									<a href="moviesingle?m_no=1">${movie.m_name}</a>
								</h6>
								<p>
									<i class="ion-android-star"></i><span>${movie.review.r_grade}</span>/100
								</p>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	</form>
	<!--메인 영화 리스트   -->
	
	<!--테마별 영화 리스트  -->
	<div class="movie-items">
		<div class="container">
			<div class="row ipad-width">
				<div class="col-md-8">
					
					<!--조회수 별 영화 리스트  -->
					<!--조회수 별 카테고리   -->
					<div class="title-hd">
						<h2>조회수가 높은</h2>
						<a href="#" class="viewall">View all <i
							class="ion-ios-arrow-right"></i></a>
					</div>
					<div class="tabs">
						<ul class="tab-links">
							<li class="active"><a href="#tab1">#Popular</a></li>
							<li><a href="#tab2">#Coming soon</a></li>
							<li><a href="#tab3"> #Top rated </a></li>
							<li><a href="#tab4">#Most reviewed</a></li>
						</ul>
						<div class="tab-content">
							<div id="tab1" class="tab active">
								<div class="row">
									<div class="slick-multiItem">
										<c:forEach items="${movieCountList}" var ="movie">
											<div class="slide-it">
												<div class="movie-item">
													<div class="mv-img">
														<img src="images/${movie.category.cg_name}/${movie.m_name }_1.jpg" alt="" width="185" height="284">
													</div>
													<div class="hvr-inner">
														<a href="moviesingle?m_no=${movie.m_no}">Read more <i class="ion-android-arrow-dropright"></i></a>
													</div>
													<div class="title-in">
														<h6>
															<a href="#">${movie.m_name}</a>
														</h6>
														<p>
															<i class="ion-android-star"></i><span> ${movie.review.r_grade}</span>/100
														</p>
													</div>
												</div>
											</div>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					<!--카테고리별 영화 리스트  -->
					<div class="title-hd">
						<h2>카테고리별</h2>
						<a href="#" class="viewall">View all <i
							class="ion-ios-arrow-right"></i></a>
					</div>
					<div class="tabs">
						<!--카테고리별 카테고리  -->
						<ul class="tab-links-2">
							<li class="active" ><a href="#" >#Popular</a></li>
							<li><a href="#tab22" >#Coming soon</a></li>
							<li><a href="#tab23" > #Top rated </a></li>
							<li><a href="#tab24" >#Most reviewed</a></li>
						</ul>
						<!--카테고리별 카테고리  -->
						<div class="tab-content">
							<div id="no=1" class="tab"  >
								<div class="row">
									<div class="slick-multiItem">
										<c:forEach items="${movieCountList}" var ="movie">
											<div class="slide-it">
												<div class="movie-item">
													<div class="mv-img">
														<img src="images/${movie.category.cg_name}/${movie.m_name }_2.jpg" alt="" width="185"
															height="284">
													</div>
													<div class="hvr-inner">
														<a href="moviesingle.jsp">Read more <i
															class="ion-android-arrow-dropright"></i></a>
													</div>
													<div class="title-in">
														<h6>
															<a href="#">Die hard</a>
														</h6>
														<p>
															<i class="ion-android-star"></i><span>7.4</span>/10
														</p>
													</div>
												</div>
												
											</div>
										</c:forEach>
									</div>
								</div>
							</div>
							<div id="tab22" class="tab active">
								<div class="row">
									<div class="slick-multiItem">
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item5.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Interstellar</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item6.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The revenant</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item7.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Die hard</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item8.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The walk</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item1.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Interstellar</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item2.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The revenant</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item3.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Die hard</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item4.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The walk</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item5.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Interstellar</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item6.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsps">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The revenant</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div id="tab23" class="tab">
								<div class="row">
									<div class="slick-multiItem">
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item1.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Interstellar</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item2.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The revenant</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item3.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Die hard</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item4.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The walk</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item5.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Interstellar</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item6.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The revenant</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item7.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Die hard</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item8.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The walk</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item3.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Die hard</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div id="tab24" class="tab">
								<div class="row">
									<div class="slick-multiItem">
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item5.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Interstellar</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item6.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The revenant</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item7.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Die hard</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item8.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">The walk</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
										<div class="slide-it">
											<div class="movie-item">
												<div class="mv-img">
													<img src="images/uploads/mv-item3.jpg" alt="" width="185"
														height="284">
												</div>
												<div class="hvr-inner">
													<a href="moviesingle.jsp">Read more <i
														class="ion-android-arrow-dropright"></i></a>
												</div>
												<div class="title-in">
													<h6>
														<a href="#">Die hard</a>
													</h6>
													<p>
														<i class="ion-android-star"></i><span>7.4</span>/10
													</p>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!--카테고리별 영화리스트 종료  -->
					
					
				</div>

			</div>
		</div>
	</div>
	<div class="trailers">
		<div class="container">
			<div class="row ipad-width">
				<div class="col-md-12">
					<div class="title-hd">
						<h2>Trailer</h2>
						<a href="#" class="viewall">View all <i
							class="ion-ios-arrow-right"></i></a>
					</div>
					<div class="videos">
						<!--영상 url  -->
						<div class="slider-for-2 video-ft">
							<c:forEach items="${movieList}" var="movie"> 
							<div>
								<iframe class="item-video" src=""
									data-src="${movie.m_url}"></iframe>
							</div>
							</c:forEach>
						</div>
						<!--영상 url  -->
						
						<div class="slider-nav-2 thumb-ft">
							<c:forEach items="${movieList}" var="movie"> 
							<div class="item">
								<div class="trailer-img">
									<img src="images/${movie.category.cg_name }/${movie.m_name}_2.jpg"
										alt="photo by Barn Images" width="4096" height="2737">
								</div>
								<div class="trailer-infor">
									<h4 class="desc">${movie.m_name }</h4>
									<p style="font-size: 13px; color: #0DEEC9"  ><fmt:formatDate value="${movie.m_date}" pattern="yyyy/MM/dd"/></p>
								</div>
							</div>
							</c:forEach>
							
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- latest new v1 section-->
	<div class="latestnew">
		<div class="container">
			<div class="row ipad-width">
				<div class="col-md-8">

					<div class="title-hd">
						<h2>최신 공지사항</h2>
					</div>
					<div class="tabs">
						<ul class="tab-links-3">
							<li class="active"><a href="#tab31">#Movies </a></li>
							<li><a href="#tab32">#TV Shows </a></li>
							<li><a href="#tab33"> # Celebs</a></li>
						</ul>
						<div class="tab-content">
							<div id="tab31" class="tab active">
								<div class="row">
									<div class="blog-item-style-1">
										<img src="images/uploads/blog-it1.jpg" alt="" width="170"
											height="250">
										<div class="blog-it-infor">
											<h3>
												<a href="blogdetail.jsp">Brie Larson to play first female white house
													candidate Victoria Woodull in Amazon film</a>
											</h3>
											<span class="time">13 hours ago</span>
											<p>
												Exclusive: <span>Amazon Studios </span>has acquired Victoria
												Woodhull, with Oscar winning Room star <span>Brie
													Larson</span>polsed to produce, and play the first female
												candidate for the presidency of the United States. Amazon
												bought it in a pitch package deal. <span>Ben Kopit</span>,
												who wrote the Warner Bros film <span>Libertine</span>that
												has...
											</p>
										</div>
									</div>
								</div>
							</div>
							<div id="tab32" class="tab">
								<div class="row">
									<div class="blog-item-style-1">
										<img src="images/uploads/blog-it2.jpg" alt="" width="170"
											height="250">
										<div class="blog-it-infor">
											<h3>
												<a href="#">Tab 2</a>
											</h3>
											<span class="time">13 hours ago</span>
											<p>
												Exclusive: <span>Amazon Studios </span>has acquired Victoria
												Woodhull, with Oscar winning Room star <span>Brie
													Larson</span>polsed to produce, and play the first female
												candidate for the presidency of the United States. Amazon
												bought it in a pitch package deal. <span>Ben Kopit</span>,
												who wrote the Warner Bros film <span>Libertine</span>that
												has...
											</p>
										</div>
									</div>
								</div>
							</div>
							<div id="tab33" class="tab">
								<div class="row">
									<div class="blog-item-style-1">
										<img src="images/uploads/blog-it1.jpg" alt="" width="170"
											height="250">
										<div class="blog-it-infor">
											<h3>
												<a href="#">Tab 3</a>
											</h3>
											<span class="time">13 hours ago</span>
											<p>
												Exclusive: <span>Amazon Studios </span>has acquired Victoria
												Woodhull, with Oscar winning Room star <span>Brie
													Larson</span>polsed to produce, and play the first female
												candidate for the presidency of the United States. Amazon
												bought it in a pitch package deal. <span>Ben Kopit</span>,
												who wrote the Warner Bros film <span>Libertine</span>that
												has...
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
	</div>
	<!--end of latest new v1 section-->
	<!-- footer section-->
	<jsp:include page="include_common_bottom.jsp"></jsp:include>
	<!-- end of footer section-->

	<script src="js/jquery.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/plugins2.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>