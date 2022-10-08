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
<script type="text/javascript">
window.URL = window.URL || window.webkitURL;

const fileSelect = document.getElementById("fileSelect"),
    fileElem = document.getElementById("fileElem"),
    fileList = document.getElementById("fileList");

fileSelect.addEventListener("click", function (e) {
  if (fileElem) {
    fileElem.click();
  }
  e.preventDefault(); // "#" 해시로 이동을 방지
}, false);

function handleFiles(files) {
  if (!files.length) {
    fileList.innerHTML = "<p>No files selected!</p>";
  } else {
    fileList.innerHTML = "";
    const list = document.createElement("ul");
    fileList.appendChild(list);
    for (let i = 0; i < files.length; i++) {
      const li = document.createElement("li");
      list.appendChild(li);

      const img = document.createElement("img");
      img.src = window.URL.createObjectURL(files[i]);
      img.height = 60;
      img.onload = function() {
        window.URL.revokeObjectURL(this.src);
      }
      li.appendChild(img);
      const info = document.createElement("span");
      info.innerHTML = files[i].name + ": " + files[i].size + " bytes";
      li.appendChild(info);
    }
  }
}
</script>

</head>
<body>
	
	
	<!-- BEGIN | Header -->
	<jsp:include page="include_common_top.jsp"/>
	<!-- END | Header -->
	
	<div class="hero user-hero">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="hero-ct">
						<h1>${login_user.u_name} profile</h1>
						<ul class="breadcumb">
							<li class="active"><a href="main">Home</a></li>
							<li><span class="ion-ios-arrow-right"></span>Rated movies</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Start | user leff menu bar-->
	<jsp:include page="include_user_menu.jsp" />
	<!-- End | user leff menu bar-->
				<div class="col-md-9 col-sm-12 col-xs-12">
					<div class="topbar-filter">
						<p>
							Found <span>3 rates</span>in total
						</p>
						<label>Sort by:</label><select><option value="popularity">카테고리</option>
							<option value="cg=1">액션</option>
							<option value="cg=2" >로맨스</option>
							<option value="cg=3">SF/미스터리</option>
							<option value="cg=4">코미디</option>
							<option value="date">드라마</option></select>
					</div>
					<div class="movie-item-style-2 userrate">
						<img src="images/uploads/mv1.jpg" alt="">
						<div class="mv-item-infor">
							<h6>
								<a href="moviesingle">oblivion <span>(2012)</span></a>
							</h6>
							<p class="time sm-text">your rate:</p>
							<p class="rate">
								<i class="ion-android-star"></i><span>9.0</span>/10
							</p>
							<p class="time sm-text">your reviews:</p>
							<h6>Best Marvel movie in my opinion</h6>
							<p class="time sm">02 April 2017</p>
							<p>“This is by far one of my favorite movies from the MCU.
								The introduction of new Characters both good and bad also makes
								the movie more exciting. giving the characters more of a back
								story can also help audiences relate more to different
								characters better, and it connects a bond between the audience
								and actors or characters. Having seen the movie three times does
								not bother me here as it is as thrilling and exciting every time
								I am watching it. In other words, the movie is by far better
								than previous movies (and I do love everything Marvel), the
								plotting is splendid (they really do out do themselves in each
								film, there are no problems watching it more than once.”</p>
						</div>
					</div>
					<div class="movie-item-style-2 userrate">
						<img src="images/uploads/mv2.jpg" alt="">
						<div class="mv-item-infor">
							<h6>
								<a href="moviesingle">into the wild <span>(2014)</span></a>
							</h6>
							<p class="time sm-text">your rate:</p>
							<p class="rate">
								<i class="ion-android-star"></i><span>7.0</span>/10
							</p>
						</div>
					</div>
					<div class="movie-item-style-2 userrate last">
						<img src="images/uploads/mv3.jpg" alt="">
						<div class="mv-item-infor">
							<h6>
								<a href="moviesingle">blade runner<span>(2015)</span></a>
							</h6>
							<p class="time sm-text">your rate:</p>
							<p class="rate">
								<i class="ion-android-star"></i><span>10.0</span>/10
							</p>
							<p class="time sm-text">your reviews:</p>
							<h6>A masterpiece!</h6>
							<p class="time sm">01 February 2017</p>
							<p>“To put it simply, the movie is fascinating, exciting and
								fantastic. The dialog, the fight choreography, the way the story
								moves, the characters charisma, all and much more are combined
								together to deliver this masterpiece. Such an amazing flow,
								providing a fusion between the 90s and the new century, it's
								like the assassins are living in another world, with another
								mindset, without people understanding it. Just one advice for
								you though: Don't build an expectation of what you want to watch
								in this movie, if you do, then you will ruin it. This movie has
								it's own flow and movement, so watch it with a clear mind, and
								have fun.”</p>
						</div>
					</div>
					<div class="topbar-filter">
						<label>Movies per page:</label><select><option
								value="range">20 Movies</option>
							<option value="saab">10 Movies</option></select>
						<div class="pagination2">
							<span>Page 1 of 1:</span><a class="active" href="#">1</a><a
								href="moviesingle"><i class="ion-arrow-right-b"></i></a>
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