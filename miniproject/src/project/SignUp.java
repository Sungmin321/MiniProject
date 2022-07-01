package project;

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

public class SignUp{
	Color Jgreen = new Color(17, 113, 89);
	private JFrame frame;
	private JPanel contentPane;
	private JTextField txtId;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField nametextField;
	private JTextField mailidtextField;
	private JTextField BDtextField;
	private JTextField mailtextField;
	private JTextField HtextField;
	private JTextField wtextField;
	private JTextField teltextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new SignUp();
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
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
		
		JPanel idpanel = new JPanel();
		idpanel.setBackground(Color.WHITE);
		idpanel.setBounds(12, 73, 340, 40);
		contentPane.add(idpanel);
		idpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setHorizontalAlignment(SwingConstants.LEFT);
		idLabel.setBackground(Color.WHITE);
		idLabel.setPreferredSize(new Dimension(90, 40));
		idpanel.add(idLabel, BorderLayout.WEST);
		
		txtId = new JTextField();
		idpanel.add(txtId, BorderLayout.CENTER);
		txtId.setColumns(10);
		
		JPanel pwpanel = new JPanel();
		pwpanel.setBackground(Color.WHITE);
		pwpanel.setBounds(12, 114, 340, 40);
		contentPane.add(pwpanel);
		pwpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel pwLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwLabel.setHorizontalAlignment(SwingConstants.LEFT);
		pwLabel.setBackground(Color.WHITE);
		pwpanel.add(pwLabel, BorderLayout.WEST);
		pwLabel.setPreferredSize(new Dimension(90, 40));
		
		passwordField = new JPasswordField();
		pwpanel.add(passwordField, BorderLayout.CENTER);
		
		JPanel pwrpanel = new JPanel();
		pwrpanel.setBackground(Color.WHITE);
		pwrpanel.setBounds(12, 155, 340, 40);
		contentPane.add(pwrpanel);
		pwrpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel pwrLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uC7AC\uD655\uC778");
		pwrLabel.setPreferredSize(new Dimension(90, 40));
		pwrLabel.setBackground(Color.WHITE);
		pwrpanel.add(pwrLabel, BorderLayout.WEST);
		
		passwordField_1 = new JPasswordField();
		pwrpanel.add(passwordField_1, BorderLayout.CENTER);
		
		JPanel namepanel = new JPanel();
		namepanel.setBackground(Color.WHITE);
		namepanel.setBounds(12, 205, 340, 40);
		contentPane.add(namepanel);
		namepanel.setLayout(new BorderLayout(0, 0));
		
		JLabel nLabel = new JLabel("\uC774\uB984");
		nLabel.setPreferredSize(new Dimension(90, 40));
		nLabel.setHorizontalAlignment(SwingConstants.LEFT);
		nLabel.setBackground(Color.WHITE);
		namepanel.add(nLabel, BorderLayout.WEST);
		
		nametextField = new JTextField();
		nametextField.setColumns(10);
		namepanel.add(nametextField, BorderLayout.CENTER);
		
		JPanel sexpanel = new JPanel();
		sexpanel.setBackground(Color.WHITE);
		sexpanel.setBounds(12, 245, 340, 40);
		contentPane.add(sexpanel);
		sexpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel sexLabel = new JLabel("\uC131\uBCC4");
		sexLabel.setPreferredSize(new Dimension(90, 40));
		sexLabel.setHorizontalAlignment(SwingConstants.LEFT);
		sexLabel.setBackground(Color.WHITE);
		sexpanel.add(sexLabel, BorderLayout.WEST);
		
		JRadioButton MRadioButton = new JRadioButton("\uB0A8\uC790");
		MRadioButton.setBackground(Color.WHITE);
		MRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		sexpanel.add(MRadioButton, BorderLayout.CENTER);
		MRadioButton.setPreferredSize(new Dimension(125, 38));
		
		JRadioButton WRadioButton = new JRadioButton("\uC5EC\uC790");
		WRadioButton.setBackground(Color.WHITE);
		WRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		sexpanel.add(WRadioButton, BorderLayout.EAST);
		WRadioButton.setPreferredSize(new Dimension(125, 38));
		
		ButtonGroup s = new ButtonGroup();
		s.add(MRadioButton);
		s.add(WRadioButton);
		
