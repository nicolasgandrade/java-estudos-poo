package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {
    public static void main(String[] args) {

        //Deleta dados
    	
    	Connection conn = null;
    	Statement st = null;
    	
    	try {
    		conn = DB.getConnection();
    		
    		//Evidencia que não é para confirmar transações automaticamente
    		conn.setAutoCommit(false);
    		
    		st = conn.createStatement();
    		
    		int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
    		
//    		//Simulando um problema no meio da transação
//    		int x = 1;
//    		if (x < 2) {
//    			throw new SQLException("Fake error");
//    		}
    		
    		int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
    		
    		//Agora sim está confirmado e a trasação terminou 
    		conn.commit();
    		
    		System.out.println("rows1 = " + rows1);
    		System.out.println("rows2 = " + rows2);

    		
    	} catch (SQLException e) {
    		try {
    			//Caso aconteça erro, ele desfaz as alterações
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to roll back, caused by" + e.getMessage());
			}
    	} finally {
    		DB.closeStatement(st);
    		DB.closeConnection();
    	}
    	
    	//end Deleta dados
    	
    }
}