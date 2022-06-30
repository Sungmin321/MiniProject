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

public class Trainer_ScheduleCancel {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156); 
	private JFrame frame;
	String header[] = {"³¯Â¥", "½Ã°£´ë", "Trainer", "ÀÌÇà¿©ºÎ"};
	String contents[][] = {{"2022/06/30", "16:00 ~ 17:00", "±è¸Æ", "O"}};
	
	public static void main(String[] args) {
		new Trainer_ScheduleCancel();
	}

	public Trainer_ScheduleCancel() {
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
		
		JLabel titleLabel = new JLabel("PersonalTrainer_cancel");
		titleLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton beforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		beforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Trainer();
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
		scrollPane.setBounds(12, 66, 340, 71);
		canceluppanel.add(scrollPane);
		
		JPanel PTcancelpanel = new JPanel();
		PTcancelpanel.setBackground(Color.WHITE);
		scrollPane.setViewportView(PTcancelpanel);
		PTcancelpanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("2022/06/30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("16:00 ~ 17:00");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(lblNewLabel_1);
		
		JLabel lblRlaaor = new JLabel("\uAE40\uB9E5");
		lblRlaaor.setHorizontalAlignment(SwingConstants.CENTER);
		PTcancelpanel.add(lblRlaaor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		PTcancelpanel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\uCDE8\uC18C");
		btnNewButton.setBackground(btblue);
		btnNewButton.setForeground(Color.white);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("µ¸¿òÃ¼", Font.BOLD, 12));
		btnNewButton.setBounds(12, 20, 66, 30);
		panel_1.add(btnNewButton);
		
		JPanel titlepanel = new JPanel();
		titlepanel.setBounds(12, 10, 340, 55);
		canceluppanel.add(titlepanel);
		titlepanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel titleLabel1 = new JLabel("\uB0A0\uC9DC");
		titlepanel.add(titleLabel1);
		titleLabel1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel titleLabel2 = new JLabel("\uC2DC\uAC04\uB300");
		titlepanel.add(titleLabel2);
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		
		JLabel titleLabel3 = new JLabel("Trainer");
		titlepanel.add(titleLabel3);
		titleLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel3.setFont(new Font("±¼¸²", Font.BOLD, 15));
		
		JLabel titleLabel3_1 = new JLabel("\uC774\uD589\uC5EC\uBD80");
		titlepanel.add(titleLabel3_1);
		titleLabel3_1.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel3_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		
		frame.setVisible(true);

	}
}
