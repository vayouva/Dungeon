/**
 * 
 */
package fil.coo.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import fil.coo.entities.Monster;
import fil.coo.entities.Player;
import fil.coo.items.Item;
import fil.coo.rooms.Direction;
import fil.coo.rooms.Room;

/**
 * @author abassi_youva
 * LookAction allows the player to look to the room's content
 */
public class LookAction implements Action {

	private Room room;
	
	/**
	 * Makes a LookAction with a specified room
	 * @param room the player's current room
	 */
	public LookAction(Room room) {
		this.room = room;
	}

	/**
	 * This method represents the action of looking in a room's content 
	 * @param pl the player who makes the action 
	 */
	public void isMadeBy(Player pl) {
		if(isPossible()) {
			//Getting the monsters
			List<Monster> monsters = new ArrayList<Monster>();
			monsters = this.room.getMonsters();
			//Getting the items
			List<Item> items = new ArrayList<Item>();
			items = this.room.getItems();
			//Getting the directions
			List<Direction> directions = new ArrayList<Direction>();
			for(Entry<Direction,Room> entry : this.room.getNeighbors().entrySet()) {
				directions.add(entry.getKey());
			}
			
			System.out.println("In this room, we've got : ");
			//Display the names of the monsters 
			System.out.println("** " + monsters.size() +" monsters, their names are : ");
			for(int i = 0; i < monsters.size(); i++) {
				System.out.println(monsters.get(i).getName());
			}
			//Display the items
			System.out.println("** " + items.size() +" items, let's list them : ");
			for(int i = 0; i < items.size(); i++) {
				System.out.println(items.get(i).getItemName());
			}
			//Display the directions
			System.out.println("** " + directions.size() +" directions, let's list them : ");
			for(int i = 0; i < directions.size(); i++) {
				System.out.println(directions.get(i) + " ");
			}
			
			System.out.println("\n --------------------------------------------------------------------------- \n");
	
		}
		
	}

	/**
	 * Looking into the room's content is always possible
	 * @return true if the action of looking the room's content is possible
	 */
	public boolean isPossible() {
		//return !room.getItems().isEmpty() || !room.getMonsters().isEmpty() || !room.getNeighbors().isEmpty();
		return true; // We can look to the room even if it's empty
	}

	public String getDescription() {
		return "look";
	}

	public String toString() {
		return "look";
	}
}
