<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="dao.SellerDao"%>
<%@page import="model.Seller"%>
<%@page import="dao.CustomerDao"%>
<%@page import="model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Pooled Admin Panel Category Flat Bootstrap Responsive Web
	Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!-- Bootstrap Core CSS -->
<link href="admin/css/bootstrap.min.css" rel='stylesheet'
	type='text/css' />
<!-- Custom CSS -->
<link href="admin/css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="admin/css/morris.css" type="text/css" />
<!-- Graph CSS -->
<link href="admin/css/font-awesome.css" rel="stylesheet">
<!-- jQuery -->
<script src="admin/js/jquery-2.1.4.min.js"></script>
<!-- //jQuery -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'
	rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="admin/css/icon-font.min.css"
	type='text/css' />
<!-- //lined-icons -->


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
	<div class="page-container">
		<!--/content-inner-->
		<div class="left-content">
			<div class="mother-grid-inner">
				<!--header start here-->
				<div class="header-main">
					<div class="logo-w3-agile">
						<h1>
							<a href="admin-home.jsp">Bootie</a>
						</h1>
					</div>
					<div class="w3layouts-left">

						<!--search-box-->
						<div class="w3-search-box">
							<form action="#" method="post">
								<input type="text" placeholder="Search..." required="">
								<input type="submit" value="">
							</form>
						</div>
						<!--//end-search-box-->
						<div class="clearfix"></div>
					</div>
					<div class="w3layouts-right">
						<div class="profile_details_left">
							<!--notifications of menu start -->
							<ul class="nofitications-dropdown">


								<li class="dropdown head-dpdn"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown"
									aria-expanded="false"><i class="fa fa-tasks"></i><span
										class="badge blue1">9</span></a>
									<ul class="dropdown-menu">
										<li></li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Database update</span><span
														class="percentage">40%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar yellow" style="width: 40%;"></div>
												</div>
										</a></li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Dashboard done</span><span
														class="percentage">90%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar green" style="width: 90%;"></div>
												</div>
										</a></li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Mobile App</span><span
														class="percentage">33%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar red" style="width: 33%;"></div>
												</div>
										</a></li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Issues fixed</span><span
														class="percentage">80%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar  blue" style="width: 80%;"></div>
												</div>
										</a></li>

									</ul></li>
								<div class="clearfix"></div>
							</ul>
							<div class="clearfix"></div>
						</div>
						<!--notification menu end -->

						<div class="clearfix"></div>
					</div>
					<div class="profile_details w3l">
						<ul>
							<li class="dropdown profile_details_drop"><a href="#"
								class="dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false">
									<div class="profile_img">
										<div class="user-name">
											<%
											String email = request.getParameter("email");
											%>
											<p>
												<%
												out.print(email);
												%>
											</p>
											<span>Administrator</span>
										</div>
										<i class="fa fa-angle-down"></i> <i class="fa fa-angle-up"></i>
										<div class="clearfix"></div>
									</div>
							</a>
								<ul class="dropdown-menu drp-mnu">
									<li><a href="admin-logout.jsp"><i
											class="fa fa-sign-out"></i> Logout</a></li>
								</ul></li>
						</ul>
					</div>

					<div class="clearfix"></div>
				</div>
				<!--heder end here-->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="admin-home.jsp">Home</a>
						<i class="fa fa-angle-right"></i></li>
				</ol>
				<!--four-grids here-->
				<div class="four-grids">
					<div class="col-md-3 four-grid">
						<div class="four-agileits">
							<div class="icon">
								<i class="glyphicon glyphicon-user" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<%
								List<Customer> clist = CustomerDao.getAllCustomers();
								%>
								<h3>Customers</h3>
								<h4>
									<%
									out.print(clist.size());
									%>
								</h4>

							</div>

						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-agileinfo">
							<div class="icon">
								<i class="glyphicon glyphicon-list-alt" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<%
								List<Seller> slist = SellerDao.getAllSellers();
								%>
								<h3>Sellers</h3>
								<h4>
									<%
									out.print(slist.size());
									%>
								</h4>

							</div>

						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-w3ls">
							<div class="icon">
								<i class="glyphicon glyphicon-folder-open" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<%
								List<Product> plist = ProductDao.getAllProduct();
								%>
								<h3>Products</h3>
								<h4>
									<%
									out.print(plist.size());
									%>
								</h4>

							</div>

						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-wthree">
							<div class="icon">
								<i class="glyphicon glyphicon-briefcase" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Payments</h3>
								<h4>Checking...</h4>

							</div>

						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--//four-grids here-->
				<!--agileinfo-grap-->

				<!--//main-content-->
				<section class="ab-info-main py-5">
					<div class="container py-3">
						<h3 class="tittle text-center">
							<span class="sub-tittle">Find Us</span> Admin Selller Edit
						</h3>
						<div class="row contact-main-info mt-5">
							<%
							int id = Integer.parseInt(request.getParameter("id"));
							%>
							<%
							Seller s = SellerDao.getSellerById(id);
							%>
							<div class="col-md-12 contact-right-content">

								<form action="SellerController" method="post"
									class="form-horizontal">
									<div class="form-group">
										<div class="col-sm-8">
											<input type="hidden" name="id" class="form-control1"
												id="focusedinput" value="<%=s.getId()%>">
										</div>
									</div>
									
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Name</label>
										<div class="col-sm-8">
											<input type="text" name="name" class="form-control1"
												id="focusedinput" value="<%=s.getName()%>">
										</div>
									</div>
									<div class="form-group">
										<label for="disabledinput" class="col-sm-2 control-label">Contact</label>
										<div class="col-sm-8">
											<input name="contact" type="text" class="form-control1"
												id="disabledinput" value="<%=s.getContact()%>">
										</div>
									</div>
									<div class="form-group">
										<label for="inputPassword" class="col-sm-2 control-label">Address</label>
										<div class="col-sm-8">
											<input type="text" name="address" class="form-control1"
												id="inputPassword" value="<%=s.getAddress()%>">
										</div>
									</div>
									<div class="form-group">
										<label for="inputPassword" class="col-sm-2 control-label">Email</label>
										<div class="col-sm-8">
											<input type="email" name="email" class="form-control1"
												id="inputPassword" value="<%=s.getEmail()%>">
										</div>
									</div>
									<div class="form-group">
									<div class="col-sm-3"></div>
										<div class="col-sm-5">
											<input type="submit" class="form-control1" id="inputPassword"
												value="admin update" name="action">
										</div>
									<div class="col-sm-3"></div>
									</div>
								</form>
							</div>

						</div>
					</div>
				</section>

				<!--//w3-agileits-pane-->
				<!-- script-for sticky-nav -->
				<script>
					$(document).ready(function() {
						var navoffeset = $(".header-main").offset().top;
						$(window).scroll(function() {
							var scrollpos = $(window).scrollTop();
							if (scrollpos >= navoffeset) {
								$(".header-main").addClass("fixed");
							} else {
								$(".header-main").removeClass("fixed");
							}
						});

					});
				</script>
				<!-- /script-for sticky-nav -->
				<!--inner block start here-->
				<div class="inner-block"></div>
				<!--inner block end here-->
				<!--copy rights start here-->
				<div class="copyrights">
					<p>
						© 2023 Bootie. All Rights Reserved | Design by <a
							href="https://github.com/gaurangdalvadi6" target="_blank">Mr.Rambo_King</a>
					</p>
				</div>
				<!--COPY rights end here-->
			</div>
		</div>
		<!--//content-inner-->
		<!--/sidebar-menu-->
		<div class="sidebar-menu">
			<header class="logo1">
				<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span>
				</a>
			</header>
			<div style="border-top: 1px ridge rgba(255, 255, 255, 0.15)"></div>
			<div class="menu">
				<ul id="menu">
					<li><a href="admin-home.jsp"><i class="fa fa-tachometer"></i>
							<span>Dashboard</span>
							<div class="clearfix"></div></a></li>


					<li id="menu-academico"><a href="admin-sellers-list.jsp"><i
							class="fa fa-envelope nav_icon"></i><span>Seller</span>
							<div class="clearfix"></div></a></li>
					<li><a href="admin-customers-list.jsp"><i
							class="fa fa-picture-o" aria-hidden="true"></i><span>Customers</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="admin-product-list.jsp"><i
							class="fa fa-bar-chart"></i><span>Products</span>
							<div class="clearfix"></div></a></li>

					<li id="menu-academico"><a href="total-payment-list.jsp"><i
							class="fa fa-exclamation-triangle" aria-hidden="true"></i><span>Payments</span>
							<div class="clearfix"></div></a></li>



				</ul>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
	<script>
		var toggle = true;

		$(".sidebar-icon").click(
				function() {
					if (toggle) {
						$(".page-container").addClass("sidebar-collapsed")
								.removeClass("sidebar-collapsed-back");
						$("#menu span").css({
							"position" : "absolute"
						});
					} else {
						$(".page-container").removeClass("sidebar-collapsed")
								.addClass("sidebar-collapsed-back");
						setTimeout(function() {
							$("#menu span").css({
								"position" : "relative"
							});
						}, 400);
					}

					toggle = !toggle;
				});
	</script>
	<!--js -->
	<script src="admin/js/jquery.nicescroll.js"></script>
	<script src="admin/js/scripts.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="admin/js/bootstrap.min.js"></script>
	<!-- /Bootstrap Core JavaScript -->
	<!-- morris JavaScript -->
	<script src="admin/js/raphael-min.js"></script>
	<script src="admin/js/morris.js"></script>

</body>
</html>