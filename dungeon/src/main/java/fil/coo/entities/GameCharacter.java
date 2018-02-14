/**
 * 
 */
package fil.coo.entities;

/**
 * @author abassi_youva
 *
 */
public class GameCharacter {

	protected int strength;
	protected int life;
	protected int gold;
	
	
	/**
	 * Build a game character, it could be a player or a monster
	 * @param strength the strength of the character
	 * @param life the life of the character
	 * @param gold the gold of the character
	 */
	public GameCharacter(int strength, int life, int gold) {
		this.strength = strength;
		this.life = life;
		this.gold = gold;
		
	}

	/**
	 * Return the character's amount of strength
	 * @return the character's amount of strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Change the character's amount of strength
	 * @param strength the strength to set
	 */
	public void changeStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * Return the amount of the character's life
	 * @return the character's amount of life
	 */
	public int getLife() {
		return life;
	}

	/**
	 * Change the amount of the character's life
	 * @param life the life to set
	 */
	public void chageLife(int life) {
		this.life = life;
	}

	/**
	 * Return the amount of the character's gold
	 * @return the character's amount of gold
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * Change the amount of character's gold
	 * @param gold the gold to set
	 */
	public void changeGold(int gold) {
		this.gold = gold;
	}
	
	/**
	 * Return true if the character is dead
	 * @return true if the character is dead
	 */
	public boolean isDead() {
		return this.getLife() <= 0;
	}
	
	/**
	 * A game character can still another game character as long as he still alive
	 * @param gc the game character to be attacked
	 */
	public void attack(GameCharacter gc) {
		if(!this.isDead())
			gc.chageLife(gc.getLife() - this.strength);
	}
	
}
