/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 *
 */
public class GoldPurse implements Item {

	private int gold;
	
	public GoldPurse(int gold) {
		this.gold = gold;
	}
	
	public void isUsedBy(Player pl) {
		pl.changeGold(pl.getGold() + this.gold);
		
	}

	public String getItemName() {
		return "gold purse";
	}

}
