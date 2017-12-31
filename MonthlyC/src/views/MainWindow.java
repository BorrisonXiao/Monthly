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
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MainWindow extends JFrame {

	private JPanel ctpMain;
	private JTextField tfMoney;
	private JLabel lblMoney;
	private JTextField tfMonth;
	private JLabel lblSlash1;
	private JTextField tfDay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		initialize();
		events();
	}

	/**
	 * Initializes all objects in the window
	 */
	private void initialize() {
		setTitle("HappyNY");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 850, 600);
		ctpMain = new JPanel();
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctpMain);

		// Set up the label "Money".
		lblMoney = new JLabel("Money:");
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Money" text field.
		tfMoney = new JTextField();
		tfMoney.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfMoney.setColumns(10);

		// Set up the label "Date".
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Month" text field.
		tfMonth = new JTextField();
		tfMonth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfMonth.setColumns(10);

		//
		lblSlash1 = new JLabel("/");
		lblSlash1.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Day" text field.
		tfDay = new JTextField();
		tfDay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfDay.setColumns(10);

		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING).addGroup(gl_ctpMain
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						gl_ctpMain.createParallelGroup(Alignment.TRAILING).addComponent(lblMoney).addComponent(lblDate))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
						.addComponent(tfMoney, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ctpMain.createSequentialGroup().addGap(2)
								.addComponent(tfMonth, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addGap(3).addComponent(lblSlash1).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(tfDay, 0, 0, Short.MAX_VALUE)))
				.addGap(622)));
		gl_ctpMain.setVerticalGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING).addGroup(gl_ctpMain
				.createSequentialGroup().addContainerGap(444, Short.MAX_VALUE)
				.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE).addComponent(lblMoney).addComponent(
						tfMoney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE).addComponent(lblDate)
						.addComponent(tfMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSlash1).addComponent(tfDay, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(40)));
		ctpMain.setLayout(gl_ctpMain);
	}

	/**
	 * Arrange all the events in the window
	 */
	private void events() {
		// Event for the "month" text field.
		tfMoney.addFocusListener(new FocusAdapter() {
			@Override
			// If the text field is not clicked/used, set prompt information.
			public void focusLost(FocusEvent event) {
				if (tfMoney.getText().isEmpty()) {
					tfMoney.setText("Money");
				}
			}

			@Override
			// If the text field is clicked, set nothing.
			public void focusGained(FocusEvent e) {
				if (tfMoney.getText().equals("Money")) {
					tfMoney.setText("");
				}
			}
		});

	}
}
