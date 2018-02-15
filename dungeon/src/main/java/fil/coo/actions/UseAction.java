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
 *
 */
public class UseAction implements Action {

	private Room room;
	
	public UseAction() {
		
	}
	
	public UseAction(Room room) {
		this.room = room;
	}

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

	public boolean isPossible() {
		return !this.room.getItems().isEmpty();
	}

	public String getDescription() {
		return "use";
	}

}
