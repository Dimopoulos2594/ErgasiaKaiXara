package org.teipir.softeng.jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTable;

public class Nurs {

	private JFrame frmNurse;
	private JTextField textField;
	static JTextField textFieldSir1;
	static JTextField textFieldNam;
	static JTable table;
	static JTable table_1;
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nurs window = new Nurs();
					window.frmNurse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn=null;

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Nurs() throws ClassNotFoundException, SQLException {
		conn=Sql_Con.dbConnector();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNurse = new JFrame();
		frmNurse.setTitle("HOSPITAL NURSE");
		frmNurse.setBounds(100, 100, 450, 300);
		frmNurse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNurse.setSize(800, 600);
		frmNurse.setResizable(false);
		frmNurse.getContentPane().setLayout(null);
		
		JPanel panelPatient = new JPanel();
		panelPatient.setBounds(0, 0, 794, 571);
		panelPatient.setVisible(false);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 794, 571);
		
		
		frmNurse.getContentPane().add(panelPatient);
		panelPatient.setLayout(null);
		
		JButton button_3 = new JButton("ΠΙΣΩ");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelPatient.setVisible(false);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(634, 11, 150, 45);
		panelPatient.add(button_3);
		
		JLabel label_1 = new JLabel("ΑΣΘΕΝΕΙΣ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_1.setBounds(323, 11, 150, 45);
		panelPatient.add(label_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 103, 774, 322);
		panelPatient.add(scrollPane_3);
		
		table_1 = new JTable();
		scrollPane_3.setViewportView(table_1);
		
		JPanel panelPat1 = new JPanel();
		panelPat1.setBounds(0, 0, 794, 571);
		frmNurse.getContentPane().add(panelPat1);
		panelPat1.setLayout(null);
		
		
		
		panelMenu.setVisible(true);
		panelPat1.setVisible(false);
		panelPatient.setVisible(false);
		
		JButton button_4 = new JButton("ΠΙΣΩ");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setVisible(true);
				panelPat1.setVisible(false);
				textFieldSir1.setText("");
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(634, 11, 150, 45);
		panelPat1.add(button_4);
		
		JLabel label_2 = new JLabel("ΑΝΑΖΗΤΗΣΗ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_2.setBounds(323, 11, 150, 45);
		panelPat1.add(label_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 64, 148, 28);
		panelPat1.add(scrollPane_1);
		
		textFieldSir1 = new JTextField();
		scrollPane_1.setViewportView(textFieldSir1);
		textFieldSir1.setForeground(Color.BLACK);
		textFieldSir1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldSir1.setEditable(false);
		textFieldSir1.setColumns(10);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(165, 64, 148, 28);
		panelPat1.add(scrollPane);
		
		textFieldNam = new JTextField();
		scrollPane.setViewportView(textFieldNam);
		textFieldNam.setForeground(Color.BLACK);
		textFieldNam.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldNam.setEditable(false);
		textFieldNam.setColumns(10);
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 103, 774, 322);
		panelPat1.add(scrollPane_2);
		
		table = new JTable();
		scrollPane_2.setViewportView(table);
		
		
		frmNurse.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		JButton button = new JButton("ΑΣΘΕΝΕΙΣ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelPatient.setVisible(true);
				String pin = "patients";
				try{
					NursC.NPatint(pin);			
				}catch(Exception e1) {
					e1.printStackTrace();
					
				}
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(10, 11, 150, 45);
		panelMenu.add(button);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(634, 11, 150, 30);
		panelMenu.add(textField);
		
		JButton button_1 = new JButton("ΑΝΑΖΗΤΗΣΗ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				String amk = textField.getText();
				if(amk.length()==0){
					JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
				} else
					try {
						if(General.validate_Input(amk)){
												
						try {
							NursC.NSecr_Search(amk);
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						try {
							NursC.NSecr_Appear(amk);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						panelMenu.setVisible(false);
						panelPat1.setVisible(true);
						
						}else{
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
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(634, 52, 150, 30);
		panelMenu.add(button_1);
		
		table.addMouseListener(new java.awt.event.MouseAdapter() /*       */
        {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				int row=table.rowAtPoint(e.getPoint());
				
				JOptionPane.showMessageDialog(null,table.getValueAt(row,5).toString());
				
			}
        }
				);
		
		JButton button_2 = new JButton("ΕΞΟΔΟΣ");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmNurse.dispose();
				Login.main(null);				
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(325, 515, 150, 45);
		panelMenu.add(button_2);
		
		JLabel label = new JLabel("ΜΕΝΟΥ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBounds(325, 11, 150, 45);
		panelMenu.add(label);
	}
}
