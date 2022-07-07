package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;

public class Master_PtCountDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Master_PtCountDialog dialog = new Master_PtCountDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Master_PtCountDialog() {
		setTitle("P.T Count Seting Dialog");
		setModal(true);
		setSize(450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel nameLabel = new JLabel("name");
			nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
			nameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
			nameLabel.setBounds(12, 10, 170, 59);
			nameLabel.setForeground(Color.white);
			contentPanel.add(nameLabel);
		}
		{
			JLabel CounttitleLabel = new JLabel("\uD604\uC7AC \uB0A8\uC740 \uD69F\uC218");
			CounttitleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
			CounttitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
			CounttitleLabel.setBounds(221, 10, 170, 31);
			CounttitleLabel.setForeground(Color.white);
			contentPanel.add(CounttitleLabel);
		}
		{
			JLabel CountLabel = new JLabel("1");
			CountLabel.setHorizontalAlignment(SwingConstants.CENTER);
			CountLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
			CountLabel.setBounds(221, 41, 170, 31);
			CountLabel.setForeground(Color.white);
			contentPanel.add(CountLabel);
		}
		{
			JLabel PlusCounttitleLabel = new JLabel("\uCD94\uAC00 \uD69F\uC218");
			PlusCounttitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
			PlusCounttitleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
			PlusCounttitleLabel.setBounds(132, 95, 170, 31);
			PlusCounttitleLabel.setForeground(Color.white);
			contentPanel.add(PlusCounttitleLabel);
		}
		{
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setText("0");
			textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
			textField.setBounds(105, 133, 237, 64);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
