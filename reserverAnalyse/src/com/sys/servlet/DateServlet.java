package com.sys.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys.dao.DateDao;
import com.sys.entity.DateDoc;

/**
 * Servlet implementation class DateServlet
 */
//@WebServlet("/DateServlet")
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateServlet() {
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
        String idMedecin = request.getParameter("id_Medecin");
        int id = Integer.parseInt(idMedecin);
		//int idMedecin = 1;
		System.out.println("idMedecin: " + idMedecin);
        List<DateDoc> dateDocList = DateDao.getListDoc(id);
        for (DateDoc dateDoc :dateDocList) {
        	String date = dateDoc.getDate();
        	int state = dateDoc.getState();
			System.out.println(date);
			System.out.println(state);
		}
        request.setAttribute("dateDocList",dateDocList);

        request.getRequestDispatcher("date.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
