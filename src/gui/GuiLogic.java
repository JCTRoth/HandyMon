package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import battle.BattleLogic;
import battle.Player;
import main.Main;
import monster.Monster;
import sun.util.logging.resources.logging;

public class GuiLogic {

	ChooseMonster chooseMonster;
	BattleWindow bw;
	BattleLogic battleLoggic;
	Log log = new Log();

	public GuiLogic() {
		
		bw = new BattleWindow();
		bw.setVisible(true);
		initAttackButtons();
		initNextButton();
	}
	
	public void chooseMonster() {
		chooseMonster.main(null);
	}
	
	public void setBattleLogic(BattleLogic battleLoggic)
	{
		this.battleLoggic = battleLoggic;
	}
	
	/**
	 * 
	 */
	private void initAttackButtons()
	{
		bw.btnA1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				battleLoggic.playerOneCommitAttack(1);
			}
		});
		bw.btnA2.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				battleLoggic.playerOneCommitAttack(2);
			}
		});
		bw.btnA3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				battleLoggic.playerOneCommitAttack(3);
			}
		});
		bw.btnA4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				battleLoggic.playerOneCommitAttack(4);
			}
		});
	}
	
	public void initNextButton() {
		bw.public_btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				battleLoggic.nextBallPlayerOne();
				
			}
		});
		bw.public_btnRestart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.startNewGame();
			}
		});
	}
	
	public void updateMonster(Monster monster, Player player)
	{
		if (player == Player.one)
		{
			// monster images
			loadImageBack(monster);
			
			
			// labels (title, level, health)
			bw.nameLabel1.setText(monster.getName());
			bw.levelLabel1.setText("Lvl. " + monster.getLevel());
			bw.healthLabel1.setText(monster.getRemainingHp() + "/" + monster.getMaxHp());
			
			// health bar
			bw.healthBar1.setMaximum(monster.getMaxHp());
			bw.healthBar1.setValue(monster.getRemainingHp());
			
			// attack button text for player one
			loadAttacks(monster);
			
			// exp bar for player one
			// bw.expBar.setValue();
			
		}
		else
		{
			// monster images
			loadImageFront(monster);
			
			// labels (title, level, health)
			bw.nameLabel2.setText(monster.getName());
			bw.levelLabel2.setText("Lvl. " + monster.getLevel());
			bw.healthLabel2.setText(monster.getRemainingHp() + "/" + monster.getMaxHp());
			
			// health bar
			bw.healthBar2.setMaximum(monster.getMaxHp());
			bw.healthBar2.setValue(monster.getRemainingHp());
		}
	}
	

	
public void loadImageFront(Monster monster) {
		
	if (monster.getImagePaths() == null)
		System.out.println("No image found for this monster");
	else
		bw.set_Image_front(monster.getImagePaths().getMainImageFront());
		
	}
	
public void loadImageBack(Monster monster) {
	if (monster.getImagePaths() == null)
		System.out.println("No image found for this monster");
	else
		bw.set_Image_back(monster.getImagePaths().getMainImageBack());
		
	}
	
public void loadLogWinow() {
	
	log.setVisible();
	
}

	public void loadMonster(Monster monster, Player player)
	{
		if (player == Player.one)
			loadAttacks(monster);
		loadMonsterImage(monster, player);
	}
	
	//If new Monster appears 
	public void loadAttacks(Monster monster) {
		
		//battleWindow.main(null);
		
		bw.setAttackString1(monster.getAttacks().getOne().getName());
		bw.setAttackString2(monster.getAttacks().getTwo().getName());
		bw.setAttackString3(monster.getAttacks().getThree().getName());
		bw.setAttackString4(monster.getAttacks().getFour().getName());
		
		bw.repaint();
		
	}
	
	public void loadMonsterImage(Monster monster, Player player) {
		
		if(player == Player.one)
		bw.set_Image_back(monster.getImagePaths().getMainImageBack());
		
		if(player == Player.two)
		bw.set_Image_back(monster.getImagePaths().getMainImageFront());
		
		
		bw.repaint();
	}
	
	
	public void gameOver() {
		
	}
	
	
}
