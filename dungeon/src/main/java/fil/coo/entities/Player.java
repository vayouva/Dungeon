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
 * This class represents a player, and it extends from GameCharacter class
 */
public class Player extends GameCharacter {

	private List<Action> actions;
	
	
	public Player(int strength, int life, int gold) {
		super(strength, life, gold);
		this.actions = new ArrayList<Action>();
	}
	
	public void addAction(Action action) {
		this.actions.add(action);
	}
	
	public List<Action> getPossibleActions() {
		return this.actions;
	}
	
	public void removeAction(Action action) {
		this.actions.remove(action);
	}
	
	public void removeAllPossibleActions() {
		this.actions = new ArrayList<Action>();
	}
	
	public Action chooseAction() {
		ListChooser lc = new ListChooser();
		Action chosenAction = lc.choose("Which action ? ", this.actions);
		
		return chosenAction;	
	}
	
	public void act() {
		Action chosenAction = this.chooseAction();
		chosenAction.isMadeBy(this);
	}
	
	
}
