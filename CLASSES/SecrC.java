package org.teipir.softeng.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

public class SecrC {
	//Start of SECR Show Patients function
			public static ResultSet Patint(String pin) throws SQLException, ClassNotFoundException{
				String query = "select * from "+pin+"";
				PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
				ResultSet rs1=pst1.executeQuery();
				Secr.table.setModel(DbUtils.resultSetToTableModel(rs1));
				return rs1;
			}
			//End of SECR Show Patients function
			
			
			//Start of Secr add function
			public static boolean Secr_add(String amk,String nam,String sir) throws SQLException, ClassNotFoundException{
				
				String qry="insert into patients (AMKA,ΟΝΟΜΑ,ΕΠΩΝΥΜΟ) values (?,?,?)";
				PreparedStatement pst2=Sql_Con.dbConnector().prepareStatement(qry);
				pst2.setString(1,amk);
				pst2.setString(2,nam);
				pst2.setString(3,sir);
				int rs1 =0;
				if(amk.length()==0||nam.length()==0||sir.length()==0 ){
					JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
				}else{
				rs1 = pst2.executeUpdate();
				}
				if( rs1 == 1){
					return true;}
				else{
					return false;}
		
		
			}
			//End of Secr add function
					
			
			//Start of Secr Update function 
			 public static boolean Secr_upt(String amk,String nam,String sir) throws SQLException, ClassNotFoundException {
				
					String qry="Update patients set AMKA='"+amk+"' ,ΟΝΟΜΑ='"+nam+"' , ΕΠΩΝΥΜΟ='"+sir+"' where AMKA='"+amk+"' ";
					PreparedStatement pst=Sql_Con.dbConnector().prepareStatement(qry);
					JOptionPane.showConfirmDialog(null, "ΑΠΟΘΗΚΕΥΣΗ?");
					int rs = pst.executeUpdate();
					if(rs == 1){
						return true;}
					else{
						
						return false;}			
			}
			//End of Secr Update function 
			 
			 
			 //Start of Secr Create a Table
			 public static boolean Secr_crt(String amk) throws SQLException, ClassNotFoundException {				 	
					String qry="CREATE TABLE `"+amk+"` ("
					+ "ID varchar(64), "
					+ "ΛΟΓΟΣ varchar(40), " 
					+ "ΗΜΕΡΟΜΗΝΙΑ varchar(40), " 
					+ "ΓΙΑΤΡΟΣ varchar(40), " 
					+ "ΣΧΟΛΙΑ varchar(255)," + "PRIMARY KEY(ID)"
					+ ")";
					PreparedStatement pst2=Sql_Con.dbConnector().prepareStatement(qry);						
					int rs1 = pst2.executeUpdate();					
					if( rs1 == 1){
						return true;}
					else{
						return false;}
								
			}
			//End of Secr Create a Table
			 
			 
			 //Start of Secr Search 
			 public static ResultSet Secr_Search(String amk) throws SQLException, ClassNotFoundException{
					String query = "select ID, ΛΟΓΟΣ, ΗΜΕΡΟΜΗΝΙΑ, ΓΙΑΤΡΟΣ, ΣΧΟΛΙΑ from `"+amk+"`";
					PreparedStatement pst1 =Sql_Con.dbConnector().prepareStatement(query);
					ResultSet rs1=pst1.executeQuery();
					Secr.table1.setModel(DbUtils.resultSetToTableModel(rs1));
					
					return rs1;
					
				}
			//End of Secr Search
			 
			//Start of Secr Appear
			 public static boolean Secr_Appear(String amk ) throws SQLException, ClassNotFoundException{
				 String query = "select * from patients where AMKA = '"+amk+"'";
				 PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
				 ResultSet rs1=pst1.executeQuery();
				 if(rs1.next()){
					Secr.textField1.setText(rs1.getString("ΕΠΩΝΥΜΟ"));
					Secr.textField_11.setText(rs1.getString("ΟΝΟΜΑ"));
						return true;}
					else{
						return false;}
				 }
				 
			//End of Secr Appear
			
			//Start of Secr Patient Fakelos
			 public static boolean Secr_Cr_Fak(String amk, String id, String log, String date, String doc, String com ) throws SQLException, ClassNotFoundException{			 
				 		int rs1 =0;
						String qry="insert into `"+amk+"` (ID,ΛΟΓΟΣ,ΗΜΕΡΟΜΗΝΙΑ,ΓΙΑΤΡΟΣ,ΣΧΟΛΙΑ) values (?,?,?,?,?)";
						PreparedStatement pst2=Sql_Con.dbConnector().prepareStatement(qry);
						pst2.setString(1,id);
						pst2.setString(2,log);
						pst2.setString(3,date);
						pst2.setString(4,doc); 
						pst2.setString(5,com);
						
						if(date.length()==0||id.length()==0||log.length()==0||doc.length()==0||com.length()==0 ){
							JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
						}else{
						rs1 = pst2.executeUpdate();
						}
						if( rs1 == 1){
							return true;}
						else{
							return false;}
				
				
					}
			//Start of Secr Patient Fakelos			 


}
