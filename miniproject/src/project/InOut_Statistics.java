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

public class InOut_Statistics {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156); 
	private JFrame frame;
	private JTable table;
	String header[] = {"³¯Â¥", "Ã¼Áß", "¿îµ¿", "À½ÁÖ"};
	String contents[][] = {{"2022/06/30", "85", "O", "X"}};
	
	public static void main(String[] args) {
		new InOut_Statistics();
	}

	public InOut_Statistics() {
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
		
		JLabel lblNewLabel = new JLabel("IN&OUT_Statistics");
		lblNewLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		
		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_InOut();
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
		panel_3.setBounds(0, 58, 364, 393);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 340, 373);
		panel_3.add(scrollPane);
		
		table = new JTable(contents, header);
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(Color.BLACK));
		
		JButton btnNewButton_1_3_1 = new JButton("\uC2DD\uB2E8\uAE30\uB85D \uD655\uC778");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InOut_FoodRecordDialog.main(null);
			}
		});
		btnNewButton_1_3_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1_3_1.setBorderPainted(false);
		btnNewButton_1_3_1.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3_1.setBounds(10, 461, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3_1);
		
		frame.setVisible(true);

	}
}
