package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

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
import javax.swing.ScrollPaneConstants;

public class Plan_ToDayExercise implements ItemListener {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251, 197, 60);
	Color Jlightgreen = new Color(177, 212, 98);
	private JFrame frame;
	private JPanel panel;
	Color toolgreen = new Color(26, 188, 156);
	private JRadioButton ARadioButton, BRadioButton, CRadioButton, DRadioButton;

	public static void main(String[] args) {
		new Plan_ToDayExercise();
	}

	public Plan_ToDayExercise() {
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

		JLabel lblNewLabel = new JLabel("Plan_ToDay Exercise");
		lblNewLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		headpanel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Plan();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);

		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setBounds(0, 63, 364, 448);
		frame.getContentPane().add(main);
		main.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		main.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 24, 350, 200);
		main.add(scrollPane);

		panel = new JPanel();
		scrollPane.setViewportView(panel);
//		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panelbottom = new JPanel();
		panelbottom.setBounds(6, 230, 350, 214);
		main.add(panelbottom);
		panelbottom.setLayout(null);

		JPanel rutin1pn = new JPanel();
		rutin1pn.setBorder(new LineBorder(Color.LIGHT_GRAY));
		rutin1pn.setBackground(JYellow);
		rutin1pn.setBounds(0, 23, 350, 48);
		panelbottom.add(rutin1pn);
		rutin1pn.setLayout(new BorderLayout(0, 0));

		ARadioButton = new JRadioButton("A");
		rutin1pn.add(ARadioButton, BorderLayout.EAST);
		ARadioButton.addItemListener(this);

		JPanel rutin2pn = new JPanel();
		rutin2pn.setBorder(new LineBorder(Color.LIGHT_GRAY));
		rutin2pn.setBackground(Jorange);
		rutin2pn.setBounds(0, 70, 350, 48);
		panelbottom.add(rutin2pn);
		rutin2pn.setLayout(new BorderLayout(0, 0));

		BRadioButton = new JRadioButton("B");
		rutin2pn.add(BRadioButton, BorderLayout.EAST);
		BRadioButton.addItemListener(this);

		JPanel rutin3pn = new JPanel();
		rutin3pn.setBorder(new LineBorder(Color.LIGHT_GRAY));
		rutin3pn.setBackground(Color.WHITE);
		rutin3pn.setBounds(0, 118, 350, 48);
		panelbottom.add(rutin3pn);
		rutin3pn.setLayout(new BorderLayout(0, 0));

		JPanel rutin4pn = new JPanel();
		rutin4pn.setBorder(new LineBorder(Color.LIGHT_GRAY));
		rutin4pn.setBounds(0, 166, 350, 48);
		panelbottom.add(rutin4pn);
		rutin4pn.setLayout(new BorderLayout(0, 0));

		CRadioButton = new JRadioButton("C");
		rutin3pn.add(CRadioButton, BorderLayout.EAST);
		CRadioButton.addItemListener(this);

		ButtonGroup group = new ButtonGroup();
		group.add(ARadioButton);

		JButton RT1btn = new JButton("Rutin1");
		RT1btn.setBackground(JYellow);
		RT1btn.setFont(new Font("굴림", Font.BOLD, 20));
		rutin1pn.add(RT1btn, BorderLayout.CENTER);
		RT1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 만약에 저장 된 운동이 하나도 있다면 바로 실행
				if (new Insert().plan_Rutin_check("1", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Plan_ToDayExercise_Rutin1();
				} else {
					if (new Insert().plan_Rutin_insert("1", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Plan_ToDayExercise_Rutin1();
					}
				}
			}
		});
		group.add(BRadioButton);

		JButton RT2btn = new JButton("Rutin2");
		RT2btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new Insert().plan_Rutin_check("2", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Plan_ToDayExercise_Rutin2();
				} else {
					if (new Insert().plan_Rutin_insert("2", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Plan_ToDayExercise_Rutin2();
					}
				}
			}
		});
		RT2btn.setFont(new Font("굴림", Font.BOLD, 20));
		RT2btn.setBackground(Jorange);
		rutin2pn.add(RT2btn, BorderLayout.CENTER);
		group.add(CRadioButton);

		JButton RT3btn = new JButton("Rutin3");
		RT3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new Insert().plan_Rutin_check("3", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Plan_ToDayExercise_Rutin3();
				} else {
					if (new Insert().plan_Rutin_insert("3", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Plan_ToDayExercise_Rutin3();
					}
				}
			}
		});
		RT3btn.setFont(new Font("굴림", Font.BOLD, 20));
		RT3btn.setBackground(btblue);
		rutin3pn.add(RT3btn, BorderLayout.CENTER);

		JButton RT4btn = new JButton("Rutin4");
		RT4btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new Insert().plan_Rutin_check("4", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Plan_ToDayExercise_Rutin4();
				} else {
					if (new Insert().plan_Rutin_insert("4", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Plan_ToDayExercise_Rutin4();
					}
				}
			}
		});
		RT4btn.setFont(new Font("굴림", Font.BOLD, 20));
		RT4btn.setBackground(Jlightgreen);
		rutin4pn.add(RT4btn, BorderLayout.CENTER);

		DRadioButton = new JRadioButton("D");
		rutin4pn.add(DRadioButton, BorderLayout.EAST);
		DRadioButton.addItemListener(this);
		group.add(DRadioButton);

		JLabel RutinlistLabel = new JLabel("Rutin list");
		RutinlistLabel.setFont(new Font("굴림", Font.BOLD, 14));
		RutinlistLabel.setBounds(5, 4, 67, 15);
		panelbottom.add(RutinlistLabel);

		JButton Rutinsavebtn = new JButton("Rutin Save");
		Rutinsavebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new MemberDAO().plan_recode_test(MemberVo.user.getId())) {// 정보가 있나?
					String num = "";
					if (ARadioButton.isSelected()) {
						num = "1";
					} else if (BRadioButton.isSelected()) {
						num = "2";
					} else if (CRadioButton.isSelected()) {
						num = "3";
					} else if (DRadioButton.isSelected()) {
						num = "4";
					}
					if (new Insert().plan_recode_Rutin_update(num, MemberVo.user.getId()))
						JOptionPane.showMessageDialog(null, "Rutin 저장 성공");
				} else {
					JOptionPane.showMessageDialog(null, "운동시작 먼저 눌러주세요!");
				}
			}
		});
		Rutinsavebtn.setBounds(259, 0, 97, 23);
		main.add(Rutinsavebtn);

		frame.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String Rutinnum = null;
		if (ARadioButton.isSelected()) {
			Rutinnum = "1";
		} else if (BRadioButton.isSelected()) {
			Rutinnum = "2";
		} else if (CRadioButton.isSelected()) {
			Rutinnum = "3";
		} else if (DRadioButton.isSelected()) {
			Rutinnum = "4";
		}

		int size = Integer.valueOf(new MemberDAO().getRutinsize(Rutinnum, MemberVo.user.getId()));
		JPanel ecercisepanel[] = new JPanel[size];
		JPanel printpanel[] = new JPanel[size];
		JLabel exnameLabel[] = new JLabel[size];
		JLabel asetLabel[] = new JLabel[size];
		JLabel aweightLabel[] = new JLabel[size];
		JLabel aexnumberLabel[] = new JLabel[size];
		JLabel setLabel[] = new JLabel[size];
		JLabel weightLabel[] = new JLabel[size];
		JLabel exnumberLabel[] = new JLabel[size];

		panel.setLayout(new GridLayout(size, 1, 0, 0));
