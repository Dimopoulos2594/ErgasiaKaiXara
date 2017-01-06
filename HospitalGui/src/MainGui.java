import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGui {

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
					MainGui window = new MainGui();
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
	public MainGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(21, 40, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u0391.\u039C.");
		label.setBounds(21, 24, 46, 14);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 40, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0391. \u03A4\u03B1\u03C5\u03C4\u03CC\u03C4\u03B7\u03C4\u03B1\u03C2");
		label_1.setBounds(136, 24, 88, 14);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(21, 96, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		label_2.setBounds(21, 71, 46, 14);
		frame.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(136, 90, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_3 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		label_3.setBounds(136, 71, 46, 14);
		frame.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(21, 146, 201, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_4 = new JLabel("\u0391\u03A6\u039C");
		label_4.setBounds(21, 121, 46, 14);
		frame.getContentPane().add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(293, 40, 242, 388);
		frame.getContentPane().add(comboBox);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBounds(21, 236, 255, 192);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("\u0391\u03BB\u03BB\u03B1\u03B3\u03AE \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(18, 439, 119, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 ");
		btnNewButton_1.setBounds(160, 439, 116, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_5 = new JLabel("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC");
		label_5.setBounds(21, 212, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u039B\u03AF\u03C3\u03C4\u03B1 \u0391\u03C3\u03B8\u03B5\u03BD\u03CE\u03BD");
		label_6.setBounds(293, 24, 86, 14);
		frame.getContentPane().add(label_6);
		
		JButton btnNewButton_2 = new JButton("\u039D\u03AD\u03BF\u03C2 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE\u03C2");
		btnNewButton_2.setBounds(293, 439, 116, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
