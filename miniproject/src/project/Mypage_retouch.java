package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import project.Customer_Plan;
import project.Main_Customer;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Mypage_retouch {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251, 197, 60);
	Color toolgreen = new Color(26, 188, 156);
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField repasswordField;
	private JTextField mail_id_textField;
	private JTextField mailtextField;
	private JTextField telltextField;
	private String password, email, tel;

	public static void main(String[] args) {
		new Mypage_retouch();
	}

	public Mypage_retouch() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(380, 620);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JPanel headpanel = new JPanel();
		headpanel.setBounds(0, 0, 364, 60);
		headpanel.setBackground(toolgreen);
		frame.getContentPane().add(headpanel);
		headpanel.setLayout(new BorderLayout(0, 0));

		JButton homeButton = new JButton("");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Customer();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		headpanel.add(homeButton, BorderLayout.WEST);

		JLabel titleLabel = new JLabel("Mypage_PrivacyRetouch");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		headpanel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);

		JButton backbtn = new JButton("\uC774\uC804\uC73C\uB85C");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Mypage();
			}
		});
		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		backbtn.setBorderPainted(false);
		backbtn.setBackground(new Color(52, 152, 219));
		backbtn.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(backbtn);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 117, 364, 248);
		frame.getContentPane().add(panel);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(null);

		JPanel idpanel = new JPanel();
		idpanel.setBackground(Color.WHITE);
		idpanel.setBounds(12, 10, 340, 40);
		panel.add(idpanel);
		idpanel.setLayout(new BorderLayout(0, 0));

		JLabel idLabel = new JLabel("아이디");
		idLabel.setPreferredSize(new Dimension(90, 40));
		idLabel.setHorizontalAlignment(SwingConstants.LEFT);
		idLabel.setBackground(Color.WHITE);
		idpanel.add(idLabel, BorderLayout.WEST);

		textField = new JTextField();
		textField.setText("아이디 변경불가");
		textField.setEditable(false);
		textField.setColumns(10);
		idpanel.add(textField, BorderLayout.CENTER);

		JPanel passwordpanel = new JPanel();
		passwordpanel.setBackground(Color.WHITE);
		passwordpanel.setBounds(12, 49, 340, 40);
		panel.add(passwordpanel);
		passwordpanel.setLayout(new BorderLayout(0, 0));

		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setPreferredSize(new Dimension(90, 40));
		pwdLabel.setHorizontalAlignment(SwingConstants.LEFT);
		pwdLabel.setBackground(Color.WHITE);
		passwordpanel.add(pwdLabel, BorderLayout.WEST);

		passwordField = new JPasswordField();
		passwordpanel.add(passwordField, BorderLayout.CENTER);

		JPanel repasswordpanel = new JPanel();
		repasswordpanel.setBackground(Color.WHITE);
		repasswordpanel.setBounds(12, 88, 340, 40);
		panel.add(repasswordpanel);
		repasswordpanel.setLayout(new BorderLayout(0, 0));

		JLabel repasswordLabel = new JLabel("비밀번호 재확인");
		repasswordLabel.setPreferredSize(new Dimension(90, 40));
		repasswordLabel.setBackground(Color.WHITE);
		repasswordpanel.add(repasswordLabel, BorderLayout.WEST);

		repasswordField = new JPasswordField();
		repasswordpanel.add(repasswordField, BorderLayout.CENTER);

		JPanel emailpanel = new JPanel();
		emailpanel.setLayout(null);
		emailpanel.setBackground(Color.WHITE);
		emailpanel.setBounds(12, 157, 340, 40);
		panel.add(emailpanel);

		JLabel emailLabel = new JLabel("Email");
		emailLabel.setPreferredSize(new Dimension(40, 40));
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setBackground(Color.WHITE);
		emailLabel.setBounds(0, 0, 40, 40);
		emailpanel.add(emailLabel);

		mail_id_textField = new JTextField();
		mail_id_textField.setPreferredSize(new Dimension(90, 40));
		mail_id_textField.setColumns(10);
		mail_id_textField.setBounds(91, 6, 106, 30);
		emailpanel.add(mail_id_textField);

		JLabel Label = new JLabel("@");
		Label.setPreferredSize(new Dimension(20, 40));
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setBounds(194, 3, 20, 30);
		emailpanel.add(Label);

		mailtextField = new JTextField();
		mailtextField.setPreferredSize(new Dimension(90, 30));
		mailtextField.setColumns(10);
		mailtextField.setBounds(214, 6, 126, 30);
		emailpanel.add(mailtextField);

		JPanel tellpanel = new JPanel();
		tellpanel.setBackground(Color.WHITE);
		tellpanel.setBounds(12, 197, 340, 40);
		panel.add(tellpanel);
		tellpanel.setLayout(new BorderLayout(0, 0));

		JLabel telLabel = new JLabel("전화번호(-제외)");
		telLabel.setPreferredSize(new Dimension(90, 40));
		telLabel.setHorizontalAlignment(SwingConstants.LEFT);
		telLabel.setBackground(Color.WHITE);
		tellpanel.add(telLabel, BorderLayout.WEST);

		telltextField = new JTextField();
		telltextField.setColumns(10);
		tellpanel.add(telltextField, BorderLayout.CENTER);

		JButton SaveButton = new JButton("수정하기");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getText().equals(repasswordField.getText())) {
					password = passwordField.getText();
					email = mail_id_textField.getText() + "@" + mailtextField.getText();
					tel = telltextField.getText();
					if (new Insert().customer_update(password, email, tel, MemberVo.user.getId())) {
						JOptionPane.showMessageDialog(null, "개인정보 수정 완료!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다. 다시입력해주세요");
				}
			}
		});
		SaveButton.setForeground(Color.WHITE);
		SaveButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		SaveButton.setBorderPainted(false);
		SaveButton.setBackground(new Color(52, 152, 219));
		SaveButton.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(SaveButton);

		JLabel retouchLabel = new JLabel("*개인정보수정");
		retouchLabel.setBounds(10, 70, 152, 35);
		frame.getContentPane().add(retouchLabel);
		retouchLabel.setForeground(new Color(17, 113, 89));
		retouchLabel.setFont(new Font("HY목각파임B", Font.BOLD, 20));
		retouchLabel.setBackground(Color.WHITE);

		frame.setVisible(true);

	}
}