//		ArrayList<RutinVo> list = new MemberDAO().Rutin_list("1", "123");
		ArrayList<RutinVo> list = new MemberDAO().Rutin_list(Rutinnum, MemberVo.user.getId());
		for (int i = 0; i < size; i++) {
			RutinVo data = (RutinVo) list.get(i);
			String ECname = data.getECname();
			String ECset = data.getECset();
			String ECweight = data.getECweight();
			String ECnumber = data.getECnumber();
			System.out.println(ECname + " : " + ECset + " : " + ECweight + " : " + ECnumber);

			ecercisepanel[i] = new JPanel();
			panel.add(ecercisepanel[i]);// 메인패널에 붙힌다.
			ecercisepanel[i].setLayout(null);
			ecercisepanel[i].setPreferredSize(new Dimension(345, 120));
			ecercisepanel[i].setBorder(new LineBorder(Color.GRAY));
			ecercisepanel[i].setBackground(Color.WHITE);

			exnameLabel[i] = new JLabel(ECname);
			exnameLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			exnameLabel[i].setFont(new Font("굴림", Font.PLAIN, 20));
			exnameLabel[i].setBounds(110, 10, 120, 37);
			ecercisepanel[i].add(exnameLabel[i]);

			printpanel[i] = new JPanel();
			printpanel[i].setBorder(new LineBorder(SystemColor.activeCaption));
			printpanel[i].setBackground(Color.WHITE);
			printpanel[i].setBounds(0, 57, 345, 63);
			ecercisepanel[i].add(printpanel[i]);
			printpanel[i].setLayout(new GridLayout(0, 3, 0, 0));

			asetLabel[i] = new JLabel("세트");
			asetLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			asetLabel[i].setFont(new Font("돋움체", Font.BOLD, 15));
			asetLabel[i].setBackground(Color.WHITE);
			printpanel[i].add(asetLabel[i]);

			aweightLabel[i] = new JLabel("kg");
			aweightLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			aweightLabel[i].setFont(new Font("돋움체", Font.BOLD, 15));
			aweightLabel[i].setBackground(Color.WHITE);
			printpanel[i].add(aweightLabel[i]);

			aexnumberLabel[i] = new JLabel("회");
			aexnumberLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			aexnumberLabel[i].setFont(new Font("돋움체", Font.BOLD, 15));
			aexnumberLabel[i].setBackground(Color.WHITE);
			printpanel[i].add(aexnumberLabel[i]);

			setLabel[i] = new JLabel(ECset);
			setLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			setLabel[i].setFont(new Font("돋움체", Font.BOLD, 15));
			setLabel[i].setBackground(Color.WHITE);
			printpanel[i].add(setLabel[i]);

			weightLabel[i] = new JLabel(ECweight);
			weightLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			weightLabel[i].setFont(new Font("돋움체", Font.BOLD, 15));
			weightLabel[i].setBackground(Color.WHITE);
			printpanel[i].add(weightLabel[i]);

			exnumberLabel[i] = new JLabel(ECnumber);
			exnumberLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			exnumberLabel[i].setFont(new Font("돋움체", Font.BOLD, 15));
			exnumberLabel[i].setBackground(Color.WHITE);
			printpanel[i].add(exnumberLabel[i]);
		}
		frame.setVisible(true);
	}
}
