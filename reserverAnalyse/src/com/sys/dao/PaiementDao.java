package com.sys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sys.utils.JDBCUtils;

public class PaiementDao {
	private PreparedStatement ps;
	private Connection connection;
	
	public PaiementDao(Connection connection){
		this.connection = connection;
	}
	
	public void insertPaiement(int idutili,String numcarte,int code,int idreser){
		String sql = "Insert into Paiement(idutili,numcarte,code,payerdate,idreser) values (?,?,?,?,?)";
		
		try {
			ps = connection.prepareStatement(sql);			
			ps.setInt(1, idutili);
			ps.setString(2, numcarte);
			ps.setInt(3, code);
			ps.setDate(4, new Date(System.currentTimeMillis()));
			ps.setInt(5, idreser);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
    	Connection conn = JDBCUtils.getConnection();
        PaiementDao payer = new PaiementDao(conn);
        payer.insertPaiement(1, "7600065277188", 786,1);
        System.out.print("successfully insert paiement!");
    }

}
