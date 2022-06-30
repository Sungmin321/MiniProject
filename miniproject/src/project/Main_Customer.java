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

public class Main_Customer {

	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);   
	public static void main(String[] args) {
		new Main_Customer();
	}

	public Main_Customer() {
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Customer();
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
		
		ImageIcon icon = new ImageIcon("D:\\work\\miniproject\\image\\CMainnameBack.png");
		Image img = icon.getImage();
		// 창의 사이즈인 500,500에 맞춰서 이미지를 변경
		Image changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JLabel lblNewLabel_1 = new JLabel(changeIcon);
		lblNewLabel_1.setText("");
		lblNewLabel_1.setBounds(22, 75, 150, 150);
		frame.getContentPane().add(lblNewLabel_1);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\CMainPTBack.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JLabel lblNewLabel_1_1 = new JLabel(changeIcon);
		lblNewLabel_1_1.setBounds(191, 75, 150, 150);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\planicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton btnNewButton_1 = new JButton(changeIcon);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Plan();
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(22, 247, 150, 150);
		btnNewButton_1.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_1);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\inouticon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);		
		
		JButton btnNewButton_1_1 = new JButton(changeIcon);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_InOut();
			}
		});
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(191, 247, 150, 150);
		
		frame.getContentPane().add(btnNewButton_1_1);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\PTicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton btnNewButton_1_2 = new JButton(changeIcon);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_PersonalTrainer();
			}
		});
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(22, 421, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\mypageicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton btnNewButton_1_2_1 = new JButton(changeIcon);
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Customer_Mypage();
			}
		});
		btnNewButton_1_2_1.setBorderPainted(false);
		btnNewButton_1_2_1.setBackground(Color.WHITE);
		btnNewButton_1_2_1.setBounds(191, 421, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2_1);
		frame.setVisible(true);
		
	}
}