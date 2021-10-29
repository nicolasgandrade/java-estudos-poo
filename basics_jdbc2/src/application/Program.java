package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
    public static void main(String[] args) {

        //Insere dados
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	
    	Connection conn = null;
    	PreparedStatement st = null;
    	try {
    		
    		conn = DB.getConnection();
    		
    		st = conn.prepareStatement(
    				"INSERT INTO seller "
    				+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
    				+ "VALUES "
    				+ "(?, ?, ?, ?, ?)",
    				Statement.RETURN_GENERATED_KEYS
    				);
    		
    		st.setString(1, "Carl Purple");//Troca a primeira (1) interrogação pelo valor entre aspas
    		st.setString(2, "carl@gmail.com");
    		st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
    		st.setDouble(4, 3000);
    		st.setInt(5, 4);
    		
    		int rowsAffected = st.executeUpdate();//Executa o comando

    		if (rowsAffected > 0) {
    			ResultSet rs = st.getGeneratedKeys();
    			
    			while (rs.next()) {
    				int id = rs.getInt(1);//Puxa o valor da coluna 1 (1);
    				System.out.println("Done! Id = " + id);
    			}
    		} else {
    			System.out.println("No rows affected");
    		}
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} catch (ParseException e) {
    		e.printStackTrace();
    	} finally {
    		DB.closeStatement(st);
    		DB.closeConnection();
    	}
    	
    	//end Insere dados
    	
    }
}