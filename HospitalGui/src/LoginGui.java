import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginGui {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField pwdSdsf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGui window = new LoginGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsernameam = new JLabel("Username/A.M.");
		lblUsernameam.setBounds(10, 32, 82, 14);
		frame.getContentPane().add(lblUsernameam);
		
		textField = new JTextField();
		textField.setBounds(10, 57, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(137, 32, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		pwdSdsf = new JPasswordField();
		pwdSdsf.setText("sdsf");
		pwdSdsf.setBounds(137, 57, 86, 20);
		frame.getContentPane().add(pwdSdsf);
		
		JButton btnHitIt = new JButton("HIT IT!");
		btnHitIt.setBounds(7, 112, 89, 23);
		frame.getContentPane().add(btnHitIt);
	}
}
