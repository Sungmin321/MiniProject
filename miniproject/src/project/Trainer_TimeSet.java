package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Trainer_TimeSet {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251, 197, 60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156);
	private JFrame frame;
	String timeset[] = { "N", "N", "N", "N", "N", "N", "N", "N", "N", "N", "N", "N" };

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

		JPanel headpanel = new JPanel();
		headpanel.setBounds(0, 0, 364, 60);
		headpanel.setBackground(toolgreen);
		frame.getContentPane().add(headpanel);
		headpanel.setLayout(new BorderLayout(0, 0));

		JButton homebtn = new JButton("");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Trainer();
			}
		});
		homebtn.setPreferredSize(new Dimension(60, 60));
		homebtn.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homebtn.setBackground(toolgreen);
		homebtn.setBorderPainted(false);
		headpanel.add(homebtn, BorderLayout.WEST);

		JLabel headLabel = new JLabel("TimeSet");
		headLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		headpanel.add(headLabel, BorderLayout.CENTER);
		headLabel.setForeground(Color.white);

		JButton backbtn = new JButton("ÀÌÀüÀ¸·Î");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Trainer();
			}
		});

		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		backbtn.setBorderPainted(false);
		backbtn.setBackground(new Color(52, 152, 219));
		backbtn.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(backbtn);

		JPanel mainpanel = new JPanel();
		mainpanel.setBackground(Color.WHITE);
		mainpanel.setBounds(0, 58, 364, 453);
		frame.getContentPane().add(mainpanel);
		mainpanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		mainpanel.setLayout(null);

		JPanel timegridpanel = new JPanel();
		timegridpanel.setBounds(12, 10, 340, 345);
		mainpanel.add(timegridpanel);
		timegridpanel.setLayout(new GridLayout(0, 2, 0, 0));

		JCheckBox timeCheckBox8 = new JCheckBox("08:00 ~ 09:00");
		timeCheckBox8.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox8.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox8);

		JCheckBox timeCheckBox9 = new JCheckBox("09:00 ~ 10:00");
		timeCheckBox9.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox9.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox9);

		JCheckBox timeCheckBox10 = new JCheckBox("10:00 ~ 11:00");
		timeCheckBox10.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox10.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox10);

		JCheckBox timeCheckBox11 = new JCheckBox("11:00 ~ 12:00");
		timeCheckBox11.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox11.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox11);

		JCheckBox timeCheckBox12 = new JCheckBox("12:00 ~ 13:00");
		timeCheckBox12.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox12.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox12);

		JCheckBox timeCheckBox13 = new JCheckBox("13:00 ~ 14:00");
		timeCheckBox13.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox13.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox13);

		JCheckBox timeCheckBox14 = new JCheckBox("14:00 ~ 15:00");
		timeCheckBox14.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox14.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox14);

		JCheckBox timeCheckBox15 = new JCheckBox("15:00 ~ 16:00");
		timeCheckBox15.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox15.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox15);

		JCheckBox timeCheckBox16 = new JCheckBox("16:00 ~ 17:00");
		timeCheckBox16.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox16.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox16);

		JCheckBox timeCheckBox17 = new JCheckBox("17:00 ~ 18:00");
		timeCheckBox17.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox17.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox17);

		JCheckBox timeCheckBox18 = new JCheckBox("18:00 ~ 19:00");
		timeCheckBox18.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox18.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox18);

		JCheckBox timeCheckBox19 = new JCheckBox("19:00 ~ 20:00");
		timeCheckBox19.setFont(new Font("±¼¸²", Font.BOLD, 15));
		timeCheckBox19.setHorizontalAlignment(SwingConstants.CENTER);
		timegridpanel.add(timeCheckBox19);

		JLabel lblNewLabel_1 = new JLabel("¾È³»»çÇ×");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 365, 93, 38);
		mainpanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("O °¡´ÉÇÑ ½Ã°£ Ã¼Å© ÈÄ ÀúÀå¹öÆ° Å¬¸¯");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_2.setBounds(12, 389, 237, 39);
		mainpanel.add(lblNewLabel_2);

		JButton savebtn = new JButton("ÀúÀåÇÏ±â");
		savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (timeCheckBox8.isSelected()) {
					timeset[0] = "Y";
				}
				if (timeCheckBox9.isSelected()) {
					timeset[1] = "Y";
				}
				if (timeCheckBox10.isSelected()) {
					timeset[2] = "Y";
				}
				if (timeCheckBox11.isSelected()) {
					timeset[3] = "Y";
				}
				if (timeCheckBox12.isSelected()) {
					timeset[4] = "Y";
				}
				if (timeCheckBox13.isSelected()) {
					timeset[5] = "Y";
				}
				if (timeCheckBox14.isSelected()) {
					timeset[6] = "Y";
				}
				if (timeCheckBox15.isSelected()) {
					timeset[7] = "Y";
				}
				if (timeCheckBox16.isSelected()) {
					timeset[8] = "Y";
				}
				if (timeCheckBox17.isSelected()) {
					timeset[9] = "Y";
				}
				if (timeCheckBox18.isSelected()) {
					timeset[10] = "Y";
				}
				if (timeCheckBox19.isSelected()) {
					timeset[11] = "Y";
				}
				String qurey = "UPDATE TRAINER_INFO SET HOUR8 = '" + timeset[0] + "', HOUR9 = '" + timeset[1]
						+ "', HOUR10 = '" + timeset[2] + "', HOUR11 = '" + timeset[3] + "', HOUR12 = '" + timeset[4]
						+ "', HOUR13 = '" + timeset[5] + "', HOUR14 = '" + timeset[6] + "', HOUR15 = '" + timeset[7]
						+ "', HOUR16 = '" + timeset[8] + "', HOUR17 ='" + timeset[9] + "', HOUR18 = '" + timeset[10]
						+ "', HOUR19 ='" + timeset[11] + "' WHERE ID = '" + MemberVo.user.getId() + "'";
				System.out.println(qurey);
				if (new Insert().Trainer_timeset(qurey)) {
					JOptionPane.showMessageDialog(null, "¼öÁ¤µÇ¾ú½À´Ï´Ù.");
				} else
					JOptionPane.showMessageDialog(null, "¼öÁ¤ ¿À·ù");
				frame.setVisible(false);
				new Trainer_TimeSet();
			}
		});
		savebtn.setForeground(Color.WHITE);
		savebtn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		savebtn.setBorderPainted(false);
		savebtn.setBackground(new Color(52, 152, 219));
		savebtn.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(savebtn);

		frame.setVisible(true);

	}
}
