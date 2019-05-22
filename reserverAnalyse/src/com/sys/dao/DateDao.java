package com.sys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sys.entity.DateDoc;
import com.sys.utils.JDBCUtils;

public class DateDao {
	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement preStmt;
	private static ResultSet res;
	private static JDBCUtils db = new JDBCUtils();
	
	public static List<DateDoc> getListDoc(int id) {
		String sql = "SELECT dateDoc, statut from date where idMedecin = ?";
		List<DateDoc> list = new ArrayList<DateDoc>();
		conn = db.getConnection();
		try {		
			preStmt = conn.prepareStatement(sql);
			preStmt.setInt(1, id);
			res = preStmt.executeQuery();
			while (res.next()) {
				String date= res.getString("dateDoc");
				int state = res.getInt("statut");
				
				DateDoc dateDoc = new DateDoc(); 
				dateDoc.setDate(date);
				dateDoc.setState(state);

				list.add(dateDoc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
