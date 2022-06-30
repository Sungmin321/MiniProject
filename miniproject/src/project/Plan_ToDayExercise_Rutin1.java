package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class Plan_ToDayExercise_Rutin1 {

	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public static void main(String[] args) {
		new Plan_ToDayExercise_Rutin1();
	}

	public Plan_ToDayExercise_Rutin1() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 380, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 364, 510);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(365, 60));
		panel_1.setBackground(new Color(26, 188, 156));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Plan_ToDay Exercise_Rutin1");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("HY∏Ò∞¢∆ƒ¿”B", Font.PLAIN, 15));
		panel_1.add(lblNewLabel, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("");
		panel_1.add(btnNewButton, BorderLayout.WEST);
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

		JPanel ecercisepanel = new JPanel();
		ecercisepanel.setLayout(null);
		ecercisepanel.setPreferredSize(new Dimension(365, 120));
		ecercisepanel.setBorder(new LineBorder(Color.GRAY));
		ecercisepanel.setBackground(Color.WHITE);
		panel.add(ecercisepanel);

		JLabel lblNewLabel_1 = new JLabel("\uC6B4\uB3D9\uBA85");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(76, 8, 142, 37);
		ecercisepanel.add(lblNewLabel_1);

		ImageIcon icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\xicon.png");
		Image img = icon.getImage();
		// √¢¿« ªÁ¿Ã¡Ó¿Œ 500,500ø° ∏¬√Áº≠ ¿ÃπÃ¡ˆ∏¶ ∫Ø∞Ê
		Image changeImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);

		JButton btnNewButton_1 = new JButton(changeIcon);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(309, 3, 50, 50);
		ecercisepanel.add(btnNewButton_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(SystemColor.activeCaption));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 57, 365, 63);
		ecercisepanel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("\uC138\uD2B8");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("kg");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("\uD68C");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uC644\uB8CC");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_1_1_1.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_2 = new JLabel("5");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_2_1 = new JLabel("40");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_2_1.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2_2_1);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("12");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_2_1_1.setBackground(Color.WHITE);
		panel_2.add(lblNewLabel_2_2_1_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		panel_2.add(chckbxNewCheckBox);

		JPanel Pexercisepanel = new JPanel();
		Pexercisepanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		Pexercisepanel.setLayout(null);
		Pexercisepanel.setPreferredSize(new Dimension(365, 120));
		Pexercisepanel.setBackground(Color.WHITE);
		panel.add(Pexercisepanel);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(SystemColor.activeCaption));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(0, 57, 284, 63);
		Pexercisepanel.add(panel_2_1);
		panel_2_1.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lblNewLabel_2_3 = new JLabel("\uC138\uD2B8");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_3.setBackground(Color.WHITE);
		panel_2_1.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_1_2 = new JLabel("kg");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_1_2.setBackground(Color.WHITE);
		panel_2_1.add(lblNewLabel_2_1_2);

		JLabel lblNewLabel_2_1_1_2 = new JLabel("\uD68C");
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2.setFont(new Font("µ∏øÚ√º", Font.BOLD, 15));
		lblNewLabel_2_1_1_2.setBackground(Color.WHITE);
		panel_2_1.add(lblNewLabel_2_1_1_2);

		textField_1 = new JTextField();
		panel_2_1.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2_1.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_2_1.add(textField_3);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uC6B4\uB3D9\uBA85\uC744 \uC785\uB825\uD558\uC138\uC694");
		textField.setBounds(31, 10, 226, 32);
		Pexercisepanel.add(textField);
		textField.setColumns(10);

		icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\plusicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton btnNewButton_2 = new JButton(changeIcon);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(309, 4, 50, 50);
		Pexercisepanel.add(btnNewButton_2);

		icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\minusicon.png");
		img = icon.getImage();
		changeImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);

		JButton btnNewButton_2_1 = new JButton(changeIcon);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(309, 64, 50, 50);
		Pexercisepanel.add(btnNewButton_2_1);

		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Plan_ToDayExercise();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 521, 163, 50);
		frame.getContentPane().add(btnNewButton_1_3);

		JButton btnNewButton_1_3_1 = new JButton("\uCD94\uAC00\uD558\uAE30");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				panel.add(Pexercisepanel);
			}
		});
		btnNewButton_1_3_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		btnNewButton_1_3_1.setBorderPainted(false);
		btnNewButton_1_3_1.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3_1.setBounds(190, 521, 163, 50);
		frame.getContentPane().add(btnNewButton_1_3_1);
		frame.setVisible(true);

	}
}
