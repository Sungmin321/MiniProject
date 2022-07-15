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

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import com.toedter.calendar.JCalendar;

import healthymain.customer.CustomerMain;
import healthymain.database.InsertUpdate;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;

public class PersonalTrainingReservation {
	private JFrame frame;
	JComboBox trnamecomboBox;
	JComboBox timecomboBox;
	ArrayList<String> ar;
	String times[] = { "�ð���" };

	public PersonalTrainingReservation() {
		Color toolgreen = new Color(26, 188, 156);
		Color btblue = new Color(52, 152, 219);
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

		JButton homebtn = new JButton("");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new CustomerMain();
			}
		});
		homebtn.setPreferredSize(new Dimension(60, 60));
		homebtn.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homebtn.setBackground(toolgreen);
		homebtn.setBorderPainted(false);
		panel.add(homebtn, BorderLayout.WEST);

		JLabel headLabel = new JLabel("PersonalTrainer_Reservation");
		headLabel.setFont(new Font("HY������B", Font.PLAIN, 15));
		panel.add(headLabel, BorderLayout.CENTER);
		headLabel.setForeground(Color.white);

		JPanel calendarpanel = new JPanel();
		calendarpanel.setBackground(Color.WHITE);
		calendarpanel.setBounds(0, 59, 364, 274);
		frame.getContentPane().add(calendarpanel);

		JCalendar calendar = new JCalendar();
		calendar.getDayChooser().getDayPanel().setBackground(Color.WHITE);
		calendarpanel.add(calendar);
		calendar.setPreferredSize(new DimensionUIResource(350, 265));

		JButton backbtn = new JButton("\uC774\uC804\uC73C\uB85C");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PersonalTraining();
			}
		});
		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(new Font("���� ���", Font.BOLD, 18));
		backbtn.setBorderPainted(false);
		backbtn.setBackground(new Color(52, 152, 219));
		backbtn.setBounds(10, 520, 345, 50);
		frame.getContentPane().add(backbtn);

		JPanel Reservationpanel = new JPanel();
		Reservationpanel.setBounds(0, 337, 364, 50);
		frame.getContentPane().add(Reservationpanel);
		Reservationpanel.setLayout(null);

		JButton btnNewButton_1 = new JButton("�����ϱ�");
		btnNewButton_1.setBounds(252, 10, 100, 30);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 14));
		btnNewButton_1.setBackground(btblue);
		btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enp = timecomboBox.getSelectedItem().toString();
				String date = calendar.getYearChooser().getYear() + "-" + (calendar.getMonthChooser().getMonth() + 1)
						+ "-" + calendar.getDayChooser().getDay();

				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String todaydate = dateFormat.format(new Date()); // ���� ������
				Date ddate = null;
				Date today = null;
				try {
					today = dateFormat.parse(todaydate);
					ddate = dateFormat.parse(date);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				int compare = ddate.compareTo(today);

				if (compare >= 0) {
					if (enp.charAt(enp.length() - 1) == 'Y') {
						String pt_hour;
						if (timecomboBox.getSelectedItem().toString().charAt(0) != '1') { // ù��°�� 1�� �ƴϸ�
							pt_hour = timecomboBox.getSelectedItem().toString().substring(0, 1);
						} else {
							pt_hour = timecomboBox.getSelectedItem().toString().substring(0, 2);
						}
//					System.out.println(tr_t);
						String tr_id = new MemberDAO().getTrainerId(trnamecomboBox.getSelectedItem().toString());
//					System.out.println(tr_id);
//					System.out.println(date);
						if (new InsertUpdate().isPtReservationInsert(MemberVo.user.getId(), tr_id, date, pt_hour)) {
							// �����ϸ�.
							JOptionPane.showInternalMessageDialog(null, "����Ǽ̽��ϴ�.");
						} else {
							JOptionPane.showInternalMessageDialog(null, "���� ����� ȸ������ ��ʴϴ�. �ð���� ������ �������ּ���.");
						}
					} else {
						JOptionPane.showMessageDialog(null, "���� ������ �ð��밡 �ƴմϴ�.");
					}
				}else 
					JOptionPane.showMessageDialog(null, "���� ��¥�� ������ �Ұ����մϴ�.");
					
//				String enp = timecomboBox.getSelectedItem().toString(); // �ð���
				// ������ �ѱ�� ���� Ʈ���̳� �̸�, �ð��븦 �Ѱ��ֱ�.

			}
		});
		Reservationpanel.add(btnNewButton_1);

		String qurey = "SELECT count(*) FROM TRAINER_INFO WHERE TRAINER_POSITION = '1'";
		String size = new MemberDAO().getSize(qurey);
		String trnames[] = new String[Integer.valueOf(size)];

		qurey = "SELECT NAME FROM TRAINER_INFO WHERE TRAINER_POSITION = '1'";
		ar = new MemberDAO().getNames(qurey);
		for (int i = 0; i < trnames.length; i++) {
			trnames[i] = ar.get(i);
		}

		trnamecomboBox = new JComboBox();
		trnamecomboBox.setModel(new DefaultComboBoxModel(trnames));
		trnamecomboBox.setBounds(12, 10, 100, 30);
		Reservationpanel.add(trnamecomboBox);
//		trnamecomboBox.addActionListener(timecomboBox);
		trnamecomboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �ڵ� ������ �޼ҵ� ����
				String trname = trnamecomboBox.getSelectedItem().toString();
				ar = new MemberDAO().getTrainerTimes(trname); // tr ���ӿ� ���� �ð��� ���ϰ��� ar�� ���.

				System.out.println(trnamecomboBox.getSelectedItem().toString());
				trnamecomboBox.getSelectedItem().toString();

				times = new String[ar.size()];
				for (int i = 0; i < ar.size(); i++) {
					times[i] = (8 + i) + "�� : " + ar.get(i);
				}

				timecomboBox.setModel(new DefaultComboBoxModel(times));
				frame.setVisible(true);
			}
		});

		timecomboBox = new JComboBox();
		timecomboBox.setFont(new Font("������", Font.PLAIN, 15));
		timecomboBox.setMaximumRowCount(10);
		timecomboBox.setModel(new DefaultComboBoxModel(times));
		timecomboBox.setBounds(124, 10, 116, 30);
		Reservationpanel.add(timecomboBox);

		JLabel subLabel = new JLabel("* �ð��뿡 N���� ǥ�õǴ� �ð��� ���� �Ұ�");
		subLabel.setBounds(10, 397, 345, 26);
		frame.getContentPane().add(subLabel);

		JLabel subLabel2 = new JLabel("* ���� ������ ȸ���� ���� �� ���� �Ұ�");
		subLabel2.setBounds(10, 425, 345, 26);
		frame.getContentPane().add(subLabel2);
		frame.setVisible(true);

	}
}
