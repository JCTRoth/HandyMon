package battle;

import monster.Ball;
import monster.Monster;
import trainer.Trainer;

public class Battle {
	
	/**
	 * A Battle has two Trainer in it.
	 * One Trainer is Defeated if no Monster in his Pocket Remains.
	 */

	Trainer trainerOne;
	Trainer trainerTwo;
	Ball currentBallOne;
	Ball currentBallTwo;
	
	public Battle(Trainer trainerOne, Trainer trainerTwo) {
		
		this.trainerOne = trainerOne;
		this.trainerTwo = trainerTwo;
		this.currentBallOne = trainerOne.getBallPocked().getBallOne();
		this.currentBallTwo = trainerTwo.getBallPocked().getBallOne();
		
	}

	/**
	 * @return the trainerOne
	 */
	public Trainer getTrainerOne() {
		return trainerOne;
	}

	/**
	 * @param trainerOne the trainerOne to set
	 */
	public void setTrainerOne(Trainer trainerOne) {
		this.trainerOne = trainerOne;
	}

	/**
	 * @return the trainerTwo
	 */
	public Trainer getTrainerTwo() {
		return trainerTwo;
	}

	/**
	 * @param trainerTwo the trainerTwo to set
	 */
	public void setTrainerTwo(Trainer trainerTwo) {
		this.trainerTwo = trainerTwo;
	}

	/**
	 * @return the currentBallOne
	 */
	public Ball getCurrentBallofPlayerOne() {
		return currentBallOne;
	}

	/**
	 * @param setCurrentBallOne the setCurrentBallofPlayerOne to set
	 */
	public void setCurrentBallOne(Ball currentBallOne) {
		this.currentBallOne = currentBallOne;
	}

	/**
	 * @return the currentMonsterTwo
	 */
	public Ball getCurrentBallTwo() {
		return currentBallTwo;
	}

	/**
	 * @param currentMonsterTwo the currentMonsterTwo to set
	 */
	public void setCurrentMonsterTwo(Ball currentBallTwo) {
		this.currentBallTwo = currentBallTwo;
	}
	

}
