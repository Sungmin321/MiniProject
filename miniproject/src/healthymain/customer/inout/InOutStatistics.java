package healthymain.customer.inout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import healthymain.customer.CustomerMain;
import healthymain.database.InoutVo;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;

import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class InOutStatistics {

	private JFrame frame;

	public InOutStatistics() {
		JTable table;
		String header[] = { "날짜", "체중", "운동", "음주" };
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
		panel.add(btnNewButton, BorderLayout.WEST);

		JLabel lblNewLabel = new JLabel("IN&OUT_Statistics");
		lblNewLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new InOut();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 58, 364, 393);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 340, 373);
		panel_3.add(scrollPane);

		ArrayList<InoutVo> list = new MemberDAO().getInOutList(MemberVo.user.getId());
		System.out.println(list.size());
		String contents[][] = new String[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			InoutVo now = list.get(i);
			contents[i][0] = now.getDATE();
			contents[i][1] = now.getWEIGHT();
			if (now.getEXERCISING().equals("1")) {
				contents[i][2] = "O";
			} else {
				contents[i][2] = "X";
			}
			if (now.getDRINKING().equals("1")) {
				contents[i][3] = "O";
			} else {
				contents[i][3] = "X";
			}
		}
		table = new JTable(contents, header);
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(Color.BLACK));

		JButton btnNewButton_1_3_1 = new JButton("식단기록 확인");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodRecordDialog.main(null);
			}
		});
		btnNewButton_1_3_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1_3_1.setBorderPainted(false);
		btnNewButton_1_3_1.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3_1.setBounds(10, 461, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3_1);

		frame.setVisible(true);

	}
}
