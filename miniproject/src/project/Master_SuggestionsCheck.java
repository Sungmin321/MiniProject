package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class Master_SuggestionsCheck {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156); 
	private JFrame frame;
	String names[] = {"ºù±×·¹", "Á¶¾È³ª", "ÀÌÁø¼ö", "", "", ""};
	String positions[] = {"2022/06/28","2022/05/05","2022/03/23","","",""};
	
	public static void main(String[] args) {
		new Master_SuggestionsCheck();
	}

	public Master_SuggestionsCheck() {
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
		
		JLabel titleLabel = new JLabel("Master_SuggestionsCheck");
		titleLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton beforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		beforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Master();
			}
		});
		beforeButton.setForeground(Color.WHITE);
		beforeButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		beforeButton.setBorderPainted(false);
		beforeButton.setBackground(new Color(52, 152, 219));
		beforeButton.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(beforeButton);
		
		JPanel canceluppanel = new JPanel();
		canceluppanel.setBackground(Color.WHITE);
		canceluppanel.setBounds(0, 58, 364, 450);
		frame.getContentPane().add(canceluppanel);
		canceluppanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		canceluppanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(12, 66, 340, 374);
		canceluppanel.add(scrollPane);
		scrollPane.setBackground(Color.white);
		
		JPanel PTcancelpanel = new JPanel();
		scrollPane.setColumnHeaderView(PTcancelpanel);
		PTcancelpanel.setBackground(Color.WHITE);
		PTcancelpanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel nameLabel = new JLabel(names[0]);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(nameLabel);
		
		JLabel countLabel = new JLabel(positions[0]);
		countLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(countLabel);
		
		JButton CheckButton = new JButton("\uD655\uC778");
		PTcancelpanel.add(CheckButton);
		CheckButton.setBackground(btblue);
		CheckButton.setForeground(Color.white);
		CheckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Master_SuggestionsCheckDialog.main(null);
			}
		});
		CheckButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		
		JLabel nameLabel_1 = new JLabel(names[1]);
		nameLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(nameLabel_1);
		
		JLabel countLabel_1 = new JLabel(positions[1]);
		countLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(countLabel_1);
		
		JButton CheckButton_1 = new JButton("\uD655\uC778");
		CheckButton_1.setForeground(Color.WHITE);
		CheckButton_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		CheckButton_1.setBackground(new Color(52, 152, 219));
		PTcancelpanel.add(CheckButton_1);
		
		JLabel nameLabel_1_1 = new JLabel(names[2]);
		nameLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(nameLabel_1_1);
		
		JLabel countLabel_1_1 = new JLabel(positions[2]);
		countLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(countLabel_1_1);
		
		JButton CheckButton_2 = new JButton("\uD655\uC778\uC644\uB8CC");
		CheckButton_2.setForeground(Color.WHITE);
		CheckButton_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		CheckButton_2.setBackground(Color.DARK_GRAY);
		PTcancelpanel.add(CheckButton_2);
		
		JLabel nameLabel_1_1_1 = new JLabel(names[3]);
		nameLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(nameLabel_1_1_1);
		
		JPanel titlepanel = new JPanel();
		titlepanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		titlepanel.setBounds(12, 10, 340, 55);
		canceluppanel.add(titlepanel);
		titlepanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel titleLabel1 = new JLabel("\uC131\uBA85");
		titlepanel.add(titleLabel1);
		titleLabel1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel titleLabel2 = new JLabel("\uAC8C\uC2DC \uB0A0\uC9DC");
		titlepanel.add(titleLabel2);
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		
		frame.setVisible(true);

	}
}