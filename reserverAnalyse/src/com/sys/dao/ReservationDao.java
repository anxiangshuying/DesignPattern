package com.sys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import com.sys.utils.JDBCUtils;

public class ReservationDao {
	private PreparedStatement ps;
	private Statement s;
	private Connection connection;
	
	public ReservationDao(Connection connection) {
		this.connection = connection;
	}
	
	public Date selectDate() {
		String sql = "Select max(date) from Reservation";
		Date date = null;
		try {
			s = connection.createStatement();
			ResultSet rs = s.executeQuery(sql);

			if (rs.next()) {
				date = rs.getDate(1);
			} else {
				date = new Date(System.currentTimeMillis() + (24 * 3600 * 1000));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return date;
	}

	public int insertReservation(int userId, int analyseId) {
		String sql = "Insert into Reservation(idutili,idtype,date) values (?,?,?)";
		 Timestamp date = new Timestamp(System.currentTimeMillis());
		int id = 0;
		try {
			ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setInt(1, userId);
			ps.setInt(2, analyseId);
			ps.setTimestamp(3, date);

			id = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return id;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException  {
    	Connection conn = JDBCUtils.getConnection();
    	ReservationDao reser = new ReservationDao(conn);
        reser.insertReservation(2, 1);
        System.out.print("successfully insert paiement!");
        
	}
	
	
	
}
