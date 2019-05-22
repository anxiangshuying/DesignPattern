package com.sys.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys.dao.MedecinDao;
import com.sys.entity.Medecin;
import com.sys.utils.JDBCUtils;

/**
 * Servlet implementation class MedecinServlet
 */
//@WebServlet("/MedecinServlet")
public class MedecinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedecinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
		// get the request parameter
		String nom = request.getParameter("nom");
		System.out.println(nom);
		MedecinDao medecinDao = new MedecinDao(JDBCUtils.getConnection());
//	    List<Medecin> list = medecinDao.findByDescrition(nom);
		List<Medecin> list = medecinDao.getListAll(nom);
		 for(Medecin medecin : list ){
	        	String nom2 = medecin.getNom();
	        	String prenom = medecin.getPrenom();
	        	System.out.print(nom2);
	        	System.out.print(" ");
	        	System.out.println(prenom);

	        	}
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("doctor.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
