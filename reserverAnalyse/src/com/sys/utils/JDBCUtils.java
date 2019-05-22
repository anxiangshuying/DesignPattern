package com.sys.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author lhj
 *
 */
public class JDBCUtils {
	//name
    private static final String USERNAME = "root";  
    //password
    private static final String PASSWORD = "";  
    //driver 
    private static final String DRIVER = "com.mysql.jdbc.Driver";  
    //adresse  
    private static final String URL = "jdbc:mysql://localhost:3306/reservation?useSSL=false";  
    private static Connection connection;  
    private PreparedStatement pstmt;  
    private ResultSet resultSet;
    
    public JDBCUtils() {  
        // TODO Auto-generated constructor stub  
        try{  
            Class.forName(DRIVER);  
            System.out.println("connection success ！");  
  
        }catch(Exception e){  
            System.out.println(e.getMessage());
        }  
    }
    /** 
     * get connection 
     * @return 
     */  
    public static Connection getConnection(){  
        try {  
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
            System.out.println(e.getMessage());
        }  
        return connection;  
    }  
    
    /** 
     * release the connection 
     */  
    public void releaseConn(){  
        if(resultSet != null){  
            try{  
                resultSet.close();  
            }catch(SQLException e){  
                e.printStackTrace();  
            }  
        }  
    }  
    
    //test for jdbc connection
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
       
        Connection conn=JDBCUtils.getConnection();
        
        Statement st=conn.createStatement();
        
        ResultSet rs=st.executeQuery("select * from utilisateur");
        
        while(rs.next()){
            System.out.println(rs.getInt("idutili")+ " " + rs.getString("Nom")+" "
                          +rs.getString("prenom")+" "+rs.getString("numSecuSoci"));
        }
        
        rs.close();
        st.close();
        conn.close();
    }
    
    
    
}
