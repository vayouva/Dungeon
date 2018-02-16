/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 * The GoldPurse class represents a gold purse that could be used by the player to increase his amount of gold
 */
public class GoldPurse implements Item {

	private int gold;
	
	/**
	 * Makes a gold purse with a specified amount of gold it gives
	 * @param gold amount of gold it gives
	 */
	public GoldPurse(int gold) {
		this.gold = gold;
	}
	
	/**
	 * A gold purse is used by the player
	 * @param pl the player who plays the game
	 */
	public void isUsedBy(Player pl) {
		pl.changeGold(pl.getGold() + this.gold);
		
	}

	public String getItemName() {
		return "gold purse";
	}

}
