package org.teipir.softeng.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

public class DocC {
	//Start of Nurse Search 
		 public static ResultSet Doc_Search(String amk) throws SQLException, ClassNotFoundException{
				String query = "select * from `"+amk+"`";
				PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
				ResultSet rs1=pst1.executeQuery();
				Doc.table_1.setModel(DbUtils.resultSetToTableModel(rs1));
				
				return rs1;
			}
		//End of Nurse Search
		 
		//Start of Nurse Show Patients function
			public static ResultSet DPatint(String pin) throws SQLException, ClassNotFoundException{
				String query = "select * from "+pin+"";
				PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
				ResultSet rs1=pst1.executeQuery();
				Doc.table.setModel(DbUtils.resultSetToTableModel(rs1));
				return rs1;
			}
			//End of Nurse Show Patients function
		 
		 
		
		 
		//Start of Nurse Appear
		 public static boolean Doc_Appear(String amk ) throws SQLException, ClassNotFoundException{
			 String query = "select * from patients where AMKA = '"+amk+"'";
			 PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
			 ResultSet rs1=pst1.executeQuery();
			 
			 if(rs1.next()){
				 
				Doc.textField_1.setText(rs1.getString("ΕΠΩΝΥΜΟ"));
				Doc.textField_2.setText(rs1.getString("ΟΝΟΜΑ"));
				return true;
			}else{
					return false;}
				 			 
				 }			 
			 
		//End of Nurse Appear
		 
		//Start of Doc Patient Fakelos
		 public static boolean Doc_Cr_Fak(String amk, String id, String log, String date, String doc, String com ) throws SQLException, ClassNotFoundException{			 
					
					String qry="insert into `"+amk+"` (ID,ΛΟΓΟΣ,ΗΜΕΡΟΜΗΝΙΑ,ΓΙΑΤΡΟΣ,ΣΧΟΛΙΑ) values (?,?,?,?,?)";
					PreparedStatement pst2=Sql_Con.dbConnector().prepareStatement(qry);
					pst2.setString(1,id);
					pst2.setString(2,log);
					pst2.setString(3,date);
					pst2.setString(4,doc);
					pst2.setString(5,com);
					int rs1 =0;
					if(id.length()==0||log.length()==0||date.length()==0||doc.length()==0||com.length()==0){
						JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
					}else{
					rs1 = pst2.executeUpdate();
					}
					if( rs1 == 1){
						return true;}
					else{
						return false;}
			
			
				}
		//Start of Doc Patient Fakelos


}
