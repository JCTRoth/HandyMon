package trainer;

import monster.Ball;

public class BallPocked {
	
	Ball ballOne;
	Ball ballTwo;
	Ball ballThree;
	Ball ballFoure;
	Ball ballFive;
	
	//A BallPocked has 5 PocketBalls in it.
	public BallPocked(Ball one, Ball two, Ball three, Ball foure, Ball five) {
		
		this.ballOne = one;
		this.ballTwo = two;
		this.ballThree = three;
		this.ballFoure = foure;
		this.ballFive = five;

	}
	
	

	/**
	 * @return the ballOne
	 */
	public Ball getBallOne() {
		return ballOne;
	}

	/**
	 * @param ballOne the ballOne to set
	 */
	public void setBallOne(Ball ballOne) {
		this.ballOne = ballOne;
	}

	/**
	 * @return the ballTwo
	 */
	public Ball getBallTwo() {
		return ballTwo;
	}

	/**
	 * @param ballTwo the ballTwo to set
	 */
	public void setBallTwo(Ball ballTwo) {
		this.ballTwo = ballTwo;
	}

	/**
	 * @return the ballThree
	 */
	public Ball getBallThree() {
		return ballThree;
	}

	/**
	 * @param ballThree the ballThree to set
	 */
	public void setBallThree(Ball ballThree) {
		this.ballThree = ballThree;
	}

	/**
	 * @return the ballFoure
	 */
	public Ball getBallFoure() {
		return ballFoure;
	}

	/**
	 * @param ballFoure the ballFoure to set
	 */
	public void setBallFoure(Ball ballFoure) {
		this.ballFoure = ballFoure;
	}

	/**
	 * @return the ballFive
	 */
	public Ball getBallFive() {
		return ballFive;
	}

	/**
	 * @param ballFive the ballFive to set
	 */
	public void setBallFive(Ball ballFive) {
		this.ballFive = ballFive;
	}



}
