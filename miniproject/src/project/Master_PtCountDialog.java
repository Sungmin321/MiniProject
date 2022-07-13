package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Master_PtCountDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JDialog dialog;
	private String name;

	public Master_PtCountDialog(String name) {
		this.name = name;

		dialog = new JDialog();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);

		dialog.setTitle("P.T Count Seting Dialog");
		dialog.setModal(true);
		dialog.setSize(450, 300);
		dialog.setLocationRelativeTo(null);
		dialog.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		dialog.getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel nameLabel = new JLabel(name);
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
			JLabel CountLabel = new JLabel(new MemberDAO().getPT_number_name(name));
			CountLabel.setHorizontalAlignment(SwingConstants.CENTER);
			CountLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
			CountLabel.setBounds(221, 41, 170, 31);
			CountLabel.setForeground(Color.white);
			contentPanel.add(CountLabel);
		}
		{
			JLabel CGCounttitleLabel = new JLabel("º¯°æ È½¼ö");
			CGCounttitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
			CGCounttitleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
			CGCounttitleLabel.setBounds(132, 95, 170, 31);
			CGCounttitleLabel.setForeground(Color.white);
			contentPanel.add(CGCounttitleLabel);
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
			dialog.getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num = textField.getText();
						if (new Insert().Customer_Ptnumber_update(num, name)) {
							JOptionPane.showMessageDialog(null, "¼öÁ¤ ¿Ï·á");
							dialog.setVisible(false);
							new Master_PtOption();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				dialog.getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dialog.setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
