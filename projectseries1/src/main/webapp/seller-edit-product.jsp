<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page import="model.Seller"%>
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
<%
Seller s = null;
if(session.getAttribute("data")!=null){
	s = (Seller)session.getAttribute("data");
}
else{
	response.sendRedirect("seller-login.jsp");
}
%>

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
						<li class="active"><a href="seller-home.jsp">Home</a></li>
						<li>
							<!-- First Tier Drop Down --> <label for="drop-2" class="toggle">Drop
								Down <span class="fa fa-angle-down" aria-hidden="true"></span>
						</label> <a href="#">Product <span class="fa fa-angle-down"
								aria-hidden="true"></span></a> <input type="checkbox" id="drop-2" />
							<ul>
								<li><a href="seller-upload-product.jsp">Upload Product</a></li>
								<li><a href="seller-manage-product.jsp">Manage Product</a></li>
							</ul>
						</li>
						<li>
							<!-- First Tier Drop Down --> <label for="drop-2" class="toggle">Drop
								Down <span class="fa fa-angle-down" aria-hidden="true"></span>
						</label> <a href="#"><%=s.getName() %><span class="fa fa-angle-down"
								aria-hidden="true"></span></a> <input type="checkbox" id="drop-2" />
							<ul>
								<li><a href="seller-profile.jsp">Profile</a></li>
								<li><a href="seller-change-password.jsp">Change Password</a></li>
								<li><a href="seller-logout.jsp">Logout</a></li>
							</ul>
						</li>
					</ul>
				</nav>
				<!-- //nav -->
			</div>
		</header>
		<!-- //header -->
		<!--/banner-->
		<div class="banner-info">
			<p>Trending of the week</p>
			<h3 class="mb-4">Casual Shoes for Men</h3>
			<div class="ban-buttons">
				<a href="shop-single.html" class="btn">Shop Now</a> <a
					href="single.html" class="btn active">Read More</a>
			</div>
		</div>
		<!--// banner-inner -->

	</div>
	<!--//main-content-->
	<!--/ab -->
	<section class="about py-md-5 py-5">
		<div class="container-fluid">
			<div class="feature-grids row px-3">
				<div class="col-lg-3 gd-bottom">
					<div class="bottom-gd row">
						<div class="icon-gd col-md-3 text-center">
							<span class="fa fa-truck" aria-hidden="true"></span>
						</div>
						<div class="icon-gd-info col-md-9">
							<h3 class="mb-2">FREE SHIPPING</h3>
							<p>On all order over $2000</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 gd-bottom">
					<div class="bottom-gd row bottom-gd2-active">
						<div class="icon-gd col-md-3 text-center">
							<span class="fa fa-bullhorn" aria-hidden="true"></span>
						</div>
						<div class="icon-gd-info col-md-9">
							<h3 class="mb-2">FREE RETURN</h3>
							<p>On 1st exchange in 30 days</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 gd-bottom">
					<div class="bottom-gd row">
						<div class="icon-gd col-md-3 text-center">
							<span class="fa fa-gift" aria-hidden="true"></span>
						</div>

						<div class="icon-gd-info col-md-9">
							<h3 class="mb-2">MEMBER DISCOUNT</h3>
							<p>Register & save up to $29%</p>
						</div>

					</div>
				</div>
				<div class="col-lg-3 gd-bottom">
					<div class="bottom-gd row">
						<div class="icon-gd col-md-3 text-center">
							<span class="fa fa-usd" aria-hidden="true"></span>
						</div>
						<div class="icon-gd-info col-md-9">
							<h3 class="mb-2">PREMIUM SUPPORT</h3>
							<p>Support 24 hours per day</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- //ab -->
	
	<%int id = Integer.parseInt(request.getParameter("id")); %>
	<%Product p = ProductDao.getProductByPid(id); %>
	  <section class="ab-info-main py-5">
		<div class="container py-3">
			<h3 class="tittle text-center">
				<span class="sub-tittle">Find Us</span> Seller Manage Product
			</h3>
			<div class="row contact-main-info mt-5">
				<div class="col-md-12 contact-right-content">
					<form action="ProductController" method="post" enctype="multipart/form-data">
						<img src="image/<%=p.getImage()%>" height="200px" alt="">
						<input type="hidden" name="sid" value="<%=s.getId()%>">
						<input type="file" name="image" placeholder="Name">
						<input type="text" name="pname" value="<%=p.getPname()%>">
						<input type="text" name="pprice"value="<%=p.getPprice()%>">
						<input type="text" class="email" name="pcategory" value="<%=p.getPcategory()%>"> 
						<input type="text" class="email" name="pdesc" value="<%=p.getPdesc()%>">
						<div class="text-center">
							<input type="submit" name="action" value="update">
						</div>
					</form>
				</div>
	

			</div>
		</div>
	</section>

</body>
</html>