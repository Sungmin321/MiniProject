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
import java.awt.SystemColor;

public class Plan_ToDayExercise {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	Color Jlightgreen = new Color(177, 212, 98);
	
	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156); 
	
	public static void main(String[] args) {
		new Plan_ToDayExercise();
	}

	public Plan_ToDayExercise() {
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
		
		JLabel lblNewLabel = new JLabel("Plan_ToDay Exercise");
		lblNewLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		
		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Plan();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);
		
		ImageIcon icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\rutinadd.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(350, 48, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 63, 364, 448);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 10, 350, 214);
		panel_3.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(350, 210));
		scrollPane.setViewportView(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(6, 230, 350, 214);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2_1.setBackground(JYellow);
		panel_2_1.setBounds(0, 23, 350, 48);
		panel_4.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
		panel_2_1.add(rdbtnNewRadioButton, BorderLayout.EAST);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2_1_1.setBackground(Jorange);
		panel_2_1_1.setBounds(0, 70, 350, 48);
		panel_4.add(panel_2_1_1);
		panel_2_1_1.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("B");
		panel_2_1_1.add(rdbtnNewRadioButton_1, BorderLayout.EAST);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBounds(0, 118, 350, 48);
		panel_4.add(panel_2_1_2);
		panel_2_1_2.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("C");
		panel_2_1_2.add(rdbtnNewRadioButton_1_1, BorderLayout.EAST);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_1 = new JButton("Rutin1");
		btnNewButton_1.setBackground(JYellow);
		btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		panel_2_1.add(btnNewButton_1, BorderLayout.CENTER);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Plan_ToDayExercise_Rutin1();
			}
		});
		group.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Rutin2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(Jorange);
		panel_2_1_1.add(btnNewButton_1_1, BorderLayout.CENTER);
		group.add(rdbtnNewRadioButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Rutin3");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(btblue);
		panel_2_1_2.add(btnNewButton_1_1_1, BorderLayout.CENTER);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2_1_3.setBounds(0, 166, 350, 48);
		panel_4.add(panel_2_1_3);
		panel_2_1_3.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("D");
		panel_2_1_3.add(rdbtnNewRadioButton_1_1_1, BorderLayout.EAST);
		group.add(rdbtnNewRadioButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Rutin4");
		btnNewButton_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBackground(Jlightgreen);
		panel_2_1_3.add(btnNewButton_1_1_1_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Rutin list");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel_1.setBounds(5, 4, 67, 15);
		panel_4.add(lblNewLabel_1);
		frame.setVisible(true);

	}
}
