/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-04-13 21:44:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ProductDao;
import model.Product;
import dao.SellerDao;
import model.Seller;
import dao.CustomerDao;
import model.Customer;
import java.util.List;

public final class admin_002dseller_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Product");
    _jspx_imports_classes.add("model.Customer");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("dao.SellerDao");
    _jspx_imports_classes.add("dao.ProductDao");
    _jspx_imports_classes.add("model.Seller");
    _jspx_imports_classes.add("dao.CustomerDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Pooled Admin Panel Category Flat Bootstrap Responsive Web\r\n");
      out.write("	Template | Home :: w3layouts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	 addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"admin/css/bootstrap.min.css\" rel='stylesheet'\r\n");
      out.write("	type='text/css' />\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"admin/css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"admin/css/morris.css\" type=\"text/css\" />\r\n");
      out.write("<!-- Graph CSS -->\r\n");
      out.write("<link href=\"admin/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"admin/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<!-- //jQuery -->\r\n");
      out.write("<link\r\n");
      out.write("	href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'\r\n");
      out.write("	rel='stylesheet' type='text/css' />\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- lined-icons -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"admin/css/icon-font.min.css\"\r\n");
      out.write("	type='text/css' />\r\n");
      out.write("<!-- //lined-icons -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Custom-Files -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<!-- Bootstrap-Core-CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Style-CSS -->\r\n");
      out.write("<!-- font-awesome-icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //font-awesome-icons -->\r\n");
      out.write("<!-- /Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- //Fonts -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"page-container\">\r\n");
      out.write("		<!--/content-inner-->\r\n");
      out.write("		<div class=\"left-content\">\r\n");
      out.write("			<div class=\"mother-grid-inner\">\r\n");
      out.write("				<!--header start here-->\r\n");
      out.write("				<div class=\"header-main\">\r\n");
      out.write("					<div class=\"logo-w3-agile\">\r\n");
      out.write("						<h1>\r\n");
      out.write("							<a href=\"admin-home.jsp\">Bootie</a>\r\n");
      out.write("						</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"w3layouts-left\">\r\n");
      out.write("\r\n");
      out.write("						<!--search-box-->\r\n");
      out.write("						<div class=\"w3-search-box\">\r\n");
      out.write("							<form action=\"#\" method=\"post\">\r\n");
      out.write("								<input type=\"text\" placeholder=\"Search...\" required=\"\">\r\n");
      out.write("								<input type=\"submit\" value=\"\">\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!--//end-search-box-->\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"w3layouts-right\">\r\n");
      out.write("						<div class=\"profile_details_left\">\r\n");
      out.write("							<!--notifications of menu start -->\r\n");
      out.write("							<ul class=\"nofitications-dropdown\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("								<li class=\"dropdown head-dpdn\"><a href=\"#\"\r\n");
      out.write("									class=\"dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("									aria-expanded=\"false\"><i class=\"fa fa-tasks\"></i><span\r\n");
      out.write("										class=\"badge blue1\">9</span></a>\r\n");
      out.write("									<ul class=\"dropdown-menu\">\r\n");
      out.write("										<li></li>\r\n");
      out.write("										<li><a href=\"#\">\r\n");
      out.write("												<div class=\"task-info\">\r\n");
      out.write("													<span class=\"task-desc\">Database update</span><span\r\n");
      out.write("														class=\"percentage\">40%</span>\r\n");
      out.write("													<div class=\"clearfix\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"progress progress-striped active\">\r\n");
      out.write("													<div class=\"bar yellow\" style=\"width: 40%;\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("										</a></li>\r\n");
      out.write("										<li><a href=\"#\">\r\n");
      out.write("												<div class=\"task-info\">\r\n");
      out.write("													<span class=\"task-desc\">Dashboard done</span><span\r\n");
      out.write("														class=\"percentage\">90%</span>\r\n");
      out.write("													<div class=\"clearfix\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"progress progress-striped active\">\r\n");
      out.write("													<div class=\"bar green\" style=\"width: 90%;\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("										</a></li>\r\n");
      out.write("										<li><a href=\"#\">\r\n");
      out.write("												<div class=\"task-info\">\r\n");
      out.write("													<span class=\"task-desc\">Mobile App</span><span\r\n");
      out.write("														class=\"percentage\">33%</span>\r\n");
      out.write("													<div class=\"clearfix\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"progress progress-striped active\">\r\n");
      out.write("													<div class=\"bar red\" style=\"width: 33%;\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("										</a></li>\r\n");
      out.write("										<li><a href=\"#\">\r\n");
      out.write("												<div class=\"task-info\">\r\n");
      out.write("													<span class=\"task-desc\">Issues fixed</span><span\r\n");
      out.write("														class=\"percentage\">80%</span>\r\n");
      out.write("													<div class=\"clearfix\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"progress progress-striped active\">\r\n");
      out.write("													<div class=\"bar  blue\" style=\"width: 80%;\"></div>\r\n");
      out.write("												</div>\r\n");
      out.write("										</a></li>\r\n");
      out.write("\r\n");
      out.write("									</ul></li>\r\n");
      out.write("								<div class=\"clearfix\"></div>\r\n");
      out.write("							</ul>\r\n");
      out.write("							<div class=\"clearfix\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!--notification menu end -->\r\n");
      out.write("\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"profile_details w3l\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"dropdown profile_details_drop\"><a href=\"#\"\r\n");
      out.write("								class=\"dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("								aria-expanded=\"false\">\r\n");
      out.write("									<div class=\"profile_img\">\r\n");
      out.write("										<div class=\"user-name\">\r\n");
      out.write("											");

											String email = request.getParameter("email");
											
      out.write("\r\n");
      out.write("											<p>\r\n");
      out.write("												");

												out.print(email);
												
      out.write("\r\n");
      out.write("											</p>\r\n");
      out.write("											<span>Administrator</span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<i class=\"fa fa-angle-down\"></i> <i class=\"fa fa-angle-up\"></i>\r\n");
      out.write("										<div class=\"clearfix\"></div>\r\n");
      out.write("									</div>\r\n");
      out.write("							</a>\r\n");
      out.write("								<ul class=\"dropdown-menu drp-mnu\">\r\n");
      out.write("									<li><a href=\"admin-logout.jsp\"><i\r\n");
      out.write("											class=\"fa fa-sign-out\"></i> Logout</a></li>\r\n");
      out.write("								</ul></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!--heder end here-->\r\n");
      out.write("				<ol class=\"breadcrumb\">\r\n");
      out.write("					<li class=\"breadcrumb-item\"><a href=\"admin-home.jsp\">Home</a>\r\n");
      out.write("						<i class=\"fa fa-angle-right\"></i></li>\r\n");
      out.write("				</ol>\r\n");
      out.write("				<!--four-grids here-->\r\n");
      out.write("				<div class=\"four-grids\">\r\n");
      out.write("					<div class=\"col-md-3 four-grid\">\r\n");
      out.write("						<div class=\"four-agileits\">\r\n");
      out.write("							<div class=\"icon\">\r\n");
      out.write("								<i class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"four-text\">\r\n");
      out.write("								");

								List<Customer> clist = CustomerDao.getAllCustomers();
								
      out.write("\r\n");
      out.write("								<h3>Customers</h3>\r\n");
      out.write("								<h4>\r\n");
      out.write("									");

									out.print(clist.size());
									
      out.write("\r\n");
      out.write("								</h4>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-3 four-grid\">\r\n");
      out.write("						<div class=\"four-agileinfo\">\r\n");
      out.write("							<div class=\"icon\">\r\n");
      out.write("								<i class=\"glyphicon glyphicon-list-alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"four-text\">\r\n");
      out.write("								");

								List<Seller> slist = SellerDao.getAllSellers();
								
      out.write("\r\n");
      out.write("								<h3>Sellers</h3>\r\n");
      out.write("								<h4>\r\n");
      out.write("									");

									out.print(slist.size());
									
      out.write("\r\n");
      out.write("								</h4>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-3 four-grid\">\r\n");
      out.write("						<div class=\"four-w3ls\">\r\n");
      out.write("							<div class=\"icon\">\r\n");
      out.write("								<i class=\"glyphicon glyphicon-folder-open\" aria-hidden=\"true\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"four-text\">\r\n");
      out.write("								");

								List<Product> plist = ProductDao.getAllProduct();
								
      out.write("\r\n");
      out.write("								<h3>Products</h3>\r\n");
      out.write("								<h4>\r\n");
      out.write("									");

									out.print(plist.size());
									
      out.write("\r\n");
      out.write("								</h4>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-3 four-grid\">\r\n");
      out.write("						<div class=\"four-wthree\">\r\n");
      out.write("							<div class=\"icon\">\r\n");
      out.write("								<i class=\"glyphicon glyphicon-briefcase\" aria-hidden=\"true\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"four-text\">\r\n");
      out.write("								<h3>Payments</h3>\r\n");
      out.write("								<h4>Checking...</h4>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!--//four-grids here-->\r\n");
      out.write("				<!--agileinfo-grap-->\r\n");
      out.write("\r\n");
      out.write("				<!--//main-content-->\r\n");
      out.write("				<section class=\"ab-info-main py-5\">\r\n");
      out.write("					<div class=\"container py-3\">\r\n");
      out.write("						<h3 class=\"tittle text-center\">\r\n");
      out.write("							<span class=\"sub-tittle\">Find Us</span> Admin Selller Edit\r\n");
      out.write("						</h3>\r\n");
      out.write("						<div class=\"row contact-main-info mt-5\">\r\n");
      out.write("							");

							int id = Integer.parseInt(request.getParameter("id"));
							
      out.write("\r\n");
      out.write("							");

							Seller s = SellerDao.getSellerById(id);
							
      out.write("\r\n");
      out.write("							<div class=\"col-md-12 contact-right-content\">\r\n");
      out.write("\r\n");
      out.write("								<form action=\"SellerController\" method=\"post\"\r\n");
      out.write("									class=\"form-horizontal\">\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<div class=\"col-sm-8\">\r\n");
      out.write("											<input type=\"hidden\" name=\"id\" class=\"form-control1\"\r\n");
      out.write("												id=\"focusedinput\" value=\"");
      out.print(s.getId());
      out.write("\">\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<label for=\"focusedinput\" class=\"col-sm-2 control-label\">Name</label>\r\n");
      out.write("										<div class=\"col-sm-8\">\r\n");
      out.write("											<input type=\"text\" name=\"name\" class=\"form-control1\"\r\n");
      out.write("												id=\"focusedinput\" value=\"");
      out.print(s.getName());
      out.write("\">\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<label for=\"disabledinput\" class=\"col-sm-2 control-label\">Contact</label>\r\n");
      out.write("										<div class=\"col-sm-8\">\r\n");
      out.write("											<input name=\"contact\" type=\"text\" class=\"form-control1\"\r\n");
      out.write("												id=\"disabledinput\" value=\"");
      out.print(s.getContact());
      out.write("\">\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<label for=\"inputPassword\" class=\"col-sm-2 control-label\">Address</label>\r\n");
      out.write("										<div class=\"col-sm-8\">\r\n");
      out.write("											<input type=\"text\" name=\"address\" class=\"form-control1\"\r\n");
      out.write("												id=\"inputPassword\" value=\"");
      out.print(s.getAddress());
      out.write("\">\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<label for=\"inputPassword\" class=\"col-sm-2 control-label\">Email</label>\r\n");
      out.write("										<div class=\"col-sm-8\">\r\n");
      out.write("											<input type=\"email\" name=\"email\" class=\"form-control1\"\r\n");
      out.write("												id=\"inputPassword\" value=\"");
      out.print(s.getEmail());
      out.write("\">\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("									<div class=\"col-sm-3\"></div>\r\n");
      out.write("										<div class=\"col-sm-5\">\r\n");
      out.write("											<input type=\"submit\" class=\"form-control1\" id=\"inputPassword\"\r\n");
      out.write("												value=\"admin update\" name=\"action\">\r\n");
      out.write("										</div>\r\n");
      out.write("									<div class=\"col-sm-3\"></div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</section>\r\n");
      out.write("\r\n");
      out.write("				<!--//w3-agileits-pane-->\r\n");
      out.write("				<!-- script-for sticky-nav -->\r\n");
      out.write("				<script>\r\n");
      out.write("					$(document).ready(function() {\r\n");
      out.write("						var navoffeset = $(\".header-main\").offset().top;\r\n");
      out.write("						$(window).scroll(function() {\r\n");
      out.write("							var scrollpos = $(window).scrollTop();\r\n");
      out.write("							if (scrollpos >= navoffeset) {\r\n");
      out.write("								$(\".header-main\").addClass(\"fixed\");\r\n");
      out.write("							} else {\r\n");
      out.write("								$(\".header-main\").removeClass(\"fixed\");\r\n");
      out.write("							}\r\n");
      out.write("						});\r\n");
      out.write("\r\n");
      out.write("					});\r\n");
      out.write("				</script>\r\n");
      out.write("				<!-- /script-for sticky-nav -->\r\n");
      out.write("				<!--inner block start here-->\r\n");
      out.write("				<div class=\"inner-block\"></div>\r\n");
      out.write("				<!--inner block end here-->\r\n");
      out.write("				<!--copy rights start here-->\r\n");
      out.write("				<div class=\"copyrights\">\r\n");
      out.write("					<p>\r\n");
      out.write("						© 2023 Bootie. All Rights Reserved | Design by <a\r\n");
      out.write("							href=\"https://github.com/gaurangdalvadi6\" target=\"_blank\">Mr.Rambo_King</a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!--COPY rights end here-->\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--//content-inner-->\r\n");
      out.write("		<!--/sidebar-menu-->\r\n");
      out.write("		<div class=\"sidebar-menu\">\r\n");
      out.write("			<header class=\"logo1\">\r\n");
      out.write("				<a href=\"#\" class=\"sidebar-icon\"> <span class=\"fa fa-bars\"></span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</header>\r\n");
      out.write("			<div style=\"border-top: 1px ridge rgba(255, 255, 255, 0.15)\"></div>\r\n");
      out.write("			<div class=\"menu\">\r\n");
      out.write("				<ul id=\"menu\">\r\n");
      out.write("					<li><a href=\"admin-home.jsp\"><i class=\"fa fa-tachometer\"></i>\r\n");
      out.write("							<span>Dashboard</span>\r\n");
      out.write("							<div class=\"clearfix\"></div></a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li id=\"menu-academico\"><a href=\"admin-sellers-list.jsp\"><i\r\n");
      out.write("							class=\"fa fa-envelope nav_icon\"></i><span>Seller</span>\r\n");
      out.write("							<div class=\"clearfix\"></div></a></li>\r\n");
      out.write("					<li><a href=\"admin-customers-list.jsp\"><i\r\n");
      out.write("							class=\"fa fa-picture-o\" aria-hidden=\"true\"></i><span>Customers</span>\r\n");
      out.write("							<div class=\"clearfix\"></div></a></li>\r\n");
      out.write("					<li id=\"menu-academico\"><a href=\"admin-product-list.jsp\"><i\r\n");
      out.write("							class=\"fa fa-bar-chart\"></i><span>Products</span>\r\n");
      out.write("							<div class=\"clearfix\"></div></a></li>\r\n");
      out.write("\r\n");
      out.write("					<li id=\"menu-academico\"><a href=\"total-payment-list.jsp\"><i\r\n");
      out.write("							class=\"fa fa-exclamation-triangle\" aria-hidden=\"true\"></i><span>Payments</span>\r\n");
      out.write("							<div class=\"clearfix\"></div></a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"clearfix\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		var toggle = true;\r\n");
      out.write("\r\n");
      out.write("		$(\".sidebar-icon\").click(\r\n");
      out.write("				function() {\r\n");
      out.write("					if (toggle) {\r\n");
      out.write("						$(\".page-container\").addClass(\"sidebar-collapsed\")\r\n");
      out.write("								.removeClass(\"sidebar-collapsed-back\");\r\n");
      out.write("						$(\"#menu span\").css({\r\n");
      out.write("							\"position\" : \"absolute\"\r\n");
      out.write("						});\r\n");
      out.write("					} else {\r\n");
      out.write("						$(\".page-container\").removeClass(\"sidebar-collapsed\")\r\n");
      out.write("								.addClass(\"sidebar-collapsed-back\");\r\n");
      out.write("						setTimeout(function() {\r\n");
      out.write("							$(\"#menu span\").css({\r\n");
      out.write("								\"position\" : \"relative\"\r\n");
      out.write("							});\r\n");
      out.write("						}, 400);\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("					toggle = !toggle;\r\n");
      out.write("				});\r\n");
      out.write("	</script>\r\n");
      out.write("	<!--js -->\r\n");
      out.write("	<script src=\"admin/js/jquery.nicescroll.js\"></script>\r\n");
      out.write("	<script src=\"admin/js/scripts.js\"></script>\r\n");
      out.write("	<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("	<script src=\"admin/js/bootstrap.min.js\"></script>\r\n");
      out.write("	<!-- /Bootstrap Core JavaScript -->\r\n");
      out.write("	<!-- morris JavaScript -->\r\n");
      out.write("	<script src=\"admin/js/raphael-min.js\"></script>\r\n");
      out.write("	<script src=\"admin/js/morris.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
