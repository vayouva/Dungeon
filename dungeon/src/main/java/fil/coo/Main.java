package fil.coo;


import fil.coo.entities.Player;
import fil.coo.items.LifePotion;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Player pla = new Player(5, 15, 5);
        LifePotion lp = new LifePotion(5);
        
        System.out.println("player's amount of life before the potion : " + pla.getLife());
        lp.isUsedBy(pla);
        System.out.println("player's amount of life after the potion : " + pla.getLife());
    }
}
