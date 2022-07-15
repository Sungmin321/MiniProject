package healthymain.trainer;

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
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;

public class TrainerMain {

	private JFrame frame;

	public TrainerMain() {
		Color toolgreen = new Color(26, 188, 156);
		Color Jorange = new Color(244, 128, 75);
		
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

		JLabel titleLabel = new JLabel("healthy home(Trainer)");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);

		JButton LogoutButton = new JButton("");
		LogoutButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\logout.png"));
		LogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					frame.setVisible(false);
					new Login();
				}
			}
		});
		LogoutButton.setPreferredSize(new Dimension(60, 60));
		LogoutButton.setBorderPainted(false);
		LogoutButton.setBackground(new Color(26, 188, 156));
		panel.add(LogoutButton, BorderLayout.EAST);

		ImageIcon icon = new ImageIcon("D:\\work\\miniproject\\image\\tricon1.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);

		JButton trButton1 = new JButton(changeIcon);
		trButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TrainerScheduleinquiry();
			}
		});
		trButton1.setBackground(Color.WHITE);
		trButton1.setBounds(22, 247, 150, 150);
		trButton1.setBorderPainted(false);
		frame.getContentPane().add(trButton1);

		icon = new ImageIcon("D:\\work\\miniproject\\image\\tricon2.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton trButton2 = new JButton(changeIcon);
		trButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TrainerScheduleCancel();
			}
		});
		trButton2.setBorderPainted(false);
		trButton2.setBackground(Color.WHITE);
		trButton2.setBounds(191, 247, 150, 150);

		frame.getContentPane().add(trButton2);

		icon = new ImageIcon("D:\\work\\miniproject\\image\\tricon3.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton trButton3 = new JButton(changeIcon);
		trButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TrainerInfoTimeSet();
			}
		});
		trButton3.setBorderPainted(false);
		trButton3.setBackground(Color.WHITE);
		trButton3.setBounds(22, 421, 150, 150);
		frame.getContentPane().add(trButton3);

		icon = new ImageIcon("D:\\work\\miniproject\\image\\tricon4.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton trButton4 = new JButton(changeIcon);
		trButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TrainerInfoRetouch();
			}
		});
		trButton4.setBorderPainted(false);
		trButton4.setBackground(Color.WHITE);
		trButton4.setBounds(191, 421, 150, 150);
		frame.getContentPane().add(trButton4);

		icon = new ImageIcon("D:\\work\\miniproject\\image\\tricon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JLabel sLabel = new JLabel(changeIcon);
		sLabel.setBounds(142, 150, 70, 70);
		frame.getContentPane().add(sLabel);

		String name = new MemberDAO().getTrainerName(MemberVo.user.getId());
		JButton trnameButton = new JButton(name + " 트레이너");
		trnameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		trnameButton.setBorderPainted(false);
		trnameButton.setForeground(Color.white);
		trnameButton.setBackground(Jorange);
		trnameButton.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		trnameButton.setBounds(56, 70, 250, 60);
		frame.getContentPane().add(trnameButton);
		frame.setVisible(true);

	}
}