/**
 * 
 */
package fil.coo.actions;

import fil.coo.entities.Player;

/**
 * @author abassi_youva
 * Action interface represents an action that can be made by a player
 */
public interface Action {
	
	/**
	 * Execute an action by the player
	 * @param pl the player
	 */
	public void isMadeBy(Player pl);
	
	/**
	 * Checks if the action is possible
	 * @return true if the action is possible
	 * @return false if the action is not possible 
	 */
	public boolean isPossible();
	
	/**
	 * Gets a description about the action 
	 * @return the action's description 
	 */
	public String getDescription();
}
