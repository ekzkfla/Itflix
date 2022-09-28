<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header class="ht-header">
		<div class="container">
			<nav class="navbar navbar-default navbar-custom">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header logo">
					<div class="navbar-toggle" data-toggle="collapse"
						data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<div id="nav-icon1">
							<span></span><span></span><span></span>
						</div>
					</div>
					<a href="index.html"><img class="logo" src="images/logo1.png"
						alt="" width="119" height="58"></a>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse flex-parent"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav flex-child-menu menu-left">
						<li class="hidden"><a href="#page-top"></a></li>
						<li class="home"><a>Home </a></li>
						<li class="dropdown first"><a href="moviegridfw.html">
								movies</a></li>
						<li class="dropdown first"><a href="celebritygrid01.html">categories</a>
						</li>
						<li class="dropdown first"><a
							class="btn btn-default dropdown-toggle lv1"
							data-toggle="dropdown" data-hover="dropdown"> news <i
								class="fa fa-angle-down" aria-hidden="true"></i></a>
							<ul class="dropdown-menu level1">
								<li><a href="bloglist.html">blog List</a></li>
								<li><a href="bloggrid.html">blog Grid</a></li>
								<li class="it-last"><a href="blogdetail.html">blog
										Detail</a></li>
							</ul></li>
						<li class="dropdown first"><a
							class="btn btn-default dropdown-toggle lv1"
							data-toggle="dropdown" data-hover="dropdown"> community <i
								class="fa fa-angle-down" aria-hidden="true"></i></a>
							<ul class="dropdown-menu level1">
								<li><a href="userfavoritegrid.html">user favorite grid</a></li>
								<li><a href="userfavoritelist.html">user favorite list</a></li>
								<li><a href="userprofile.html">user profile</a></li>
								<li class="it-last"><a href="userrate.html">user rate</a></li>
							</ul></li>
					</ul>
					<ul class="nav navbar-nav flex-child-menu menu-right">

						<li><a href="#">도움</a></li>
						<li class="loginLink"><a href="#">로그인</a></li>
						<li class="btn signupLink"><a href="#">회원가입</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</nav>
			<!-- top search form -->
			<div class="top-search">
				<select><option value="united">카테고리</option>
					<option value="saab">액션</option>
					<option value="saab">코미디</option>
					<option value="saab">로맨스</option>
					<option value="saab">호러/스릴러</option>
					<option value="saab">SF/판타지</option>
					<option value="saab">드라마</option>
				</select> <input type="text"
					placeholder="Serch your Movie and enjoy your Life">
			</div>
		</div>
	</header>
