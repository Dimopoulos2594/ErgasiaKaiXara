import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class NewPatientGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPatientGui window = new NewPatientGui();
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
	public NewPatientGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(13, 27, 86, 20);
		frame.getContentPane().add(textField);
		
		JLabel label = new JLabel("\u0391.\u039C.");
		label.setBounds(13, 11, 46, 14);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 27, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("\u0391. \u03A4\u03B1\u03C5\u03C4\u03CC\u03C4\u03B7\u03C4\u03B1\u03C2");
		label_1.setBounds(128, 11, 88, 14);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(13, 83, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		label_2.setBounds(13, 58, 46, 14);
		frame.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 77, 86, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		label_3.setBounds(128, 58, 46, 14);
		frame.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(13, 133, 201, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel label_4 = new JLabel("\u0391\u03A6\u039C");
		label_4.setBounds(13, 108, 46, 14);
		frame.getContentPane().add(label_4);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBounds(13, 223, 451, 192);
		frame.getContentPane().add(editorPane);
		
		JButton button_1 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 ");
		button_1.setBounds(186, 426, 116, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_5 = new JLabel("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC");
		label_5.setBounds(13, 199, 46, 14);
		frame.getContentPane().add(label_5);
	}

}
