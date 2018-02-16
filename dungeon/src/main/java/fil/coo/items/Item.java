/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 * The Item interface represents an item that could be used by the player
 */
public interface Item {

	/**
	 * An item is used by the player
	 * @param pl the player who uses the item
	 */
	public void isUsedBy(Player pl);
	
	/**
	 * Gets the name of the item
	 * @return the name of the item
	 */
	public String getItemName();
}
