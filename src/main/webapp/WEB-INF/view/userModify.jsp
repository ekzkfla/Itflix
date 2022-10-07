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
		<!-- Start | user leff menu bar-->
	<jsp:include page="include_user_menu.jsp" />
	<!-- End | user leff menu bar-->
				<div class="col-md-9 col-sm-12 col-xs-12">
					<div class="form-style-1 user-pro" action="">
						<form action="" class="user">
							<h4>회원의 상세페이지</h4>
							<div class="row">
								<div class="col-md-6 form-it">
									<label>이름</label><input type="text"
										placeholder= ${login_user.u_name}>
								</div>
								<div class="col-md-6 form-it">
									<label>이메일</label><input type="text"
										placeholder= ${login_user.u_email}>
								</div>
							</div>
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
						</form>
						<form action="" class="password">
							<h4>02. 비밀번호 변경</h4>
							<div class="row">
								<div class="col-md-6 form-it">
									<label>예전 비밀번호</label><input type="text"
										placeholder= "**********">
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