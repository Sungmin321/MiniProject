package healthymain.customer.plan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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

import healthymain.customer.CustomerMain;
import healthymain.customer.plan.rutin.Rutin;
import healthymain.database.InsertUpdate;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;
import healthymain.database.RutinVo;

public class ToDayExercisePlan implements ItemListener {

	private JFrame frame;
	private JPanel panel;
	private JRadioButton RadioButton1, RadioButton2, RadioButton3, RadioButton4;
	JScrollPane scrollPane;
	
	public ToDayExercisePlan() {
		Color toolgreen = new Color(26, 188, 156);
		Color btblue = new Color(52, 152, 219);
		Color Jorange = new Color(244, 128, 75);
		Color JYellow = new Color(251, 197, 60);
		Color Jlightgreen = new Color(177, 212, 98);
		
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
				new CustomerMain();
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

		JButton BackButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Plan();
			}
		});
		BackButton.setForeground(Color.WHITE);
		BackButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		BackButton.setBorderPainted(false);
		BackButton.setBackground(new Color(52, 152, 219));
		BackButton.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(BackButton);

		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setBounds(0, 63, 364, 448);
		frame.getContentPane().add(main);
		main.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		main.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 24, 350, 200);
		main.add(scrollPane);

		panel = new JPanel();
		scrollPane.setViewportView(panel);
//		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panelbottom = new JPanel();
		panelbottom.setBounds(6, 230, 350, 214);
		main.add(panelbottom);
		panelbottom.setLayout(null);

		JPanel RutinPanel1 = new JPanel();
		RutinPanel1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		RutinPanel1.setBackground(JYellow);
		RutinPanel1.setBounds(0, 23, 350, 48);
		panelbottom.add(RutinPanel1);
		RutinPanel1.setLayout(new BorderLayout(0, 0));

		RadioButton1 = new JRadioButton("A");
		RutinPanel1.add(RadioButton1, BorderLayout.EAST);
		RadioButton1.addItemListener(this);

		JPanel RutinPanel2 = new JPanel();
		RutinPanel2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		RutinPanel2.setBackground(Jorange);
		RutinPanel2.setBounds(0, 70, 350, 48);
		panelbottom.add(RutinPanel2);
		RutinPanel2.setLayout(new BorderLayout(0, 0));

		RadioButton2 = new JRadioButton("B");
		RutinPanel2.add(RadioButton2, BorderLayout.EAST);
		RadioButton2.addItemListener(this);

		JPanel RutinPanel3 = new JPanel();
		RutinPanel3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		RutinPanel3.setBackground(Color.WHITE);
		RutinPanel3.setBounds(0, 118, 350, 48);
		panelbottom.add(RutinPanel3);
		RutinPanel3.setLayout(new BorderLayout(0, 0));

		JPanel RutinPanel4 = new JPanel();
		RutinPanel4.setBorder(new LineBorder(Color.LIGHT_GRAY));
		RutinPanel4.setBounds(0, 166, 350, 48);
		panelbottom.add(RutinPanel4);
		RutinPanel4.setLayout(new BorderLayout(0, 0));

		RadioButton3 = new JRadioButton("C");
		RutinPanel3.add(RadioButton3, BorderLayout.EAST);
		RadioButton3.addItemListener(this);

		ButtonGroup group = new ButtonGroup();
		group.add(RadioButton1);

		JButton Button1 = new JButton("Rutin1");
		Button1.setBackground(JYellow);
		Button1.setFont(new Font("굴림", Font.BOLD, 20));
		RutinPanel1.add(Button1, BorderLayout.CENTER);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 만약에 저장 된 운동이 하나도 있다면 바로 실행
				if (new InsertUpdate().hasRutinDate("1", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Rutin("1");
				} else {
					if (new InsertUpdate().isRutinInsert("1", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Rutin("1");
					}
				}
			}
		});
		group.add(RadioButton2);

		JButton Button2 = new JButton("Rutin2");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new InsertUpdate().hasRutinDate("2", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Rutin("2");
				} else {
					if (new InsertUpdate().isRutinInsert("2", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Rutin("2");
					}
				}
			}
		});
		Button2.setFont(new Font("굴림", Font.BOLD, 20));
		Button2.setBackground(Jorange);
		RutinPanel2.add(Button2, BorderLayout.CENTER);
		group.add(RadioButton3);

		JButton Button3 = new JButton("Rutin3");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new InsertUpdate().hasRutinDate("3", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Rutin("3");
				} else {
					if (new InsertUpdate().isRutinInsert("3", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Rutin("3");
					}
				}
			}
		});
		Button3.setFont(new Font("굴림", Font.BOLD, 20));
		Button3.setBackground(btblue);
		RutinPanel3.add(Button3, BorderLayout.CENTER);

		JButton Button4 = new JButton("Rutin4");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new InsertUpdate().hasRutinDate("4", MemberVo.user.getId())) {
					frame.setVisible(false);
					new Rutin("4");
				} else {
					if (new InsertUpdate().isRutinInsert("4", "런닝머신", "1", "20", "2", MemberVo.user.getId())) {
						// 저장시켜놓은 운동이 없을경우 기본운동을 insert 해주고 다음화면으로 넘어가게.
						frame.setVisible(false);
						new Rutin("4");
					}
				}
			}
		});
		Button4.setFont(new Font("굴림", Font.BOLD, 20));
		Button4.setBackground(Jlightgreen);
		RutinPanel4.add(Button4, BorderLayout.CENTER);

		RadioButton4 = new JRadioButton("D");
		RutinPanel4.add(RadioButton4, BorderLayout.EAST);
		RadioButton4.addItemListener(this);
		group.add(RadioButton4);

		JLabel RutinlistLabel = new JLabel("Rutin list");
		RutinlistLabel.setFont(new Font("굴림", Font.BOLD, 14));
		RutinlistLabel.setBounds(5, 4, 67, 15);
		panelbottom.add(RutinlistLabel);

		JButton RutinSaveButton = new JButton("Rutin Save");
		RutinSaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new MemberDAO().hasPlan(MemberVo.user.getId())) {// 정보가 있나?
					String num = "";
					if (RadioButton1.isSelected()) {
						num = "1";
					} else if (RadioButton2.isSelected()) {
						num = "2";
					} else if (RadioButton3.isSelected()) {
						num = "3";
					} else if (RadioButton4.isSelected()) {
						num = "4";
					}
					if (new InsertUpdate().isPlanRutinNumberModify(num, MemberVo.user.getId()))
						JOptionPane.showMessageDialog(null, "Rutin 저장 성공");
				} else {
					JOptionPane.showMessageDialog(null, "운동시작 먼저 눌러주세요!");
				}
			}
		});
		RutinSaveButton.setBounds(259, 0, 97, 23);
		main.add(RutinSaveButton);

		frame.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		
		String Rutinnum = null;
		if (RadioButton1.isSelected()) {
			Rutinnum = "1";
		} else if (RadioButton2.isSelected()) {
			Rutinnum = "2";
		} else if (RadioButton3.isSelected()) {
			Rutinnum = "3";
		} else if (RadioButton4.isSelected()) {
			Rutinnum = "4";
		}

		int size = Integer.valueOf(new MemberDAO().getRutinSize(Rutinnum, MemberVo.user.getId()));
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
		ArrayList<RutinVo> list = new MemberDAO().getRutinList(Rutinnum, MemberVo.user.getId());
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
