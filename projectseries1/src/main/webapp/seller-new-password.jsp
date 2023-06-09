<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<!DOCTYPE html>
<html lang="zxx">

<head>
<title>Bootie Ecommerce Bootstrap Responsive Web Template | Home
	:: W3layouts</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8" />
<meta name="keywords"
	content="Bootie Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<!-- //Meta tag Keywords -->

<!-- Custom-Files -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- Bootstrap-Core-CSS -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!-- Style-CSS -->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- //font-awesome-icons -->
<!-- /Fonts -->
<link
	href="//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900"
	rel="stylesheet">
<!-- //Fonts -->

</head>

<body>

	<!-- mian-content -->
	<div class="main-banner" id="home">
		<!-- header -->
		<header class="header">
			<div class="container-fluid px-lg-5">
				<!-- nav -->
				<nav class="py-4">
					<div id="logo">
						<h1>
							<a href="index.jsp"><span class="fa fa-bold"
								aria-hidden="true"></span>ootie</a>
						</h1>
					</div>

					<label for="drop" class="toggle">Menu</label> <input
						type="checkbox" id="drop" />
					<ul class="menu mt-2">
						<li><a href="index.jsp">Home</a></li>
						<li><a href="about.html">About</a></li>
						<li><a href="blog.html">Blog</a></li>
						<li>
							<!-- First Tier Drop Down --> <label for="drop-2" class="toggle">Drop
								Down <span class="fa fa-angle-down" aria-hidden="true"></span>
						</label> <a href="#">Register <span class="fa fa-angle-down"
								aria-hidden="true"></span></a> <input type="checkbox" id="drop-2" />
							<ul>
								<li><a href="seller-registration.jsp">As Seller</a></li>
								<li><a href="customer-registration.jsp">As Customer</a></li>
							</ul>
						</li>
						<li class="active">
							<!-- First Tier Drop Down --> <label for="drop-2" class="toggle">Drop
								Down <span class="fa fa-angle-down" aria-hidden="true"></span>
						</label> <a href="#">Login <span class="fa fa-angle-down"
								aria-hidden="true"></span></a> <input type="checkbox" id="drop-2" />
							<ul>
								<li><a href="seller-login.jsp">As Seller</a></li>
								<li><a href="customer-login.jsp">As Customer</a></li>
								<li><a href="admin-login.jsp">As Admin</a></li>
							</ul>
						</li>
					</ul>
				</nav>
				<!-- //nav -->
			</div>
		</header>
		<!-- //header -->
	</div>

	<!---->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
		<li class="breadcrumb-item active">Seller New password</li>
	</ol>
	<!---->

<!--//main-content-->
	<section class="ab-info-main py-5">
		<div class="container py-3">
			<h3 class="tittle text-center">
				<span class="sub-tittle">Find Us</span> Seller Login
			</h3>

			<h5 class="tittle text-center">
				<%String msg1 = (String)request.getAttribute("msg1"); %>
				<%if(msg1!= null){ %>
					<%out.print(msg1); %>
				<%} %>
			</h5>

			<div class="row contact-main-info mt-5">
				<div class="col-md-12 contact-right-content">
				<%String email = (String)request.getAttribute("email"); %>
					<form action="SellerController" method="post">
						<input type="hidden" name="email" value="<%=email%>">
						 <input type="password" name="np"
							placeholder="New Password" required="">
						<input type="password" name="cnp"
							placeholder="Confirm New Password" required="">
						<div class="text-center">
							<input type="submit" name="action" value="Update Password">
						</div>
						
					</form>
				</div>

			</div>
		</div>
	</section>


</body>
</html>