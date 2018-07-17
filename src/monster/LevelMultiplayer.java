package monster;
/**
 * Num. Set to add on Top
 */


public class LevelMultiplayer {
	
	int maxHp;
	int attack;
	int defense;
	int spezialAttack;
	int spezialDefense;
	
	public LevelMultiplayer(int maxHp, int attack, int defense, int spezialAttack, int spezialDefense) {
		this.maxHp = maxHp;
		this.attack = attack;
		this.defense = defense;
		this.spezialAttack = spezialAttack;
		this.spezialDefense = spezialDefense;
	}

	/**
	 * @return the maxHp
	 */
	public int getMaxHp() {
		return maxHp;
	}

	/**
	 * @param maxHp the maxHp to set
	 */
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * @return the spezialAttack
	 */
	public int getSpezialAttack() {
		return spezialAttack;
	}

	/**
	 * @param spezialAttack the spezialAttack to set
	 */
	public void setSpezialAttack(int spezialAttack) {
		this.spezialAttack = spezialAttack;
	}

	/**
	 * @return the spezialDefense
	 */
	public int getSpezialDefense() {
		return spezialDefense;
	}

	/**
	 * @param spezialDefense the spezialDefense to set
	 */
	public void setSpezialDefense(int spezialDefense) {
		this.spezialDefense = spezialDefense;
	}

}
