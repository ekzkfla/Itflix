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
	<jsp:include page="include_common_top.jsp"/>
	<!-- END | Header -->
	
	<div class="hero user-hero">
		<div class="container">
				<div class="col-md-12">
					<div class="hero-ct">
						<h1 align="center">회원의 상세페이지</h1>
						<ul class="breadcumb">
							<li class="active"><a href="main">Home</a></li>
							<li><span class="ion-ios-arrow-right"></span>Profile</li>
						</ul>
					</div>
				</div>
		</div>
	</div>
	<div class="page-single">
		<div class="container">
			<div class="row ipad-width">
				<div class="col-md-3 col-sm-12 col-xs-12">
				<div></div>
					<div class="user-information">
						<div class="user-img">
							<a href="#"><img src="images/uploads/user-img.png" alt=""><br></a><a
								href="#" class="redbtn">Change avatar</a>
						</div>
						<div class="user-fav">
							<p>상세페이지</p>
							<ul>
								<li class="active"><a href="userprofile">프로필 수정</a></li>
								<li><a href="userfavoritegrid">찜한 영화</a></li>
								<li><a href="userrate">선호하는 카테고리 영화<br><br></a></li>
								
								<li><a href="#">로그아웃</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-9 col-sm-12 col-xs-12">
					<div class="form-style-1 user-pro" action="">
						<form action="" class="user">
							<h4>회원의 상세페이지</h4>
							<div class="row">
								<div class="col-md-6 form-it">
									<label>이름</label><input type="text"
										placeholder= ${login_user.u_name}
										readonly>
								</div>
								<div class="col-md-6 form-it">
									<label>이메일</label><input type="text"
										placeholder= ${login_user.u_email}
										readonly>
								</div>
							</div>
							<!-- 
							<div class="row">
								<div class="col-md-6 form-it">
									<label>First Name</label><input type="text"
										placeholder="Edward ">
								</div>
								<div class="col-md-6 form-it">
									<label>Last Name</label><input type="text"
										placeholder="Kennedy">
								</div>
							</div>
							 
							<div class="row">
								<div class="col-md-2">
									<input class="submit" type="submit" value="save">
								</div>
							</div>
							-->
						</form>
						<form action="" class="password">
							<h4> 회원정보 변경</h4>
							<div class="row">
								<div class="col-md-6 form-it">
									<label>예전 비밀번호</label><input type="text"
										placeholder= "**********">
								</div>
								<div class="col-md-6 form-it">
									<label>핸드폰 번호</label><input type="text"
										placeholder= ${login_user.u_phone}>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 form-it">
									<label>새로운 비밀번호</label><input type="text"
										placeholder="***************"
										pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$">
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 form-it">
									<label>새로운 비밀번호 확인</label><input type="text"
										placeholder="*************** "
										pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$">
								</div>
							</div>
							<div class="row">
								<div class="col-md-2">
									<input class="submit" type="submit" value="change">
								</div>
							</div>

						</form>

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