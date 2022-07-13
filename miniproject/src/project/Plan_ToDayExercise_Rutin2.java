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
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Plan_ToDayExercise_Rutin2 {

	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156);
	private JTextField addexnametf;
	private JTextField settf;
	private JTextField weighttf;
	private JTextField exnumbertf;
	private String ECname, ECset, ECweight, ECnumber;
	private JTextField Detf;
	private String Rutinnum = "2";
	int size = Integer.valueOf( new MemberDAO().getRutinsize(Rutinnum, MemberVo.user.getId()));
	JPanel ecercisepanel[] = new JPanel[size];
	JPanel printpanel[] = new JPanel[size];
	JLabel exnameLabel[] = new JLabel[size];
	JLabel asetLabel[] = new JLabel[size];
	JLabel aweightLabel[] = new JLabel[size];
	JLabel aexnumberLabel[] = new JLabel[size];
	JLabel setLabel[] = new JLabel[size];
	JLabel weightLabel[] = new JLabel[size];
	JLabel exnumberLabel[] = new JLabel[size];

	public static void main(String[] args) {
		new Plan_ToDayExercise_Rutin2();
	}

	public Plan_ToDayExercise_Rutin2() {
		
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(380, 620);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel mainpanel = new JPanel();
		mainpanel.setBackground(Color.WHITE);
		mainpanel.setBounds(0, 0, 370, 467);
		frame.getContentPane().add(mainpanel);
		mainpanel.setLayout(null);

		JPanel panelhead = new JPanel();
		panelhead.setBounds(0, 5, 365, 60);
		panelhead.setPreferredSize(new Dimension(365, 60));
		panelhead.setBackground(new Color(26, 188, 156));
		mainpanel.add(panelhead);
		panelhead.setLayout(new BorderLayout(0, 0));

		JLabel headLabel = new JLabel("Plan_ToDay Exercise_Rutin2");
		headLabel.setForeground(Color.WHITE);
		headLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panelhead.add(headLabel, BorderLayout.CENTER);

		JButton homeButton = new JButton("");
		panelhead.add(homeButton, BorderLayout.WEST);
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



		JPanel rutinaddpanel = new JPanel();
		rutinaddpanel.setBounds(0, 70, 365, 120);
		rutinaddpanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		rutinaddpanel.setLayout(null);
		rutinaddpanel.setPreferredSize(new Dimension(365, 120));
		rutinaddpanel.setBackground(Color.WHITE);
		mainpanel.add(rutinaddpanel);

		JPanel rutinaddpanel_1 = new JPanel();
		rutinaddpanel_1.setBorder(new LineBorder(SystemColor.activeCaption));
		rutinaddpanel_1.setBackground(Color.WHITE);
		rutinaddpanel_1.setBounds(0, 57, 284, 63);
		rutinaddpanel.add(rutinaddpanel_1);
		rutinaddpanel_1.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel addsetLabel = new JLabel("\uC138\uD2B8(\uC22B\uC790)");
		addsetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addsetLabel.setFont(new Font("돋움체", Font.BOLD, 15));
		addsetLabel.setBackground(Color.WHITE);
		rutinaddpanel_1.add(addsetLabel);

		JLabel addweightlLabel = new JLabel("kg(\uC22B\uC790)");
		addweightlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addweightlLabel.setFont(new Font("돋움체", Font.BOLD, 15));
		addweightlLabel.setBackground(Color.WHITE);
		rutinaddpanel_1.add(addweightlLabel);

		JLabel addexnumberLabel = new JLabel("\uD68C(\uC22B\uC790)");
		addexnumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addexnumberLabel.setFont(new Font("돋움체", Font.BOLD, 15));
		addexnumberLabel.setBackground(Color.WHITE);
		rutinaddpanel_1.add(addexnumberLabel);

		settf = new JTextField();
		rutinaddpanel_1.add(settf);
		settf.setColumns(10);

		weighttf = new JTextField();
		weighttf.setColumns(10);
		rutinaddpanel_1.add(weighttf);

		exnumbertf = new JTextField();
		exnumbertf.setColumns(10);
		rutinaddpanel_1.add(exnumbertf);

		addexnametf = new JTextField();
		addexnametf.setHorizontalAlignment(SwingConstants.CENTER);
		addexnametf.setText("\uC6B4\uB3D9\uBA85\uC744 \uC785\uB825\uD558\uC138\uC694");
		addexnametf.setBounds(31, 10, 226, 32);
		rutinaddpanel.add(addexnametf);
		addexnametf.setColumns(10);

		ImageIcon icon = new ImageIcon("D:\\\\work\\\\miniproject\\\\image\\\\plusicon.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JButton savebtn = new JButton(changeIcon);
		savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ECname = addexnametf.gettext();
				ECname = addexnametf.getText();
				ECset = settf.getText();
				ECweight = weighttf.getText();
				ECnumber = exnumbertf.getText();
				// 셋,웨이트,넘버 숫자인지
				if (ECset.chars().allMatch(Character::isDigit) & ECweight.chars().allMatch(Character::isDigit)
						& ECnumber.chars().allMatch(Character::isDigit)) {
					// 숫자판별 후 rutin1 데이터 생성.
					if (new Insert().plan_Rutin_insert(Rutinnum, ECname, ECset, ECweight, ECnumber,
							MemberVo.user.getId())) {
						JOptionPane.showMessageDialog(null, "추가 success");
						frame.setVisible(false);
						new Plan_ToDayExercise_Rutin2();
					} else {
						JOptionPane.showMessageDialog(null, "추가 fail");
					}

				}
			}
		});
		savebtn.setBounds(296, 39, 50, 50);
		rutinaddpanel.add(savebtn);

		JLabel lblNewLabel = new JLabel("저장하기");
		lblNewLabel.setFont(new Font("굴림체", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(288, 20, 65, 21);
		rutinaddpanel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 192, 364, 275);
		mainpanel.add(scrollPane);

		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(size, 0, 0, 0));

		ArrayList<RutinVo> list = new MemberDAO().Rutin_list(Rutinnum, MemberVo.user.getId());
//		ArrayList<RutinVo> list = new MemberDAO().Rutin_list("1", "123");
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
		
		JButton backbtn = new JButton("이전으로");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Plan_ToDayExercise();
			}
		});
		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		backbtn.setBorderPainted(false);
		backbtn.setBackground(new Color(52, 152, 219));
		backbtn.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(backbtn);

		Detf = new JTextField();
		Detf.setText("삭제 할 운동명을 입력해주세요");
		Detf.setHorizontalAlignment(SwingConstants.CENTER);
		Detf.setBounds(10, 477, 222, 30);
		frame.getContentPane().add(Detf);
		Detf.setColumns(10);

		JButton deletebtn = new JButton("삭제하기");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ECname = Detf.getText();
				if (new MemberDAO().plan_Rutin_test(ECname, Rutinnum, MemberVo.user.getId())) {
					if (new Insert().plan_Rutin_Delete(ECname, Rutinnum, MemberVo.user.getId())) {
						JOptionPane.showMessageDialog(null, "삭제 성공");
						frame.setVisible(false);
						new Plan_ToDayExercise_Rutin2();
					}
				}else
					JOptionPane.showMessageDialog(null, "삭제 할 항목이 없습니다.");
			}
		});
		deletebtn.setForeground(Color.white);
		deletebtn.setBorderPainted(false);
		deletebtn.setBackground(new Color(52, 152, 219));
		deletebtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		deletebtn.setBounds(243, 477, 109, 30);
		frame.getContentPane().add(deletebtn);
		frame.setVisible(true);

	}
}
