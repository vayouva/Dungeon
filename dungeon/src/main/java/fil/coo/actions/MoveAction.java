/**
 * 
 */
package fil.coo.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import fil.coo.AdventureGame;
import fil.coo.entities.Player;
import fil.coo.listchooser.ListChooser;
import fil.coo.rooms.Direction;
import fil.coo.rooms.Room;

/**
 * @author abassi_youva
 * The MoveAction class allows the player to move to another room 
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
	
	/**
	 * Displays the different directions available in the current room 
	 * The player enters a direction and if the move is possible, the player goes to the specified room
	 * @param pl the player who plays the game
	 */
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

	/**
	 * The player can change the room if all the monsters are dead, and the current room has neighbors
	 * @return if the current room's list of monsters is empty and it has neighbors
	 */
	public boolean isPossible() {
		if(this.room.getMonsters().isEmpty() && !this.room.getNeighbors().isEmpty())
			return true;
		
		return false;
	}

	public String getDescription() {
		return "move";
	}

	public String toString() {
		return "move";
	}
}
