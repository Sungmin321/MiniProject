package healthymain.customer.plan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class Plan {
	private JFrame frame;

	public Plan() {
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

		JLabel lblNewLabel = new JLabel("Plan");
		lblNewLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		headpanel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JPanel calendarpanel = new JPanel();
		calendarpanel.setBackground(Color.WHITE);
		calendarpanel.setBounds(0, 59, 364, 274);
		frame.getContentPane().add(calendarpanel);

		JCalendar calendar = new JCalendar();
		calendar.getDayChooser().getDayPanel().setBackground(Color.WHITE);
		calendarpanel.add(calendar);
		calendar.setPreferredSize(new DimensionUIResource(350, 265));

		JButton StartButton = new JButton("운동시작");
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new MemberDAO().hasPlan(MemberVo.user.getId())) { // 데이터가 있다면 트루. 없다면 false
					if (new InsertUpdate().isPlanStimeModify(MemberVo.user.getId())) {
						JOptionPane.showMessageDialog(null, "시작시간 저장완료");
					} else {
						JOptionPane.showMessageDialog(null, "데이터 저장 실패"); // 
					}
				} else {
					if (new InsertUpdate().isPlanInsert(MemberVo.user.getId())) {
						JOptionPane.showMessageDialog(null, "시작시간 저장완료");
					} else {
						JOptionPane.showMessageDialog(null, "데이터 저장 실패"); // 안뜰텐데? 아마도?
					}
				}

			}
		});
		StartButton.setBackground(btblue);
		StartButton.setForeground(Color.white);
		StartButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		StartButton.setBounds(10, 340, 165, 50);
		StartButton.setBorderPainted(false);
		frame.getContentPane().add(StartButton);

		JButton EndButton = new JButton("운동 끝");
		EndButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new MemberDAO().hasPlan(MemberVo.user.getId())) {
					if (new InsertUpdate().isPlanEtimeModify(MemberVo.user.getId())) {
						JOptionPane.showMessageDialog(null, "종료시간 저장완료");
					}
				}else
					JOptionPane.showMessageDialog(null, "시작시간 먼저 눌러주세요!");
			}
		});
		EndButton.setForeground(Color.WHITE);
		EndButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		EndButton.setBorderPainted(false);
		EndButton.setBackground(new Color(52, 152, 219));
		EndButton.setBounds(190, 340, 165, 50);

		JButton planbtn = new JButton("\uC624\uB298\uC758 \uC6B4\uB3D9 \uACC4\uD68D\uD558\uAE30");
		planbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new ToDayExercisePlan();
			}
		});
		planbtn.setForeground(Color.WHITE);
		planbtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		planbtn.setBorderPainted(false);
		planbtn.setBackground(new Color(52, 152, 219));
		planbtn.setBounds(10, 400, 345, 50);
		frame.getContentPane().add(planbtn);

		JButton plan_statisticsbtn = new JButton("\uC6B4\uB3D9 \uC2DC\uAC04 \uD1B5\uACC4");
		plan_statisticsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PlanStatistics();
			}
		});
		plan_statisticsbtn.setForeground(Color.WHITE);
		plan_statisticsbtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		plan_statisticsbtn.setBorderPainted(false);
		plan_statisticsbtn.setBackground(new Color(52, 152, 219));
		plan_statisticsbtn.setBounds(10, 460, 345, 50);
		frame.getContentPane().add(plan_statisticsbtn);

		JButton backbtn = new JButton("\uC774\uC804\uC73C\uB85C");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new CustomerMain();
			}
		});
		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		backbtn.setBorderPainted(false);
		backbtn.setBackground(new Color(52, 152, 219));
		backbtn.setBounds(10, 520, 345, 50);
		frame.getContentPane().add(backbtn);

		frame.getContentPane().add(EndButton);
		frame.setVisible(true);

	}
}
