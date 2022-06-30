package project;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Customer_InOut {
	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);   
	Color btblue = new Color(52, 152, 219);   

	public static void main(String[] args) {
		new Customer_InOut();
	}

	public Customer_InOut() {
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
		
		JLabel lblNewLabel = new JLabel("IN&OUT");
		lblNewLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 59, 364, 274);
		frame.getContentPane().add(panel_1);
		
		JCalendar calendar = new JCalendar();
		calendar.getDayChooser().getDayPanel().setBackground(Color.WHITE);
		panel_1.add(calendar);
		calendar.setPreferredSize(new DimensionUIResource(350, 265));
		
		JButton btnNewButton_1 = new JButton("\uCCB4\uC911 \uC785\uB825");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InOut_WeightDialog().main(null);
			}
		});
		btnNewButton_1.setBackground(btblue);
		btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1.setBounds(10, 340, 345, 50);
		btnNewButton_1.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uC2DD\uB2E8 \uAE30\uB85D");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new InOut_FoodRecord();
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(52, 152, 219));
		btnNewButton_1_1.setBounds(10, 400, 345, 50);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\uD1B5\uACC4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new InOut_Statistics();
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBackground(new Color(52, 152, 219));
		btnNewButton_1_2.setBounds(10, 460, 345, 50);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Customer();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 520, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);
		frame.setVisible(true);

	}
}
