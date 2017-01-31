package org.teipir.softeng.jdbc;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doc {

	private JFrame frmHospitalDoctor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doc window = new Doc();
					window.frmHospitalDoctor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	Connection conn=null;
	private JTextField textFieldSearch;
	static JTable table;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTable table_1;
	private JTextField textFieldArEx;
	private JTextField textFieldDat;
	private JTextField textFieldDoc;
	private JTextField textFieldLog;

	/**
	 * Create the application.
	 */
	public Doc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHospitalDoctor = new JFrame();
		frmHospitalDoctor.setTitle("HOSPITAL DOCTOR");
		frmHospitalDoctor.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frmHospitalDoctor.getContentPane().setLayout(null);
		
		JPanel panelCrt = new JPanel();
		panelCrt.setBounds(0, 0, 794, 571);
		frmHospitalDoctor.getContentPane().add(panelCrt);
		panelCrt.setLayout(null);
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 794, 571);
		
		JPanel panelPatients = new JPanel();
		panelPatients.setBounds(0, 0, 794, 571);
		
		JPanel panelPat1 = new JPanel();
		panelPat1.setBounds(0, 0, 794, 571);
		
		panelMenu.setVisible(true);
		panelPat1.setVisible(false);
		panelCrt.setVisible(false);
		panelPatients.setVisible(false);
		
		JLabel label_2 = new JLabel("ΝΕΑ ΕΠΙΣΚΕΨΗ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_2.setBounds(299, 11, 200, 30);
		panelCrt.add(label_2);
		
		JLabel label_3 = new JLabel("ΑΡΙΘΜΟΣ ΕΞΕΤΑΣΗΣ");
		label_3.setBounds(10, 52, 150, 30);
		panelCrt.add(label_3);
		
		JLabel label_4 = new JLabel("ΗΜΕΡΟΜΗΝΙΑ");
		label_4.setBounds(10, 93, 150, 30);
		panelCrt.add(label_4);
		
		JLabel label_5 = new JLabel("ΛΟΓΟΣ");
		label_5.setBounds(342, 52, 150, 30);
		panelCrt.add(label_5);
		
		JLabel label_6 = new JLabel("ΓΙΑΤΡΟΣ");
		label_6.setBounds(342, 93, 150, 30);
		panelCrt.add(label_6);
		
		textFieldArEx = new JTextField();
		textFieldArEx.setColumns(10);
		textFieldArEx.setBounds(170, 52, 150, 30);
		panelCrt.add(textFieldArEx);
		
		textFieldDat = new JTextField();
		textFieldDat.setColumns(10);
		textFieldDat.setBounds(170, 93, 150, 30);
		panelCrt.add(textFieldDat);
		
		textFieldDoc = new JTextField();
		textFieldDoc.setColumns(10);
		textFieldDoc.setBounds(502, 93, 150, 30);
		panelCrt.add(textFieldDoc);
		
		textFieldLog = new JTextField();
		textFieldLog.setColumns(10);
		textFieldLog.setBounds(502, 52, 150, 30);
		panelCrt.add(textFieldLog);
		
		JLabel label_7 = new JLabel("ΣΧΟΛΙΑ");
		label_7.setBounds(10, 134, 150, 30);
		panelCrt.add(label_7);
		
		JTextPane textPaneSx = new JTextPane();
		textPaneSx.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textPaneSx.setBounds(10, 175, 774, 250);
		panelCrt.add(textPaneSx);
		
		JButton buttonSave = new JButton("ΑΠΟΘΗΚΕΥΣΗ");
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textFieldArEx.getText();
				String date = textFieldDat.getText();
				String amk = textFieldSearch.getText();
				String doc = textFieldDoc.getText();
				String log = textFieldLog.getText();
				String com = textPaneSx.getText();
				
				try {
					SecrC.Secr_Cr_Fak(amk, id, log, date, doc, com);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textFieldArEx.setText(""); 
				textFieldDat.setText("");
				textFieldSearch.setText("");
				textFieldDoc.setText("");
				textFieldLog.setText("");
				textPaneSx.setText("");
				panelCrt.setVisible(false);
				panelPat1.setVisible(true);
				try {
					General.refresh3(amk);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		buttonSave.setBounds(634, 530, 150, 30);
		panelCrt.add(buttonSave);
		
		JButton buttonBak = new JButton("ΠΙΣΩ");
		buttonBak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPat1.setVisible(true);
				panelCrt.setVisible(false);
			}
		});
		buttonBak.setBounds(10, 530, 150, 30);
		panelCrt.add(buttonBak);
		
		
		frmHospitalDoctor.getContentPane().add(panelPat1);
		panelPat1.setLayout(null);
		
		JButton buttonBakk = new JButton("ΠΙΣΩ");
		buttonBakk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelPat1.setVisible(false);
				textFieldSearch.setText("");
			}
		});
		buttonBakk.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonBakk.setBounds(634, 11, 150, 45);
		panelPat1.add(buttonBakk);
		
		JLabel label_1 = new JLabel("ΑΝΑΖΗΤΗΣΗ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_1.setBounds(323, 11, 150, 45);
		panelPat1.add(label_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 64, 146, 26);
		panelPat1.add(scrollPane_2);
		
		textField_1 = new JTextField();
		scrollPane_2.setViewportView(textField_1);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(165, 64, 146, 26);
		panelPat1.add(scrollPane_1);
		
		textField_2 = new JTextField();
		scrollPane_1.setViewportView(textField_2);
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 103, 774, 322);
		panelPat1.add(scrollPane_3);
		
		table_1 = new JTable();
		scrollPane_3.setViewportView(table_1);
		
		JButton buttonNewE = new JButton("ΝΕΑ ΕΠΙΣΚΕΨΗ");
		buttonNewE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCrt.setVisible(true);
				panelPat1.setVisible(false);
			}
		});
		buttonNewE.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonNewE.setBounds(313, 490, 150, 30);
		panelPat1.add(buttonNewE);
		
		
		frmHospitalDoctor.getContentPane().add(panelPatients);
		panelPatients.setLayout(null);
		
		JButton button_3 = new JButton("ΠΙΣΩ");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelPatients.setVisible(false);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(634, 11, 150, 45);
		panelPatients.add(button_3);
		
		JLabel label = new JLabel("ΑΣΘΕΝΕΙΣ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBounds(323, 11, 150, 45);
		panelPatients.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 103, 774, 322);
		panelPatients.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		frmHospitalDoctor.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		JButton buttonPat = new JButton("ΑΣΘΕΝΕΙΣ");
		buttonPat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelPatients.setVisible(true);
				String pin = "patients";
				try{
					DocC.DPatint(pin);			
				}catch(Exception e1) {
					e1.printStackTrace();
					
				}
			}
		});
		buttonPat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonPat.setBounds(10, 11, 150, 45);
		panelMenu.add(buttonPat);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldSearch.setColumns(10);
		textFieldSearch.setBounds(634, 11, 150, 30);
		panelMenu.add(textFieldSearch);
		
		JButton buttonSearch = new JButton("ΑΝΑΖΗΤΗΣΗ");
		buttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amk = textFieldSearch.getText();
				if(amk.length()==0){
					JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
				} else
					try {
						if(General.validate_Input(amk)){		
							
						try {
							DocC.Doc_Search(amk);					
						} catch (SQLException e23) {
							// TODO Auto-generated catch block
							e23.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							DocC.Doc_Appear(amk);
						} catch (SQLException e12) {
							// TODO Auto-generated catch block
							e12.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						panelMenu.setVisible(false);
						panelPat1.setVisible(true);
						}
						else{
						JOptionPane.showMessageDialog(null, "ΔΕΝ ΥΠΑΡΧΕΙ ΑΣΘΕΝΗΣ");
}
					} catch (HeadlessException | ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		buttonSearch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonSearch.setBounds(634, 52, 150, 30);
		panelMenu.add(buttonSearch);
		
		JButton buttonEx = new JButton("ΕΞΟΔΟΣ");
		buttonEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHospitalDoctor.dispose();
				Login.main(null);
			}
		});
		buttonEx.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonEx.setBounds(325, 515, 150, 45);
		panelMenu.add(buttonEx);
		
		JLabel labelMnm = new JLabel("ΜΕΝΟΥ");
		labelMnm.setHorizontalAlignment(SwingConstants.CENTER);
		labelMnm.setFont(new Font("Times New Roman", Font.BOLD, 18));
		labelMnm.setBounds(323, 11, 150, 45);
		panelMenu.add(labelMnm);
		frmHospitalDoctor.setBounds(100, 100, 450, 300);
		frmHospitalDoctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHospitalDoctor.setSize(800, 600);
		frmHospitalDoctor.setResizable(false);
	}
}
