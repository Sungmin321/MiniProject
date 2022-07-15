package healthymain.customer.plan;

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
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;
import healthymain.database.PlanVo;

import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class PlanStatistics {

	private JFrame frame;
	private JTable table;
	
	public PlanStatistics() {
		String header[] = {"날짜", "시작시간", "종료시간", "루틴넘버"}; //고정
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
		
		JLabel titleLabel = new JLabel("Plan_Statistics");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton BeforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Plan();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		BeforeButton.setBorderPainted(false);
		BeforeButton.setBackground(new Color(52, 152, 219));
		BeforeButton.setBounds(10, 521, 345, 50);
		frame.getContentPane().add(BeforeButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 58, 364, 453);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 340, 433);
		panel_3.add(scrollPane);
		
		// 데이터를 갖고와서 넣기
		ArrayList<PlanVo> list = new MemberDAO().getPlanList(MemberVo.user.getId());
//		ArrayList<PlanVo> list = new MemberDAO().Plan_list("123");
		System.out.println(list.size());
		String contents [][] = new String[list.size()][4];
		for (int i = 0; i<list.size() ; i++) {
			PlanVo now = list.get(i);
				contents[i][0] = now.getDATE();
				contents[i][1] = now.getSTIME();
				contents[i][2] = now.getETIME();
				contents[i][3] = now.getRUTIN();
		}
		
		table = new JTable(contents, header);
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(Color.BLACK));
		
		frame.setVisible(true);

	}
}
