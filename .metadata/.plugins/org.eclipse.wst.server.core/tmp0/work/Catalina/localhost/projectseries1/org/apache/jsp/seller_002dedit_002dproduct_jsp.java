/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-04-13 22:12:47 UTC
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
import java.util.List;
import model.Seller;

public final class seller_002dedit_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("dao.ProductDao");
    _jspx_imports_classes.add("model.Seller");
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
      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bootie Ecommerce Bootstrap Responsive Web Template | Home\r\n");
      out.write("	:: W3layouts</title>\r\n");
      out.write("<!-- Meta tag Keywords -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Bootie Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script>\r\n");
      out.write("	addEventListener(\"load\", function() {\r\n");
      out.write("		setTimeout(hideURLbar, 0);\r\n");
      out.write("	}, false);\r\n");
      out.write("\r\n");
      out.write("	function hideURLbar() {\r\n");
      out.write("		window.scrollTo(0, 1);\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<!-- //Meta tag Keywords -->\r\n");
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

Seller s = null;
if(session.getAttribute("data")!=null){
	s = (Seller)session.getAttribute("data");
}
else{
	response.sendRedirect("seller-login.jsp");
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- mian-content -->\r\n");
      out.write("	<div class=\"main-banner\" id=\"home\">\r\n");
      out.write("		<!-- header -->\r\n");
      out.write("		<header class=\"header\">\r\n");
      out.write("			<div class=\"container-fluid px-lg-5\">\r\n");
      out.write("				<!-- nav -->\r\n");
      out.write("				<nav class=\"py-4\">\r\n");
      out.write("					<div id=\"logo\">\r\n");
      out.write("						<h1>\r\n");
      out.write("							<a href=\"index.jsp\"><span class=\"fa fa-bold\"\r\n");
      out.write("								aria-hidden=\"true\"></span>ootie</a>\r\n");
      out.write("						</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<label for=\"drop\" class=\"toggle\">Menu</label> <input\r\n");
      out.write("						type=\"checkbox\" id=\"drop\" />\r\n");
      out.write("					<ul class=\"menu mt-2\">\r\n");
      out.write("						<li class=\"active\"><a href=\"seller-home.jsp\">Home</a></li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<!-- First Tier Drop Down --> <label for=\"drop-2\" class=\"toggle\">Drop\r\n");
      out.write("								Down <span class=\"fa fa-angle-down\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</label> <a href=\"#\">Product <span class=\"fa fa-angle-down\"\r\n");
      out.write("								aria-hidden=\"true\"></span></a> <input type=\"checkbox\" id=\"drop-2\" />\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"seller-upload-product.jsp\">Upload Product</a></li>\r\n");
      out.write("								<li><a href=\"seller-manage-product.jsp\">Manage Product</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<!-- First Tier Drop Down --> <label for=\"drop-2\" class=\"toggle\">Drop\r\n");
      out.write("								Down <span class=\"fa fa-angle-down\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</label> <a href=\"#\">");
      out.print(s.getName() );
      out.write("<span class=\"fa fa-angle-down\"\r\n");
      out.write("								aria-hidden=\"true\"></span></a> <input type=\"checkbox\" id=\"drop-2\" />\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"seller-profile.jsp\">Profile</a></li>\r\n");
      out.write("								<li><a href=\"seller-change-password.jsp\">Change Password</a></li>\r\n");
      out.write("								<li><a href=\"seller-logout.jsp\">Logout</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("				<!-- //nav -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</header>\r\n");
      out.write("		<!-- //header -->\r\n");
      out.write("		<!--/banner-->\r\n");
      out.write("		<div class=\"banner-info\">\r\n");
      out.write("			<p>Trending of the week</p>\r\n");
      out.write("			<h3 class=\"mb-4\">Casual Shoes for Men</h3>\r\n");
      out.write("			<div class=\"ban-buttons\">\r\n");
      out.write("				<a href=\"shop-single.html\" class=\"btn\">Shop Now</a> <a\r\n");
      out.write("					href=\"single.html\" class=\"btn active\">Read More</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--// banner-inner -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!--//main-content-->\r\n");
      out.write("	<!--/ab -->\r\n");
      out.write("	<section class=\"about py-md-5 py-5\">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<div class=\"feature-grids row px-3\">\r\n");
      out.write("				<div class=\"col-lg-3 gd-bottom\">\r\n");
      out.write("					<div class=\"bottom-gd row\">\r\n");
      out.write("						<div class=\"icon-gd col-md-3 text-center\">\r\n");
      out.write("							<span class=\"fa fa-truck\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"icon-gd-info col-md-9\">\r\n");
      out.write("							<h3 class=\"mb-2\">FREE SHIPPING</h3>\r\n");
      out.write("							<p>On all order over $2000</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 gd-bottom\">\r\n");
      out.write("					<div class=\"bottom-gd row bottom-gd2-active\">\r\n");
      out.write("						<div class=\"icon-gd col-md-3 text-center\">\r\n");
      out.write("							<span class=\"fa fa-bullhorn\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"icon-gd-info col-md-9\">\r\n");
      out.write("							<h3 class=\"mb-2\">FREE RETURN</h3>\r\n");
      out.write("							<p>On 1st exchange in 30 days</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 gd-bottom\">\r\n");
      out.write("					<div class=\"bottom-gd row\">\r\n");
      out.write("						<div class=\"icon-gd col-md-3 text-center\">\r\n");
      out.write("							<span class=\"fa fa-gift\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"icon-gd-info col-md-9\">\r\n");
      out.write("							<h3 class=\"mb-2\">MEMBER DISCOUNT</h3>\r\n");
      out.write("							<p>Register & save up to $29%</p>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 gd-bottom\">\r\n");
      out.write("					<div class=\"bottom-gd row\">\r\n");
      out.write("						<div class=\"icon-gd col-md-3 text-center\">\r\n");
      out.write("							<span class=\"fa fa-usd\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"icon-gd-info col-md-9\">\r\n");
      out.write("							<h3 class=\"mb-2\">PREMIUM SUPPORT</h3>\r\n");
      out.write("							<p>Support 24 hours per day</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- //ab -->\r\n");
      out.write("	\r\n");
      out.write("	");
int id = Integer.parseInt(request.getParameter("id")); 
      out.write('\r');
      out.write('\n');
      out.write('	');
Product p = ProductDao.getProductByPid(id); 
      out.write("\r\n");
      out.write("	  <section class=\"ab-info-main py-5\">\r\n");
      out.write("		<div class=\"container py-3\">\r\n");
      out.write("			<h3 class=\"tittle text-center\">\r\n");
      out.write("				<span class=\"sub-tittle\">Find Us</span> Seller Manage Product\r\n");
      out.write("			</h3>\r\n");
      out.write("			<div class=\"row contact-main-info mt-5\">\r\n");
      out.write("				<div class=\"col-md-12 contact-right-content\">\r\n");
      out.write("					<form action=\"ProductController\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("						<img src=\"image/");
      out.print(p.getImage());
      out.write("\" height=\"200px\" alt=\"\">\r\n");
      out.write("						<input type=\"hidden\" name=\"sid\" value=\"");
      out.print(s.getId());
      out.write("\">\r\n");
      out.write("						<input type=\"file\" name=\"image\" placeholder=\"Name\">\r\n");
      out.write("						<input type=\"text\" name=\"pname\" value=\"");
      out.print(p.getPname());
      out.write("\">\r\n");
      out.write("						<input type=\"text\" name=\"pprice\"value=\"");
      out.print(p.getPprice());
      out.write("\">\r\n");
      out.write("						<input type=\"text\" class=\"email\" name=\"pcategory\" value=\"");
      out.print(p.getPcategory());
      out.write("\"> \r\n");
      out.write("						<input type=\"text\" class=\"email\" name=\"pdesc\" value=\"");
      out.print(p.getPdesc());
      out.write("\">\r\n");
      out.write("						<div class=\"text-center\">\r\n");
      out.write("							<input type=\"submit\" name=\"action\" value=\"update\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
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
