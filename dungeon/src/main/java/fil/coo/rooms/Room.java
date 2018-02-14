/**
 * 
 */
package fil.coo.rooms;


import java.util.ArrayList;
import java.util.HashMap;
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
	protected Map<Direction, Room> neighbors;
	

	/**
	 * Builds a room with a monsters and an item
	 * @param monster the monster to set
	 * @param item the item to set
	 */
	public Room(Monster monster, Item item) {
		this.monsters = new ArrayList<Monster>();
		monsters.add(monster);
		this.items = new ArrayList<Item>();
		items.add(item);
		this.neighbors = new HashMap<Direction, Room>();
	}
	
	/**
	 * Creates a room without parameters 
	 */
	public Room() {
		this.monsters = new ArrayList<Monster>();
		this.items = new ArrayList<Item>();
		this.neighbors = new HashMap<Direction, Room>();
	}

	/**
	 * Remove a monster from the list of this room's monsters 
	 * @param monster the monster to remove from the list
	 */
	public void removeMonster(Monster monster) {
		this.monsters.remove(monster);
	}
	
	/**
	 * Add a monster to the list of this room's monsters 
	 * @param monster the monster to add to the list
	 */
	public void addMonster(Monster monster) {
		this.monsters.add(monster);
	}
	
	/**
	 * Remove an item from the list of this room's items
	 * @param item the item to remove from the list
	 */
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	/**
	 * Add an item to the list of this room's items 
	 * @param item the item to add to the list
	 */
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	/**
	 * Return a list of this room's monsters 
	 * @return a list of monsters
	 */
	public List<Monster> getMonsters() {
		return this.monsters;
	}
	
	/**
	 * Return a list of this room's items 
	 * @return a list of items
	 */
	public List<Item> getItems() {
		return this.items;
	}
	
	/**
	 * Return the neighbor room with the specified direction
	 * @param direction the direction of the room wanted 
	 * @return Room the room wanted by the direction
	 */
	public Room getNeighbor(Direction direction) {
		return this.neighbors.get(direction);
	}
	
	/**
	 * Add a room to the list of neighbors
	 * @param direction of the neighbor to add
	 * @param room to add to the list of neighbors
	 */
	public void addNeighbor(Direction direction, Room room) {
		this.neighbors.put(direction, room);
	}
	
	/**
	 * return a map of neighbors
	 * @return the neighbors to return 
	 */
	public Map<Direction, Room> getNeighbors() {
		return this.neighbors;
	}
}
