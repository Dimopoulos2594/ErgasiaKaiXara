package org.teipir.softeng.jdbc;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class SuperTest {

	@Test
	public void testAdmin_upt() throws SQLException, Exception {
		assertEquals("Result",true,AdminC.Admin_upt("admin01", "98746", "2587"));
		assertEquals("Result",false,AdminC.Admin_upt("admin03", "98746", "287"));
		assertEquals("Result",false,AdminC.Admin_upt("", "", ""));
	}

	@Test
	public void testAdmin_add() throws SQLException, Exception {
		assertEquals("Result",true,AdminC.Admin_add("secr03", "89451", "9871"));
		assertEquals("Result",false,AdminC.Admin_add("ecr03", "89451", "9871"));
		assertEquals("Result",false,AdminC.Admin_add("", "", ""));
		
	}

	@Test
	public void testAdmin_users() throws SQLException, Exception {
		assertEquals("Result",true,AdminC.Admin_users().next());
	}

	@Test
	public void testAdmin_Dlt() throws SQLException, Exception {
		assertEquals("Result",true,AdminC.Admin_Dlt("9871"));
		assertEquals("Result",false,AdminC.Admin_Dlt("964"));
		assertEquals("Result",false,AdminC.Admin_Dlt(""));
	}
	
	@Test
	public void testPatint() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,SecrC.Patint("patients").next());		
	}	
	

	@Test
	public void testSecr_Cr_Fak() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,SecrC.Secr_Cr_Fak("3216", "5641", "ΕΙΣΑΓΩΓΗ", "27/02/2016", "ΔΡΑΚΟΠΟΥΛΟΣ", "ΚΑΝΕΝΑ ΣΧΟΛΙΟ"));
		assertEquals("Result",false,SecrC.Secr_Cr_Fak("3216", "", "", "", "", ""));
	}
	
	@Test
	public void testSecr_Search() throws ClassNotFoundException, SQLException {
		
		assertEquals("Result",true,SecrC.Secr_Search("3216").next());
		
	} 
	
	@Test
	public void testSecr_Appear() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,SecrC.Secr_Appear("3216"));
		assertEquals("Result",false,SecrC.Secr_Appear("asfgh"));	
		
	}
	
	@Test
	public void testSecr_crt() throws ClassNotFoundException, SQLException {
		assertEquals("Result",false,SecrC.Secr_crt("79844"));		
	}
	
	@Test
	public void testSecr_upt() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,SecrC.Secr_upt("7984", "ΒΑΤΙΣΤΑΣ", "ΚΟΥΝΤΟΥΡΗΣ"));
		assertEquals("Result",false,SecrC.Secr_upt("", "ΒΑΤΙΣΤΑΣ", "ΚΟΥΝΤΟΥΡΗΣ"));
		
	}
	
	@Test
	public void testSecr_add() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,SecrC.Secr_add("7984", "ΒΑΤΙΣΤΑΣ", "ΚΟΥΝΤΟΥΡΗΣ"));
		assertEquals("Result",false,SecrC.Secr_add("", "", ""));
	}
	
	@Test
	public void testDbConnector() throws ClassNotFoundException, SQLException {
		equals(Sql_Con.dbConnector());
	}
	
	@Test
	public void testNSecr_Search() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,NursC.NSecr_Search("3216").next());
	}

	@Test
	public void testNPatint() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,NursC.NPatint("patients").next());
	}

	@Test
	public void testNSecr_Appear() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,NursC.NSecr_Appear("3216"));
		assertEquals("Result",false,NursC.NSecr_Appear("asfgh"));
	}
	
	@Test
	public void testValidate_login() throws SQLException, ClassNotFoundException {
		assertEquals("Result",true,LoginC.validate_login("admin01", "98746"));
		assertEquals("Result",false,LoginC.validate_login("admin01", "946"));
		assertEquals("Result",false,LoginC.validate_login("", ""));
	}
	
	@Test
	public void testDoc_Search() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,DocC.Doc_Search("3216").next());
	}

	@Test
	public void testDPatint() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,DocC.DPatint("patients").next());
	}

	@Test
	public void testDoc_Appear() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,DocC.Doc_Appear("3216"));
		assertEquals("Result",false,DocC.Doc_Appear("asfgh"));
	}

	@Test
	public void testDoc_Cr_Fak() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,DocC.Doc_Cr_Fak("3216", "5661", "ΕΙΣΑΓΩΓΗ", "27/02/2016", "ΔΡΑΚΟΠΟΥΛΟΣ", "ΚΑΝΕΝΑ ΣΧΟΛΙΟ"));
		assertEquals("Result",false,DocC.Doc_Cr_Fak("3216", "", "", "", "", ""));
	}
	
	@Test
	public void testRefresh() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,General.refresh().next());
	}

	@Test
	public void testRefresh2() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,General.refresh2().next());
	}

	@Test
	public void testRefresh3() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,General.refresh3("3216").next());
	}

	@Test
	public void testValidate_Input() throws ClassNotFoundException, SQLException {
		assertEquals("Result",true,General.validate_Input("3216"));
	}

	@Test
	public void testValidate_Upt() throws ClassNotFoundException, SQLException {
		assertEquals("Result",false,General.validate_Input("987546"));
	}

}
