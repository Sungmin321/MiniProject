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
	Color Jgreen = new Color(17, 113, 89); 
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
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\CMainPTBack.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\planicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton PlanButton = new JButton(changeIcon);
		PlanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Plan();
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
				new Customer_InOut();
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
				new Customer_PersonalTrainer();
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
			new Customer_Mypage();
			}
		});
		MypageButton.setBorderPainted(false);
		MypageButton.setBackground(Color.WHITE);
		MypageButton.setBounds(191, 421, 150, 150);
		frame.getContentPane().add(MypageButton);
		
		JButton btnName = new JButton("name");
		btnName.setForeground(Color.WHITE);
		btnName.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		btnName.setBackground(Jgreen);
		btnName.setBounds(56, 81, 250, 60);
		frame.getContentPane().add(btnName);
		btnName.setBorderPainted(false);
		
		JButton PTcountbtn = new JButton("\uC794\uC5EC P.T \uD69F\uC218 : ");
		PTcountbtn.setForeground(Color.WHITE);
		PTcountbtn.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		PTcountbtn.setBackground(Jgreen);
		PTcountbtn.setBounds(56, 162, 250, 60);
		PTcountbtn.setBorderPainted(false);
		frame.getContentPane().add(PTcountbtn);
		frame.setVisible(true);
		
	}
}