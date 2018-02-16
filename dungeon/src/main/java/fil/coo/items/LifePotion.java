/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 * The LifePotion class represents a life potion that could be used by the player to increase his amount of life points
 */
public class LifePotion implements Item {

	private int life;
	
	/**
	 * Make a life potion with a specified points of life it gives 
	 * @param life points of life it gives 
	 */
	public LifePotion(int life) {
		this.life = life;
	}
	
	/**
	 * A life potion is used by the player
	 * @param pl the player who plays the game
	 */
	public void isUsedBy(Player pl) {
		pl.chageLife(pl.getLife() + this.life);
		
	}


	public String getItemName() {
		return "life potion";
	}

}
