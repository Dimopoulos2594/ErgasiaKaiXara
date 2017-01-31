package org.teipir.softeng.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.proteanit.sql.DbUtils;

public class NursC {
	//Start of Nurse Search 
	 public static ResultSet NSecr_Search(String amk) throws SQLException, ClassNotFoundException{
			String query = "select * from `"+amk+"`";
			PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
			ResultSet rs1=pst1.executeQuery();
			Nurs.table.setModel(DbUtils.resultSetToTableModel(rs1));
				
			return rs1;
		}
	//End of Nurse Search
	 
	//Start of Nurse Show Patients function
		public static ResultSet NPatint(String pin) throws SQLException, ClassNotFoundException{
			String query = "select * from "+pin+"";
			PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
			ResultSet rs1=pst1.executeQuery();
			Nurs.table_1.setModel(DbUtils.resultSetToTableModel(rs1));
			
			return rs1;
		}
		//End of Nurse Show Patients function
	 
	 
	
	 
	//Start of Nurse Appear
	 public static boolean NSecr_Appear(String amk ) throws SQLException, ClassNotFoundException{
		 String query = "select * from patients where AMKA = '"+amk+"'";
		 PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
		 ResultSet rs1=pst1.executeQuery();
		 if(rs1.next()){			 
			 Nurs.textFieldNam.setText(rs1.getString("ΟΝΟΜΑ"));
			 Nurs.textFieldSir1.setText(rs1.getString("ΕΠΩΝΥΜΟ"));
			 return true;
		}else{
				return false;}
		 
		 }
	//End of Nurse Appear
	 
	 
	
	  
		 
}
	 
	 
	




