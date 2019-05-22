package com.sys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sys.entity.TypeAnalyse;
import com.sys.utils.JDBCUtils;

public class TypeAnalyseDao {
	//private PreparedStatement ps;
	private Connection connection;
	
	public TypeAnalyseDao(Connection connection) {
		this.connection = connection;
	}
	
	public List<TypeAnalyse> findByDescrition(String  description) {
		List<TypeAnalyse> list=new ArrayList<TypeAnalyse>();//create a list to save analyse
		try {
		String sql  = "select * from typeanalyse where description = ?";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1,description);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			TypeAnalyse type=new TypeAnalyse();
			type.setIdType(rs.getInt(1));
			type.setDescription(rs.getString(2));
			type.setPrix(rs.getDouble(3));
		    list.add(type);
		}
		} catch (SQLException e) {

		e.printStackTrace();
		}
		return list;	
	}
	
	 public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	    	Connection conn = JDBCUtils.getConnection();
	    	TypeAnalyseDao typeDao = new TypeAnalyseDao(conn);
	        List<TypeAnalyse> list= typeDao.findByDescrition("groupsanguin");
	        for(TypeAnalyse type : list ){
	        	int id = type.getIdType();
	        	String typenom =type.getDescription();
	        	Double prix = type.getPrix();
	        	System.out.print(id);
	        	System.out.print(" ");
	        	System.out.print(typenom);
	        	System.out.print(" ");
	        	System.out.print(prix);
	        	System.out.println();

	        	}
	        
	    }

}
