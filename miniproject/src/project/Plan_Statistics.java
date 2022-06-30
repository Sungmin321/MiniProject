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

public class Plan_Statistics {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156); 
	private JFrame frame;
	private JTable table;
	String header[] = {"날짜", "시작시간", "종료시간", "루틴명", "운동시간"};
	String contents[][] = {{"2022/06/30", "16:00", "17:00", "Rutin1","1시간"}};
	
	public static void main(String[] args) {
		new Plan_Statistics();
	}

	public Plan_Statistics() {
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
		
		JLabel titleLabel = new JLabel("Plan_Statistics");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton BeforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Plan();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		BeforeButton.setBorderPainted(false);
		BeforeButton.setBackground(new Color(52, 152, 219));
		BeforeButton.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(BeforeButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 58, 364, 453);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 340, 433);
		panel_3.add(scrollPane);
		
		table = new JTable(contents, header);
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(Color.BLACK));
		
		frame.setVisible(true);

	}
}
