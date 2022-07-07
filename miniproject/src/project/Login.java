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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
				if (textField.getText().equals("") & passwordField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "ID와 PASSWORD를 입력해주세요");
				} else if (textField.getText().equals(""))
					JOptionPane.showMessageDialog(null, "ID를 입력해주세요");
				else if (passwordField.getText().equals(""))
					JOptionPane.showMessageDialog(null, "PASSWORD를 입력해주세요");
				else {
					String id = textField.getText();
					vo = new MemberVo(id, passwordField.getText());
					MemberVo.userInit(vo);
//							MemberVo.user.getId();
					if (CustomerRadioButton.isSelected()) {
						flag = new MemberDAO().Customer_Login(vo);
						if (flag) {
							System.out.println();
							JOptionPane.showMessageDialog(null, "로그인 성공\n");
							frame.setVisible(false);
							new Main_Customer();
//						new Main_Customer(id);
						} else {
							System.out.println("로그인실패");
							JOptionPane.showMessageDialog(null, "로그인 실패\nID,PASSWORD를 확인해주세요");
						}
					} else if (TrannerRadioButton.isSelected()) {
						flag = new MemberDAO().Trainer_Login(vo);
						if (flag) {
							JOptionPane.showMessageDialog(null, "로그인 성공");
//						JOptionPane.showConfirmDialog(null, e);
							System.out.println("로그인 성공하셨습니다");
							frame.setVisible(false);
							new Main_Trainer();
//						new Main_Trainer(id);
						} else
							JOptionPane.showMessageDialog(null, "로그인 실패\nID,PASSWORD를 확인해주세요");
					} else if (MasterRadioButton.isSelected()) {
						flag = new MemberDAO().Master_Login(vo);
						if (flag) {
							JOptionPane.showMessageDialog(null, "로그인 성공");
							System.out.println("로그인 성공하셨습니다");
							frame.setVisible(false);
							new Main_Master();
//						new Main_Master(id);
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
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\\uB85C\uADF8\uC778 \uC0AC\uB78C.png"));
		lblNewLabel_2.setBounds(61, 61, 241, 277);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setVisible(true);
	}
}
