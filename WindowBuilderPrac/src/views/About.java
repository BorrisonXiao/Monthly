package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class About extends JDialog {

	private final JPanel ctpMain = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/resources/Info-icon.png")));
		setTitle("About");
		setBounds(720, 320, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(ctpMain, BorderLayout.CENTER);
		JTextArea textInfo = new JTextArea();
		textInfo.setEditable(false);
		textInfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textInfo.setText("Author: Borrsion\r\nReleased Date: 12/29/2017\r\nVersion: 1.0.0");
		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING).addComponent(textInfo,
				GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE));
		gl_ctpMain.setVerticalGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING).addComponent(textInfo,
				GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE));
		ctpMain.setLayout(gl_ctpMain);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						// Close the current window.
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
