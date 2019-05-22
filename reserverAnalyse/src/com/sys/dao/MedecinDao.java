package com.sys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





import com.sys.entity.Medecin;
import com.sys.entity.TypeAnalyse;
import com.sys.utils.JDBCUtils;

public class MedecinDao {
	
	//private PreparedStatement ps;
	private static Connection connection;

	public MedecinDao(Connection connection) {
		this.connection = connection;
	}
	
	
	public List<Medecin> getListAll(String nom) {
		List<Medecin> list=new ArrayList<Medecin>();//create a list to save medecin
		try {
		String sql="select * from medecin where nom = ?";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1, nom);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Medecin medecin=new Medecin();
			medecin.setIdMedecin(rs.getInt(1));
			medecin.setNom(rs.getString(2));
			medecin.setPrenom(rs.getString(3));
			medecin.setNumSecuSoci(rs.getString(4));
		    list.add(medecin);
		}
		} catch (SQLException e) {

		e.printStackTrace();
		}
		return list;	
	}
	
	public List<Medecin> findByDescrition(String  description) {
		List<Medecin> list=new ArrayList<Medecin>();//create a list to save medecin
		try {
//		String sql1 = "select * from typeanalyse where description = ?";
//        TypeAnalyse analyse = qr.query(sql1, new BeanHandler<TypeAnalyse>(TypeAnalyse.class), description);
//       analyse.setDescription(description);
		String sql="select m.idMedecin,m.nom,m.prenom,t.description "
				+ "from medecin m left join autorisation a on(a.idmedecin=m.idmedecin) "
				+ "left join typeanalyse t on (t.idtype = a.idtype) where description=?";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1,description);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Medecin medecin=new Medecin();
			medecin.setIdMedecin(rs.getInt(1));
			medecin.setNom(rs.getString(2));
			medecin.setPrenom(rs.getString(3));
			//medecin.getAnalyse().setDescription(rs.getString(4));
		    list.add(medecin);
		}
		} catch (SQLException e) {

		e.printStackTrace();
		}
		return list;	
	}
	
	 public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	    	Connection conn = JDBCUtils.getConnection();
	    	MedecinDao medecin = new MedecinDao(conn);
	        List<Medecin> list = medecin.findByDescrition("groupsanguin");
	        for(Medecin med : list ){
	        	String nom = (String) med.getNom();
	        	//String type = med.getAnalyse().getDescription();
	        	System.out.println(nom);
	        	//System.out.println(type);

	        	}
	        System.out.println("~~~~~~~~~~");
	        List<Medecin> list2 = medecin.getListAll("li");
	        for(Medecin med : list2 ){
	        	String nom = (String) med.getNom();
	        	String prenom = med.getPrenom();
	        	//Class<TypeAnalyse> analyse = (Class<TypeAnalyse>) med.getAnalyse().getClass();
	        	System.out.print(nom);
	        	System.out.print(" ");
	        	System.out.print(prenom);
	        	System.out.println();

	        	}
	        
	        
	    }

}
