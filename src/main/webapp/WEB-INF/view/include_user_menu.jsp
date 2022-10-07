<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
						<!-- 
						<p>상세페이지</p>
					 -->
						<p>&nbsp;&nbsp;&nbsp;반가워요!<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${login_user.u_name} 님&nbsp;<img src ="images/emotion.png" width="30px" height="30px"></p>
						<br>
						<ul>
							<li class="active"><a href="userprofile">프로필 수정</a></li>
							<li><a href="userfavoritegrid">내가 찜한 콘텐츠</a></li>
							<li><a href="userrate">나의 리뷰<br> <br></a></li>

							<li><a href="user_logout_action">로그아웃</a></li>
						</ul>
					</div>
				</div>
			</div>