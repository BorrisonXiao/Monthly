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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JToggleButton;

public class WindowG extends JFrame {

	private JPanel ctp1;
	private JTextField userNameTF;
	private JLabel lblUsername;
	private JButton btnEnter;
	private JRadioButton rbMale;
	private JRadioButton rbFemale;
	private JLabel lblGender;
	private final ButtonGroup MeatBG = new ButtonGroup();
	private JRadioButton rbPork;
	private JRadioButton rbSteak;
	private JRadioButton rbChicken;
	private JLabel lblMeat;
	private JLabel lblExtras;
	private JCheckBox cbNewCheckBox;
	private final ButtonGroup GenderBG = new ButtonGroup();
	private JLabel lblDescription;
	private JTextArea taDescription;
	private JScrollPane scrDescription;
	private JCheckBox cbMildSauce;
	private JComboBox combTitle;
	private DefaultComboBoxModel titleMode;
	private JList<? extends Object> listCustomers;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenuItem mntmExit;
	private JMenuItem mntmSave;
	private JMenu mnCheckBoxOptions;
	private JMenu mnRadioOptions;
	private JCheckBoxMenuItem chckbxmntmCbOption;
	private JCheckBoxMenuItem chckbxmntmCbOption_1;
	private JRadioButtonMenuItem rdbtnmntmRbOption;
	private JRadioButtonMenuItem rdbtnmntmRbOption_1;
	private final ButtonGroup RBG = new ButtonGroup();
	private JPopupMenu popupMenu;
	private JMenuItem mntmCopy;
	private JMenuItem mntmPase;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JProgressBar pbEnter;
	private JSlider sld1;
	private JSpinner spn1;
	private JToggleButton TgB1;

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
		setBounds(560, 280, 750, 500);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnFile);

		mntmSave = new JMenuItem("Save");
		mntmSave.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnFile.add(mntmSave);

		// Set up the "exit" menu.
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
				if (ret == JOptionPane.YES_NO_OPTION) {
					// Save work to file or database, etc.
					System.exit(0);
				}
			}
		});
		mntmExit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnFile.add(mntmExit);

		mnEdit = new JMenu("Edit");
		mnEdit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnEdit);

		mnCheckBoxOptions = new JMenu("Check Box Options");
		mnEdit.add(mnCheckBoxOptions);

		chckbxmntmCbOption = new JCheckBoxMenuItem("CB Option 1");
		mnCheckBoxOptions.add(chckbxmntmCbOption);

		chckbxmntmCbOption_1 = new JCheckBoxMenuItem("CB Option 2");
		mnCheckBoxOptions.add(chckbxmntmCbOption_1);

		mnRadioOptions = new JMenu("Radio Options");
		mnEdit.add(mnRadioOptions);

		rdbtnmntmRbOption = new JRadioButtonMenuItem("RB Option 1");
		RBG.add(rdbtnmntmRbOption);
		mnRadioOptions.add(rdbtnmntmRbOption);

		rdbtnmntmRbOption_1 = new JRadioButtonMenuItem("RB Option 2");
		RBG.add(rdbtnmntmRbOption_1);
		mnRadioOptions.add(rdbtnmntmRbOption_1);

		mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnHelp);

		mntmAbout = new JMenuItem("About");
		mntmAbout.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnHelp.add(mntmAbout);
		ctp1 = new JPanel();
		ctp1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctp1);

		// Set up the "username" label.
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "username" text Field.
		userNameTF = new JTextField();
		userNameTF.setColumns(10);

		// Set up the "enter" button.
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Male" button.
		rbMale = new JRadioButton("Male");
		GenderBG.add(rbMale);
		rbMale.setSelected(true);
		rbMale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbMale.setActionCommand("male");

		// Set up the "Female" button.
		rbFemale = new JRadioButton("Female");
		GenderBG.add(rbFemale);
		rbFemale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbFemale.setActionCommand("female");

		// Set up the "Gender" label.
		lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Chicken" button.
		rbChicken = new JRadioButton("Chicken");
		rbChicken.setSelected(true);
		MeatBG.add(rbChicken);
		rbChicken.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Steak" button.
		rbSteak = new JRadioButton("Steak");
		MeatBG.add(rbSteak);
		rbSteak.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Pork" button.
		rbPork = new JRadioButton("Pork");
		MeatBG.add(rbPork);
		rbPork.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Meat" label.
		lblMeat = new JLabel("Meat:");
		lblMeat.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Extras" label.
		lblExtras = new JLabel("Extras:");
		lblExtras.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Mild Sauce" checkbox.
		cbMildSauce = new JCheckBox("Mild Sauce");
		cbMildSauce.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Medium Sauce" checkbox.
		cbNewCheckBox = new JCheckBox("MediumSauce");
		cbNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up the "Description" label.
		lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Set up a scrollpane for the description text area.
		scrDescription = new JScrollPane();

		JPanel pnlCustomers = new JPanel();
		pnlCustomers.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Customers",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		popupMenu = new JPopupMenu();
		addPopup(ctp1, popupMenu);

		mntmCopy = new JMenuItem("Copy");
		mntmCopy.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		popupMenu.add(mntmCopy);

		mntmPase = new JMenuItem("Paste");
		mntmPase.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		popupMenu.add(mntmPase);

		TgB1 = new JToggleButton("OFF");
		TgB1.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Finalize the panel.
		GroupLayout gl_ctp1 = new GroupLayout(ctp1);
		gl_ctp1.setHorizontalGroup(gl_ctp1.createParallelGroup(Alignment.TRAILING).addGroup(gl_ctp1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_ctp1.createParallelGroup(Alignment.TRAILING).addComponent(lblUsername)
						.addComponent(lblGender).addComponent(lblMeat).addComponent(lblExtras)
						.addComponent(lblDescription))
				.addGap(7)
				.addGroup(gl_ctp1.createParallelGroup(Alignment.TRAILING).addGroup(gl_ctp1.createSequentialGroup()
						.addGroup(gl_ctp1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_ctp1.createSequentialGroup().addComponent(cbMildSauce)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(cbNewCheckBox))
								.addGroup(gl_ctp1.createSequentialGroup().addComponent(rbChicken)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(rbSteak)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(rbPork))
								.addGroup(gl_ctp1.createSequentialGroup().addComponent(rbMale)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(rbFemale)))
						.addGap(94))
						.addGroup(gl_ctp1.createSequentialGroup().addGroup(gl_ctp1
								.createParallelGroup(Alignment.TRAILING)
								.addComponent(userNameTF, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_ctp1.createParallelGroup(Alignment.LEADING, false)
										.addGroup(Alignment.TRAILING, gl_ctp1.createSequentialGroup().addComponent(TgB1)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(btnEnter))
										.addComponent(scrDescription, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
												305, GroupLayout.PREFERRED_SIZE)))
								.addGap(18)))
				.addGap(18).addComponent(pnlCustomers, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE).addGap(6)));
		gl_ctp1.setVerticalGroup(gl_ctp1.createParallelGroup(Alignment.TRAILING).addGroup(gl_ctp1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_ctp1.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlCustomers, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
						.addGroup(gl_ctp1.createSequentialGroup()
								.addGroup(gl_ctp1.createParallelGroup(Alignment.BASELINE).addComponent(lblUsername)
										.addComponent(userNameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_ctp1.createParallelGroup(Alignment.BASELINE).addComponent(lblGender)
										.addComponent(rbMale).addComponent(rbFemale))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_ctp1.createParallelGroup(Alignment.BASELINE).addComponent(lblMeat)
										.addComponent(rbChicken).addComponent(rbSteak).addComponent(rbPork))
								.addGroup(gl_ctp1.createParallelGroup(Alignment.BASELINE).addComponent(lblExtras)
										.addComponent(cbMildSauce).addComponent(cbNewCheckBox))
								.addGap(0)
								.addGroup(gl_ctp1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_ctp1.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblDescription))
										.addGroup(gl_ctp1.createSequentialGroup().addGap(12).addComponent(
												scrDescription, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))))
				.addGap(18)
				.addGroup(gl_ctp1.createParallelGroup(Alignment.BASELINE).addComponent(btnEnter).addComponent(TgB1))
				.addContainerGap()));

		// Set up the combobox and its model.
		combTitle = new JComboBox();
		combTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		combTitle.setModel(new DefaultComboBoxModel(new String[] { "Dr.", "Mr.", "Mrs." }));
		combTitle.setSelectedIndex(2);

		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JScrollPane scrollPane = new JScrollPane();

		sld1 = new JSlider();
		sld1.setPaintTicks(true);
		sld1.setMajorTickSpacing(20);
		sld1.setPaintLabels(true);

		spn1 = new JSpinner();
		spn1.setModel(new SpinnerNumberModel((int) sld1.getValue(), 0, 100, 1));

		pbEnter = new JProgressBar();
		pbEnter.setStringPainted(true);

		GroupLayout gl_pnlCustomers = new GroupLayout(pnlCustomers);
		gl_pnlCustomers.setHorizontalGroup(gl_pnlCustomers.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlCustomers.createSequentialGroup().addContainerGap().addGroup(gl_pnlCustomers
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCustomers.createSequentialGroup().addGroup(gl_pnlCustomers
								.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
								.addComponent(combTitle, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCustomer)
								.addGroup(gl_pnlCustomers.createSequentialGroup()
										.addComponent(sld1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(spn1,
												GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
						.addGroup(gl_pnlCustomers.createSequentialGroup()
								.addComponent(pbEnter, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE).addGap(49)))));
		gl_pnlCustomers.setVerticalGroup(gl_pnlCustomers.createParallelGroup(Alignment.LEADING).addGroup(gl_pnlCustomers
				.createSequentialGroup().addContainerGap()
				.addComponent(combTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblCustomer)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE).addGap(26)
				.addGroup(gl_pnlCustomers.createParallelGroup(Alignment.BASELINE)
						.addComponent(sld1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(spn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
				.addComponent(pbEnter, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE).addContainerGap()));

		// Set up the list.
		listCustomers = new JList();
		listCustomers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listCustomers.setModel(new AbstractListModel() {
			String[] values = new String[] { "Death Knight", "Demon Hunter", "Warlock" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listCustomers);
		pnlCustomers.setLayout(gl_pnlCustomers);

		// Set up the description area.
		taDescription = new JTextArea();
		taDescription.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrDescription.setViewportView(taDescription);
		ctp1.setLayout(gl_ctp1);
	}

	/**
	 * Create the events.
	 */
	private void events() {
		EnterListener enterl = new EnterListener();
		// Event for the "enter" button.
		btnEnter.addActionListener(enterl);

		// Event for the "username" textfield.
		userNameTF.addActionListener(enterl);

		// Event for the "about" menu button.
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about = new About();
				// Can no longer interact with other window until done with current window.
				about.setModal(true);
				about.setVisible(true);
			}
		});

		// Event for the slider (interact with the spn1)
		sld1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				spn1.setValue(sld1.getValue());
			}
		});

		// Event for the spinner (interact with sld1)
		spn1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				sld1.setValue((int) spn1.getValue());
			}
		});

		// Event for the toggle button "OFF"
		TgB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TgB1.isSelected()) {
					TgB1.setText("ON");
				}
				else {
					TgB1.setText("OFF");
				}
			}
		});
	}

	/**
	 * Define actions performed when press "enter" and click the "enter" button.
	 */
	private class EnterListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			pbEnter.setValue(pbEnter.getValue() + 1);
			String out1 = GenderBG.getSelection().getActionCommand();
			JOptionPane.showMessageDialog(null, combTitle.getSelectedItem() + " " + userNameTF.getText() + " is a "
					+ out1 + " " + listCustomers.getSelectedValue());
			titleMode = (DefaultComboBoxModel) combTitle.getModel(); // Mess with the model
		}
	}

	/**
	 * Adds a pop up.
	 * 
	 * @param component
	 * @param popup
	 */
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
