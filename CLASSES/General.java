package org.teipir.softeng.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.proteanit.sql.DbUtils;

public class General {
	//Start of refresh function
		static ResultSet refresh() throws ClassNotFoundException, SQLException {
			
				String query = "select * from users";
				PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
				ResultSet rs1=pst1.executeQuery();
				Admin.table.setModel(DbUtils.resultSetToTableModel(rs1));
				
					return rs1;
						
			
				
			
		}
		//End of refresh function
		
		
		//Start of refresh patients function
		static ResultSet refresh2() throws ClassNotFoundException, SQLException {
			
				String query = "select * from patients";
				PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
				ResultSet rs1=pst1.executeQuery();
				Secr.table.setModel(DbUtils.resultSetToTableModel(rs1));
				return rs1;
								
			
		}
		//End of refresh patients function
		
		//Start of refresh amk function
			static ResultSet refresh3(String amk) throws SQLException, ClassNotFoundException  {
				
					String query = "select * from `"+amk+"`";
					PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
					ResultSet rs1=pst1.executeQuery();
					Secr.table1.setModel(DbUtils.resultSetToTableModel(rs1));
					return rs1;				
				
			}
			//End of refresh amk function
			
			
			//Start Valid for Search
			 static boolean validate_Input(String amk) throws ClassNotFoundException, SQLException {
					PreparedStatement pst;
					
						pst = Sql_Con.dbConnector().prepareStatement("Select * from patients where AMKA=?");
						pst.setString(1,  amk);
						ResultSet rs = pst.executeQuery();
						if(rs.next())
							return true;
						else
							return false;
					
							
					
				}
			//End Valid for Search
			
			 
			//Start Valid for Upt
			 static boolean validate_Upt(String amk) throws ClassNotFoundException, SQLException {					    					
					    PreparedStatement pst = Sql_Con.dbConnector().prepareStatement("Select * from users where AMKA=?");
						pst.setString(3, amk);						
						ResultSet rs = pst.executeQuery();
						if(rs.next())
							return true;
						else
							return false;					
				}
			//End Valid for Upt
			 

}
