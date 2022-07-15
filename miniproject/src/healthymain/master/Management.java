package healthymain.master;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import healthymain.database.InsertUpdate;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Management {
	private JFrame frame;

	public Management() {
		JTextField textField;
		
		Color btblue = new Color(52, 152, 219);
		Color toolgreen = new Color(26, 188, 156);
		System.out.print(MemberVo.user.getId());
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

		JButton homeButton = new JButton("");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new MasterMain();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);

		JLabel titleLabel = new JLabel("Master_Management");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);

		JButton beforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		beforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new MasterMain();
			}
		});
		beforeButton.setForeground(Color.WHITE);
		beforeButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
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
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(12, 40, 340, 360);
		canceluppanel.add(scrollPane);
		scrollPane.setBackground(Color.white);

		JPanel PTcancelpanel = new JPanel();
		scrollPane.setColumnHeaderView(PTcancelpanel);
		PTcancelpanel.setBackground(Color.WHITE);
		PTcancelpanel.setLayout(new GridLayout(0, 2, 0, 0));

		ArrayList<String> Customernamelist = new MemberDAO()
				.getNames("SELECT NAME FROM CUSTOMER_INFO WHERE CUSTOMER_POSITION = 2");

		ArrayList<String> Trainerlist = new MemberDAO().getNames("SELECT NAME FROM TRAINER_INFO WHERE TRAINER_POSITION = 1");

		int size = Customernamelist.size() + Trainerlist.size();
		System.out.println(size);
		JLabel nameLabel[] = new JLabel[size];
		JLabel positionLabel[] = new JLabel[size];

		for (int i = 0; i < Customernamelist.size(); i++) {
			nameLabel[i] = new JLabel(Customernamelist.get(i));
			nameLabel[i].setFont(new Font("굴림", Font.PLAIN, 20));
			nameLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			PTcancelpanel.add(nameLabel[i]);

			positionLabel[i] = new JLabel("일반회원");
			positionLabel[i].setFont(new Font("굴림", Font.PLAIN, 20));
			positionLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			PTcancelpanel.add(positionLabel[i]);
		}

		for (int j = 0, i = Customernamelist.size(); i < size; i++, j++) {
			nameLabel[i] = new JLabel(Trainerlist.get(j));
			nameLabel[i].setFont(new Font("굴림", Font.PLAIN, 20));
			nameLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			PTcancelpanel.add(nameLabel[i]);

			positionLabel[i] = new JLabel("트레이너");
			positionLabel[i].setFont(new Font("굴림", Font.PLAIN, 20));
			positionLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			PTcancelpanel.add(positionLabel[i]);
		}

		JPanel titlepanel = new JPanel();
		titlepanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		titlepanel.setBounds(12, 10, 340, 32);
		canceluppanel.add(titlepanel);
		titlepanel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel titleLabel1 = new JLabel("\uC131\uBA85");
		titlepanel.add(titleLabel1);
		titleLabel1.setFont(new Font("굴림", Font.BOLD, 25));
		titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel titleLabel2 = new JLabel("position");
		titlepanel.add(titleLabel2);
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setFont(new Font("굴림", Font.BOLD, 25));

		textField = new JTextField();
		textField.setText("이름을 입력해주세요");
		textField.setBounds(12, 410, 122, 30);
		canceluppanel.add(textField);
		textField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "일반회원", "트레이너" }));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(142, 410, 98, 30);

		JButton CancelButton = new JButton("\uC0AD\uC81C\uD558\uAE30");
		CancelButton.setBounds(252, 410, 100, 30);
		canceluppanel.add(comboBox);
		canceluppanel.add(CancelButton);
		CancelButton.setBackground(btblue);
		CancelButton.setForeground(Color.white);
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				if (comboBox.getSelectedItem().toString().equals("일반회원")) {
					new InsertUpdate().isCustomerDelete(name);
					JOptionPane.showMessageDialog(null, "해당 이름의 일반회원 데이터가 삭제 되었습니다.");
					frame.setVisible(false);
					new Management();
				} else {
					new InsertUpdate().isTrainerDelete(name);
					JOptionPane.showMessageDialog(null, "해당 이름의 트레이너 데이터가 삭제 되었습니다.");
					frame.setVisible(false);
					new Management();
				}
			}
		});
		CancelButton.setFont(new Font("돋움체", Font.BOLD, 12));

		frame.setVisible(true);

	}
}
