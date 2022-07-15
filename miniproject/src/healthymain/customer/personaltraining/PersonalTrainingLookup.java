package healthymain.customer.personaltraining;

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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import healthymain.customer.CustomerMain;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;
import healthymain.database.PTVo;

public class PersonalTrainingLookup {

	private JFrame frame;

	public PersonalTrainingLookup() {
		JTable PTLookuptable;
		String header[] = { "날짜", "시간대", "Trainer", "PT이행여부" };
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

		JButton homeButton = new JButton("");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new CustomerMain();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);

		JLabel lblNewLabel = new JLabel("PersonalTrainer_Lookup");
		lblNewLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PersonalTraining();
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
		scrollPane.setBounds(12, 10, 340, 430);
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

		ArrayList<PTVo> list = new MemberDAO().getCustomerPtList(MemberVo.user.getId());
		System.out.println(list.size());
		String contents[][] = new String[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			PTVo now = list.get(i);
			contents[i][0] = now.getDATE();
			contents[i][1] = now.getHour();
			contents[i][2] = new MemberDAO().getTrainerName(now.getTR_Id());
			if (now.getFlag().charAt(0) == '0') {
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
					contents[i][3] = "예약 중";
				} else if (compare < 0) {
					contents[i][3] = "완료";
					System.out.println("today가 date보다 큽니다.(date < today)");
				} else {
					System.out.println("today와 date가 같습니다.(date = today)");
					contents[i][3] = "예약 중";
				}
			} else {
				contents[i][3] = "예약 취소";
			}

		}

		PTLookuptable = new JTable(contents, header);
		PTLookuptable.setFont(new Font("굴림", Font.PLAIN, 12));
		scrollPane.setViewportView(PTLookuptable);
		PTLookuptable.setBorder(new LineBorder(Color.BLACK));

		frame.setVisible(true);

	}
}
