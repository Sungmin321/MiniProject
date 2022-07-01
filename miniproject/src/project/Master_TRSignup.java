package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Master_TRSignup {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156); 
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public static void main(String[] args) {
		new Master_TRSignup();
	}

	public Master_TRSignup() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 380, 620);
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
				new Main_Master();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);
		
		JLabel titleLabel = new JLabel("Master_TrainerSignup");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton beforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		beforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Master();
			}
		});
		beforeButton.setForeground(Color.WHITE);
		beforeButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		beforeButton.setBorderPainted(false);
		beforeButton.setBackground(new Color(52, 152, 219));
		beforeButton.setBounds(10, 521, 165, 50);
		frame.getContentPane().add(beforeButton);
		
		JPanel signuppanel = new JPanel();
		signuppanel.setBackground(Color.WHITE);
		signuppanel.setBounds(0, 58, 364, 450);
		frame.getContentPane().add(signuppanel);
		signuppanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		signuppanel.setLayout(null);
		
		JPanel idpanel = new JPanel();
		idpanel.setBackground(Color.WHITE);
		idpanel.setBounds(12, 10, 340, 40);
		signuppanel.add(idpanel);
		idpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setPreferredSize(new Dimension(90, 40));
		idLabel.setHorizontalAlignment(SwingConstants.LEFT);
		idLabel.setBackground(Color.WHITE);
		idpanel.add(idLabel, BorderLayout.WEST);
		
		textField = new JTextField();
		textField.setColumns(10);
		idpanel.add(textField, BorderLayout.CENTER);
		
		JPanel pwpanel = new JPanel();
		pwpanel.setBackground(Color.WHITE);
		pwpanel.setBounds(12, 49, 340, 40);
		signuppanel.add(pwpanel);
		pwpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel pwLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwLabel.setPreferredSize(new Dimension(90, 40));
		pwLabel.setHorizontalAlignment(SwingConstants.LEFT);
		pwLabel.setBackground(Color.WHITE);
		pwpanel.add(pwLabel, BorderLayout.WEST);
		
		passwordField = new JPasswordField();
		pwpanel.add(passwordField, BorderLayout.CENTER);
		
		JPanel pwrpanel = new JPanel();
		pwrpanel.setBackground(Color.WHITE);
		pwrpanel.setBounds(12, 87, 340, 40);
		signuppanel.add(pwrpanel);
		pwrpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel pwrLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uC7AC\uD655\uC778");
		pwrLabel.setPreferredSize(new Dimension(90, 40));
		pwrLabel.setBackground(Color.WHITE);
		pwrpanel.add(pwrLabel, BorderLayout.WEST);
		
		passwordField_1 = new JPasswordField();
		pwrpanel.add(passwordField_1, BorderLayout.CENTER);
		
		JPanel namepanel = new JPanel();
		namepanel.setBackground(Color.WHITE);
		namepanel.setBounds(12, 137, 340, 40);
		signuppanel.add(namepanel);
		namepanel.setLayout(new BorderLayout(0, 0));
		
		JLabel nLabel = new JLabel("\uC774\uB984");
		nLabel.setPreferredSize(new Dimension(90, 40));
		nLabel.setHorizontalAlignment(SwingConstants.LEFT);
		nLabel.setBackground(Color.WHITE);
		namepanel.add(nLabel, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		namepanel.add(textField_1, BorderLayout.CENTER);
		
		JPanel sexpanel = new JPanel();
		sexpanel.setBackground(Color.WHITE);
		sexpanel.setBounds(12, 177, 340, 40);
		signuppanel.add(sexpanel);
		sexpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel sexLabel = new JLabel("\uC131\uBCC4");
		sexLabel.setPreferredSize(new Dimension(90, 40));
		sexLabel.setHorizontalAlignment(SwingConstants.LEFT);
		sexLabel.setBackground(Color.WHITE);
		sexpanel.add(sexLabel, BorderLayout.WEST);
		
		JRadioButton MRadioButton = new JRadioButton("\uB0A8\uC790");
		MRadioButton.setPreferredSize(new Dimension(125, 38));
		MRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		MRadioButton.setBackground(Color.WHITE);
		sexpanel.add(MRadioButton, BorderLayout.CENTER);
		
		JRadioButton WRadioButton = new JRadioButton("\uC5EC\uC790");
		WRadioButton.setPreferredSize(new Dimension(125, 38));
		WRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		WRadioButton.setBackground(Color.WHITE);
		sexpanel.add(WRadioButton, BorderLayout.EAST);
		
		ButtonGroup group = new ButtonGroup();
		group.add(WRadioButton);
		group.add(MRadioButton);
		
		JPanel BDpanel = new JPanel();
		BDpanel.setBackground(Color.WHITE);
		BDpanel.setBounds(12, 217, 340, 40);
		signuppanel.add(BDpanel);
		BDpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel BDLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C(8\uC790\uB9AC)");
		BDLabel.setPreferredSize(new Dimension(90, 40));
		BDLabel.setHorizontalAlignment(SwingConstants.LEFT);
		BDLabel.setBackground(Color.WHITE);
		BDpanel.add(BDLabel, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		BDpanel.add(textField_2, BorderLayout.CENTER);
		
		JPanel emailpanel = new JPanel();
		emailpanel.setLayout(null);
		emailpanel.setBackground(Color.WHITE);
		emailpanel.setBounds(12, 254, 340, 40);
		signuppanel.add(emailpanel);
		
		JLabel emailLabel = new JLabel("\uC774\uBA54\uC77C");
		emailLabel.setPreferredSize(new Dimension(40, 40));
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setBackground(Color.WHITE);
		emailLabel.setBounds(0, 0, 40, 40);
		emailpanel.add(emailLabel);
		
		textField_3 = new JTextField();
		textField_3.setPreferredSize(new Dimension(90, 40));
		textField_3.setColumns(10);
		textField_3.setBounds(91, 6, 106, 30);
		emailpanel.add(textField_3);
		
		JLabel Label = new JLabel("@");
		Label.setPreferredSize(new Dimension(20, 40));
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setBounds(194, 3, 20, 30);
		emailpanel.add(Label);
		
		textField_4 = new JTextField();
		textField_4.setPreferredSize(new Dimension(90, 30));
		textField_4.setColumns(10);
		textField_4.setBounds(214, 6, 126, 30);
		emailpanel.add(textField_4);
		
		JPanel telpanel = new JPanel();
		telpanel.setBackground(Color.WHITE);
		telpanel.setBounds(12, 293, 340, 40);
		signuppanel.add(telpanel);
		telpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel telLabel = new JLabel("\uC804\uD654\uBC88\uD638(-\uC81C\uC678)");
		telLabel.setPreferredSize(new Dimension(90, 40));
		telLabel.setHorizontalAlignment(SwingConstants.LEFT);
		telLabel.setBackground(Color.WHITE);
		telpanel.add(telLabel, BorderLayout.WEST);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		telpanel.add(textField_5, BorderLayout.CENTER);
		
		JLabel Label2 = new JLabel("*\uC120\uD0DD\uC785\uB825\uC0AC\uD56D");
		Label2.setForeground(new Color(17, 113, 89));
		Label2.setFont(new Font("HY목각파임B", Font.BOLD, 15));
		Label2.setBackground(Color.WHITE);
		Label2.setBounds(12, 332, 103, 35);
		signuppanel.add(Label2);
		
		JPanel hpanel = new JPanel();
		hpanel.setBackground(Color.WHITE);
		hpanel.setBounds(12, 360, 340, 40);
		signuppanel.add(hpanel);
		hpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel HLabel = new JLabel("\uD0A4");
		HLabel.setPreferredSize(new Dimension(90, 40));
		HLabel.setHorizontalAlignment(SwingConstants.LEFT);
		HLabel.setBackground(Color.WHITE);
		hpanel.add(HLabel, BorderLayout.WEST);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		hpanel.add(textField_6, BorderLayout.CENTER);
		
		JPanel wpanel = new JPanel();
		wpanel.setBackground(Color.WHITE);
		wpanel.setBounds(12, 400, 340, 40);
		signuppanel.add(wpanel);
		wpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel wLabel = new JLabel("\uBAB8\uBB34\uAC8C");
		wLabel.setPreferredSize(new Dimension(90, 40));
		wLabel.setHorizontalAlignment(SwingConstants.LEFT);
		wLabel.setBackground(Color.WHITE);
		wpanel.add(wLabel, BorderLayout.WEST);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		wpanel.add(textField_7, BorderLayout.CENTER);
		
		JButton signupButton = new JButton("\uAC00\uC785\uD558\uAE30");
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signupButton.setForeground(Color.WHITE);
		signupButton.setFont(new Font("문체부 제목 돋음체", Font.BOLD, 20));
		signupButton.setBorderPainted(false);
		signupButton.setBackground(new Color(17, 113, 89));
		signupButton.setBounds(187, 521, 165, 50);
		frame.getContentPane().add(signupButton);
		
		frame.setVisible(true);

	}
}
