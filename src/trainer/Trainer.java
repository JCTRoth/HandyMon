package trainer;


public class Trainer {
	
	String name;
	BallPocked ballPocked; 
	
	public Trainer(String name, BallPocked ballPocked) {
		
		this.name = name;
		this.ballPocked = ballPocked;
	
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
	 * @return the ballPocked
	 */
	public BallPocked getBallPocked() {
		return ballPocked;
	}

	/**
	 * @param ballPocked the ballPocked to set
	 */
	public void setBallPocked(BallPocked ballPocked) {
		this.ballPocked = ballPocked;
	}

}
