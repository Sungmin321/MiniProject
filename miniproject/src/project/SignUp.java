package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class SignUp {
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
	private JTextField teltextField;
	String ID, PASSWORD, NAME, BIRTHDAY, EMAIL;
	int SEX, PHONE_NUMBER;

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
		frame.setSize(380, 620);
		frame.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		frame.setContentPane(contentPane);
		frame.setVisible(true);
		contentPane.setLayout(null);

		JLabel logoLabel = new JLabel("well healthy");
		logoLabel.setBackground(Color.WHITE);
		logoLabel.setFont(new Font("���� ���", Font.BOLD, 24));
		logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoLabel.setBounds(100, 10, 164, 35);
		contentPane.add(logoLabel);
		logoLabel.setForeground(Jgreen);

		JLabel signupLabel = new JLabel("ȸ������");
		signupLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signupLabel.setForeground(Color.BLACK);
		signupLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		signupLabel.setBackground(Color.WHITE);
		signupLabel.setBounds(100, 48, 164, 35);
		contentPane.add(signupLabel);

		JPanel idpanel = new JPanel();
		idpanel.setBackground(Color.WHITE);
		idpanel.setBounds(12, 93, 340, 40);
		contentPane.add(idpanel);
		idpanel.setLayout(new BorderLayout(0, 0));

		JLabel idLabel = new JLabel("���̵�");
		idLabel.setHorizontalAlignment(SwingConstants.LEFT);
		idLabel.setBackground(Color.WHITE);
		idLabel.setPreferredSize(new Dimension(90, 40));
		idpanel.add(idLabel, BorderLayout.WEST);

		txtId = new JTextField();
		idpanel.add(txtId, BorderLayout.CENTER);
		txtId.setColumns(10);

		JPanel pwpanel = new JPanel();
		pwpanel.setBackground(Color.WHITE);
		pwpanel.setBounds(12, 143, 340, 40);
		contentPane.add(pwpanel);
		pwpanel.setLayout(new BorderLayout(0, 0));

		JLabel pwLabel = new JLabel("��й�ȣ");
		pwLabel.setHorizontalAlignment(SwingConstants.LEFT);
		pwLabel.setBackground(Color.WHITE);
		pwpanel.add(pwLabel, BorderLayout.WEST);
		pwLabel.setPreferredSize(new Dimension(90, 40));

		passwordField = new JPasswordField();
		pwpanel.add(passwordField, BorderLayout.CENTER);

		JPanel pwrpanel = new JPanel();
		pwrpanel.setBackground(Color.WHITE);
		pwrpanel.setBounds(12, 193, 340, 40);
		contentPane.add(pwrpanel);
		pwrpanel.setLayout(new BorderLayout(0, 0));

		JLabel pwrLabel = new JLabel("��й�ȣ ��Ȯ��");
		pwrLabel.setPreferredSize(new Dimension(90, 40));
		pwrLabel.setBackground(Color.WHITE);
		pwrpanel.add(pwrLabel, BorderLayout.WEST);

		passwordField_1 = new JPasswordField();
		pwrpanel.add(passwordField_1, BorderLayout.CENTER);

		JPanel namepanel = new JPanel();
		namepanel.setBackground(Color.WHITE);
		namepanel.setBounds(12, 243, 340, 40);
		contentPane.add(namepanel);
		namepanel.setLayout(new BorderLayout(0, 0));

		JLabel nLabel = new JLabel("�̸�");
		nLabel.setPreferredSize(new Dimension(90, 40));
		nLabel.setHorizontalAlignment(SwingConstants.LEFT);
		nLabel.setBackground(Color.WHITE);
		namepanel.add(nLabel, BorderLayout.WEST);

		nametextField = new JTextField();
		nametextField.setColumns(10);
		namepanel.add(nametextField, BorderLayout.CENTER);

		JPanel sexpanel = new JPanel();
		sexpanel.setBackground(Color.WHITE);
		sexpanel.setBounds(12, 293, 340, 40);
		contentPane.add(sexpanel);
		sexpanel.setLayout(new BorderLayout(0, 0));

		JLabel sexLabel = new JLabel("����");
		sexLabel.setPreferredSize(new Dimension(90, 40));
		sexLabel.setHorizontalAlignment(SwingConstants.LEFT);
		sexLabel.setBackground(Color.WHITE);
		sexpanel.add(sexLabel, BorderLayout.WEST);

		JRadioButton MRadioButton = new JRadioButton("����");
		MRadioButton.setBackground(Color.WHITE);
		MRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		sexpanel.add(MRadioButton, BorderLayout.CENTER);
		MRadioButton.setPreferredSize(new Dimension(125, 38));

		JRadioButton WRadioButton = new JRadioButton("����");
		WRadioButton.setBackground(Color.WHITE);
		WRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		sexpanel.add(WRadioButton, BorderLayout.EAST);
		WRadioButton.setPreferredSize(new Dimension(125, 38));

		ButtonGroup s = new ButtonGroup();
		s.add(MRadioButton);
		s.add(WRadioButton);

		JPanel BDpanel = new JPanel();
		BDpanel.setBackground(Color.WHITE);
		BDpanel.setBounds(12, 343, 340, 40);
		contentPane.add(BDpanel);
		BDpanel.setLayout(new BorderLayout(0, 0));

		JLabel BDLabel = new JLabel("�������(6�ڸ�)");
		BDLabel.setPreferredSize(new Dimension(90, 40));
		BDLabel.setHorizontalAlignment(SwingConstants.LEFT);
		BDLabel.setBackground(Color.WHITE);
		BDpanel.add(BDLabel, BorderLayout.WEST);

		BDtextField = new JTextField();
		BDtextField.setColumns(10);
		BDpanel.add(BDtextField, BorderLayout.CENTER);

		JPanel emailpanel = new JPanel();
		emailpanel.setBackground(Color.WHITE);
		emailpanel.setBounds(102, 393, 250, 40);
		contentPane.add(emailpanel);
		emailpanel.setLayout(new GridLayout(0, 3, 0, 0));

		mailidtextField = new JTextField();
		mailidtextField.setColumns(10);
		emailpanel.add(mailidtextField);
		mailidtextField.setPreferredSize(new Dimension(100, 40));

		JLabel Label = new JLabel("@");
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		emailpanel.add(Label);
		Label.setPreferredSize(new Dimension(10, 36));

		mailtextField = new JTextField();
		mailtextField.setPreferredSize(new Dimension(90, 30));
		mailtextField.setColumns(10);
		emailpanel.add(mailtextField);

		JPanel telpanel = new JPanel();
		telpanel.setBackground(Color.WHITE);
		telpanel.setBounds(12, 443, 340, 40);
		contentPane.add(telpanel);
		telpanel.setLayout(new BorderLayout(0, 0));

		JLabel telLabel = new JLabel("��ȭ��ȣ(-����)");
		telLabel.setPreferredSize(new Dimension(90, 40));
		telLabel.setHorizontalAlignment(SwingConstants.LEFT);
		telLabel.setBackground(Color.WHITE);
		telpanel.add(telLabel, BorderLayout.WEST);

		teltextField = new JTextField();
		teltextField.setColumns(10);
		telpanel.add(teltextField, BorderLayout.CENTER);

		JButton signupButton = new JButton("�����ϱ�");
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtId.getText().length() > 4) {
					JOptionPane.showMessageDialog(null, "ID�� 5�ڸ� �̻� �Է����ּ���.");
				} else if (passwordField.getText().length() > 4) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� 5�ڸ� �̻� �Է����ּ���.");
				} else if (passwordField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "��й�ȣ ��Ȯ���� ��Ȯ�� �Է����ּ���.");
				} else if (nametextField.getText().length() > 2) {
					JOptionPane.showMessageDialog(null, "�̸��� 2�ڸ� �̻� �Է����ּ���.");
				} else if (BDtextField.getText().chars().allMatch(Character::isDigit)) {
					JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ���.");
				} else if (mailidtextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���� ���̵� �Է����ּ���.");
				} else if (mailtextField.getText().length() > 6) {
					JOptionPane.showMessageDialog(null, "���� �ּҸ� ��Ȯ�� �Է����ּ���.");
				} else if (teltextField.getText().chars().allMatch(Character::isDigit)) {
					JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ���.");
				}
				// ��й�ȣ, ��й�ȣ ��Ȯ���� ����Ǿ� �����ܰ�� �Ѿ.
				else if (passwordField.getText().equals(passwordField_1.getText())) {
					ID = txtId.getText();
					PASSWORD = passwordField.getText();
					NAME = nametextField.getText();
					if (MRadioButton.isSelected()) {
						SEX = 1;
					} else {
						SEX = 2;
					}
					BIRTHDAY = BDtextField.getText();
					EMAIL = mailidtextField.getText() + "@" + mailtextField.getText();
					PHONE_NUMBER = Integer.parseInt(teltextField.getText());

					boolean b = new Insert().signup(ID, PASSWORD, NAME, SEX, BIRTHDAY, EMAIL, PHONE_NUMBER);

					if (b) {
						System.out.println("��������");
						JOptionPane.showInternalMessageDialog(null, "success\nLoingâ���� �̵�");
						// ����ȭ������ �̵��Ѵٴ� ���̾˷α� ȭ�� �ϳ� ������ֱ�.
						frame.setVisible(false);
						new Login();
					} else {
						System.out.println("����");
						JOptionPane.showInternalMessageDialog(null, "fail\nID �ߺ�, �ٸ�ID�� �Է����ּ���.");
						// �����ߴٴ� ���̾˷α� ȭ�� �ϳ� ������ֱ�.
					}
				} else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �ٸ��ϴ�. �ٽ� Ȯ�����ּ���.");
				}
			}
		});
		signupButton.setFont(new Font("��ü�� ���� ����ü", Font.BOLD, 20));
		signupButton.setBackground(Jgreen);
		signupButton.setForeground(Color.white);
		signupButton.setBounds(85, 523, 195, 48);
		contentPane.add(signupButton);
		signupButton.setBorderPainted(false);

		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(12, 393, 83, 40);
		contentPane.add(emailLabel);
		emailLabel.setPreferredSize(new Dimension(45, 40));
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setBackground(Color.WHITE);
	}
}