		JPanel BDpanel = new JPanel();
		BDpanel.setBackground(Color.WHITE);
		BDpanel.setBounds(12, 285, 340, 40);
		contentPane.add(BDpanel);
		BDpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel BDLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C(8\uC790\uB9AC)");
		BDLabel.setPreferredSize(new Dimension(90, 40));
		BDLabel.setHorizontalAlignment(SwingConstants.LEFT);
		BDLabel.setBackground(Color.WHITE);
		BDpanel.add(BDLabel, BorderLayout.WEST);
		
		BDtextField = new JTextField();
		BDtextField.setColumns(10);
		BDpanel.add(BDtextField, BorderLayout.CENTER);
		
		JPanel emailpanel = new JPanel();
		emailpanel.setBackground(Color.WHITE);
		emailpanel.setBounds(12, 324, 340, 40);
		contentPane.add(emailpanel);
		emailpanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("\uC774\uBA54\uC77C");
		emailLabel.setBounds(0, 0, 40, 40);
		emailLabel.setPreferredSize(new Dimension(40, 40));
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setBackground(Color.WHITE);
		emailpanel.add(emailLabel);
		
		mailidtextField = new JTextField();
		mailidtextField.setBounds(91, 6, 106, 30);
		mailidtextField.setColumns(10);
		emailpanel.add(mailidtextField);
		mailidtextField.setPreferredSize(new Dimension(90, 40));
		
		JLabel Label = new JLabel("@");
		Label.setBounds(194, 3, 20, 30);
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		emailpanel.add(Label);
		Label.setPreferredSize(new Dimension(20, 40));
		
		mailtextField = new JTextField();
		mailtextField.setBounds(214, 6, 126, 30);
		mailtextField.setPreferredSize(new Dimension(90, 30));
		mailtextField.setColumns(10);
		emailpanel.add(mailtextField);
		
		JPanel telpanel = new JPanel();
		telpanel.setBackground(Color.WHITE);
		telpanel.setBounds(12, 366, 340, 40);
		contentPane.add(telpanel);
		telpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel telLabel = new JLabel("\uC804\uD654\uBC88\uD638(-\uC81C\uC678)");
		telLabel.setPreferredSize(new Dimension(90, 40));
		telLabel.setHorizontalAlignment(SwingConstants.LEFT);
		telLabel.setBackground(Color.WHITE);
		telpanel.add(telLabel, BorderLayout.WEST);
		
		teltextField = new JTextField();
		teltextField.setColumns(10);
		telpanel.add(teltextField, BorderLayout.CENTER);
		
		JPanel hpanel = new JPanel();
		hpanel.setBackground(Color.WHITE);
		hpanel.setBounds(12, 434, 340, 40);
		contentPane.add(hpanel);
		hpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel HLabel = new JLabel("\uD0A4");
		HLabel.setPreferredSize(new Dimension(90, 40));
		HLabel.setHorizontalAlignment(SwingConstants.LEFT);
		HLabel.setBackground(Color.WHITE);
		hpanel.add(HLabel, BorderLayout.WEST);
		
		HtextField = new JTextField();
		HtextField.setColumns(10);
		hpanel.add(HtextField, BorderLayout.CENTER);
		
		JLabel Label2 = new JLabel("*\uC120\uD0DD\uC785\uB825\uC0AC\uD56D");
		Label2.setBackground(Color.WHITE);
		Label2.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.BOLD, 15));
		Label2.setBounds(12, 403, 103, 35);
		contentPane.add(Label2);
		Label2.setForeground(Jgreen);
		
		JPanel wpanel = new JPanel();
		wpanel.setBackground(Color.WHITE);
		wpanel.setBounds(12, 473, 340, 40);
		contentPane.add(wpanel);
		wpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel wLabel = new JLabel("\uBAB8\uBB34\uAC8C");
		wLabel.setPreferredSize(new Dimension(90, 40));
		wLabel.setHorizontalAlignment(SwingConstants.LEFT);
		wLabel.setBackground(Color.WHITE);
		wpanel.add(wLabel, BorderLayout.WEST);
		
		wtextField = new JTextField();
		wtextField.setColumns(10);
		wpanel.add(wtextField, BorderLayout.CENTER);
		
		JButton signupButton = new JButton("\uAC00\uC785\uD558\uAE30");
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Login();
			}
		});
		signupButton.setFont(new Font("¹®Ã¼ºÎ Á¦¸ñ µ¸À½Ã¼", Font.BOLD, 20));
		signupButton.setBackground(Jgreen);
		signupButton.setForeground(Color.white);
		signupButton.setBounds(84, 523, 195, 48);
		contentPane.add(signupButton);
		signupButton.setBorderPainted(false);
		

	}
}
