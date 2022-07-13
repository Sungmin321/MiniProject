package project;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import oracle.net.ano.SupervisorService;

public class Master_SuggestionsCheck implements ActionListener{

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251, 197, 60);
	Color Jlightgreen = new Color(177, 212, 98);
	Color toolgreen = new Color(26, 188, 156);
	private JFrame frame;
	int NOVTI;

	public static void main(String[] args) {
		new Master_SuggestionsCheck();
	}

	public Master_SuggestionsCheck(){
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
				new Main_Master();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);

		JLabel titleLabel = new JLabel("Master_SuggestionsCheck");
		titleLabel.setFont(new Font("HY¸ñ°¢ÆÄÀÓB", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);

		JButton beforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		beforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Main_Master();
			}
		});
		beforeButton.setForeground(Color.WHITE);
		beforeButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
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
		scrollPane.setBounds(12, 66, 340, 374);
		canceluppanel.add(scrollPane);
		scrollPane.setBackground(Color.white);

		JPanel PTcancelpanel = new JPanel();
		scrollPane.setColumnHeaderView(PTcancelpanel);
		PTcancelpanel.setBackground(Color.WHITE);
		PTcancelpanel.setLayout(new GridLayout(0, 3, 0, 0));

		//
		ArrayList<NotiVo> Notilist = new MemberDAO().Noti_list();
		int size = Notilist.size();
		JLabel nameLabel[] = new JLabel[size];
		JLabel countLabel[] = new JLabel[size];
		JButton CheckButton[] = new JButton[size];
		
		String arr[] = new String[size];
		for (NOVTI = 0; NOVTI < size; NOVTI++) {
			arr[NOVTI] = ""+NOVTI;
			System.out.println(NOVTI);
			NotiVo NV = Notilist.get(NOVTI);
			nameLabel[NOVTI] = new JLabel(new MemberDAO().getname(NV.getID()));
			nameLabel[NOVTI].setHorizontalAlignment(SwingConstants.CENTER);
			PTcancelpanel.add(nameLabel[NOVTI]);

			countLabel[NOVTI] = new JLabel(NV.getDATE());
			countLabel[NOVTI].setHorizontalAlignment(SwingConstants.CENTER);
			PTcancelpanel.add(countLabel[NOVTI]);

			CheckButton[NOVTI] = new JButton("È®ÀÎ");
			PTcancelpanel.add(CheckButton[NOVTI]);
			CheckButton[NOVTI].setBackground(btblue);
			CheckButton[NOVTI].setForeground(Color.white);
			CheckButton[NOVTI].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, NV.getSuggestions());
					JButton btn = (JButton)e.getSource();
					btn.setText("È®ÀÎ ¿Ï·á");
					btn.setBackground(Color.black);
				}
			});
			CheckButton[NOVTI].setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
			System.out.println(NOVTI);
		}
		//

		JPanel titlepanel = new JPanel();
		titlepanel.setBackground(Color.WHITE);
		titlepanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		titlepanel.setBounds(12, 10, 340, 55);
		canceluppanel.add(titlepanel);
		titlepanel.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel titleLabel1 = new JLabel("\uC131\uBA85");
		titlepanel.add(titleLabel1);
		titleLabel1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel titleLabel2 = new JLabel("\uAC8C\uC2DC \uB0A0\uC9DC");
		titlepanel.add(titleLabel2);
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setFont(new Font("±¼¸²", Font.BOLD, 15));

		JLabel lblCheck = new JLabel("\uD655\uC778\uD558\uAE30");
		lblCheck.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheck.setFont(new Font("±¼¸²", Font.BOLD, 15));
		titlepanel.add(lblCheck);

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO ÀÚµ¿ »ý¼ºµÈ ¸Þ¼Òµå ½ºÅÓ
		
	}

}