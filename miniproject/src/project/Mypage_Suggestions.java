package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Mypage_Suggestions {

	Color btblue = new Color(52, 152, 219);
	Color Jorange = new Color(244, 128, 75);
	Color JYellow = new Color(251,197,60);
	
	private JFrame frame;
	Color toolgreen = new Color(26, 188, 156); 
	
	public static void main(String[] args) {
		new Mypage_Suggestions();
	}

	public Mypage_Suggestions() {
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
				new Main_Customer();
			}
		});
		homeButton.setPreferredSize(new Dimension(60, 60));
		homeButton.setIcon(new ImageIcon("D:\\work\\miniproject\\image\\home.png"));
		homeButton.setBackground(toolgreen);
		homeButton.setBorderPainted(false);
		panel.add(homeButton, BorderLayout.WEST);
		
		JLabel titleLabel = new JLabel("Mypage_Suggestions");
		titleLabel.setFont(new Font("HY������B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton BeforeButton = new JButton("\uC774\uC804\uC73C\uB85C");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Customer_Mypage();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("���� ���", Font.BOLD, 18));
		BeforeButton.setBorderPainted(false);
		BeforeButton.setBackground(new Color(52, 152, 219));
		BeforeButton.setBounds(10, 521, 170, 50);
		frame.getContentPane().add(BeforeButton);
		
		JPanel Suggestionspanel = new JPanel();
		Suggestionspanel.setBackground(Color.WHITE);
		Suggestionspanel.setBounds(0, 59, 364, 452);
		frame.getContentPane().add(Suggestionspanel);
		Suggestionspanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Suggestionspanel.setLayout(null);
		
		JLabel SuggestionsLabel = new JLabel("\uAC74\uC758 \uC0AC\uD56D");
		SuggestionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SuggestionsLabel.setFont(new Font("����", Font.BOLD, 25));
		SuggestionsLabel.setBackground(Color.WHITE);
		SuggestionsLabel.setBounds(-7, 3, 161, 50);
		Suggestionspanel.add(SuggestionsLabel);
		
		JTextArea SuggestionstextArea = new JTextArea();
		SuggestionstextArea.setBackground(Color.WHITE);
		SuggestionstextArea.setFont(new Font("���ʷҹ���", Font.PLAIN, 13));
		SuggestionstextArea.setText("\uAC74\uC758\uC0AC\uD56D\uC744 \uB0A8\uACA8\uC8FC\uC138\uC694");
		SuggestionstextArea.setBounds(12, 50, 340, 392);
		   // TextArea�� �׵θ����� ���� ���� �α��� 3px�� �����մϴ�.
	    Border lineBorder = BorderFactory.createLineBorder(Color.black, 2);
	    // �ؽ�Ʈ�� TextArea ��� ���̿� ������ �α� ���ؼ� emptyBorder�� �����մϴ�.
	    Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
	    //TextArea�� lineBorder(�����׵θ�), emptyBorder(����)�� ������ ���� ��輱�� �����մϴ�.
	    SuggestionstextArea.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		Suggestionspanel.add(SuggestionstextArea);
		
		JButton SaveButton = new JButton("SAVE");
		SaveButton.setForeground(Color.WHITE);
		SaveButton.setFont(new Font("���� ���", Font.BOLD, 18));
		SaveButton.setBorderPainted(false);
		SaveButton.setBackground(new Color(52, 152, 219));
		SaveButton.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(SaveButton);
		
		ButtonGroup group = new ButtonGroup();
		frame.setVisible(true);

	}
}
