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
 * Principle class of the game, it allows the player to launch the game and manages the player's progress through the rooms he meets
 * This class also allows you to add monsters and objects to a populated room
 */
public class AdventureGame {
	
	private Room currentRoom;
	private Player player;
	
	/**
	 * Makes an adventure game with a specified player 
	 * @param pl the player who plays the game 
	 */
	public AdventureGame(Player pl) {
		this.player = pl;
	}
	
	/**
	 * Return the current's player room
	 * @return the current's player room
	 */
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	/**
	 * Set the current room
	 * @param room the room to set
	 */
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	/**
	 * Play the game
	 * @param pl the player who play's the game
	 */
	public void play(Player pl) {
		refreshAllPossibleActions(this.currentRoom);
	}

	/**
	 * Add a monster to the adventure game
	 * @param monster the monster to add 
	 * @param room the room where the monster will be added 
	 */
	public void addMonster(Monster monster, Room room) {
		room.getMonsters().add(monster);
	}
	
	/**
	 * Add an item the the adventure game
	 * @param item the item to add 
	 * @param room the room where the item will be added
	 */
	public void addItem(Item item, Room room) {
		room.getItems().add(item);
	}
	
	/**
	 * Return true if the game is finished 
	 * @return true if the player is dead or the player's current room is an exit room and all the monsters in this room are dead
	 */
	public boolean isFinished() {
		return this.player.isDead() || (this.currentRoom instanceof Exit && this.currentRoom.getMonsters().isEmpty()); 
	}
	
	/**
	 * Refresh all the player's possible actions when he gets in another room 
	 * @param room the player's current room
	 */
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
