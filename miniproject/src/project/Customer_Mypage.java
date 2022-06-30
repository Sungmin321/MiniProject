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
import javax.swing.Icon;
import javax.swing.SwingConstants;

public class Customer_Mypage {
	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);   
	Color btblue = new Color(52, 152, 219);   

	public static void main(String[] args) {
		new Customer_Mypage();
	}

	public Customer_Mypage() {
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
				new Main_Customer();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);
		
		JLabel titleLabel = new JLabel("Mypage");
		titleLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		JButton BeforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Customer();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		BeforeButton.setBorderPainted(false);
		BeforeButton.setBackground(new Color(52, 152, 219));
		BeforeButton.setBounds(10, 520, 345, 50);
		frame.getContentPane().add(BeforeButton);
		
		ImageIcon icon = new ImageIcon("D:\\work\\miniproject\\image\\retochicon.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(230, 60, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JButton pravicyRetouchButton = new JButton(changeIcon);
		pravicyRetouchButton.setBackground(Color.WHITE);
		pravicyRetouchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Mypage_retouch();
			}
		});
		pravicyRetouchButton.setBounds(67, 90, 230, 60);
		pravicyRetouchButton.setBorderPainted(false);
		frame.getContentPane().add(pravicyRetouchButton);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\Suggestionsicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(230, 60, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton SuggestionsButton = new JButton(changeIcon);
		SuggestionsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Mypage_Suggestions();
			}
		});
		SuggestionsButton.setBorderPainted(false);
		SuggestionsButton.setBackground(Color.WHITE);
		SuggestionsButton.setBounds(67, 180, 230, 60);
		frame.getContentPane().add(SuggestionsButton);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\reservationlookupicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(230, 60, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		frame.setVisible(true);
		

	}
}
