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
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;
import healthymain.database.PTVo;

import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class TrainerScheduleinquiry {

	private JFrame frame;
	
	public TrainerScheduleinquiry() {
		JTable table;
		String header[] = {"��¥", "�ð���", "ȸ����", "���࿩��"};
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
				new TrainerMain();
			}
		});
		btnNewButton.setPreferredSize(new Dimension(60, 60));
		btnNewButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		btnNewButton.setBackground(toolgreen);
		btnNewButton.setBorderPainted(false);
		panel.add(btnNewButton, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Scheduleinquiry");
		lblNewLabel.setFont(new Font("HY������B", Font.PLAIN, 15));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);
		
		
		JButton btnNewButton_1_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TrainerMain();
			}
		});
		
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("���� ����", Font.BOLD, 18));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(52, 152, 219));
		btnNewButton_1_3.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 58, 364, 453);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 340, 433);
		panel_3.add(scrollPane);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String todaydate = dateFormat.format(new Date()); // ���� ������
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
					// TODO �ڵ� ������ catch ����
					e1.printStackTrace();
				}
				int compare = date.compareTo(today);
				// date = 7/10 , today = 7/11
				if (compare > 0) { // ����϶�. << �޾ƿ� ��� ��¥�� ���ú��� Ŭ��
					System.out.println("date�� today���� Ů�ϴ�.(date > today)");
					contents[i][3] = "���� ��";
				} else if (compare < 0) {
					contents[i][3] = "�Ϸ�";
					System.out.println("today�� date���� Ů�ϴ�.(date < today)");
				} else {
					System.out.println("today�� date�� �����ϴ�.(date = today)");
					contents[i][3] = "���� ��";
				}
			} else {
				contents[i][3] = "���� ���";
			}

		}
		
		table = new JTable(contents, header);
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(Color.BLACK));
		
		frame.setVisible(true);

	}
}