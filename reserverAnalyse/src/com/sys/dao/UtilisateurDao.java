package com.sys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sys.utils.JDBCUtils;

public class UtilisateurDao {
	private PreparedStatement ps;
	private Connection connection;

	public UtilisateurDao(Connection connection) {
		this.connection = connection;
	}

	public int insertUser(String nom, String prenom, String numSecuSoci) {
		String sql = "Insert into Utilisateur(nom,prenom,numsecusoci) values (?,?,?)";
		int id = 0;
		try {
			ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setString(3, numSecuSoci);

			id = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return id;
	}
	
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
    	Connection conn = JDBCUtils.getConnection();
        UtilisateurDao user = new UtilisateurDao(conn);
        String nom = "de";
        String prenom = "mary";
        String numSecuSoci = "45904";
        user.insertUser(nom, prenom, numSecuSoci);
        
    }
}
