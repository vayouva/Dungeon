/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 *
 */
public class StrengthPotion implements Item {
	
	private int strength;
	
	public StrengthPotion(int strength) {
		this.strength = strength;
	}

	public void isUsedBy(Player pl) {
		pl.changeStrength(pl.getStrength() + this.strength);
	}

	public String getItemName() {
		return "strength potion";
	}
	
}
