package healthymain.master;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import healthymain.database.InsertUpdate;

public class TrainerSignUp {

	private JFrame frame;

	public TrainerSignUp() {
		JTextField txtId;
		JPasswordField passwordField;
		JPasswordField passwordField_1;
		JTextField nametextField;
		JTextField teltextField;

		Color toolgreen = new Color(26, 188, 156);
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
				new MasterMain();
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
				new MasterMain();
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
		idpanel.setBounds(12, 45, 340, 40);
		signuppanel.add(idpanel);
		idpanel.setLayout(new BorderLayout(0, 0));

		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setPreferredSize(new Dimension(90, 40));
		idLabel.setHorizontalAlignment(SwingConstants.LEFT);
		idLabel.setBackground(Color.WHITE);
		idpanel.add(idLabel, BorderLayout.WEST);

		txtId = new JTextField();
		txtId.setColumns(10);
		idpanel.add(txtId, BorderLayout.CENTER);

		JPanel pwpanel = new JPanel();
		pwpanel.setBackground(Color.WHITE);
		pwpanel.setBounds(12, 105, 340, 40);
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
		pwrpanel.setBounds(12, 165, 340, 40);
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
		namepanel.setBounds(12, 225, 340, 40);
		signuppanel.add(namepanel);
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
		sexpanel.setBounds(12, 285, 340, 40);
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

		JPanel telpanel = new JPanel();
		telpanel.setBackground(Color.WHITE);
		telpanel.setBounds(12, 345, 340, 40);
		signuppanel.add(telpanel);
		telpanel.setLayout(new BorderLayout(0, 0));

		JLabel telLabel = new JLabel("\uC804\uD654\uBC88\uD638(-\uC81C\uC678)");
		telLabel.setPreferredSize(new Dimension(90, 40));
		telLabel.setHorizontalAlignment(SwingConstants.LEFT);
		telLabel.setBackground(Color.WHITE);
		telpanel.add(telLabel, BorderLayout.WEST);

		teltextField = new JTextField();
		teltextField.setColumns(10);
		telpanel.add(teltextField, BorderLayout.CENTER);

		JLabel lblNewLabel_1 = new JLabel("\uD2B8\uB808\uC774\uB108 \uC815\uBCF4\uC785\uB825");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(62, 5, 240, 35);
		signuppanel.add(lblNewLabel_1);

		JButton signupButton = new JButton("가입하기");
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID, PASSWORD, NAME, BIRTHDAY, EMAIL;
				int SEX, PHONE_NUMBER;
				ID = txtId.getText();
				// 비밀번호, 비밀번호 재확인이 통과되야 다음단계로 넘어감.
				if (passwordField.getText().equals(passwordField_1.getText())) {
					PASSWORD = passwordField.getText();
					NAME = nametextField.getText();
					if (MRadioButton.isSelected()) {
						SEX = 1;
					} else {
						SEX = 2;
					}
					PHONE_NUMBER = Integer.parseInt(teltextField.getText());

					boolean b = new InsertUpdate().isTrainerSignUp(ID, PASSWORD, NAME, SEX, PHONE_NUMBER);

					if (b) {
						System.out.println("생성성공");
						JOptionPane.showInternalMessageDialog(null, "success");
						// 메인화면으로 이동한다는 다이알로그 화면 하나 만들어주기.
//						frame.setVisible(false);
//						new Login();
					} else {
						System.out.println("실패");
						JOptionPane.showInternalMessageDialog(null, "fail");
						// 실패했다는 다이알로그 화면 하나 만들어주기.
					}
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호 확인 요망");
					System.out.println("비밀번호가 같지않다.");
				}
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
