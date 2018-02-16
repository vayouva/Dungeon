/**
 * 
 */
package fil.coo.items;

import java.util.Random;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 * OneArmedBandit represents an armed bandit 
 */
public class OneArmedBandit implements Item {

	private final int BANDIT_PRICE = 10; 
	
	public OneArmedBandit() {
		
	}
	
	/**
	 * The player pays the armed bandit, then he picks an item randomly for the player
	 * @param pl the player who deals with the armed bandit
	 */
	public void isUsedBy(Player pl) {
		if(pl.getGold() >= BANDIT_PRICE) {
			
			System.out.println("You have enough gold to get something in return from El Bandito...");
			System.out.println("El Bandito will get you randomly something from his bag !");
			
			try {
				System.out.println("3...");
				Thread.sleep(1000);
				System.out.println("2...");
				Thread.sleep(1000);
				System.out.println("1...");
				Thread.sleep(1000);
			} 
			catch(InterruptedException e) {
				System.out.println(e);
			}
			
			Random random = new Random();
			int choice;
			choice = random.nextInt(3) + 1;
			
			switch(choice) {
				case 1:
					System.out.println("El Bandito got you a life potion !");
					new LifePotion(5).isUsedBy(pl);
					break;
				case 2:
					System.out.println("El Bandito got you a strength potion !");
					new StrengthPotion(5).isUsedBy(pl);
					break;
				case 3:
					System.out.println("El Bandito got you a life potion !");
					new GoldPurse(15).isUsedBy(pl);
					break;	
			}
			
			pl.changeGold(pl.getGold() - BANDIT_PRICE);
			
		}
		else {
			System.out.println("You haven't enough gold, El Bandito is no disappearing in the darkness !");
		}
	}

	public String getItemName() {
		//I guess he's Mexican or something like that 
		return "El Bandito";
	}

}
