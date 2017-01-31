package org.teipir.softeng.jdbc;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

public class AdminC {
	
	
	
	//Start of ADMIN Update function
		 public static boolean Admin_upt(String usr1,String pas1,String amk1) throws SQLException, Exception {
			
				String qry="Update users set username='"+usr1+"' ,password='"+pas1+"' , AMKA='"+amk1+"' where AMKA='"+amk1+"' ";
				
				PreparedStatement pst=Sql_Con.dbConnector().prepareStatement(qry);
						JOptionPane.showConfirmDialog(null, "ΑΠΟΘΗΚΕΥΣΗ?");
				int rs = pst.executeUpdate();
				if(rs == 1){
					return true;}
				else{
					
					return false;}			
		}
		//End of ADMIN Update function 
		 
		 
		//Start of ADMIN Insert function 
		public static boolean Admin_add(String usr1,String pas1,String amk1) throws SQLException, Exception{
			
			String qry="insert into users (username,password,AMKA) values (?,?,?)";
			PreparedStatement pst2=Sql_Con.dbConnector().prepareStatement(qry);
			pst2.setString(1,usr1);
			pst2.setString(2,pas1);
			pst2.setString(3,amk1);
			int rs1 =0;
			if(usr1.length()==0||pas1.length()==0||amk1.length()==0 ){
				JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
			}else if(usr1.charAt(0)=='a'||usr1.charAt(0)=='d'||usr1.charAt(0)=='n'||usr1.charAt(0)=='s' ){
			
			
				JOptionPane.showConfirmDialog(null, "ΑΠΟΘΗΚΕΥΣΗ?");
				rs1 = pst2.executeUpdate();	
			}
			else{
			JOptionPane.showMessageDialog(null, "ΤΟ USERNAME ΔΕΝ ΞΕΚΙΝΑ ΜΕ a ή d ή n ή s");
			}		
			if( rs1 == 1){
				return true;}
			else{
				return false;}		
		}
		//End of ADMIN Insert function 
		
		
		//Start of ADMIN Show Users function
		public static ResultSet Admin_users() throws SQLException, Exception{
			String query = "select * from users";
			PreparedStatement pst1 = Sql_Con.dbConnector().prepareStatement(query);
			ResultSet rs1=pst1.executeQuery();
			Admin.table.setModel(DbUtils.resultSetToTableModel(rs1));
			
			return rs1;
		}
		//End of ADMIN Show Users function
		
		
		//Start of ADMIN Delete Users function
		public static boolean Admin_Dlt(String amk) throws ClassNotFoundException, SQLException {
			
		String query="DELETE FROM users where AMKA='"+amk+"' ";
		int rs1 = 0;
		PreparedStatement pst=Sql_Con.dbConnector().prepareStatement(query);
		rs1=pst.executeUpdate();
		
			JOptionPane.showConfirmDialog(null, "ΔΙΑΓΡΑΦΗ?");
			
		
		if( rs1 == 1){
			return true;}
		else{
			JOptionPane.showMessageDialog(null, "ΔΕΝ ΥΠΑΡΧΕΙ Ο ΧΡΗΣΤΗΣ");
			return false;}
		}
		//End of ADMIN Delete Users function

}
