/**
 * 
 */
package fil.coo.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import fil.coo.entities.Player;
import fil.coo.listchooser.ListChooser;
import fil.coo.rooms.Direction;
import fil.coo.rooms.Room;

/**
 * @author abassi_youva
 *
 */
public class MoveAction implements Action {
	
	private Room room;
	
	public MoveAction() {
		
		ListChooser lc = new ListChooser();
		List<Direction> possibleDir = new ArrayList<Direction>();
		
		if(isPossible()) {
			for(Entry<Direction,Room> entry : this.room.getNeighbors().entrySet()) {
				possibleDir.add(entry.getKey());
			}
			
			Direction choice = lc.choose("Which direction ? ", possibleDir);
			Room chosenRoom = this.room.getNeighbor(choice);
			//Must continue here
		}
	}
	
	public void isMadeBy(Player pl) {
		
		
	}

	public boolean isPossible() {
		return this.room.getMonsters().isEmpty();
	}

	public String getDescription() {
		return "move";
	}

}
