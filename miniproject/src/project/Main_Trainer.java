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
import javax.swing.JPanel;

public class Main_Trainer {

	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);   
	public static void main(String[] args) {
		new Main_Trainer();
	}

	public Main_Trainer() {
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
				new Main_Trainer();
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
		
		ImageIcon icon = new ImageIcon("D:\\work\\miniproject\\image\\CMainnameBack.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\CMainPTBack.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\tricon1.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton trButton1 = new JButton(changeIcon);
		trButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Trainer_Scheduleinquiry();
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
				new Trainer_ScheduleCancel();
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
				new Trainer_TimeSet();
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
			new Trainer_retouch();
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
		
		JLabel lblNewLabel = new JLabel(changeIcon);
		lblNewLabel.setBounds(142, 150, 70, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD2B8\uB808\uC774\uB108");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setEnabled(false);
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBackground(new Color(0, 255, 127));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(56, 70, 250, 60);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
		
	}
}