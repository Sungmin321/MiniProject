package healthymain.trainer;

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

import healthymain.customer.CustomerMain;
import healthymain.customer.plan.Plan;
import healthymain.database.InsertUpdate;
import healthymain.database.MemberVo;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TrainerInfoRetouch {

	private JFrame frame;

	public TrainerInfoRetouch() {
		JTextField textField;
		JPasswordField passwordField;
		JPasswordField repasswordField;
		JTextField telltextField;

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
				new TrainerMain();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);

		JLabel titleLabel = new JLabel("Trainer_PrivacyRetouch");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);

		JButton BeforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TrainerMain();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		BeforeButton.setBorderPainted(false);
		BeforeButton.setBackground(new Color(52, 152, 219));
		BeforeButton.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(BeforeButton);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBounds(0, 117, 364, 187);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);

		JPanel idpanel = new JPanel();
		idpanel.setBackground(Color.WHITE);
		idpanel.setBounds(12, 10, 340, 40);
		panel_3.add(idpanel);
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
		panel_3.add(passwordpanel);
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
		panel_3.add(repasswordpanel);
		repasswordpanel.setLayout(new BorderLayout(0, 0));

		JLabel repasswordLabel = new JLabel("비밀번호 재확인");
		repasswordLabel.setPreferredSize(new Dimension(90, 40));
		repasswordLabel.setBackground(Color.WHITE);
		repasswordpanel.add(repasswordLabel, BorderLayout.WEST);

		repasswordField = new JPasswordField();
		repasswordpanel.add(repasswordField, BorderLayout.CENTER);

		JPanel tellpanel = new JPanel();
		tellpanel.setBackground(Color.WHITE);
		tellpanel.setBounds(12, 138, 340, 40);
		panel_3.add(tellpanel);
		tellpanel.setLayout(new BorderLayout(0, 0));

		JLabel telLabel = new JLabel("전화번호(-제외)");
		telLabel.setPreferredSize(new Dimension(90, 40));
		telLabel.setHorizontalAlignment(SwingConstants.LEFT);
		telLabel.setBackground(Color.WHITE);
		tellpanel.add(telLabel, BorderLayout.WEST);

		telltextField = new JTextField();
		telltextField.setColumns(10);
		tellpanel.add(telltextField, BorderLayout.CENTER);

		JButton SaveButton = new JButton("\uC218\uC815\uD558\uAE30");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password, tel;
				if (passwordField.getText().equals(repasswordField.getText())) {
					password = passwordField.getText();
					tel = telltextField.getText();

					if (new InsertUpdate().isTrainerInfoModify(password, tel, MemberVo.user.getId())) {
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
