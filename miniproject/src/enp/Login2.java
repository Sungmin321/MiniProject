package enp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login2() {
		Color Jgreen = new Color(17, 113, 89);
		
		setResizable(false);
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		txtId = new JTextField();
		txtId.setText("id");
		txtId.setBounds(67, 306, 274, 43);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("password");
		txtPassword.setColumns(10);
		txtPassword.setBounds(67, 348, 274, 43);
		contentPane.add(txtPassword);
		
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
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785 | \uC544\uC774\uB514\uCC3E\uAE30 | \uBE44\uBC00\uBC88\uD638\uCC3E\uAE30");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(12, 538, 344, 33);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBorderPainted(false);
	}
}
