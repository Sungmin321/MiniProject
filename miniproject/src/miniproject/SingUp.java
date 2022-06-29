package miniproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class SingUp{
	Color Jgreen = new Color(17, 113, 89);
	private JFrame frame;
	private JPanel contentPane;
	private JTextField txtId;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new SingUp();
	}

	/**
	 * Create the frame.
	 */
	public SingUp() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 380, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		frame.setContentPane(contentPane);
		frame.setVisible(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("well healthy");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 0, 164, 35);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(Jgreen);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(93, 28, 164, 35);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 73, 340, 40);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setPreferredSize(new Dimension(90, 40));
		panel.add(lblNewLabel_2, BorderLayout.WEST);
		
		txtId = new JTextField();
		panel.add(txtId, BorderLayout.CENTER);
		txtId.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 114, 340, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBackground(Color.WHITE);
		panel_1.add(lblNewLabel_3, BorderLayout.WEST);
		lblNewLabel_3.setPreferredSize(new Dimension(90, 40));
		
		passwordField = new JPasswordField();
		panel_1.add(passwordField, BorderLayout.CENTER);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(12, 155, 340, 40);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uC7AC\uD655\uC778");
		lblNewLabel_3_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_3_1.setBackground(Color.WHITE);
		panel_1_1.add(lblNewLabel_3_1, BorderLayout.WEST);
		
		passwordField_1 = new JPasswordField();
		panel_1_1.add(passwordField_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(12, 205, 340, 40);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC774\uB984");
		lblNewLabel_2_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2_1, BorderLayout.WEST);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_2.add(textField, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(12, 245, 340, 40);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\uC131\uBCC4");
		lblNewLabel_2_1_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		panel_3.add(lblNewLabel_2_1_1, BorderLayout.WEST);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(rdbtnNewRadioButton, BorderLayout.CENTER);
		rdbtnNewRadioButton.setPreferredSize(new Dimension(125, 38));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(rdbtnNewRadioButton_1, BorderLayout.EAST);
		rdbtnNewRadioButton_1.setPreferredSize(new Dimension(125, 38));
		
		ButtonGroup s = new ButtonGroup();
		s.add(rdbtnNewRadioButton);
		s.add(rdbtnNewRadioButton_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(12, 285, 340, 40);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uC0DD\uB144\uC6D4\uC77C(8\uC790\uB9AC)");
		lblNewLabel_2_1_1_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setBackground(Color.WHITE);
		panel_3_1.add(lblNewLabel_2_1_1_1, BorderLayout.WEST);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_3_1.add(textField_3, BorderLayout.CENTER);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBounds(12, 324, 340, 40);
		contentPane.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2_2.setBounds(0, 0, 40, 40);
		lblNewLabel_2_2.setPreferredSize(new Dimension(40, 40));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setBackground(Color.WHITE);
		panel_3_2.add(lblNewLabel_2_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 6, 106, 30);
		textField_1.setColumns(10);
		panel_3_2.add(textField_1);
		textField_1.setPreferredSize(new Dimension(90, 40));
		
		JLabel lblNewLabel_4 = new JLabel("@");
		lblNewLabel_4.setBounds(194, 3, 20, 30);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3_2.add(lblNewLabel_4);
		lblNewLabel_4.setPreferredSize(new Dimension(20, 40));
		
		textField_4 = new JTextField();
		textField_4.setBounds(214, 6, 126, 30);
		textField_4.setPreferredSize(new Dimension(90, 30));
		textField_4.setColumns(10);
		panel_3_2.add(textField_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(12, 366, 340, 40);
		contentPane.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("\uC804\uD654\uBC88\uD638(-\uC81C\uC678)");
		lblNewLabel_2_1_2.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2.setBackground(Color.WHITE);
		panel_4.add(lblNewLabel_2_1_2, BorderLayout.WEST);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_4.add(textField_6, BorderLayout.CENTER);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(12, 434, 340, 40);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("\uD0A4");
		lblNewLabel_2_1_3.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_3.setBackground(Color.WHITE);
		panel_2_1.add(lblNewLabel_2_1_3, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2_1.add(textField_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel("*\uC120\uD0DD\uC785\uB825\uC0AC\uD56D");
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.BOLD, 15));
		lblNewLabel_5.setBounds(12, 403, 103, 35);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Jgreen);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(12, 473, 340, 40);
		contentPane.add(panel_2_1_1);
		panel_2_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("\uBAB8\uBB34\uAC8C");
		lblNewLabel_2_1_3_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_2_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_3_1.setBackground(Color.WHITE);
		panel_2_1_1.add(lblNewLabel_2_1_3_1, BorderLayout.WEST);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_2_1_1.add(textField_5, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uAC00\uC785\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Login();
			}
		});
		btnNewButton.setFont(new Font("¹®Ã¼ºÎ Á¦¸ñ µ¸À½Ã¼", Font.BOLD, 20));
		btnNewButton.setBackground(Jgreen);
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBounds(84, 523, 195, 48);
		contentPane.add(btnNewButton);
		btnNewButton.setBorderPainted(false);
		

	}
}
