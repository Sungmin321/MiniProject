package healthymain.customer.inout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import healthymain.database.MemberDAO;
import healthymain.database.MemberVo;

public class FoodRecordDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();

	public static void main(String[] args) {
		try {
			FoodRecordDialog dialog = new FoodRecordDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public FoodRecordDialog() {
		JDateChooser dateChooser;
		JTextArea textArea;
		Color btblue = new Color(52, 152, 219);
		setTitle("식단 확인");
		setModal(true);
		setSize(450, 527);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(12, 10, 410, 435);
			contentPanel.add(panel);
			panel.setLayout(null);

			dateChooser = new JDateChooser();
			dateChooser.setBounds(102, 10, 296, 21);
			panel.add(dateChooser);

			textArea = new JTextArea();
			textArea.setText("날짜를 선택 후 OK버튼을 눌러주세요.");
			textArea.setBounds(12, 41, 386, 384);
			panel.add(textArea);

			JLabel lblNewLabel = new JLabel("날짜 선택");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("문체부 바탕체", Font.PLAIN, 13));
			lblNewLabel.setBounds(12, 10, 78, 21);
			panel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new BorderLayout(0, 0));
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String date = dateChooser.getJCalendar().getYearChooser().getYear() + "-"
								+ (dateChooser.getJCalendar().getMonthChooser().getMonth() + 1) + "-"
								+ dateChooser.getJCalendar().getDayChooser().getDay();
						String foodrecode = new MemberDAO().getFoodRecode(MemberVo.user.getId(), date);
						if (foodrecode.equals(""))
							textArea.setText("해당 요일에 식단기록이 없습니다.");
						else
							textArea.setText(foodrecode);
						setVisible(true);
					}
				});
				okButton.setBackground(btblue);
				okButton.setForeground(Color.white);
				okButton.setFont(new Font("굴림", Font.BOLD, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}