package org.teipir.softeng.jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


import java.awt.event.ActionListener;

import java.sql.Connection;

import java.sql.SQLException;
import java.awt.event.ActionEvent;


import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Color;
import javax.swing.JTextPane;

public class Secr {

	private JFrame frmHospitalSecretary;
	private JTextField textFieldSearch;
	static JTable table;
	static JTable table1;
	static JTextField textField1;
	static JTextField textField_11;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secr window = new Secr();
					window.frmHospitalSecretary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn=null;
	private JTextField textFieldAMKA;
	private JTextField txtSirname;
	private JTextField textFieldNam;
	private JTextField textFieldAmka2;
	private JTextField textFieldSir2;
	private JTextField textFieldName2;
	private JTextField textFieldID;
	private JTextField textFieldDate;
	private JTextField textFieldDoc;
	private JTextField textFieldLog;
	

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Secr() throws ClassNotFoundException, SQLException {
		conn=Sql_Con.dbConnector();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHospitalSecretary = new JFrame();
		frmHospitalSecretary.setTitle("HOSPITAL SECRETARY");
		frmHospitalSecretary.setBounds(100, 100, 450, 300);
		frmHospitalSecretary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHospitalSecretary.getContentPane().setLayout(null);
		frmHospitalSecretary.setSize(800, 600);
		frmHospitalSecretary.setResizable(false);
		
		JPanel panelPatients = new JPanel();
		panelPatients.setBounds(0, 0, 794, 571);
		
		JPanel panelMa = new JPanel();
		panelMa.setBounds(10, 403, 774, 157);
		
		JPanel panelUpt = new JPanel();
		panelUpt.setBounds(10, 403, 774, 157);
		
		JPanel panelCrt = new JPanel();
		panelCrt.setBounds(10, 403, 774, 157);
		
		JPanel panelCrtP = new JPanel();
		panelCrtP.setBounds(0, 0, 794, 571);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 794, 571);
		
		JPanel panelPat1 = new JPanel();
		panelPat1.setBounds(0, 0, 794, 571);
		
		panelMenu.setVisible(true);
		panelPatients.setVisible(false);
		panelMa.setVisible(false);
		panelCrt.setVisible(false);
		panelUpt.setVisible(false);
		panelCrtP.setVisible(false);
		panelPat1.setVisible(false);
		
		
		
		
		
		frmHospitalSecretary.getContentPane().add(panelCrtP);
		panelCrtP.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("\u039D\u0395\u0391 \u0395\u03A0\u0399\u03A3\u039A\u0395\u03A8\u0397");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(297, 11, 200, 30);
		panelCrtP.add(lblNewLabel_5);
		
		JLabel label_4 = new JLabel("\u0391\u03A1\u0399\u0398\u039C\u039F\u03A3 \u0395\u039E\u0395\u03A4\u0391\u03A3\u0397\u03A3");
		label_4.setBounds(10, 60, 150, 30);
		panelCrtP.add(label_4);
		
		JLabel label_5 = new JLabel("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391");
		label_5.setBounds(10, 101, 150, 30);
		panelCrtP.add(label_5);
		
		JLabel label_6 = new JLabel("\u039B\u039F\u0393\u039F\u03A3");
		label_6.setBounds(342, 60, 150, 30);
		panelCrtP.add(label_6);
		
		JLabel label_7 = new JLabel("\u0393\u0399\u0391\u03A4\u03A1\u039F\u03A3");
		label_7.setBounds(342, 101, 150, 30);
		panelCrtP.add(label_7);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(170, 60, 150, 30);
		panelCrtP.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldDate = new JTextField();
		textFieldDate.setColumns(10);
		textFieldDate.setBounds(170, 101, 150, 30);
		panelCrtP.add(textFieldDate);
		
		textFieldDoc = new JTextField();
		textFieldDoc.setColumns(10);
		textFieldDoc.setBounds(502, 101, 150, 30);
		panelCrtP.add(textFieldDoc);
		
		textFieldLog = new JTextField();
		textFieldLog.setColumns(10);
		textFieldLog.setBounds(502, 60, 150, 30);
		panelCrtP.add(textFieldLog);
		
		JLabel label_8 = new JLabel("\u03A3\u03A7\u039F\u039B\u0399\u0391");
		label_8.setBounds(10, 142, 150, 30);
		panelCrtP.add(label_8);
		
		JTextPane textPane1 = new JTextPane();
		textPane1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textPane1.setBounds(10, 183, 774, 222);
		panelCrtP.add(textPane1);
		
		JButton btnNewSave = new JButton("\u0391\u03A0\u039F\u0398\u0397\u039A\u0395\u03A5\u03A3\u0397");
		btnNewSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textFieldID.getText();
				String date = textFieldDate.getText();
				String amk = textFieldSearch.getText();
				String doc = textFieldDoc.getText();
				String log = textFieldLog.getText();
				String com = textPane1.getText();
				
