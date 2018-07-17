package attack;


//Holds the Attacks of a PMonster

public class Attacks {
	
	Attack one;
	Attack two;
	Attack three;
	Attack four;
	
	
	public Attacks(Attack one, Attack two, Attack three, Attack four) {
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
	}
	
	// Empty ini.
	public Attacks() {

		
	}

	/**
	 * @return the one
	 */
	public Attack getOne() {
		return one;
	}

	/**
	 * @param one the one to set
	 */
	public void setOne(Attack one) {
		this.one = one;
	}

	/**
	 * @return the two
	 */
	public Attack getTwo() {
		return two;
	}

	/**
	 * @param two the two to set
	 */
	public void setTwo(Attack two) {
		this.two = two;
	}

	/**
	 * @return the three
	 */
	public Attack getThree() {
		return three;
	}

	/**
	 * @param three the three to set
	 */
	public void setThree(Attack three) {
		this.three = three;
	}

	/**
	 * @return the four
	 */
	public Attack getFour() {
		return four;
	}

	/**
	 * @param four the four to set
	 */
	public void setFour(Attack four) {
		this.four = four;
	}

}
