package com.sys.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys.dao.PaiementDao;
import com.sys.utils.JDBCUtils;

/**
 * Servlet implementation class PayerServlet
 */
// @WebServlet("/PayerServlet")
public class PayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PayerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		//PrintWriter out = response.getWriter();
		// get the request parameter
		String idutili = request.getParameter("idutili");
		int idu = Integer.parseInt(idutili);
		String idreser = request.getParameter("idreser");
		int idr = Integer.parseInt(idreser);
		String numcarte = request.getParameter("numcarte");
		System.out.println(numcarte);
		String code = request.getParameter("code");
		int codecarte=Integer.parseInt(code);
		PaiementDao payerDao = new PaiementDao(JDBCUtils.getConnection());
		try {
			payerDao.insertPaiement(idu, numcarte, codecarte, idr);
			
		} catch (Exception e) {
			System.out.println("error of insert a paiement!");
			e.printStackTrace();
		}
		request.getRequestDispatcher("payersucces.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
