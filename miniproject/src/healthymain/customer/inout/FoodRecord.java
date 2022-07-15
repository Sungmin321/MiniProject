package healthymain.customer.inout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import healthymain.customer.plan.Plan;
import healthymain.database.InsertUpdate;
import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;

import java.awt.SystemColor;
import javax.swing.JTextArea;

public class FoodRecord {
	private JFrame frame;

	public FoodRecord() {
		Color toolgreen = new Color(26, 188, 156);
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

		JLabel lblNewLabel = new JLabel("IN&OUT FoodRecord");
		lblNewLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		headpanel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.white);

		JButton backbtn = new JButton("이전으로");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new InOut();
			}
		});
		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		backbtn.setBorderPainted(false);
		backbtn.setBackground(new Color(52, 152, 219));
		backbtn.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(backbtn);

		JPanel mainpanel = new JPanel();
		mainpanel.setBackground(SystemColor.inactiveCaptionBorder);
		mainpanel.setBounds(0, 59, 364, 452);
		frame.getContentPane().add(mainpanel);
		mainpanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		mainpanel.setLayout(null);

		JLabel FoodRecordLabel = new JLabel("식단 기록");
		FoodRecordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FoodRecordLabel.setFont(new Font("굴림", Font.BOLD, 25));
		FoodRecordLabel.setBackground(Color.WHITE);
		FoodRecordLabel.setBounds(-7, 3, 161, 50);
		mainpanel.add(FoodRecordLabel);

		JTextArea FoodRecordtextArea = new JTextArea();
		FoodRecordtextArea.setBounds(12, 50, 340, 392);
		mainpanel.add(FoodRecordtextArea);

		JButton Savebtn = new JButton("저장하기");
		Savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new MemberDAO().hasInout(MemberVo.user.getId())) {
					String recode = FoodRecordtextArea.getText();
					if (new InsertUpdate().isInOutFoodRecodeModify(MemberVo.user.getId(), recode))
						JOptionPane.showMessageDialog(null, "식단기록이 정상저장 되었습니다.");
				} else
					JOptionPane.showMessageDialog(null, "체중입력 먼저 해주세요!");
			}
		});
		Savebtn.setForeground(Color.WHITE);
		Savebtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		Savebtn.setBorderPainted(false);
		Savebtn.setBackground(new Color(52, 152, 219));
		Savebtn.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(Savebtn);

		frame.setVisible(true);
	}
}