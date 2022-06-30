package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InOut_FoodRecordDialog extends JDialog {
	Color btblue = new Color(52, 152, 219);
	
	private final JPanel contentPanel = new JPanel();

	public static void main(String[] args) {
		try {
			InOut_FoodRecordDialog dialog = new InOut_FoodRecordDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public InOut_FoodRecordDialog() {
		setTitle("\uC2DD\uB2E8 \uD655\uC778");
		setModal(true);
		setBounds(100, 100, 450, 527);
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
			
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(102, 10, 296, 21);
			panel.add(dateChooser);
			
			JTextArea textArea = new JTextArea();
			textArea.setText("\uAE30\uB85D\uC774 \uC5C6\uC2B5\uB2C8\uB2E4.");
			textArea.setBounds(12, 41, 386, 384);
			panel.add(textArea);
			
			JLabel lblNewLabel = new JLabel("\uB0A0\uC9DC \uC120\uD0DD");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("πÆ√º∫Œ πŸ≈¡√º", Font.PLAIN, 13));
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
						System.exit(0);
					}
				});
				okButton.setBackground(btblue);
				okButton.setForeground(Color.white);
				okButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}