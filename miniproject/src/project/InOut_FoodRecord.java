package project;

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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import project.Customer_Plan;
import project.Main_Customer;

import java.awt.SystemColor;
import javax.swing.JTextArea;

public class InOut_FoodRecord {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	
	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156); 
	
	public static void main(String[] args) {
		new InOut_FoodRecord();
	}

	public InOut_FoodRecord() {
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
		
		JLabel lblNewLabel = new JLabel("IN&OUT FoodRecord");
		lblNewLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		
		JButton BeforeButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_InOut();
			}
		});
		BeforeButton_1_3.setForeground(Color.WHITE);
		BeforeButton_1_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		BeforeButton_1_3.setBorderPainted(false);
		BeforeButton_1_3.setBackground(new Color(52, 152, 219));
		BeforeButton_1_3.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(BeforeButton_1_3);
		
		ImageIcon icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\rutinadd.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(350, 48, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBounds(0, 59, 364, 452);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JLabel FoodRecordLabel = new JLabel("\uC2DD\uB2E8 \uAE30\uB85D");
		FoodRecordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FoodRecordLabel.setFont(new Font("±¼¸²", Font.BOLD, 25));
		FoodRecordLabel.setBackground(Color.WHITE);
		FoodRecordLabel.setBounds(-7, 3, 161, 50);
		panel_3.add(FoodRecordLabel);
		
		JTextArea FoodRecordtextArea = new JTextArea();
		FoodRecordtextArea.setBounds(12, 50, 340, 392);
		panel_3.add(FoodRecordtextArea);
		
		JButton SaveButton = new JButton("SAVE");
		SaveButton.setForeground(Color.WHITE);
		SaveButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		SaveButton.setBorderPainted(false);
		SaveButton.setBackground(new Color(52, 152, 219));
		SaveButton.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(SaveButton);
		
		ButtonGroup group = new ButtonGroup();
		frame.setVisible(true);

	}
}
