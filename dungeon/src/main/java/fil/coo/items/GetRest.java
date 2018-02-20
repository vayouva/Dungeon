/**
 * 
 */
package fil.coo.items;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 * The GetRest class represents an item that the player can use to get some rest and recover life points
 */
public class GetRest implements Item {

	private int timeToRest;
	private int restLife;
	
	/**
	 * Makes a GetRest item with a specified amount of time to rest and life points to get in return 
	 * @param timeToRest the amount of rest time
	 * @param restLife the amount of life points the player gets after having some rest
	 */
	public GetRest(int timeToRest, int restLife) {
		this.timeToRest = timeToRest;
		this.restLife = restLife;
	}
	
	/**
	 * Return the specified time to rest 
	 * @return the amount rest time
	 */
	public int getTimeToRest() {
		return this.timeToRest;
	}
	
	/**
	 * Return the specified life points earned after resting
	 * @return the rest life points
	 */
	public int getRestLife() {
		return this.restLife;
	}
	
	/**
	 * A rest time is used by the player 
	 * @param pl the player who plays the game
	 */
	public void isUsedBy(Player pl) {
		int time = this.getTimeToRest();
		
		System.out.println("You need some rest you brave warrior !");
		while(time > 0) {
			try {
				Thread.sleep(1000);
				System.out.println(time + "...");
			} catch(InterruptedException e) {
				System.out.println(e);
			}
			
			time--;
		}
		
		pl.chageLife(pl.getLife() + this.getRestLife());
		System.out.println("Congratulations, you earned " + this.getRestLife() + " points of life by getting some rest !");
		
	}

	public String getItemName() {
		return "get some rest";
	}

}
