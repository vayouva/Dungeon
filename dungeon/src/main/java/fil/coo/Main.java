package fil.coo;


import fil.coo.entities.Monster;
import fil.coo.entities.Player;
import fil.coo.items.GoldPurse;
import fil.coo.items.LifePotion;
import fil.coo.items.OneArmedBandit;
import fil.coo.items.StrengthPotion;
import fil.coo.rooms.Direction;
import fil.coo.rooms.Exit;
import fil.coo.rooms.Room;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
    	
    		System.out.println("Welcome you brave warrior, let's kill the Bouteflikus dragon, if you make the right choices, you'll SUCCEED !");
    		System.out.println("Let's begin...");
		
    		//Setting the player 
    		Player pl = new Player(10, 5, 5);
    		
    		//Setting the adventure game and the different items
    		AdventureGame ag = new AdventureGame(pl);
    		LifePotion lifePotion = new LifePotion(5);
    		StrengthPotion strengthPotion = new StrengthPotion(5);
    		GoldPurse goldPurse = new GoldPurse(5);
    		OneArmedBandit bandito = new OneArmedBandit();
    		
    		//Setting the monsters
    		Monster monster_easy = new Monster(3, 5, 2, "viscous toad");
    		Monster monster_easy2 = new Monster(3, 5, 2, "viscous toad");
    		Monster monster_mid = new Monster(10, 7, 3, "lizard with knife");
    		Monster monster_mid2 = new Monster(10, 7, 3, "lizard with knife");
    		Monster monster_mid3 = new Monster(15, 7, 3, "lizard with knife");
    		Monster monster_hard = new Monster(17, 10, 4, "giant spider");
    		Monster monster_hard2 = new Monster(25, 10, 4, "giant spider");
    		Monster monster_insane = new Monster(30, 30, 4, "Bouteflikus, the evil");
    		
    		//Setting the rooms
    		Room room1 = new Room(strengthPotion);
    		Room room2 = new Room(monster_easy, lifePotion);
    		Room room3 = new Room(monster_mid, lifePotion);
    		Room room4 = new Room(monster_easy2, strengthPotion);
    		Room room5 = new Room(monster_mid2, goldPurse);
    		Room room6 = new Room(monster_hard, goldPurse);
    		Room room7 = new Room(monster_mid3, goldPurse);
    		Room room8 = new Exit(monster_insane, lifePotion);
    		Room room9 = new Room(bandito);
    		Room room10 = new Room(monster_hard2, goldPurse);
    		Room room11 = new Room(bandito);
   
    		//Setting the neighbors
    		room1.addNeighbor(Direction.NORTH, room2);
    		room2.addNeighbor(Direction.SOUTH, room1);
    		room2.addNeighbor(Direction.EAST, room3);
    		room3.addNeighbor(Direction.WEST, room2);
    		room2.addNeighbor(Direction.WEST, room4);
    		room4.addNeighbor(Direction.EAST, room2);
    		room2.addNeighbor(Direction.NORTH, room5);
    		room5.addNeighbor(Direction.SOUTH, room2);
    		room5.addNeighbor(Direction.NORTH, room6);
    		room6.addNeighbor(Direction.SOUTH, room5);
    		room6.addNeighbor(Direction.EAST, room7);
    		room7.addNeighbor(Direction.WEST, room6);
    		room7.addNeighbor(Direction.NORTH, room8);
    		room8.addNeighbor(Direction.SOUTH, room7);
    		room8.addNeighbor(Direction.EAST, room10);
    		room10.addNeighbor(Direction.WEST, room8);
    		room10.addNeighbor(Direction.NORTH, room11);
    		room11.addNeighbor(Direction.SOUTH, room10);
    		room11.addNeighbor(Direction.NORTH, room9);
    		room9.addNeighbor(Direction.SOUTH, room11);
    		
    		ag.setCurrentRoom(room1);
    		ag.play(pl);
    		
    		while(!ag.isFinished()) {
    			pl.act();
    			ag.refreshAllPossibleActions(ag.getCurrentRoom());
    		}
    		
    		if(pl.isDead()) {
    			System.out.println("Say hello to Odin in the Valhalla");
    		}
    		else
    			System.out.println("Congratulations warrior, you've defeated Bouteflikus, so he may leave the throne now !");

    }
}
