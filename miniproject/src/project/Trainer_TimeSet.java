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
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class Trainer_TimeSet {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156); 
	private JFrame frame;
	String header[] = {"³¯Â¥", "½Ã°£´ë", "È¸¿ø¸í", "ÀÌÇà¿©ºÎ"};
	String contents[][] = {{"2022/06/30", "16:00~17:00", "Á¶¾È³ª", "¿¹¾à"},
			{"2022/06/29", "16:00~17:00", "ºù±×·¹", "¿¹¾à"},
			{"2022/06/28", "16:00~17:00", "ÀÌÁø¼ö", "¿Ï·á"}};
	
	public static void main(String[] args) {
		new Trainer_TimeSet();
	}

	public Trainer_TimeSet() {
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Trainer();
			}
		});
		btnNewButton.setPreferredSize(new Dimension(60, 60));
		btnNewButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		btnNewButton.setBackground(toolgreen);
		btnNewButton.setBorderPainted(false);
		panel.add(btnNewButton, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("TimeSet");
		lblNewLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		
		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Trainer();
			}
		});
		
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 58, 364, 453);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 340, 345);
		panel_3.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JCheckBox timeCheckBox = new JCheckBox("08:00 ~ 09:00");
		timeCheckBox.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox);
		
		JCheckBox timeCheckBox_1 = new JCheckBox("09:00 ~ 10:00");
		timeCheckBox_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1);
		
		JCheckBox timeCheckBox_1_1 = new JCheckBox("10:00 ~ 11:00");
		timeCheckBox_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1);
		
		JCheckBox timeCheckBox_1_1_1 = new JCheckBox("11:00 ~ 12:00");
		timeCheckBox_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1 = new JCheckBox("12:00 ~ 13:00");
		timeCheckBox_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1_1 = new JCheckBox("13:00 ~ 14:00");
		timeCheckBox_1_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1_1_1 = new JCheckBox("14:00 ~ 15:00");
		timeCheckBox_1_1_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1_1_1_1 = new JCheckBox("15:00 ~ 16:00");
		timeCheckBox_1_1_1_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1_1_1_1_1 = new JCheckBox("16:00 ~ 17:00");
		timeCheckBox_1_1_1_1_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1_1_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1_1_1_1_1_1 = new JCheckBox("17:00 ~ 18:00");
		timeCheckBox_1_1_1_1_1_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1_1_1_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1_1_1_1_1_1_1 = new JCheckBox("18:00 ~ 19:00");
		timeCheckBox_1_1_1_1_1_1_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1_1_1_1_1_1_1);
		
		JCheckBox timeCheckBox_1_1_1_1_1_1_1_1_1_1_1 = new JCheckBox("19:00 ~ 20:00");
		timeCheckBox_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeCheckBox_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uC548\uB0B4\uC0AC\uD56D");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 365, 93, 38);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("O \uAC00\uB2A5\uD55C \uC2DC\uAC04 \uCCB4\uD06C");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_2.setBounds(12, 389, 237, 39);
		panel_3.add(lblNewLabel_2);
		
		frame.setVisible(true);

	}
}
