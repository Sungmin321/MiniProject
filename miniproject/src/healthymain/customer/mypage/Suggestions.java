package healthymain.customer.mypage;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import healthymain.customer.CustomerMain;
import healthymain.database.InsertUpdate;
import healthymain.database.MemberVo;

public class Suggestions {
	private JFrame frame;
	
	public Suggestions() {
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
		
		JLabel titleLabel = new JLabel("Mypage_Suggestions");
		titleLabel.setFont(new Font("HY목각파임B", Font.PLAIN, 15));
		panel.add(titleLabel, BorderLayout.CENTER);
		titleLabel.setForeground(Color.white);
		
		
		JButton BeforeButton = new JButton("이전으로");
		BeforeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new MyPage();
			}
		});
		BeforeButton.setForeground(Color.WHITE);
		BeforeButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
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
		
		JLabel SuggestionsLabel = new JLabel("건의사항");
		SuggestionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SuggestionsLabel.setFont(new Font("굴림", Font.BOLD, 25));
		SuggestionsLabel.setBackground(Color.WHITE);
		SuggestionsLabel.setBounds(-7, 3, 161, 50);
		Suggestionspanel.add(SuggestionsLabel);
		
		JTextArea SuggestionstextArea = new JTextArea();
		SuggestionstextArea.setBackground(Color.WHITE);
		SuggestionstextArea.setFont(new Font("함초롬바탕", Font.PLAIN, 13));
		SuggestionstextArea.setText("건의사항을 남겨주세요");
		SuggestionstextArea.setBounds(12, 50, 340, 392);
		   // TextArea의 테두리선의 색을 검정 두깨를 3px로 설정합니다.
	    Border lineBorder = BorderFactory.createLineBorder(Color.black, 2);
	    // 텍스트와 TextArea 경계 사이에 여백을 두기 위해서 emptyBorder를 생성합니다.
	    Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
	    //TextArea에 lineBorder(검정테두리), emptyBorder(여백)로 구성된 복합 경계선을 설정합니다.
	    SuggestionstextArea.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		Suggestionspanel.add(SuggestionstextArea);
		
		JButton SaveButton = new JButton("저장하기");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contents = SuggestionstextArea.getText();
				if(new InsertUpdate().isNotiBoardInsert(contents, MemberVo.user.getId())) {
					JOptionPane.showMessageDialog(null, "정상적으로 저장되었습니다.");
				}
			}
		});
		SaveButton.setForeground(Color.WHITE);
		SaveButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		SaveButton.setBorderPainted(false);
		SaveButton.setBackground(new Color(52, 152, 219));
		SaveButton.setBounds(185, 521, 170, 50);
		frame.getContentPane().add(SaveButton);
		
		frame.setVisible(true);
	}
}