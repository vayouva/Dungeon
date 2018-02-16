/**
 * 
 */
package fil.coo.entities;

import java.util.ArrayList;
import java.util.List;


import fil.coo.actions.Action;
import fil.coo.listchooser.ListChooser;


/**
 * @author abassi_youva
 * The Player class represents a player
 */
public class Player extends GameCharacter {

	/**
	 * The list of the player's actions
	 */
	private List<Action> actions;
	
	/**
	 * Makes a player with a specified amounts of strength, life and gold
	 * @param strength the player's strength
	 * @param life the player's life
	 * @param gold the player's gold
	 */
	public Player(int strength, int life, int gold) {
		super(strength, life, gold);
		this.actions = new ArrayList<Action>();
	}
	
	/**
	 * Add an action to the player's list of actions
	 * @param action to add to the list
	 */
	public void addAction(Action action) {
		this.actions.add(action);
	}
	
	/**
	 * Return a list of the player's possible actions
	 * @return a list of the player's possible actions
	 */
	public List<Action> getPossibleActions() {
		return this.actions;
	}
	
	/**
	 * Remove an action from the player's possible actions
	 * @param action the action to remove from the player's list of actions
	 */
	public void removeAction(Action action) {
		this.actions.remove(action);
	}
	
	/**
	 * Makes an empty list of actions for the player
	 */
	public void removeAllPossibleActions() {
		this.actions = new ArrayList<Action>();
	}
	
	/**
	 * Return a chosen action from a list of actions 
	 * @return the action chosen
	 */
	public Action chooseAction() {
		ListChooser lc = new ListChooser();
		Action chosenAction = lc.choose("Which action ? ", actions);
		
		return chosenAction;	
	}
	
	/**
	 * This method makes a chosen action by the player, executed by him, wherever look, move, use, or attack action
	 */
	public void act() {
		Action chosenAction = this.chooseAction();
		chosenAction.isMadeBy(this);
	}
	
}
