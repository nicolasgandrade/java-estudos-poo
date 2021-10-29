package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        //Recupera dados
        
        try {
        	//Conecta ao banco de dados
        	conn = DB.getConnection();
        	
        	//Instancia um objeto do tipo Statement
        	st = conn.createStatement();
        	//Realiza o comando SQL
        	rs = st.executeQuery("SELECT * FROM department");
        	
        	while (rs.next()) {
        		System.out.println(rs.getInt("Id") + ", " + rs.getString("name")); //O nome do campo fica entre aspas
        	}
        	
        } catch (SQLException e) {
        	e.printStackTrace();
        } finally {
        	DB.closeResultSet(rs);
        	DB.closeStatement(st);
        	DB.closeConnection();
        }
        
        //end Recupera dados

    }
}