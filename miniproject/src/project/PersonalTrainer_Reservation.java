package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import com.toedter.calendar.JCalendar;

public class PersonalTrainer_Reservation {
	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);   
	Color btblue = new Color(52, 152, 219);   

	public static void main(String[] args) {
		new PersonalTrainer_Reservation();
	}

	public PersonalTrainer_Reservation() {
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
		
		JLabel lblNewLabel = new JLabel("PersonalTrainerReservation");
		lblNewLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		JPanel calendarpanel = new JPanel();
		calendarpanel.setBackground(Color.WHITE);
		calendarpanel.setBounds(0, 59, 364, 274);
		frame.getContentPane().add(calendarpanel);
		
		JCalendar calendar = new JCalendar();
		calendar.getDayChooser().getDayPanel().setBackground(Color.WHITE);
		calendarpanel.add(calendar);
		calendar.setPreferredSize(new DimensionUIResource(350, 265));
		
		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_PersonalTrainer();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 520, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JPanel Reservationpanel = new JPanel();
		Reservationpanel.setBounds(0, 337, 364, 50);
		frame.getContentPane().add(Reservationpanel);
		Reservationpanel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uC608\uC57D\uD558\uAE30");
		btnNewButton_1.setBounds(252, 10, 100, 30);
		btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btnNewButton_1.setBackground(btblue);
		btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Reservationpanel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Trainer", "\uAE40\uB9E5", "\uD568\uBC85", "\uC774\uB86F"}));
		comboBox.setBounds(12, 10, 100, 30);
		Reservationpanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("»õ±¼¸²", Font.PLAIN, 15));
		comboBox_1.setMaximumRowCount(10);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC2DC\uAC04\uB300", "08:00~09:00", "09:00~10:00", "10:00~11:00", "11:00~12:00", "12:00~13:00", "13:00~14:00", "14:00~15:00", "15:00~16:00", "16:00~17:00", "17:00~18:00", "18:00~19:00", "19:00~20:00"}));
		comboBox_1.setBounds(124, 10, 116, 30);
		Reservationpanel.add(comboBox_1);
		frame.setVisible(true);

	}
}
