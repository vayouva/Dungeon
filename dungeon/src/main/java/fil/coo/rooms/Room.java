/**
 * 
 */
package fil.coo.rooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fil.coo.entities.Monster;
import fil.coo.items.Item;

/**
 * @author abassi_youva
 *
 */
public class Room {
	
	protected List<Monster> monsters;
	protected List<Item> items;
	protected Map<Directions, Room> neighbors;
	
	public Room() {
		
	}

	
}
