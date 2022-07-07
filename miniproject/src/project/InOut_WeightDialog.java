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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InOut_WeightDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField weightTF;
	private JCheckBox ExerciseCheckbox;
	private JCheckBox DrinkingCheckbox;

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
		setSize(450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 2, 0, 0));
		{
			JLabel WeightLabel = new JLabel("\uCCB4\uC911");
			WeightLabel.setHorizontalAlignment(SwingConstants.CENTER);
			WeightLabel.setFont(new Font("돋움", Font.BOLD, 40));
			contentPanel.add(WeightLabel);
		}
		{
			weightTF = new JTextField();
			weightTF.setText("\uCCB4\uC911\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694");
			contentPanel.add(weightTF);
			weightTF.setColumns(10);
		}
		{
			ExerciseCheckbox = new JCheckBox("\uC6B4\uB3D9");
			ExerciseCheckbox.setFont(new Font("굴림", Font.PLAIN, 40));
			ExerciseCheckbox.setHorizontalAlignment(SwingConstants.CENTER);
			ExerciseCheckbox.setBackground(SystemColor.window);
			contentPanel.add(ExerciseCheckbox);
		}
		{
			DrinkingCheckbox = new JCheckBox("\uC74C\uC8FC");
			DrinkingCheckbox.setFont(new Font("굴림", Font.PLAIN, 40));
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
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String weight = weightTF.getText();
						String Exercise = "0", Drinking = "0";
						if (DrinkingCheckbox.isSelected()) {
							Drinking = "1";
						}
						if (ExerciseCheckbox.isSelected()) {
							Exercise = "1";
						}
						// 데이터가 있는지 없는지. 확인하고
						if (new MemberDAO().Inout_test(MemberVo.user.getId())) {
							// 있으면 true -> 그럼 업데이트.
							if (new Insert().Inout_update(MemberVo.user.getId(), weight, Drinking, Exercise)) {
								JOptionPane.showMessageDialog(null, "data correction");
							}
						} else {
							// 없으면 false. 새로 insert 해주고
							if (new Insert().Inout_insert(MemberVo.user.getId(), weight, Drinking, Exercise)) {
								JOptionPane.showMessageDialog(null, "today info Recode");
							}

						}

					}
				});
				okButton.setBackground(SystemColor.activeCaption);
				okButton.setFont(new Font("굴림", Font.BOLD, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setBackground(SystemColor.activeCaptionBorder);
				cancelButton.setFont(new Font("굴림", Font.BOLD, 20));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}