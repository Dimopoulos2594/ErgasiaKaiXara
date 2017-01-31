package org.teipir.softeng.jdbc;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;


public class LoginC {     
    
// Start of login function
	 static boolean validate_login(String username,String password) throws SQLException, ClassNotFoundException {
		PreparedStatement pst;
		
		
			pst = Sql_Con.dbConnector().prepareStatement("Select * from users where username=? and password=?");
			pst.setString(1,  username);
			pst.setString(2,  password);
			
			ResultSet rs = pst.executeQuery();
			
			
			 
			if(rs.next()){
				return true;}
			else{
				return false;}
			
				
		
	}
// End of login function 
	
}
	
		 
		 
