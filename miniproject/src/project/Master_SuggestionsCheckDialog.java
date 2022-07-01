package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Master_SuggestionsCheckDialog extends JDialog {
	Color btblue = new Color(52, 152, 219);
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Master_SuggestionsCheckDialog dialog = new Master_SuggestionsCheckDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Master_SuggestionsCheckDialog() {
		setModal(true);
		setTitle("SuggestionsCheckDialog");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JTextArea textArea = new JTextArea();
			textArea.setText("\uAC74\uC758\uC0AC\uD56D \uB0B4\uC6A9");
			textArea.setEditable(false);
			   // TextArea의 테두리선의 색을 검정 두깨를 3px로 설정합니다.
		    Border lineBorder = BorderFactory.createLineBorder(Color.black, 1);
		    // 텍스트와 TextArea 경계 사이에 여백을 두기 위해서 emptyBorder를 생성합니다.
		    Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
		    //TextArea에 lineBorder(검정테두리), emptyBorder(여백)로 구성된 복합 경계선을 설정합니다.
		    textArea.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
			contentPanel.add(textArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new BorderLayout(0, 0));
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("OK");
				okButton.setBackground(btblue);
				buttonPane.add(okButton);
				okButton.setBorderPainted(false);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
