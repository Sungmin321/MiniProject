package healthymain.customer.personaltraining;

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

import healthymain.customer.CustomerMain;

public class PersonalTraining {
	private JFrame frame;

	public PersonalTraining() {
		Color toolgreen = new Color(26, 188, 156);   
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
				new CustomerMain();
			}
		});
		btnNewButton.setPreferredSize(new Dimension(60, 60));
		btnNewButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		btnNewButton.setBackground(toolgreen);
		btnNewButton.setBorderPainted(false);
		panel.add(btnNewButton, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("PersonalTrainer");
		lblNewLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		JButton BeforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new CustomerMain();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		BeforeButton.setBorderPainted(false);
		BeforeButton.setBackground(new Color(52, 152, 219));
		BeforeButton.setBounds(10, 520, 345, 50);
		frame.getContentPane().add(BeforeButton);
		
		ImageIcon icon = new ImageIcon("D:\\work\\miniproject\\image\\reservationicon.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(230, 60, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JButton ReservationButton = new JButton(changeIcon);
		ReservationButton.setBackground(Color.WHITE);
		ReservationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PersonalTrainingReservation();
			}
		});
		ReservationButton.setBounds(67, 90, 230, 60);
		ReservationButton.setBorderPainted(false);
		frame.getContentPane().add(ReservationButton);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\reservationcancelicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(230, 60, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton ReservationcancelButton = new JButton(changeIcon);
		ReservationcancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PersonalTrainingCancel();
			}
		});
		ReservationcancelButton.setBorderPainted(false);
		ReservationcancelButton.setBackground(Color.WHITE);
		ReservationcancelButton.setBounds(67, 180, 230, 60);
		frame.getContentPane().add(ReservationcancelButton);
		
		icon = new ImageIcon("D:\\work\\miniproject\\image\\reservationlookupicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(230, 60, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		
		JButton ReservationLookupButton = new JButton(changeIcon);
		ReservationLookupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PersonalTrainingLookup();
			}
		});
		ReservationLookupButton.setBorderPainted(false);
		ReservationLookupButton.setBackground(Color.WHITE);
		ReservationLookupButton.setBounds(67, 270, 230, 60);
		frame.getContentPane().add(ReservationLookupButton);
		
		JPanel notificationpanel = new JPanel();
		notificationpanel.setBackground(Color.WHITE);
		notificationpanel.setBounds(0, 349, 364, 161);
		frame.getContentPane().add(notificationpanel);
		notificationpanel.setLayout(null);
		
		JLabel notificationtitleLabel = new JLabel("\uC548\uB0B4\uC0AC\uD56D");
		notificationtitleLabel.setFont(new Font("±¼¸²", Font.BOLD, 30));
		notificationtitleLabel.setBounds(12, 10, 132, 35);
		notificationpanel.add(notificationtitleLabel);
		
		JLabel notificationLabel1 = new JLabel("O \uD558\uB8E8 \uC804 \uCDE8\uC18C \uBD88\uAC00\r\n");
		notificationLabel1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		notificationLabel1.setBounds(12, 54, 340, 35);
		notificationpanel.add(notificationLabel1);
		
		JLabel notificationLabel2 = new JLabel("O \uC794\uC5EC P.T \uD69F\uC218 \uC5C6\uC744 \uC2DC \uC608\uC57D \uBD88\uAC00\r\n");
		notificationLabel2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		notificationLabel2.setBounds(12, 88, 340, 35);
		notificationpanel.add(notificationLabel2);
		frame.setVisible(true);
		

	}
}
