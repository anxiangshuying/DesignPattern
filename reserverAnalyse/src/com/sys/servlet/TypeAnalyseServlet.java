package com.sys.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys.dao.TypeAnalyseDao;
import com.sys.entity.TypeAnalyse;
import com.sys.utils.JDBCUtils;

/**
 * Servlet implementation class TypeAnalyseServlet
 */
//@WebServlet("/TypeAnalyseServlet")
public class TypeAnalyseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeAnalyseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
		// get the request parameter
		String nom = request.getParameter("nom");
		System.out.println(nom);
		TypeAnalyseDao typeDao = new TypeAnalyseDao(JDBCUtils.getConnection());
		List<TypeAnalyse> list = typeDao.findByDescrition(nom);
		 for(TypeAnalyse type : list ){
	        	int id = type.getIdType();
	            System.out.print(id);
	            System.out.print(" ");
	        	String des = type.getDescription();
	        	System.out.print(des);
	        	System.out.print(" ");
	        	double prix = type.getPrix();
	        	System.out.println(prix);

	        	}
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("typelist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
