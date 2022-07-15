package healthymain.customer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import healthymain.Login;
import healthymain.customer.inout.InOut;
import healthymain.customer.mypage.MyPage;
import healthymain.customer.personaltraining.PersonalTraining;
import healthymain.customer.plan.Plan;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;

public class CustomerMain {

	private JFrame frame;
	private String name, PT_number;

	public CustomerMain() {
		Color toolgreen = new Color(26, 188, 156);
		Color Jgreen = new Color(17, 113, 89);

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

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new CustomerMain();
			}
		});

		btnNewButton.setPreferredSize(new Dimension(60, 60));
		btnNewButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		btnNewButton.setBackground(toolgreen);
		btnNewButton.setBorderPainted(false);
		panel.add(btnNewButton, BorderLayout.WEST);

		JLabel lblNewLabel = new JLabel("healthy home");
		lblNewLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JButton LogoutButton = new JButton("");
		LogoutButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\logout.png"));
		LogoutButton.setPreferredSize(new Dimension(60, 60));
		LogoutButton.setBackground(toolgreen);
		LogoutButton.setBorderPainted(false);
		LogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					frame.setVisible(false);
					new Login();
				}
			}
		});
		panel.add(LogoutButton, BorderLayout.EAST);

		ImageIcon icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\planicon.png");
		Image img = icon.getImage();
		// 창의 사이즈인 500,500에 맞춰서 이미지를 변경
		Image changeImg = img.getScaledInstance(150,150, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);

		JButton PlanButton = new JButton(changeIcon);
		PlanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Plan();
			}
		});
		PlanButton.setBackground(Color.WHITE);
		PlanButton.setBounds(22, 247, 150, 150);
		PlanButton.setBorderPainted(false);
		frame.getContentPane().add(PlanButton);

		icon = new ImageIcon("D:\\work\\miniproject\\image\\inouticon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton InoutButton = new JButton(changeIcon);
		InoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new InOut();
			}
		});
		InoutButton.setBorderPainted(false);
		InoutButton.setBackground(Color.WHITE);
		InoutButton.setBounds(191, 247, 150, 150);

		frame.getContentPane().add(InoutButton);

		icon = new ImageIcon("D:\\work\\miniproject\\image\\PTicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton PTButton = new JButton(changeIcon);
		PTButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PersonalTraining();
			}
		});
		PTButton.setBorderPainted(false);
		PTButton.setBackground(Color.WHITE);
		PTButton.setBounds(22, 421, 150, 150);
		frame.getContentPane().add(PTButton);

		icon = new ImageIcon("D:\\work\\miniproject\\image\\mypageicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton MypageButton = new JButton(changeIcon);
		MypageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new MyPage();
			}
		});
		MypageButton.setBorderPainted(false);
		MypageButton.setBackground(Color.WHITE);
		MypageButton.setBounds(191, 421, 150, 150);
		frame.getContentPane().add(MypageButton);

		name = new MemberDAO().getCustomerName(MemberVo.user.getId());
		JButton btnName = new JButton(name);
		btnName.setForeground(Color.WHITE);
		btnName.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		btnName.setBackground(Jgreen);
		btnName.setBounds(56, 81, 250, 60);
		frame.getContentPane().add(btnName);
		btnName.setBorderPainted(false);

		PT_number = new MemberDAO().getCustomerPtNumber_Id(MemberVo.user.getId());
		JButton PTcountbtn = new JButton("잔여 P.T : " + PT_number + "회");
		PTcountbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		PTcountbtn.setForeground(Color.WHITE);
		PTcountbtn.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		PTcountbtn.setBackground(Jgreen);
		PTcountbtn.setBounds(56, 162, 250, 60);
		PTcountbtn.setBorderPainted(false);
		frame.getContentPane().add(PTcountbtn);
		frame.setVisible(true);

	}
}