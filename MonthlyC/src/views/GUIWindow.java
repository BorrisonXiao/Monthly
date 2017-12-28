/**
 * @author Borrison
 * @date 12/28/2017
 */
package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GUIWindow extends JFrame {

	private JPanel contentPane;
	private JTextField userNameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWindow frame = new GUIWindow();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIWindow() {
		initialize();
		events();
	}

	/**
	 * Initializes all objects in the window
	 */
	private void initialize() {
		setTitle("Monthly");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblUsername = new JLabel("Username");

		userNameField = new JTextField();
		userNameField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblUsername)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(userNameField, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblUsername)
								.addComponent(userNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(214, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * Arrange all the events in the window
	 */
	private void events() {
		// TODO Auto-generated method stub

	}
}
