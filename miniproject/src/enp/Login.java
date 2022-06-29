package enp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

import miniproject.SingUp;

import java.awt.BorderLayout;

public class Login {
	private JFrame frame2222;
	private JPanel contentPane;
	Color Jgreen = new Color(17, 113, 89);
	private JPasswordField passwordField;
	private JTextField textField;

	public static void main(String[] args) {
		new Login();
	}

	public Login() {
		frame = new JFrame();

		frame.setResizable(false);
		frame.setBackground(Color.ORANGE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 380, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setVisible(true);

		JLabel lblNewLabel = new JLabel("well healthy");
		lblNewLabel.setForeground(Jgreen);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 47));
		lblNewLabel.setBounds(40, 0, 280, 68);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 402, 344, 33);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uAD00\uB9AC\uC790");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uD2B8\uB808\uC774\uB108");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("\uD68C\uC6D0");
		rdbtnNewRadioButton_1_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(rdbtnNewRadioButton_1_1);

		ButtonGroup radio = new ButtonGroup();
		radio.add(rdbtnNewRadioButton);
		radio.add(rdbtnNewRadioButton_1);
		radio.add(rdbtnNewRadioButton_1_1);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(99, 455, 160, 73);
		contentPane.add(btnNewButton);
		btnNewButton.setBorderPainted(false);

		JButton btnNewButton_1 = new JButton(
				"\uD68C\uC6D0\uAC00\uC785 | \uC544\uC774\uB514\uCC3E\uAE30 | \uBE44\uBC00\uBC88\uD638\uCC3E\uAE30");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(12, 538, 344, 33);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBorderPainted(false);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(12, 334, 340, 30);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		panel_1_1.add(lblNewLabel_1_1, BorderLayout.WEST);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		textField = new JTextField();
		panel_1_1.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 365, 340, 30);
		panel_1.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_1);
//		frame.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		panel_1.add(lblNewLabel_1, BorderLayout.WEST);
		lblNewLabel_1.setPreferredSize(new Dimension(90, 40));

		passwordField = new JPasswordField();
		panel_1.add(passwordField, BorderLayout.CENTER);
		frame.add(panel_1);
		frame.add(panel_1_1);
	}
}