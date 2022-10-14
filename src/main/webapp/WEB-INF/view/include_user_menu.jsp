<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	function removeUser(){
		document.userBar.action="removeUser";
		document.userBar.method="POST";
		document.userBar.submit;
	}
</script>
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
						<form name="userBar">
						
						
						<br>
							<input type="hidden" name="u_email" value="${login_user.u_email }" >
						<ul>
							<li><a href="userprofile">프로필 수정</a></li>
							<li><a href="userfavoritegrid?u_email=${login_user.u_email}">내가 찜한 콘텐츠</a></li>
							<li><a href="userrate?u_email=${login_user.u_email }">나의 리뷰<br> <br></a>
							<li><a href="removeUser">회원 탈퇴</a></li>
							
							<!-- 이건 input방식의 탈퇴 방법
							<input  type="submit" style="float:left; background-color:#020d18; color:#ffffff; padding:4px 1px; border-radius:5px; cursor:pointer" 
									class="btn" value="회원탈퇴"onclick="removeUser()">
							 -->
						</ul>
						</form>
					</div>
				</div>
			</div>
			