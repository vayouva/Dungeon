/**
 * 
 */
package fil.coo.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import fil.coo.AdventureGame;
import fil.coo.entities.Player;
import fil.coo.items.ListChooser;
import fil.coo.rooms.Direction;
import fil.coo.rooms.Room;

/**
 * @author abassi_youva
 *
 */
public class MoveAction implements Action {
	
	private Room room;
	private AdventureGame ag;
	
	public MoveAction(Room room) {
		this.room = room;
	}
	
	public MoveAction(Room room, AdventureGame ag) {
		this.room = room;
		this.ag = ag;
	}
	
	public void isMadeBy(Player pl) {
		
		ListChooser lc = new ListChooser();
		List<Direction> possibleDir = new ArrayList<Direction>();
		
		if(isPossible()) {
			for(Entry<Direction,Room> entry : this.room.getNeighbors().entrySet()) {
				possibleDir.add(entry.getKey());
			}
			
			Direction choice = lc.choose("Which direction ? ", possibleDir);
			Room chosenRoom = this.room.getNeighbor(choice);
			ag.setCurrentRoom(chosenRoom);
			ag.refreshAllPossibleActions(chosenRoom);
		}
		
	}

	public boolean isPossible() {
		if(this.room.getMonsters().isEmpty() && !this.room.getNeighbors().isEmpty())
			return true;
		
		return false;
	}

	public String getDescription() {
		return "move";
	}

}
