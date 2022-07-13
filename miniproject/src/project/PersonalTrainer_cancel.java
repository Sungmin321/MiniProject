package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class PersonalTrainer_cancel {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251, 197, 60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156);
	private JFrame frame;
	private JTable PTLookuptable;
	String header[] = { "날짜", "이름", "시간대", "비고" };
	ArrayList<String> ar;
	JComboBox trnamecomboBox;

	public static void main(String[] args) {
		new PersonalTrainer_cancel();
	}

	public PersonalTrainer_cancel() {
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
				new Main_Customer();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);

		JLabel lblNewLabel = new JLabel("PersonalTrainer_Cancel");
		lblNewLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_PersonalTrainer();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);

		JPanel Lookuppanel = new JPanel();
		Lookuppanel.setBackground(Color.WHITE);
		Lookuppanel.setBounds(0, 58, 364, 450);
		frame.getContentPane().add(Lookuppanel);
		Lookuppanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Lookuppanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 340, 359);
		Lookuppanel.add(scrollPane);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String todaydate = dateFormat.format(new Date()); // 현재 데이터
		Date date = null;
		Date today = null;
		try {
			today = dateFormat.parse(todaydate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		ArrayList<PTVo> list = new MemberDAO().PT_list(MemberVo.user.getId());
		System.out.println(list.size());
		String contents[][] = new String[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			PTVo now = list.get(i);
			if (now.getFlag().charAt(0) == '0') {
				contents[i][0] = now.getDATE();
				contents[i][1] = new MemberDAO().getTRname(now.getTR_Id()); // 트레이너 이름.
				contents[i][2] = now.getHour();
				try {
					date = dateFormat.parse(now.getDATE());
				} catch (ParseException e1) {
					// TODO 자동 생성된 catch 블록
					e1.printStackTrace();
				}
				int compare = date.compareTo(today);
				// date = 7/10 , today = 7/11
				if (compare > 0) { // 양수일때. << 받아온 통계 날짜가 오늘보다 클때
					System.out.println("date가 today보다 큽니다.(date > today)");
					contents[i][3] = "취소 가능";
				} else if (compare < 0) {
					contents[i][3] = "완료";
					System.out.println("today가 date보다 큽니다.(date < today)");
				} else {
					System.out.println("today와 date가 같습니다.(date = today)");
					contents[i][3] = "취소 불가능";
				}
			}
		}

		PTLookuptable = new JTable(contents, header);
		PTLookuptable.setFont(new Font("굴림", Font.PLAIN, 12));
		scrollPane.setViewportView(PTLookuptable);
		PTLookuptable.setBorder(new LineBorder(Color.BLACK));

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(45, 380, 149, 22);
		Lookuppanel.add(dateChooser);

		String qurey = "SELECT count(*) FROM TRAINER_INFO WHERE TRAINER_POSITION = '1'";
		String size = new MemberDAO().get_TR_size(qurey);
		String trnames[] = new String[Integer.valueOf(size)];

		qurey = "SELECT NAME FROM TRAINER_INFO WHERE TRAINER_POSITION = '1'";
		ar = new MemberDAO().getNames(qurey);

		for (int i = 0; i < trnames.length; i++) {
			trnames[i] = ar.get(i);
		}

		trnamecomboBox = new JComboBox();
		trnamecomboBox.setModel(new DefaultComboBoxModel(trnames));
		trnamecomboBox.setBounds(11, 412, 110, 30);
		Lookuppanel.add(trnamecomboBox);

		String times[] = { "시간대", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" };
		JComboBox timecomboBox = new JComboBox();
		timecomboBox.setBounds(130, 412, 110, 30);
		timecomboBox.setModel(new DefaultComboBoxModel(times));
		Lookuppanel.add(timecomboBox);

		JButton cancelButton = new JButton("예약취소");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = MemberVo.user.getId();
				String date = dateChooser.getJCalendar().getYearChooser().getYear() + "-"
						+ (dateChooser.getJCalendar().getMonthChooser().getMonth() + 1) + "-"
						+ dateChooser.getJCalendar().getDayChooser().getDay();
				String tr_id = new MemberDAO().getTRid(trnamecomboBox.getSelectedItem().toString());
				String hour = timecomboBox.getSelectedItem().toString();

				if (new MemberDAO().customer_delete_test(id, date, tr_id, hour)) {
					new Insert().PT_flag_update(id, date, tr_id, hour);
					JOptionPane.showMessageDialog(null, "예약 취소되셨습니다.");
					frame.setVisible(false);
					new PersonalTrainer_cancel();
				}else
					JOptionPane.showMessageDialog(null, "해당하는 예약항목이 없습니다.");
			}
		});
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		cancelButton.setBorderPainted(false);
		cancelButton.setBackground(new Color(52, 152, 219));
		cancelButton.setBounds(255, 379, 97, 63);
		Lookuppanel.add(cancelButton);

		frame.setVisible(true);

	}
}
