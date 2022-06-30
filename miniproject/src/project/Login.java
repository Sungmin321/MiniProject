package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Login();
	}
	
	/**
	 * Create the application.
	 */
	public Login() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 380, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("well healthy");
		lblNewLabel.setForeground(new Color(17, 113, 89));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 47));
		lblNewLabel.setBounds(41, 10, 280, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(107, 460, 160, 73);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785 | \uC544\uC774\uB514\uCC3E\uAE30 | \uBE44\uBC00\uBC88\uD638\uCC3E\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new SingUp();
			}
		});
		btnNewButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 14));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(12, 543, 344, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 377, 340, 30);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		panel_1.add(lblNewLabel_1, BorderLayout.WEST);
		
		passwordField = new JPasswordField();
		panel_1.add(passwordField, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 417, 344, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton MasterRadioButton = new JRadioButton("\uAD00\uB9AC\uC790");
		MasterRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		MasterRadioButton.setBackground(Color.WHITE);
		panel.add(MasterRadioButton);
		
		JRadioButton TrannerRadioButton = new JRadioButton("\uD2B8\uB808\uC774\uB108");
		TrannerRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		TrannerRadioButton.setBackground(Color.WHITE);
		panel.add(TrannerRadioButton);
		
		JRadioButton CustomerRadioButton = new JRadioButton("\uD68C\uC6D0");
		CustomerRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		CustomerRadioButton.setBackground(Color.WHITE);
		panel.add(CustomerRadioButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(12, 348, 340, 30);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		panel_1_1.add(lblNewLabel_1_1, BorderLayout.WEST);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_1_1.add(textField, BorderLayout.CENTER);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CustomerRadioButton.isSelected()) {
					frame.setVisible(false);
					new Main_Customer();
				}else if (TrannerRadioButton.isSelected()) {
					new Main_Trainer();
				}else {
//					new Main_Master();
				}
			}
		});
		
		ButtonGroup group = new ButtonGroup();
		group.add(MasterRadioButton);
		group.add(TrannerRadioButton);
		group.add(CustomerRadioButton);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\\uB85C\uADF8\uC778 \uC0AC\uB78C.png"));
		lblNewLabel_2.setBounds(61, 61, 241, 277);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setVisible(true);
	}
}
