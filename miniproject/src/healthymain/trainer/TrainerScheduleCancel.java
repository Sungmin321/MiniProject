package healthymain.trainer;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

import healthymain.database.InsertUpdate;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;
import healthymain.database.PTVo;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TrainerScheduleCancel {

	private JFrame frame;

	public TrainerScheduleCancel() {
		JTable PTLookuptable;
		JTextField textField;
		String header[] = { "날짜", "시간대", "이름", "이행여부" };
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
				new TrainerMain();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);

		JLabel titleLabel = new JLabel("Trainer_ScheduleCancel");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);

		JButton beforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		beforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TrainerMain();
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
		scrollPane.setBounds(12, 10, 340, 359);
		canceluppanel.add(scrollPane);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String todaydate = dateFormat.format(new Date()); // 현재 데이터
		Date date = null;
		Date today = null;
		try {
			today = dateFormat.parse(todaydate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		ArrayList<PTVo> list = new MemberDAO().getTrainerPtList(MemberVo.user.getId());
		System.out.println(list.size());
		String contents[][] = new String[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			PTVo now = list.get(i);
			
			contents[i][0] = now.getDATE();
			contents[i][1] = now.getHour();
			contents[i][2] = new MemberDAO().getCustomerName(now.getTR_Id());
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
			}else 
				contents[i][3] = "예약 취소";

		}
		
		PTLookuptable = new JTable(contents, header);
		PTLookuptable.setFont(new Font("굴림", Font.PLAIN, 12));
		scrollPane.setViewportView(PTLookuptable);
		PTLookuptable.setBorder(new LineBorder(Color.BLACK));

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(45, 380, 149, 22);
		canceluppanel.add(dateChooser);

		JComboBox timecomboBox = new JComboBox();
		timecomboBox.setBounds(130, 411, 110, 30);
		canceluppanel.add(timecomboBox);

		textField = new JTextField("회원 이름 입력");
		textField.setBounds(12, 411, 110, 30);
		canceluppanel.add(textField);
		textField.setColumns(10);

		JButton cancelButton = new JButton("예약 취소");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = new MemberDAO().getCustomerId(textField.getText());
				String date = dateChooser.getJCalendar().getYearChooser().getYear() + "-"
						+ (dateChooser.getJCalendar().getMonthChooser().getMonth() + 1) + "-"
						+ dateChooser.getJCalendar().getDayChooser().getDay();
				String tr_id = MemberVo.user.getId();
				String hour = timecomboBox.getSelectedItem().toString();
				new InsertUpdate().deletePtReservation(id, date, tr_id, hour);
				JOptionPane.showMessageDialog(null, "예약 취소 되셨습니다.");
			}
		});
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		cancelButton.setBorderPainted(false);
		cancelButton.setBackground(new Color(52, 152, 219));
		cancelButton.setBounds(255, 379, 97, 63);
		canceluppanel.add(cancelButton);

		frame.setVisible(true);

	}
}
