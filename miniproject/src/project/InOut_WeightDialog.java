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

public class InOut_WeightDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InOut_WeightDialog dialog = new InOut_WeightDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InOut_WeightDialog() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 2, 0, 0));
		{
			JLabel WeightLabel = new JLabel("\uCCB4\uC911");
			WeightLabel.setHorizontalAlignment(SwingConstants.CENTER);
			WeightLabel.setFont(new Font("µ¸¿ò", Font.BOLD, 40));
			contentPanel.add(WeightLabel);
		}
		{
			textField = new JTextField();
			textField.setText("\uCCB4\uC911\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694");
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JCheckBox ExerciseCheckbox = new JCheckBox("\uC6B4\uB3D9");
			ExerciseCheckbox.setFont(new Font("±¼¸²", Font.PLAIN, 40));
			ExerciseCheckbox.setHorizontalAlignment(SwingConstants.CENTER);
			ExerciseCheckbox.setBackground(SystemColor.window);
			contentPanel.add(ExerciseCheckbox);
		}
		{
			JCheckBox DrinkingCheckbox = new JCheckBox("\uC74C\uC8FC");
			DrinkingCheckbox.setFont(new Font("±¼¸²", Font.PLAIN, 40));
			DrinkingCheckbox.setHorizontalAlignment(SwingConstants.CENTER);
			DrinkingCheckbox.setBackground(Color.WHITE);
			contentPanel.add(DrinkingCheckbox);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(SystemColor.activeCaption);
				okButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.activeCaptionBorder);
				cancelButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}