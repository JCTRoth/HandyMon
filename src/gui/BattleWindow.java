package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class BattleWindow extends JFrame {

	
	private String AttackString1 = "A1";
	private String AttackString2 = "A2";
	private String AttackString3 = "A3";
	private String AttackString4 = "A4";

	// Attack buttons
	public JButton btnA1;
	public JButton btnA2;
	public JButton btnA3;
	public JButton btnA4;
	
	// name label
	public JLabel nameLabel1;
	public JLabel nameLabel2;
	// level label
	public JLabel levelLabel1;
	public JLabel levelLabel2;
	// health label
	public JLabel healthLabel1;
	public JLabel healthLabel2;
	
	// health bar
	public JProgressBar healthBar1;
	public JProgressBar healthBar2;
	
	// player 1 exp bar
	public JProgressBar expBar;
	
	
	public JLabel public_image_back;
	public JLabel public_image_front;
	
	public JButton public_btnNext;
	public JButton public_btnLog;
	public JButton public_btnMonster;
	public JButton public_btnRestart;
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BattleWindow frame = new BattleWindow();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public BattleWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 240));
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// FIGHT
			}
		});
		panel_1.add(btnNext);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// BAG
			}
		});
		panel_1.add(btnLog);
		
		JButton btnMonster = new JButton("Mónster");
		btnMonster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Pokemon
			}
		});
		panel_1.add(btnMonster);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_1.add(btnRestart);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE))
						.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		
		///////////////////////////////////////////////////
		///btnAttack*
		//////////////////////////////////////////////////
		
		
		//btnAttack1
		JButton btnAttack1 = new JButton(AttackString1);
		btnAttack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(btnAttack1);
		
		
		JButton btnAttack2 = new JButton(AttackString2);
		btnAttack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// BAG
				
			}
		});
		panel.add(btnAttack2);
		
		JButton btnAttack3 = new JButton(AttackString3);
		panel.add(btnAttack3);
		
		JButton btnAttack4 = new JButton(AttackString4);
		panel.add(btnAttack4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_3.setBackground(new Color(255, 228, 196));
		panel_3.setForeground(new Color(255, 228, 181));
		
		JPanel panel_7 = new JPanel();
		panel_7.setForeground(new Color(255, 228, 181));
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_7.setBackground(new Color(255, 228, 196));
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JProgressBar progressBar_2 = new JProgressBar();
		
		JLabel lblNewLabel = new JLabel("EXP");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(null);
		
		JPanel panel_11 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED, 102, Short.MAX_VALUE)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel image_front = new JLabel("");
		image_front.setFont(new Font("Dialog", Font.PLAIN, 5));
		image_front.setHorizontalAlignment(SwingConstants.TRAILING);
		image_front.setIcon(new ImageIcon(BattleWindow.class.getResource("/gui/Monster1_vorne.png")));
		panel_10.add(image_front);
		panel_11.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(0, 0, 209, 125);
		panel_11.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel image_back = new JLabel("");
		image_back.setIcon(new ImageIcon(BattleWindow.class.getResource("/gui/Monster1_hinten.png")));
		panel_12.add(image_back);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(0, 0, 3, 0));
		panel_8.setBackground(new Color(255, 228, 196));
		panel_7.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(label_1, BorderLayout.EAST);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(label_2, BorderLayout.WEST);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_7.add(label_3, BorderLayout.SOUTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.DARK_GRAY);
		panel_7.add(panel_9, BorderLayout.EAST);
		
		JLabel label_4 = new JLabel("HP");
		label_4.setForeground(Color.ORANGE);
		label_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		panel_9.add(label_4);
		
		JProgressBar progressBar_1 = new JProgressBar();
		panel_9.add(progressBar_1);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 3, 0));
		panel_4.setBackground(new Color(255, 228, 196));
		panel_3.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel monsterLevelLabel = new JLabel("New label");
		monsterLevelLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(monsterLevelLabel, BorderLayout.EAST);
		
		JLabel monsterNameLabel = new JLabel("New label");
		monsterNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(monsterNameLabel, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(3, 0, 0, 0));
		panel_5.setBackground(new Color(255, 228, 196));
		panel_5.setForeground(new Color(255, 235, 205));
		panel_3.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("New label");
		panel_5.add(label, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.DARK_GRAY);
		panel_3.add(panel_6, BorderLayout.EAST);
		
		JLabel lblHp = new JLabel("HP");
		lblHp.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblHp.setForeground(Color.ORANGE);
		panel_6.add(lblHp);
		
		JProgressBar progressBar = new JProgressBar();
		panel_6.add(progressBar);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
		//contentPane.setBackground(new Color(137, 127, 110));
		
		//Pointing
		
		btnA1 = btnAttack1;
		btnA2 = btnAttack2;
		btnA3 = btnAttack3;
		btnA4 = btnAttack4;
		
		public_image_back = image_back;
		public_image_front = image_front;
		
		public_btnNext = btnNext;
		public_btnLog = btnLog;
		btnLog.setEnabled(false);
		
		public_btnMonster = btnMonster;
		btnMonster.setEnabled(false);
		
		public_btnRestart = btnRestart;
		
		
		// name label
		nameLabel2 = label_1;
		nameLabel1 = monsterNameLabel;
		// level label
		levelLabel2 = label_2;
		levelLabel1 = monsterLevelLabel;
		// health label
		healthLabel2 = label_3;
		healthLabel1 = label;
		
		// health bar
		healthBar1 = progressBar;
		healthBar2 = progressBar_1;
		
		// player 1 exp bar
		expBar = progressBar_2;
		setLocationRelativeTo(null);
	}

	

	/**
	 * @param path to public_image_back
	 */
	public void set_Image_back(String path) {
		public_image_back.setIcon(new ImageIcon(BattleWindow.class.getResource(path)));
	}
	
	/**
	 * @param path to public_image_front
	 */
	public void set_Image_front(String path) {
		public_image_front.setIcon(new ImageIcon(BattleWindow.class.getResource(path)));
	}
	
	
	/**
	 * @return the attackString1
	 */
	public String getAttackString1() {
		return AttackString1;
	}

	/**
	 * @param attackString1 the attackString1 to set
	 */
	public void setAttackString1(String attackString1) {
		btnA1.setText(attackString1);
	}

	/**
	 * @return the attackString2
	 */
	public String getAttackString2() {
		return AttackString2;
	}

	/**
	 * @param attackString2 the attackString2 to set
	 */
	public void setAttackString2(String attackString2) {
		btnA2.setText(attackString2);
	}

	/**
	 * @return the attackString3
	 */
	public String getAttackString3() {
		return AttackString3;
	}

	/**
	 * @param attackString3 the attackString3 to set
	 */
	public void setAttackString3(String attackString3) {
		btnA3.setText(attackString3);
	}

	/**
	 * @return the attackString4
	 */
	public String getAttackString4() {
		return AttackString4;
	}

	/**
	 * @param attackString4 the attackString4 to set
	 */
	public void setAttackString4(String attackString4) {
		btnA4.setText(attackString4);
	}

	
}
