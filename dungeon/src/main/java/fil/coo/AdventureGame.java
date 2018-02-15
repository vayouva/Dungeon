/**
 * 
 */
package fil.coo;

import fil.coo.actions.AttackAction;
import fil.coo.actions.LookAction;
import fil.coo.actions.MoveAction;
import fil.coo.actions.UseAction;
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
		refreshAllPossibleActions(this.currentRoom);
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
	
	public void refreshAllPossibleActions(Room room) {
		this.player.removeAllPossibleActions();
		
		MoveAction move = new MoveAction(room, this);
		AttackAction attack = new AttackAction(room);
		LookAction look = new LookAction(room);
		UseAction use = new UseAction(room);
		
		if(move.isPossible())
			this.player.addAction(move);
		if(attack.isPossible())
			this.player.addAction(attack);
		if(look.isPossible())
			this.player.addAction(look);
		if(use.isPossible())
			this.player.addAction(use);
	}
	
}
