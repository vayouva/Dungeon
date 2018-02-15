/**
 * 
 */
package fil.coo.actions;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 *
 */
public interface Action {
	
	public void isMadeBy(Player pl);
	
	public boolean isPossible();
	
	public String getDescription();
}
