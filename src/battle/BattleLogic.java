/**
 * 
 */
package battle;

import javax.swing.JOptionPane;

import attack.Attack;
import gui.GuiLogic;
import monster.Ball;


/**
 * 
 *
 */

public class BattleLogic {

	GuiLogic guiLogic;
	private Battle battle;
	
	//
	public BattleLogic(Battle battle) {
	
		this.guiLogic = guiLogic;
		this.battle = battle;
		
	}

	public void setGuiLogic(GuiLogic guiLogic)
	{
		this.guiLogic = guiLogic;
	}
	
	public void updateGui()
	{
		if (guiLogic != null)
		{
			guiLogic.updateMonster(
					battle.getCurrentBallofPlayerOne().getMonster(),
					Player.one);
			guiLogic.updateMonster(
					battle.getCurrentBallTwo().getMonster(),
					Player.two);
		}
	}
	

public void switchBall(Ball ball, Player player) {
	if(player == Player.one) {
		battle.setCurrentBallOne(ball);
	}
	
	if(player == Player.two) {
		battle.setCurrentMonsterTwo(ball);
	
	}
	
}

/**
 * 
 * @param currentBall
 */
public void nextBallPlayerOne() {
 	switch (battle.getCurrentBallofPlayerOne().getPosition())
 	{
 	case 1:
 		switchBall(battle.getTrainerOne().getBallPocked().getBallTwo(), Player.one);
 		break;
 	case 2:
 		switchBall(battle.getTrainerOne().getBallPocked().getBallThree(), Player.one);
 		break;
 	case 3:
 		switchBall(battle.getTrainerOne().getBallPocked().getBallFoure(), Player.one);
 		break;
 	case 4:
 		switchBall(battle.getTrainerOne().getBallPocked().getBallFive(), Player.one);
 		break;
 	case 5:
 		switchBall(battle.getTrainerOne().getBallPocked().getBallOne(), Player.one);
 	default:
 	}
 	updateGui();
}


public boolean hasPlayerOneWon() {
	return ! battle.getTrainerTwo().getBallPocked().getBallOne().getMonster().isAlive()
			&& ! battle.getTrainerTwo().getBallPocked().getBallTwo().getMonster().isAlive()
			&& ! battle.getTrainerTwo().getBallPocked().getBallThree().getMonster().isAlive()
			&& ! battle.getTrainerTwo().getBallPocked().getBallFoure().getMonster().isAlive()
			&& ! battle.getTrainerTwo().getBallPocked().getBallFive().getMonster().isAlive();
}

public boolean hasPlayerTwoWon() {
	
	return ! battle.getTrainerOne().getBallPocked().getBallOne().getMonster().isAlive()
			&& ! battle.getTrainerOne().getBallPocked().getBallTwo().getMonster().isAlive()
			&& ! battle.getTrainerOne().getBallPocked().getBallThree().getMonster().isAlive()
			&& ! battle.getTrainerOne().getBallPocked().getBallFoure().getMonster().isAlive()
			&& ! battle.getTrainerOne().getBallPocked().getBallFive().getMonster().isAlive();
}


/**
 * 
 * @param currentBall
 */
public void nextBallPlayerTwo() {

 	switch (battle.getCurrentBallTwo().getPosition())
 	{
 	case 1:
 		switchBall(battle.getTrainerTwo().getBallPocked().getBallTwo(), Player.two);
 		break;
 	case 2:
 		switchBall(battle.getTrainerTwo().getBallPocked().getBallThree(), Player.two);
 		break;
 	case 3:
 		switchBall(battle.getTrainerTwo().getBallPocked().getBallFoure(), Player.two);
 		break;
 	case 4:
 		switchBall(battle.getTrainerTwo().getBallPocked().getBallFive(), Player.two);
 		break;
 	case 5:
 		switchBall(battle.getTrainerTwo().getBallPocked().getBallOne(), Player.two);
 	default:
 	}
}

	

/**
 * Player One Commits Attack by ID
 * @param id
 */

public void playerOneCommitAttack(int id)
{
	
	
	if(hasPlayerTwoWon())
	{
		 JOptionPane.showMessageDialog(null, "There is no monster left...all your monsters are dead! You MONSTER!", "", JOptionPane.PLAIN_MESSAGE);
		 return;
	}
	
	if(hasPlayerOneWon())
	{
		 JOptionPane.showMessageDialog(null, "Stop punching, you already won.", "", JOptionPane.PLAIN_MESSAGE);
		 return;
	}
	
	switch (id)
	{
	case 1:
		playerOneCommitAttack(battle.getCurrentBallofPlayerOne().getMonster().getAttacks().getOne());
		break;
	case 2:
		playerOneCommitAttack(battle.getCurrentBallofPlayerOne().getMonster().getAttacks().getTwo());
		break;
	case 3:
		playerOneCommitAttack(battle.getCurrentBallofPlayerOne().getMonster().getAttacks().getThree());
		break;
	case 4:
		playerOneCommitAttack(battle.getCurrentBallofPlayerOne().getMonster().getAttacks().getFour());
	default:
	}
	
	if(hasPlayerOneWon())
	{
		 JOptionPane.showMessageDialog(null, "You won.", "", JOptionPane.PLAIN_MESSAGE);
		 return;
	}
	
	// update ui -> health bars changed
	updateGui();
}
	
/**
 * Player One Commits Attack by Attack
 * @param attack
 */
	
