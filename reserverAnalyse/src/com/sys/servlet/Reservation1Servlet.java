package com.sys.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sys.dao.ReservationDao;
import com.sys.utils.JDBCUtils;

/**
 * Servlet implementation class Reservation1Servlet
 */
//@WebServlet("/Reservation1Servlet")
public class Reservation1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservation1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        //get the request parameter
		String idtype = request.getParameter("idtype");
		int idt = Integer.parseInt(idtype);
		String iduser = request.getParameter("iduser");
		int idu = Integer.parseInt(iduser);               
        System.out.println(iduser);
        ReservationDao reserDao = new ReservationDao(JDBCUtils.getConnection());
        try {
        	reserDao.insertReservation(idu,idt);
        	} catch (Exception e) {
        	System.out.println("error of insert a ureservation");
        	e.printStackTrace();
        	}
        request.getRequestDispatcher("payer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
