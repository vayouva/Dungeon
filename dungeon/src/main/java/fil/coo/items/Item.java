/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 *
 */
public interface Item {

	public void isUsedBy(Player pl);
	
	public String getItemName();
}
