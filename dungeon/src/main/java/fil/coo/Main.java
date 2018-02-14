package fil.coo;


import fil.coo.entities.Monster;
import fil.coo.entities.Player;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Player pla = new Player(5, 15, 5);
        Monster mon = new Monster(10, 10, 5, "bouteflika");
        
        pla.attack(mon);
        System.out.println("The player attacked " + mon.getName());
        System.out.println("The remaining life of the monster: " + mon.getLife());
        System.out.println("The monster is attacking the player..");
        mon.attack(pla);
        System.out.println("The remaining life of the player: " + pla.getLife());
    }
}
