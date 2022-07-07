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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import project.Customer_Plan;
import project.Main_Customer;

import java.awt.SystemColor;
import javax.swing.JTextArea;

public class InOut_FoodRecord {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251, 197, 60);

	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);

	public static void main(String[] args) {
		new InOut_FoodRecord();
	}

	public InOut_FoodRecord() {
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
		headpanel.add(btnNewButton, BorderLayout.WEST);

		JLabel lblNewLabel = new JLabel("IN&OUT FoodRecord");
		lblNewLabel.setFont(new Font("HY∏Ò∞¢∆ƒ¿”B", Font.PLAIN, 15));
		headpanel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JButton backbtn = new JButton("\uC774\uC804\uC73C\uB85C");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_InOut();
			}
		});
		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		backbtn.setBorderPainted(false);
		backbtn.setBackground(new Color(52, 152, 219));
		backbtn.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(backbtn);

		ImageIcon icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\rutinadd.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(350, 48, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);

		JPanel mainpanel = new JPanel();
		mainpanel.setBackground(SystemColor.inactiveCaptionBorder);
		mainpanel.setBounds(0, 59, 364, 452);
		frame.getContentPane().add(mainpanel);
		mainpanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		mainpanel.setLayout(null);

		JLabel FoodRecordLabel = new JLabel("\uC2DD\uB2E8 \uAE30\uB85D");
		FoodRecordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FoodRecordLabel.setFont(new Font("±º∏≤", Font.BOLD, 25));
		FoodRecordLabel.setBackground(Color.WHITE);
		FoodRecordLabel.setBounds(-7, 3, 161, 50);
		mainpanel.add(FoodRecordLabel);

		JTextArea FoodRecordtextArea = new JTextArea();
		FoodRecordtextArea.setBounds(12, 50, 340, 392);
		mainpanel.add(FoodRecordtextArea);

		JButton Savebtn = new JButton("SAVE");
		Savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new MemberDAO().Inout_test(MemberVo.user.getId())) {
					String recode = FoodRecordtextArea.getText();
					if (new Insert().Inout_FoodRecode_update(MemberVo.user.getId(), recode))
						JOptionPane.showMessageDialog(null, "data success");
				} else
					JOptionPane.showMessageDialog(null, "√º¡ﬂ¿‘∑¬ ∏’¿˙ «ÿ¡÷ººø‰!");
			}
		});
		Savebtn.setForeground(Color.WHITE);
		Savebtn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		Savebtn.setBorderPainted(false);
		Savebtn.setBackground(new Color(52, 152, 219));
		Savebtn.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(Savebtn);

		ButtonGroup group = new ButtonGroup();
		frame.setVisible(true);

	}
}
