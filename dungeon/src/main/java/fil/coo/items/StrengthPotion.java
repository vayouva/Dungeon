/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 * The StrengthPotion class represents a strength potion that could be used by the player to increase his amount of strength points
 */
public class StrengthPotion implements Item {
	
	private int strength;
	
	/**
	 * Makes a strength potion with a specified points of strength it gives 
	 * @param strength points of strength it gives 
	 */
	public StrengthPotion(int strength) {
		this.strength = strength;
	}

	/**
	 * A strength potion is used by the player
	 * @param pl the player who plays the game
	 */
	public void isUsedBy(Player pl) {
		pl.changeStrength(pl.getStrength() + this.strength);
	}

	public String getItemName() {
		return "strength potion";
	}
	
}
