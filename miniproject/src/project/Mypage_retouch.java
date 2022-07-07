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
	Color JYellow = new Color(251,197,60);
	
	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156); 
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField repasswordField;
	private JTextField mail_id_textField;
	private JTextField mailtextField;
	private JTextField telltextField;
	private JTextField WtextField;
	private JTextField HtextField;
	
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 364, 60);
		panel.setBackground(toolgreen);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
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
		panel.add(homeButton, BorderLayout.WEST);
		
		JLabel titleLabel = new JLabel("Mypage_PrivacyRetouch");
		titleLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton BeforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Mypage();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		BeforeButton.setBorderPainted(false);
		BeforeButton.setBackground(new Color(52, 152, 219));
		BeforeButton.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(BeforeButton);
		
		ImageIcon icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\rutinadd.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(350, 48, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBounds(0, 117, 364, 366);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JPanel idpanel = new JPanel();
		idpanel.setBackground(Color.WHITE);
		idpanel.setBounds(12, 10, 340, 40);
		panel_3.add(idpanel);
		idpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_2.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBackground(Color.WHITE);
		idpanel.add(lblNewLabel_2, BorderLayout.WEST);
		
		textField = new JTextField();
		textField.setText("\uC544\uC774\uB514 \uBCC0\uACBD\uBD88\uAC00");
		textField.setEditable(false);
		textField.setColumns(10);
		idpanel.add(textField, BorderLayout.CENTER);
		
		JPanel passwordpanel = new JPanel();
		passwordpanel.setBackground(Color.WHITE);
		passwordpanel.setBounds(12, 49, 340, 40);
		panel_3.add(passwordpanel);
		passwordpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_3.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBackground(Color.WHITE);
		passwordpanel.add(lblNewLabel_3, BorderLayout.WEST);
		
		passwordField = new JPasswordField();
		passwordpanel.add(passwordField, BorderLayout.CENTER);
		
		JPanel repasswordpanel = new JPanel();
		repasswordpanel.setBackground(Color.WHITE);
		repasswordpanel.setBounds(12, 88, 340, 40);
		panel_3.add(repasswordpanel);
		repasswordpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel repasswordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uC7AC\uD655\uC778");
		repasswordLabel.setPreferredSize(new Dimension(90, 40));
		repasswordLabel.setBackground(Color.WHITE);
		repasswordpanel.add(repasswordLabel, BorderLayout.WEST);
		
		repasswordField = new JPasswordField();
		repasswordpanel.add(repasswordField, BorderLayout.CENTER);
		
		JPanel emailpanel = new JPanel();
		emailpanel.setLayout(null);
		emailpanel.setBackground(Color.WHITE);
		emailpanel.setBounds(12, 157, 340, 40);
		panel_3.add(emailpanel);
		
		JLabel emailLabel = new JLabel("\uC774\uBA54\uC77C");
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
		panel_3.add(tellpanel);
		tellpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel telLabel = new JLabel("\uC804\uD654\uBC88\uD638(-\uC81C\uC678)");
		telLabel.setPreferredSize(new Dimension(90, 40));
		telLabel.setHorizontalAlignment(SwingConstants.LEFT);
		telLabel.setBackground(Color.WHITE);
		tellpanel.add(telLabel, BorderLayout.WEST);
		
		telltextField = new JTextField();
		telltextField.setColumns(10);
		tellpanel.add(telltextField, BorderLayout.CENTER);
		
		JPanel weightpanel = new JPanel();
		weightpanel.setBackground(Color.WHITE);
		weightpanel.setBounds(12, 265, 340, 40);
		panel_3.add(weightpanel);
		weightpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel wLabel = new JLabel("\uD0A4");
		wLabel.setPreferredSize(new Dimension(90, 40));
		wLabel.setHorizontalAlignment(SwingConstants.LEFT);
		wLabel.setBackground(Color.WHITE);
		weightpanel.add(wLabel, BorderLayout.WEST);
		
		WtextField = new JTextField();
		WtextField.setColumns(10);
		weightpanel.add(WtextField, BorderLayout.CENTER);
		
		JPanel heightpanel = new JPanel();
		heightpanel.setBackground(Color.WHITE);
		heightpanel.setBounds(12, 306, 340, 40);
		panel_3.add(heightpanel);
		heightpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel hLabel = new JLabel("\uBAB8\uBB34\uAC8C");
		hLabel.setPreferredSize(new Dimension(90, 40));
		hLabel.setHorizontalAlignment(SwingConstants.LEFT);
		hLabel.setBackground(Color.WHITE);
		heightpanel.add(hLabel, BorderLayout.WEST);
		
		HtextField = new JTextField();
		HtextField.setColumns(10);
		heightpanel.add(HtextField, BorderLayout.CENTER);
		
		JButton SaveButton = new JButton("\uC218\uC815\uD558\uAE30");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SaveButton.setForeground(Color.WHITE);
		SaveButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		SaveButton.setBorderPainted(false);
		SaveButton.setBackground(new Color(52, 152, 219));
		SaveButton.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(SaveButton);
		
		JLabel retouchLabel = new JLabel("*\uAC1C\uC778\uC815\uBCF4\uC218\uC815");
		retouchLabel.setBounds(10, 70, 152, 35);
		frame.getContentPane().add(retouchLabel);
		retouchLabel.setForeground(new Color(17, 113, 89));
		retouchLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.BOLD, 20));
		retouchLabel.setBackground(Color.WHITE);
		
		ButtonGroup group = new ButtonGroup();
		frame.setVisible(true);

	}
}
