package healthymain.master;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import healthymain.database.CustomerVo;
import healthymain.database.MemberDAO;

public class CustomerPtCount {
	private JFrame frame;

	public CustomerPtCount() {
		JTextField textField;
		
		Color btblue = new Color(52, 152, 219);
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
				new MasterMain();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);

		JLabel titleLabel = new JLabel("Master_P.T Option");
		titleLabel.setFont(new Font("HY������B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);

		JButton beforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		beforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new MasterMain();
			}
		});
		beforeButton.setForeground(Color.WHITE);
		beforeButton.setFont(new Font("���� ���", Font.BOLD, 18));
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
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(12, 66, 340, 338);
		canceluppanel.add(scrollPane);
		scrollPane.setBackground(Color.white);

		JPanel PTcancelpanel = new JPanel();
		scrollPane.setColumnHeaderView(PTcancelpanel);
		PTcancelpanel.setBackground(Color.WHITE);
		PTcancelpanel.setLayout(new GridLayout(0, 2, 0, 0));

		ArrayList<CustomerVo> list = new MemberDAO().getCustomerList();
		int size = list.size();
		
		JLabel nameLabel[] = new JLabel[size];
		JLabel countLabel[] = new JLabel[size];
		
		for (int i = 0; i < size; i++) {
			CustomerVo vo = list.get(i);
			nameLabel[i] = new JLabel(vo.getName());
			nameLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			nameLabel[i].setFont(new Font("����", Font.BOLD, 15));
			PTcancelpanel.add(nameLabel[i]);

			countLabel[i] = new JLabel(vo.getPtcount());
			countLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			countLabel[i].setFont(new Font("����", Font.BOLD, 15));
			PTcancelpanel.add(countLabel[i]);
		}

		JPanel titlepanel = new JPanel();
		titlepanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		titlepanel.setBounds(12, 10, 340, 55);
		canceluppanel.add(titlepanel);
		titlepanel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel titleLabel1 = new JLabel("\uC131\uBA85");
		titlepanel.add(titleLabel1);
		titleLabel1.setFont(new Font("����", Font.BOLD, 15));
		titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel titleLabel2 = new JLabel("\uB0A8\uC740 \uD69F\uC218");
		titlepanel.add(titleLabel2);
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setFont(new Font("����", Font.BOLD, 15));

		textField = new JTextField();
		textField.setText("ȸ�� �̸��� �����ּ���");
		textField.setBounds(12, 415, 159, 25);
		canceluppanel.add(textField);
		textField.setColumns(10);

		JButton OptionButton = new JButton("����");
		OptionButton.setBounds(183, 415, 169, 25);
		canceluppanel.add(OptionButton);
		OptionButton.setBackground(btblue);
		OptionButton.setForeground(Color.white);
		OptionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				new PtCountDialogOption(name);
			}
		});
		OptionButton.setFont(new Font("���� ���", Font.BOLD, 12));

		frame.setVisible(true);

	}
}
