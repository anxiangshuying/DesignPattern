package com.sys.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys.dao.UtilisateurDao;
import com.sys.utils.JDBCUtils;


/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UtilisateurServlet")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        //get the request parameter
        String nom = request.getParameter("nom");               
        System.out.println(nom);
        String prenom = request.getParameter("prenom");
        String numSecuSoci = request.getParameter("numSecuSoci");
        UtilisateurDao userDao = new UtilisateurDao(JDBCUtils.getConnection());
        try {
        	userDao.insertUser(nom, prenom, numSecuSoci);
        	} catch (Exception e) {
        	System.out.println("error of insert a user");
        	e.printStackTrace();
        	}
        request.getRequestDispatcher("doctor.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	


}
