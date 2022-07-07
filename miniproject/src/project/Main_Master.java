package project;

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
import javax.swing.Icon;

public class Main_Master {

	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);   
	public static void main(String[] args) {
		new Main_Master();
	}

	public Main_Master() {
		System.out.println(MemberVo.user.getId());
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
				new Main_Master();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);
		
		JLabel titleLabel = new JLabel("healthy home(Matser)");
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
		
		ImageIcon icon = new ImageIcon("D:\\work\\miniproject\\image\\CMainnameBack.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\CMainPTBack.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\managementicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton mButton1 = new JButton(changeIcon);
		mButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Master_Management();
			}
		});
		mButton1.setBackground(Color.WHITE);
		mButton1.setBounds(22, 247, 150, 150);
		mButton1.setBorderPainted(false);
		frame.getContentPane().add(mButton1);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\joinicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);		
		
		JButton mButton2 = new JButton(changeIcon);
		mButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Master_TRSignup();
			}
		});
		mButton2.setBorderPainted(false);
		mButton2.setBackground(Color.WHITE);
		mButton2.setBounds(191, 247, 150, 150);
		
		frame.getContentPane().add(mButton2);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\optionicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton mButton3 = new JButton(changeIcon);
		mButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Master_PtOption();
			}
		});
		mButton3.setBorderPainted(false);
		mButton3.setBackground(Color.WHITE);
		mButton3.setBounds(22, 421, 150, 150);
		frame.getContentPane().add(mButton3);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\Sugicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton mButton4 = new JButton(changeIcon);
		mButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Master_SuggestionsCheck();
			}
		});
		mButton4.setBorderPainted(false);
		mButton4.setBackground(Color.WHITE);
		mButton4.setBounds(191, 421, 150, 150);
		frame.getContentPane().add(mButton4);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\micon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JLabel sLabel = new JLabel(changeIcon);
		sLabel.setBounds(282, 70, 70, 70);
		frame.getContentPane().add(sLabel);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\Mastericon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JLabel LLabel = new JLabel(changeIcon);
		LLabel.setBounds(107, 77, 150, 150);
		frame.getContentPane().add(LLabel);
		frame.setVisible(true);
		
	}
}