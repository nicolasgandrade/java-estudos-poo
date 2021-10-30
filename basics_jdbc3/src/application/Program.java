package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {
    public static void main(String[] args) {

        //Atualiza dados
    	
    	Connection conn = null;
    	PreparedStatement st = null;
    	
    	try {
    		conn = DB.getConnection();
    		
    		st = conn.prepareStatement(
    				"UPDATE seller "
    				+ "SET BaseSalary = BaseSalary + ? "
    				+ "WHERE "
    				+ "(DepartmentId = ?)"
    				);
    		
    		st.setDouble(1, 200);
    		st.setInt(2, 2);
    		
    		int rowsAffected = st.executeUpdate();
    		
    		System.out.println("Done! Rows affected: " + rowsAffected);
    	} catch (SQLException e) {
    		e.getStackTrace();
    	} finally {
    		DB.closeStatement(st);
    		DB.closeConnection();
    	}
    	
    	//end Atualiza dados
    	
    }
}