package views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowG extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTF;
	private JLabel lblUsername;
	private JButton btnEnter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowG frame = new WindowG();
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
	public WindowG() {
		initialize();
		events();
	}

	/**
	 * Initialize all objects.
	 */
	private void initialize() {
		// Set the frame and the panel.
		setIconImage(Toolkit.getDefaultToolkit().getImage(WindowG.class.getResource("/resources/black11.jpg")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(760, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Set up the "username" label.
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "username" text Field.
		userNameTF = new JTextField();
		userNameTF.setColumns(10);

		// Set up the "enter" button.
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Finalize the panel.
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblUsername)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(userNameTF, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
								.addComponent(btnEnter, Alignment.TRAILING))
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblUsername).addComponent(
						userNameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnEnter)
				.addContainerGap(176, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	private void events() {
		// Event for the "enter" button.
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, userNameTF.getText());
			}
		});

		// Event for the "username" textfield.
		userNameTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, userNameTF.getText());
				JOptionPane.showInputDialog("");
			}
		});
	}
}
