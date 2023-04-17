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
						<li>
							<!-- First Tier Drop Down --> <label for="drop-2" class="toggle">Drop
								Down <span class="fa fa-angle-down" aria-hidden="true"></span>
						</label> <a href="#">Login <span class="fa fa-angle-down"
								aria-hidden="true"></span></a> <input type="checkbox" id="drop-2" />
							<ul>
								<li><a href="seller-login.jsp">As Seller</a></li>
								<li><a href="customer-login.jsp">As Customer</a></li>
								<li class="active"><a href="admin-login.jsp">As Admin</a></li>
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
        <li class="breadcrumb-item">
            <a href="index.jsp">Home</a>
        </li>
        <li class="breadcrumb-item active">Admin Login</li>
    </ol>
    <!---->
    
	<!--//main-content-->
	<section class="ab-info-main py-5">
		<div class="container py-3">
			<h3 class="tittle text-center">
				<span class="sub-tittle">Find Us</span> Admin Login
			</h3>
			<div class="row contact-main-info mt-5">
				<div class="col-md-12 contact-right-content">
					<form action="AdminController" method="post">
						<input type="email" class="email" name="email" placeholder="Email" required=""> 
						<input type="password" name="password" placeholder="Password" required="">
						<div class="text-center">
							<input type="submit" value="Login" name="action" >
						</div>
					</form>
				</div>

			</div>
		</div>
	</section>


	<!-- footer -->
	<footer>
		<div class="container">
			<div class="row footer-top">
				<div class="col-lg-4 footer-grid_section_w3layouts">
					<h2 class="logo-2 mb-lg-4 mb-3">
						<a href="index.jsp"><span class="fa fa-bold"
							aria-hidden="true"></span>ootie</a>
					</h2>
					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
						laboris nisi ut aliquip ex ea commodo consequat.</p>
					<h4 class="sub-con-fo ad-info my-4">Catch on Social</h4>
					<ul class="w3layouts_social_list list-unstyled">
						<li><a
							href="https://www.facebook.com/gaurang.dalvadisathvara.7"
							class="w3pvt_facebook"> <span class="fa fa-facebook-f"></span>
						</a></li>
						<li class="mx-2"><a href="https://twitter.com/dalvadigaurang"
							class="w3pvt_twitter"> <span class="fa fa-twitter"></span>
						</a></li>
					</ul>
				</div>
				<div class="col-lg-8 footer-right">
					<div class="w3layouts-news-letter">
						<h3 class="footer-title text-uppercase text-wh mb-lg-4 mb-3">Newsletter</h3>

						<p>By subscribing to our mailing list you will always get
							latest news and updates from us.</p>
						<form action="#" method="post" class="w3layouts-newsletter">
							<input type="email" name="Email"
								placeholder="Enter your email..." required="">
							<button class="btn1">
								<span class="fa fa-paper-plane-o" aria-hidden="true"></span>
							</button>

						</form>
					</div>
					<div class="row mt-lg-4 bottom-w3layouts-sec-nav mx-0">
						<div class="col-md-4 footer-grid_section_w3layouts">
							<h3 class="footer-title text-uppercase text-wh mb-lg-4 mb-3">Information</h3>
							<ul class="list-unstyled w3layouts-icons">
								<li><a href="index.jsp">Home</a></li>
								<li class="mt-3"><a href="about.html">About Us</a></li>
								<li class="mt-3"><a href="#">Gallery</a></li>
								<li class="mt-3"><a href="#">Services</a></li>
								<li class="mt-3"><a href="contact.html">Contact Us</a></li>
							</ul>
						</div>
						<div class="col-md-4 footer-grid_section_w3layouts">
							<!-- social icons -->
							<div class="agileinfo_social_icons">
								<h3 class="footer-title text-uppercase text-wh mb-lg-4 mb-3">Customer
									Service</h3>
								<ul class="list-unstyled w3layouts-icons">

									<li><a href="#">About Us</a></li>
									<li class="mt-3"><a href="#">Delivery & Returns</a></li>
									<li class="mt-3"><a href="#">Waranty</a></li>
									<li class="mt-3"><a href="#">Terms & Condition</a></li>
									<li class="mt-3"><a href="#">Privacy Plolicy</a></li>
								</ul>
							</div>
							<!-- social icons -->
						</div>
						<div class="col-md-4 footer-grid_section_w3layouts my-md-0 my-5">
							<h3 class="footer-title text-uppercase text-wh mb-lg-4 mb-3">Contact
								Info</h3>
							<div class="contact-info">
								<div class="footer-address-inf">
									<h4 class="ad-info mb-2">Phone</h4>
									<p>+91 922 837 1789</p>
								</div>
								<div class="footer-address-inf my-4">
									<h4 class="ad-info mb-2">Email</h4>
									<p>
										<a href="mailto:gaurangdalvadi89@gmail.com">gaurangdalvadi89@gmail.com</a>
									</p>
								</div>
								<div class="footer-address-inf">
									<h4 class="ad-info mb-2">Location</h4>
									<p>Vatva, Ahmedabad City</p>
								</div>
							</div>
						</div>


					</div>
					<div class="cpy-right text-left row">
						<p class="col-md-10">
							© 2023 Bootie. All rights reserved | Design by <a
								href="https://github.com/gaurangdalvadi6"> mr.rambo_king</a>
						</p>
						<!-- move top icon -->
						<a href="#home" class="move-top text-right col-md-2"><span
							class="fa fa-long-arrow-up" aria-hidden="true"></span></a>
						<!-- //move top icon -->
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- //footer -->

</body>

</html>
