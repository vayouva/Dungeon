/**
 * 
 */
package fil.coo.actions;

import java.util.ArrayList;
import java.util.List;

import fil.coo.entities.Player;
import fil.coo.items.Item;
import fil.coo.listchooser.ListChooser;
import fil.coo.rooms.Room;

/**
 * @author abassi_youva
 * The UseAction class allows the player to use an item in his current room
 */
public class UseAction implements Action {

	private Room room;
	
	/**
	 * Makes a UseAction by specifying its current room
	 * @param room the player's current room
	 */
	public UseAction(Room room) {
		this.room = room;
	}

	/**
	 * Displays the list of the items present in the current room
	 * The player can use the item with isUsedBy method, then the item is removed from the current room
	 * @param pl the player who plays the game
	 */
	public void isMadeBy(Player pl) {
		if(isPossible()) {
			List <Item> items = new ArrayList<Item>();
			items = this.room.getItems();
			if(items.size() == 1) {
				items.get(0).isUsedBy(pl);
				items.remove(0);
				System.out.println("Player's life: " + pl.getLife() + ", strength: " + pl.getStrength() + ", gold: " + pl.getGold());
			}
			else {
				ListChooser lc = new ListChooser();
				Item choice = lc.choose("Which item ? ", items);
				choice.isUsedBy(pl);
				System.out.println("Player's life: " + pl.getLife() + ", strength: " + pl.getStrength() + ", gold: " + pl.getGold());
				items.remove(choice);
			}
		}
		
	}

	/**
	 * Return true if the romm's list of items isn't empty
	 * @return true if the romm's list of items isn't empty
	 */
	public boolean isPossible() {
		return !this.room.getItems().isEmpty();
	}

	public String getDescription() {
		return "use";
	}
	
	public String toString() {
		return "use";
	}

}
