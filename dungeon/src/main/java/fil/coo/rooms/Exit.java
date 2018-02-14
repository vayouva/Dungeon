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

	
	
	public Exit(Monster monster, Item item) {
		super(monster, item);
	}

	public boolean isExit() {
		return true;
	}

}
