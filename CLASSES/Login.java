package org.teipir.softeng.jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;

import java.sql.SQLException;
import java.awt.event.ActionEvent;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.HeadlessException;

public class Login {
	
	private JFrame frame;
	private JTextField textFieldUsr;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 * @return 
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	Connection conn=null;
	/**
	 * Create the application.
	 */
	public Login() {
		try {
			conn=Sql_Con.dbConnector();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(350,230);
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		textFieldUsr = new JTextField();
		textFieldUsr.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldUsr.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	 
				   	  				 
				       String usr = textFieldUsr.getText();  
				       char[] pas = passwordField.getPassword(); 
				       String pwd = String.copyValueOf(pas);  
				       if(usr.length()==0 || pas.length==0){  
						      JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");} else
						try {
							if(LoginC.validate_login(usr,pwd)){
								   if(usr.charAt(0)=='a'){
									    frame.dispose();     
								        Admin.main(null);
							       }
								   else if(usr.charAt(0)=='d'){
									   frame.dispose();
									   Doc.main(null);
								   }
								   else if(usr.charAt(0)=='s'){
									   frame.dispose();	
									   Secr.main(null);				    	        
								   }
								   else if(usr.charAt(0)=='n'){
									   frame.dispose();
								   	   Nurs.main(null); 
								   }
							   
 
							}else{
							      JOptionPane.showMessageDialog(null, "ΛΑΘΟΣ USERNAME Ή PASSWORD");
							   }
							      

							   
						} catch (HeadlessException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				       textFieldUsr.setText("");
				       passwordField.setText("");
			}
				
			
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblUsername)
							.addGap(61)
							.addComponent(textFieldUsr, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPassword)
							.addGap(63)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblUsername))
						.addComponent(textFieldUsr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPassword))
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(65)
					.addComponent(btnOk))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
