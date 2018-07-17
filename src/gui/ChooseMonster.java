package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ChooseMonster {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseMonster window = new ChooseMonster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChooseMonster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][]", "[][]"));
		
		JLabel lblMName = new JLabel("M Name");
		frame.getContentPane().add(lblMName, "cell 1 0");
		
		JLabel Monster_Image = new JLabel("");
		Monster_Image.setEnabled(true);
		Monster_Image.setIcon(new ImageIcon(ChooseMonster.class.getResource("/gui/Monster1_oH_s.png")));
		frame.getContentPane().add(Monster_Image, "cell 1 1");
	}

}
