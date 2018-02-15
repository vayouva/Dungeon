/**
 * 
 */
package fil.coo.actions;

import fil.coo.entities.Monster;
import fil.coo.entities.Player;
import fil.coo.items.ListChooser;
import fil.coo.rooms.Room;

/**
 * @author abassi_youva
 *
 */
public class AttackAction implements Action {

	private Room room;
	
	public AttackAction(Room room) {
		this.room = room;
	}
	
	public void isMadeBy(Player pl) {
		if(isPossible()) {
			Monster monster = null;
			
			if(this.room.getMonsters().size() == 1) {
				monster = this.room.getMonsters().get(0);
			}
			else {
				ListChooser lc = new ListChooser();
				monster = lc.choose("Which monster ? ", this.room.getMonsters());
			}
			
			monster.chageLife(monster.getLife() - pl.getStrength());
			if(!monster.isDead()) {
				System.out.println(monster.getName() + " has lost " + pl.getStrength() + " points of life, it remains to him " + monster.getLife() + " points !");
				monster.attack(pl);
				System.out.println(monster.getName() + " hits back, you lost " + monster.getStrength() + " points of life ! You still have " + pl.getLife() + " points of life !");
			}
			else {
				pl.changeGold(pl.getGold() + monster.getGold());
				System.out.println(monster.getName() + " has been defeated, you win " + monster.getGold() + " coins of gold !");
				this.room.removeMonster(monster);
			}
		}
		else {
			System.out.println("Sorry, but this action is not possible !");
		}
	}

	public boolean isPossible() {
		return !this.room.getMonsters().isEmpty();
	}

	public String getDescription() {
		return "attack";
	}

}
