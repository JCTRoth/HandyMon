package monster;
import attack.Attacks;
import attack.SpecialEffects;
import main.Type;


public class Monster {

	String name;
	String nickname;
	int level;
	Type type; 
	float weight;
	float width;
	float length;
	String descriptionText;
	Attacks attacks;
	LevelMultiplayer levelMultiplayer;
	int remainingHp;
	SpecialEffects effected;
	boolean alive;
	ImagePaths imagePaths;
	
	// A PocketMonster has:
	// Name
	// NickName
	// Weight
	// Level
	// Size: height, width, length
	// Attacks Array
	
	//Empty ini. 
	public Monster(){
		
	}
	
	public Monster(String name, String nickname, int level, Type type, float weight, float width, float length, String descriptionText, Attacks attacks, 
			LevelMultiplayer levelMultiplayer, int remainingHp, SpecialEffects effected, boolean alive) {

		this.name = name;
		this.nickname = nickname;
		this.level = level;
		this.type = type;
		this.weight = weight;
		this.width = width;
		this.length = length;
		this.attacks = attacks;
		this.descriptionText = descriptionText;
		this.levelMultiplayer = levelMultiplayer;
		this.alive = alive;
		
		//If bigger than MaxHP than sets eq. to MaxHP
		//this.remainingHp = remainingHp;
		this.setRemainingHp(remainingHp);
		 
		
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Monster clone() {
		// TODO Auto-generated method stub
		return new Monster(name, nickname, level, type, weight, width, length, descriptionText, attacks, levelMultiplayer, remainingHp, effected, alive, imagePaths);
	}

	/**
	 * With Image Paths
	 * 
	 */
	public Monster(String name, String nickname, int level, Type type, float weight, float width, float length, String descriptionText, Attacks attacks, 
			LevelMultiplayer levelMultiplayer, int remainingHp, SpecialEffects effected, boolean alive, ImagePaths imagePaths) {

		this.name = name;
		this.nickname = nickname;
		this.level = level;
		this.type = type;
		this.weight = weight;
		this.width = width;
		this.length = length;
		this.attacks = attacks;
		this.descriptionText = descriptionText;
		this.levelMultiplayer = levelMultiplayer;
		this.alive = alive;
		this.imagePaths = imagePaths;
		
		//If bigger than MaxHP than sets eq. to MaxHP
		//this.remainingHp = remainingHp;
		this.setRemainingHp(remainingHp);
		 
		
	}
	
	
	
	

	/**
	 * @return the remaining HP
	 */
	public int getRemainingHp() {
		return remainingHp;
	}

	/**
	 * @param sets the remaining HP, if bigger than max set eq to maxHP
	 */
	public void setRemainingHp(int remainingHp) {
		
		if(remainingHp >= this.getMaxHp()) {
			this.remainingHp = this.getMaxHp();}
		else {this.remainingHp = remainingHp;}
		
	}

	
	
	/**
	 * @return the MaxHP
	 */
	public int getMaxHp() {
		
		
		return this.getLevelMultiplayer().getMaxHp() * this.getLevel();
		
	}
	
	/**
	 * @return the Defense Strength
	 */
	public int getDefense() {
		
		return this.getLevelMultiplayer().getDefense() * this.getLevel();
		
	}
	
	/**
	 * @return the Attack Strength
	 */
	public int getAttackStrength() {
				
		return this.getLevelMultiplayer().getAttack() * this.getLevel();
		
	}
	
	/**
	 * @return the Special Attack Strength
	 */
	public int getSpecialAttackStrength() {
		
		
		return this.getLevel() * this.getLevelMultiplayer().getSpezialAttack();
		
	}
	
	/**
	 * @return the Special Defense Strength
	 */
	public int getSpecialDefenseStrength() {
		
		int specialDefenseAttack = this.getLevelMultiplayer().spezialDefense;
		
		return specialDefenseAttack * this.getLevel();
		
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
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the type of monster
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
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		this.length = length;
	}

	/**
	 * @return the descriptionText
	 */
	public String getDescriptionText() {
		return descriptionText;
	}

	/**
	 * @param descriptionText the descriptionText to set
	 */
	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}

	/**
	 * @return the attacks
	 */
	public Attacks getAttacks() {
		return attacks;
	}

	/**
	 * @param attacks the attacks to set
	 */
	public void setAttacks(Attacks attacks) {
		this.attacks = attacks;
	}
	
	/**
	 * @return the attacks
	 */
	public LevelMultiplayer getLevelMultiplayer() {
		return levelMultiplayer;
	}

	/**
	 * @param attacks the attacks to set
	 */
	public void setLevelMultiplayer(LevelMultiplayer levelMultiplayer) {
		this.levelMultiplayer = levelMultiplayer;
	}
	
	/**
	 * @return the effected
	 */
	public SpecialEffects getEffected() {
		return effected;
	}

	/**
	 * @param effected the effected to set
	 */
	public void setEffected(SpecialEffects effected) {
		this.effected = effected;
	}

	/**
	 * @return the alive
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * @param alive the alive to set
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * @param imagePaths the imagePaths to set
	 */
	public void setImagePaths(ImagePaths imagePaths) {
		this.imagePaths = imagePaths;
	}

	/**
	 * @return the imagePaths
	 */
	public ImagePaths getImagePaths() {
		return imagePaths;
	}
	

	
	
}