				try {
					SecrC.Secr_Cr_Fak(amk, id, log, date, doc, com);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				textFieldID.setText(""); 
				textFieldDate.setText("");
				textFieldSearch.setText("");
				textFieldDoc.setText("");
				textFieldLog.setText("");
				textPane1.setText("");
				panelCrtP.setVisible(false);
				panelPat1.setVisible(true);
				try {
					General.refresh3(amk);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewSave.setBounds(634, 520, 150, 30);
		panelCrtP.add(btnNewSave);
		
		JButton button_2Bck = new JButton("\u03A0\u0399\u03A3\u03A9");
		button_2Bck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPat1.setVisible(true);
				panelCrtP.setVisible(false);
			}
		});
		button_2Bck.setBounds(10, 520, 150, 30);
		panelCrtP.add(button_2Bck);
		
		
		
		
		
		
		frmHospitalSecretary.getContentPane().add(panelPat1);
		panelPat1.setLayout(null);
		
		JButton btnbak = new JButton("\u03A0\u0399\u03A3\u03A9");
		btnbak.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnbak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setVisible(true);
				panelPat1.setVisible(false);
				textFieldSearch.setText("");			
			}
		});
		btnbak.setBounds(624, 11, 150, 45);
		panelPat1.add(btnbak);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 94, 774, 322);
		panelPat1.add(scrollPane1);
		
		table1 = new JTable();
		table1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		scrollPane1.setViewportView(table1);
		
		JLabel lblNewLabel_4 = new JLabel("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(325, 11, 150, 45);
		panelPat1.add(lblNewLabel_4);
		
		JPanel panelAnMen = new JPanel();
		panelAnMen.setBounds(10, 422, 774, 138);
		panelPat1.add(panelAnMen);
		panelAnMen.setLayout(null);
		
		JButton button_1 = new JButton("ΝΕΑ ΕΠΙΣΚΕΨΗ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelCrtP.setVisible(true);
				panelPat1.setVisible(false);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(313, 53, 150, 30);
		panelAnMen.add(button_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 53, 150, 30);
		panelPat1.add(scrollPane_1);
		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setForeground(Color.BLACK);
		textField1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		scrollPane_1.setViewportView(textField1);
		textField1.setColumns(10);
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(165, 53, 150, 30);
		panelPat1.add(scrollPane_2);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setForeground(Color.BLACK);
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		scrollPane_2.setViewportView(textField_11);
		textField_11.setColumns(10);
		
		
		
		
		frmHospitalSecretary.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		table1.addMouseListener(new java.awt.event.MouseAdapter() /*       */
        {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				int row=table1.rowAtPoint(e.getPoint());
				
				JOptionPane.showMessageDialog(null,table1.getValueAt(row,4).toString());
				
			}
        }
				);
		
				
		JButton btnPatients = new JButton("\u0391\u03A3\u0398\u0395\u039D\u0395\u0399\u03A3");
		btnPatients.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setVisible(false);
				panelPatients.setVisible(true);
				panelMa.setVisible(true);
				String pin = "patients"; 
				try{				
					SecrC.Patint(pin);			
				}catch(Exception e) {
					e.printStackTrace();
					
				}
			}
		});
		btnPatients.setBounds(10, 11, 150, 45);
		panelMenu.add(btnPatients);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldSearch.setBounds(624, 11, 150, 30);
		panelMenu.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton buttonSearch = new JButton("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397");
		buttonSearch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				String amk = textFieldSearch.getText();
				if(amk.length()==0){ 
					JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
				} else
					try {
						if(General.validate_Input(amk)){
								
						try {
							SecrC.Secr_Search(amk);					
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
						try {
							SecrC.Secr_Appear(amk);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						panelMenu.setVisible(false);
						panelPat1.setVisible(true);
						}else{
							JOptionPane.showMessageDialog(null, "ΔΕΝ ΥΠΑΡΧΕΙ ΑΣΘΕΝΗΣ");
						}
					} catch (HeadlessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				 
				
			}
		});
		buttonSearch.setBounds(624, 52, 150, 30);
		panelMenu.add(buttonSearch);
		
		JButton buttonExit = new JButton("\u0395\u039E\u039F\u0394\u039F\u03A3");
		buttonExit.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHospitalSecretary.dispose();
				Login.main(null);				
			}
		});
		buttonExit.setBounds(325, 505, 150, 45);
		panelMenu.add(buttonExit);
		
		JLabel lblNewLabel = new JLabel("\u039C\u0395\u039D\u039F\u03A5");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(310, 11, 150, 45);
		panelMenu.add(lblNewLabel);
		
		
		
		
		frmHospitalSecretary.getContentPane().add(panelPatients);
		panelPatients.setLayout(null);
		
		JButton buttonBac = new JButton("\u03A0\u0399\u03A3\u03A9");
		buttonBac.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonBac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPatients.setVisible(false);
				panelMenu.setVisible(true);
				panelCrt.setVisible(false);
				panelUpt.setVisible(false);
				
			}
		});
		buttonBac.setBounds(624, 11, 150, 45);
		panelPatients.add(buttonBac);
		
		JLabel lblNewLabel_1 = new JLabel("\u0391\u03A3\u0398\u0395\u039D\u0395\u0399\u03A3");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(323, 11, 150, 45);
		panelPatients.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 764, 325);
		panelPatients.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		scrollPane.setViewportView(table);
		
		
		panelPatients.add(panelUpt);
		panelUpt.setLayout(null);
		
		textFieldAmka2 = new JTextField();
		textFieldAmka2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldAmka2.setColumns(10);
		textFieldAmka2.setBounds(10, 81, 150, 25);
		panelUpt.add(textFieldAmka2);
		
		textFieldSir2 = new JTextField();
		textFieldSir2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldSir2.setColumns(10);
		textFieldSir2.setBounds(604, 81, 150, 25);
		panelUpt.add(textFieldSir2);
		
		textFieldName2 = new JTextField();
		textFieldName2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldName2.setColumns(10);
		textFieldName2.setBounds(325, 81, 150, 25);
		panelUpt.add(textFieldName2);
		
		JLabel label = new JLabel("AMKA");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label.setBounds(10, 52, 150, 25);
		panelUpt.add(label);
		
		JLabel label_1 = new JLabel("\u039F\u039D\u039F\u039C\u0391");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(325, 52, 150, 25);
		panelUpt.add(label_1);
		
		JLabel label_2 = new JLabel("\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_2.setBounds(604, 52, 150, 25);
		panelUpt.add(label_2);
		
		JButton buttonSave2 = new JButton("\u0391\u03A0\u039F\u0398\u0397\u039A\u0395\u03A5\u03A3\u0397");
		buttonSave2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amk = textFieldAmka2.getText();
				String nam = textFieldName2.getText();
				String sir = textFieldSir2.getText();
				
				try {
					SecrC.Secr_upt(amk, nam, sir);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				panelMa.setVisible(true);
				panelUpt.setVisible(false);
				try {
					General.refresh2();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textFieldAmka2.setText("");
				textFieldSir2.setText("");
				textFieldName2.setText("");
				
				
			}
		});
		buttonSave2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonSave2.setBounds(325, 111, 150, 25);
		panelUpt.add(buttonSave2);
		
		JLabel label_3 = new JLabel("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_3.setBounds(325, 11, 150, 25);
		panelUpt.add(label_3);
		
		
		
		
		panelPatients.add(panelCrt);
		panelCrt.setLayout(null);
		
		textFieldAMKA = new JTextField();
		textFieldAMKA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldAMKA.setBounds(10, 81, 150, 25);
		panelCrt.add(textFieldAMKA);
		textFieldAMKA.setColumns(10);
		
		txtSirname = new JTextField();
		txtSirname.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtSirname.setColumns(10);
		txtSirname.setBounds(604, 81, 150, 25);
		panelCrt.add(txtSirname);
		
		textFieldNam = new JTextField();
		textFieldNam.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldNam.setColumns(10);
		textFieldNam.setBounds(325, 81, 150, 25);
		panelCrt.add(textFieldNam);
		
		JLabel lblNewLabel_2 = new JLabel("AMKA");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 52, 150, 25);
		panelCrt.add(lblNewLabel_2);
		
		JLabel labelNAME = new JLabel("\u039F\u039D\u039F\u039C\u0391");
		labelNAME.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelNAME.setHorizontalAlignment(SwingConstants.CENTER);
		labelNAME.setBounds(325, 52, 150, 25);
		panelCrt.add(labelNAME);
		
		JLabel labelSirname = new JLabel("\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F");
		labelSirname.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelSirname.setHorizontalAlignment(SwingConstants.CENTER);
		labelSirname.setBounds(604, 52, 150, 25);
		panelCrt.add(labelSirname);
		
		JButton buttonSave = new JButton("\u0391\u03A0\u039F\u0398\u0397\u039A\u0395\u03A5\u03A3\u0397");
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amk = textFieldAMKA.getText();
				String nam = textFieldNam.getText();
				String sir = txtSirname.getText();
				
				try {
					SecrC.Secr_add(amk, nam, sir);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace(); 
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					SecrC.Secr_crt(amk);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panelCrt.setVisible(false);
				panelMa.setVisible(true);
				try {
					General.refresh2();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textFieldAMKA.setText("");
				textFieldNam.setText("");
				txtSirname.setText("");
				
			}
		});
		buttonSave.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonSave.setBounds(325, 111, 150, 25);
		panelCrt.add(buttonSave);
		
		JLabel lblNewLabel_3 = new JLabel("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(325, 11, 150, 25);
		panelCrt.add(lblNewLabel_3);
		
		
		panelPatients.add(panelMa);
		panelMa.setLayout(null);
		
		JButton buttonUpt = new JButton("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391");
		buttonUpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMa.setVisible(false);
				panelUpt.setVisible(true);
			}
		});
		buttonUpt.setBounds(604, 64, 150, 30);
		buttonUpt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panelMa.add(buttonUpt);
		
		JButton buttonCrt = new JButton("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391");
		buttonCrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCrt.setVisible(true);
				panelMa.setVisible(false); 
			}
		});
		buttonCrt.setBounds(10, 64, 150, 30);
		buttonCrt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panelMa.add(buttonCrt);
	}
}
