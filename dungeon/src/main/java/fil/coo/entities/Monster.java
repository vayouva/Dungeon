/**
 * 
 */
package fil.coo.entities;

/**
 * @author abassi_youva
 * The Monster class represents a monster
 */
public class Monster extends GameCharacter {

	private String name;
	
	/**
	 * Makes a monster by its specified strength, life, gold and name 
	 * @param strength the monster's strength
	 * @param life the monster's life
	 * @param gold the monster's gold
	 * @param name the monster's name
	 */
	public Monster(int strength, int life, int gold, String name) {
		super(strength, life, gold);
		this.name = name;
	}

	/**
	 * Return the name of the monster
	 * @return the name of the monster
	 */
	public String getName() {
		return name;
	}

	
}
