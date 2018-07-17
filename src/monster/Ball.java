/**
 * 
 */
package monster;

/**
 *  Ball has Zero or One Monster in it.
 *	Ball has a ChatchMultiplier
 */

public class Ball {
	
	Monster monster;
	float chatchMultiplier;
	int position;

	/**
	 * 
	 * @param monster
	 * @param ChatchMultiplier
	 */
	public Ball(Monster monster, float ChatchMultiplier){
		this.monster = monster;
		this.chatchMultiplier = ChatchMultiplier;
	}
	
	/**
	 * With Position
	 * @param monster
	 * @param ChatchMultiplier
	 * @param position
	 */
	public Ball(Monster monster, float ChatchMultiplier, int position){
		this.monster = monster;
		this.chatchMultiplier = ChatchMultiplier;
		this.position = position;
	}
	
	Ball(){
		
	}

	
	public Ball returnPositionBall(int position) {
		
		return new Ball(this.monster.clone(), this.chatchMultiplier, position);
		
	}
	
	
	
	/**
	 * @return the monster
	 */
	public Monster getMonster() {
		return monster;
	}

	/**
	 * @param monster the monster to set
	 */
	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	/**
	 * @return the chatchMultiplier
	 */
	public float getChatchMultiplier() {
		return chatchMultiplier;
	}

	/**
	 * @param chatchMultiplier the chatchMultiplier to set
	 */
	public void setChatchMultiplier(float chatchMultiplier) {
		this.chatchMultiplier = chatchMultiplier;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

}
