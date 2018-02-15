/**
 * 
 */
package fil.coo;

import fil.coo.entities.Monster;
import fil.coo.entities.Player;
import fil.coo.items.Item;
import fil.coo.rooms.Exit;
import fil.coo.rooms.Room;

/**
 * @author abassi_youva
 *
 */
public class AdventureGame {
	
	private Room currentRoom;
	private Player player;
	
	public AdventureGame(Player pl) {
		this.player = pl;
	}
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	public void play(Player pl) {
		
	}

	public void addMonster(Monster monster, Room room) {
		room.getMonsters().add(monster);
	}
	
	public void addItem(Item item, Room room) {
		room.getItems().add(item);
	}
	
	public boolean isFinished() {
		return this.player.isDead() || (this.currentRoom instanceof Exit && this.currentRoom.getMonsters().isEmpty()); 
	}
	
}
