/**
 * 
 */
package fil.coo.rooms;

import fil.coo.entities.Monster;
import fil.coo.items.Item;

/**
 * @author abassi_youva
 *
 */
public class Exit extends Room {
	
	/**
	 * Makes an exit (final) room
	 * @param monster the monster to set in the room
	 * @param item the item to set in the room
	 */
	public Exit(Monster monster, Item item) {
		super(monster, item);
	}

	

}