 public void playerOneCommitAttack(Attack attack) {
	 
	 //Checks if Monster is alive
	 if(! battle.getCurrentBallofPlayerOne().getMonster().isAlive()) {
		 JOptionPane.showMessageDialog(null, "This Monster is dead, use another one.", "", JOptionPane.PLAIN_MESSAGE);
		 
	 }else {
	 
	 
	 
	float attackPower = (battle.getCurrentBallofPlayerOne().getMonster().getAttackStrength() * (attack.getPower()/50.0f));
	
	float defensePower = battle.getCurrentBallTwo().getMonster().getDefense();
	
	float harm = Math.max(1, attackPower - defensePower);
	
	//If HP < 0 than dead
	//If HP > 0 than HP - Harm
	if(battle.getCurrentBallTwo().getMonster().getRemainingHp() - harm <= 0){
	
		battle.getCurrentBallTwo().getMonster().setAlive(false);
		battle.getCurrentBallTwo().getMonster().setRemainingHp(0);

	}
	else{
		battle.getCurrentBallTwo().getMonster().setRemainingHp(((int)(battle.getCurrentBallTwo().getMonster().getRemainingHp() - harm)));}
	}
	 
	 playerTwoCommitAttack((int)Math.round(Math.random()*4+1)); 
	 updateGui();
}

 /**
  * Player Two Commits Attack by ID
  * @param id
  */

 public void playerTwoCommitAttack(int id)
 {
 	switch (id)
 	{
 	case 1:
 		playerTwoCommitAttack(battle.getCurrentBallTwo().getMonster().getAttacks().getOne());
 		break;
 	case 2:
 		playerTwoCommitAttack(battle.getCurrentBallTwo().getMonster().getAttacks().getTwo());
 		break;
 	case 3:
 		playerTwoCommitAttack(battle.getCurrentBallTwo().getMonster().getAttacks().getThree());
 		break;
 	case 4:
 		playerTwoCommitAttack(battle.getCurrentBallTwo().getMonster().getAttacks().getFour());
 	default:
 	}
 	
	if(hasPlayerTwoWon())
	{
		 JOptionPane.showMessageDialog(null, "Fail! You lost the game.", "", JOptionPane.PLAIN_MESSAGE);
		 return;
	}
 	
 } 
 
 
/**
 * Player Two Commits Attack by Attack
 * @param attack
 */
 
 public void playerTwoCommitAttack(Attack attack) {
	 
	 //Checks if Monster is alive
	 if(! battle.getCurrentBallTwo().getMonster().isAlive()) {
		 nextBallPlayerTwo();
		 
	 }else {
	 
	 
	 float attackPower = (battle.getCurrentBallTwo().getMonster().getAttackStrength() * (attack.getPower()/50.0f));
	
	float defensePower = battle.getCurrentBallofPlayerOne().getMonster().getDefense();
	
	float harm = Math.max(1, attackPower - defensePower);
	
	//If HP < 0 than dead
	//If HP > 0 than HP - Harm
	if(battle.getCurrentBallofPlayerOne().getMonster().getRemainingHp() - harm <= 0){
		
		battle.getCurrentBallofPlayerOne().getMonster().setAlive(false);
		battle.getCurrentBallofPlayerOne().getMonster().setRemainingHp(0);
		
	}else{battle.getCurrentBallofPlayerOne().getMonster().setRemainingHp(((int)(battle.getCurrentBallofPlayerOne().getMonster().getRemainingHp() - harm)));}

	 }
	 updateGui();
		
}
 




	

}
