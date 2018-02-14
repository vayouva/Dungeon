/**
 * 
 */
package fil.coo.entities;

/**
 * @author abassi_youva
 *
 */
public class Monster extends GameCharacter {

	private String name;
	
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
