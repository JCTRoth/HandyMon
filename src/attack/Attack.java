package attack;
import main.Type;

public class Attack {

	
	// Name
	// Power = Power of the Attack
	// Type of Attack: Fire, Water etc.
	// Special Effect of Attack
	
	private String name;
	private float power;
	private Type type;
	private SpecialEffects specialEffect;
	private int max_iteration;
	private int remaining_iterations;
	
	public Attack(String name, float power, Type type, SpecialEffects specialEffect, int max_iteration, int remaining_iterations) {
		
		this.name = name;
		this.power = power;
		this.type = type;
		this.specialEffect = specialEffect;
		this.max_iteration = max_iteration;
		this.remaining_iterations = remaining_iterations;
	
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the power
	 */
	public float getPower() {
		return power;
	}



	/**
	 * @param power the power to set
	 */
	public void setPower(float power) {
		this.power = power;
	}



	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}



	/**
	 * @return the specialEffect
	 */
	public SpecialEffects getSpecialEffect() {
		return specialEffect;
	}



	/**
	 * @param specialEffect the specialEffect to set
	 */
	public void setSpecialEffect(SpecialEffects specialEffect) {
		this.specialEffect = specialEffect;
	}


	/**
	 * @return the max_iteration
	 */
	public int getMax_iteration() {
		return max_iteration;
	}


	/**
	 * @param max_iteration the max_iteration to set
	 */
	public void setMax_iteration(int max_iteration) {
		this.max_iteration = max_iteration;
	}


	/**
	 * @return the remaining_iterations
	 */
	public int getRemaining_iterations() {
		return remaining_iterations;
	}


	/**
	 * @param remaining_iterations the remaining_iterations to set
	 */
	public void setRemaining_iterations(int remaining_iterations) {
		this.remaining_iterations = remaining_iterations;
	}
	
	
}
