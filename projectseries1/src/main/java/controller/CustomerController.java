package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CustomerDao;
import dao.SellerDao;
import model.Customer;
import model.Seller;
import services.Service;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("Registration")) {
			Customer c = new Customer();
			c.setName(request.getParameter("name"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			c.setAddress(request.getParameter("address"));
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			CustomerDao.insertCustomer(c);
			request.setAttribute("msg", "Account registered succesfully");
			request.getRequestDispatcher("customer-login.jsp").forward(request, response);

		}

		else if (action.equalsIgnoreCase("Login")) {
			Customer c = new Customer();
			c.setEmail(request.getParameter("email"));
			String email = request.getParameter("email");
			c.setPassword(request.getParameter("password"));
			boolean flag = CustomerDao.checkEmail(email);
			if (flag == true) {
				Customer c1 = CustomerDao.loginCustomer(c);
				if (c1 != null) {
					HttpSession session = request.getSession();
					session.setAttribute("data", c1);
					request.getRequestDispatcher("customer-home.jsp").forward(request, response);
				} else {
					request.setAttribute("incorrect", "password is incorrect.");
					request.getRequestDispatcher("customer-login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg1", "account is not registed");
				request.getRequestDispatcher("customer-login.jsp").forward(request, response);
			}
		}
		else if (action.equalsIgnoreCase("update")) {
			Customer c= new Customer();
			c.setId(Integer.parseInt(request.getParameter("id")));
			c.setName(request.getParameter("name"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			c.setAddress(request.getParameter("address"));
			c.setEmail(request.getParameter("email"));
			CustomerDao.updateProfile(c);
			HttpSession session = request.getSession();
			session.setAttribute("data", c);
			request.getRequestDispatcher("customer-home.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("change password")) {
			Customer c= new Customer();
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = CustomerDao.checkOldPassword(id, op);
			if (flag==true) {
				if (np.equals(cnp)) {
					CustomerDao.changePassword(id, np);
					response.sendRedirect("customer-login.jsp");
				} else {
					request.setAttribute("msg1", "new password and confirm new password is not match");
					request.getRequestDispatcher("customer-change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "old password is incorrect");
				request.getRequestDispatcher("customer-change-password.jsp").forward(request, response);
			}
		}
		else if (action.equalsIgnoreCase("GET OTP")) {
			String email = request.getParameter("email");
			boolean flag = CustomerDao.checkEmail(email);
			if (flag == true) {
				Service s = new Service();
				Random r = new Random();
				int num = r.nextInt(9999);
				System.out.println(num);
				s.sendMail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("customer-verify-otp.jsp").forward(request, response);
			}
			else {
				
			}
		}
		else if (action.equalsIgnoreCase("verify")) {
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if (otp1 == otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("customer-new-password.jsp").forward(request, response);
			} else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg","otp is not matched");
				request.getRequestDispatcher("customer-verify-otp.jsp").forward(request, response);
			}
		}
		else if (action.equalsIgnoreCase("Update Password")) {
			String email = request.getParameter("email");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			if (np.equals(cnp)) {
				CustomerDao.changeNewPasswrod(email, np);
				response.sendRedirect("customer-login.jsp");
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("msg1", "new password and confirm new password is not matched");
				request.getRequestDispatcher("customer-new-password.jsp").forward(request, response);
			}
		}
		else if (action.equalsIgnoreCase("admin customer update")) {
			Customer c = new Customer();
			c.setId(Integer.parseInt(request.getParameter("id")));
			c.setName(request.getParameter("name"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			c.setAddress(request.getParameter("address"));
			c.setEmail(request.getParameter("email"));
			CustomerDao.updateProfile(c);
			response.sendRedirect("admin-customers-list.jsp");
		}

	}
}
