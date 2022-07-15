package healthymain;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import healthymain.customer.CustomerMain;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;
import healthymain.master.MasterMain;
import healthymain.trainer.TrainerMain;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private MemberVo vo;
	private boolean flag;

	public static void main(String[] args) {
		new Login();
	}

	public Login() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(380, 620);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JLabel rogoLabel = new JLabel("well healthy");
		rogoLabel.setForeground(new Color(17, 113, 89));
		rogoLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 47));
		rogoLabel.setBounds(41, 10, 280, 68);
		frame.getContentPane().add(rogoLabel);

		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		loginButton.setBorderPainted(false);
		loginButton.setBackground(Color.WHITE);
		loginButton.setBounds(107, 460, 160, 73);
		frame.getContentPane().add(loginButton);

		JButton SignupButton = new JButton(
				"회원가입");
		SignupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new SignUp();
			}
		});
		SignupButton.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		SignupButton.setBorderPainted(false);
		SignupButton.setBackground(Color.WHITE);
		SignupButton.setBounds(12, 543, 344, 33);
		frame.getContentPane().add(SignupButton);

		JPanel pwdpanel = new JPanel();
		pwdpanel.setBackground(Color.WHITE);
		pwdpanel.setBounds(12, 377, 340, 30);
		frame.getContentPane().add(pwdpanel);
		pwdpanel.setLayout(new BorderLayout(0, 0));

		JLabel passwordLabel = new JLabel("PASSWORD");
		passwordLabel.setPreferredSize(new Dimension(90, 40));
		passwordLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		pwdpanel.add(passwordLabel, BorderLayout.WEST);

		passwordField = new JPasswordField();
		pwdpanel.add(passwordField, BorderLayout.CENTER);

		JPanel radiopanel = new JPanel();
		radiopanel.setBackground(Color.WHITE);
		radiopanel.setBounds(12, 417, 344, 33);
		frame.getContentPane().add(radiopanel);
		radiopanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JRadioButton MasterRadioButton = new JRadioButton("관리자");
		MasterRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		MasterRadioButton.setBackground(Color.WHITE);
		radiopanel.add(MasterRadioButton);

		JRadioButton TrannerRadioButton = new JRadioButton("트레이너");
		TrannerRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		TrannerRadioButton.setBackground(Color.WHITE);
		radiopanel.add(TrannerRadioButton);

		JRadioButton CustomerRadioButton = new JRadioButton("회원");
		CustomerRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		CustomerRadioButton.setBackground(Color.WHITE);
		radiopanel.add(CustomerRadioButton);

		JPanel idpanel = new JPanel();
		idpanel.setBackground(Color.WHITE);
		idpanel.setBounds(12, 348, 340, 30);
		frame.getContentPane().add(idpanel);
		idpanel.setLayout(new BorderLayout(0, 0));

		JLabel idLabel = new JLabel("ID");
		idLabel.setPreferredSize(new Dimension(90, 40));
		idLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		idLabel.setBackground(Color.WHITE);
		idpanel.add(idLabel, BorderLayout.WEST);

		textField = new JTextField();
		textField.setColumns(10);
		idpanel.add(textField, BorderLayout.CENTER);

		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") & passwordField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "ID와 PASSWORD를 입력해주세요");
				} else if (textField.getText().equals(""))
					JOptionPane.showMessageDialog(null, "ID를 입력해주세요");
				else if (passwordField.getText().equals(""))
					JOptionPane.showMessageDialog(null, "PASSWORD를 입력해주세요");
				else {
					String id = textField.getText();
					vo = new MemberVo(id, passwordField.getText());
					MemberVo.userInit(vo); // Membervo에 정보 저장
					if (CustomerRadioButton.isSelected()) {
						flag = new MemberDAO().hasCustomerLogin(vo);
						if (flag) {
							System.out.println();
							JOptionPane.showMessageDialog(null, "로그인 성공\n");
							frame.setVisible(false);
							new CustomerMain();
						} else {
							System.out.println("로그인실패");
							JOptionPane.showMessageDialog(null, "로그인 실패\nID,PASSWORD를 확인해주세요");
						}
					} else if (TrannerRadioButton.isSelected()) {
						flag = new MemberDAO().hasTrainerLogin(vo);
						if (flag) {
							JOptionPane.showMessageDialog(null, "로그인 성공");
							System.out.println("로그인 성공하셨습니다");
							frame.setVisible(false);
							new TrainerMain();
						} else
							JOptionPane.showMessageDialog(null, "로그인 실패\nID,PASSWORD를 확인해주세요");
					} else if (MasterRadioButton.isSelected()) {
						flag = new MemberDAO().hasMasterLogin(vo);
						if (flag) {
							JOptionPane.showMessageDialog(null, "로그인 성공");
							System.out.println("로그인 성공하셨습니다");
							frame.setVisible(false);
							new MasterMain();
						} else
							JOptionPane.showMessageDialog(null, "로그인 실패\nID,PASSWORD를 확인해주세요");
					}
				}
			}
		});

		ButtonGroup group = new ButtonGroup();
		group.add(MasterRadioButton);
		group.add(TrannerRadioButton);
		group.add(CustomerRadioButton);
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\\uB85C\uADF8\uC778 \uC0AC\uB78C.png"));
		Logo.setBounds(68, 85, 228, 236);
		frame.getContentPane().add(Logo);
		frame.setVisible(true);
	}
}
