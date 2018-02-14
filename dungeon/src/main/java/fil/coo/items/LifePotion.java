/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 *
 */
public class LifePotion implements Item {

	private int life;
	
	public LifePotion(int life) {
		this.life = life;
	}
	
	public void isUsedBy(Player pl) {
		pl.chageLife(pl.getLife() + this.life);
		
	}

	public String getItemName() {
		return "life potion";
	}

}
