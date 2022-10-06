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
<style>
 .center {
	      text-align:  center;
	
}
.rounded {
	border-radius: 1rem
}

.nav-pills .nav-link {
	color: #555
}

.nav-pills .nav-link.active {
	color: white
}

input[type="radio"] {
	margin-right: 5px
}

.bold {
	font-weight: bold
}
</style>
<script type="text/javascript">
$(function() {
	$('[data-toggle="tooltip"]').tooltip()
})
</script>
</head>
	<!--결제 팝업-->
<body>
	<div class="login-wrapper" id="login-content">
		<div class="login-content">
			<a href="#" class="close">x</a>
			<h3>Login</h3>
			<form method="post" action="login.php">
				<div class="row">
					<label for="EMAIL">EMAIL:<input type="text" name="u_email"
						id="u_email" placeholder="example@iflix.com"
						pattern="^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$"
						required="required" />${user_info.u_email}</label>
				</div>
				<div class="row">
					<label for="password"> Password:<input type="password"
						name="u_pass" id="u_pass" placeholder="******"
						pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$"
						required="required" />${user_info.u_pass}</label>
				</div>
				<div class="row">
					<div class="remember">
						<div>
							<input type="checkbox" name="remember" value="Remember me"><span>Remember
								me</span>
						</div>
						<a href="#">Forget password ?</a>
					</div>
				</div>
				<div class="row">
					<button type="submit">Login</button>
				</div>
			</form>
		</div>
	</div>
	<!--결제 팝업-->

	<div class="landing-hero">
		<a href="main"> <img src="images/logo1.png" alt="Logo">
		</a>
		<div class="row landing-hero-text">
			<img src="images/payImage.png" alt="Logo">
		</div>
			<div class="center">
				<li class="loginLink"><a href="#" class="redbtn">결제하기</a></li>
			</div>
			<ul class="nav navbar-nav flex-child-menu menu-right">
			</ul>
	</div>

	<!-- footer v3 section-->
	<div class="ft-copyright-landing">
		<p>
			© 2017 Blockbuster. All Rights <a href="http://www.bootstrapmb.com/"
				title="bootstrapmb">Reserved</a>. Designed by haintheme.
		</p>
	</div>
	<!-- end of footer v3 section-->
	<script src="js/jquery.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/plugins2.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>