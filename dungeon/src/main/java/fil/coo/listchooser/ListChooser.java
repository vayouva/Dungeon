/**
 * 
 */
package fil.coo.listchooser;

import java.util.List;

import fil.coo.scanner.ScannerInt;

/**
 * @author abassi_youva
 * Allows the player to chose an element from different types of lists 
 */
public class ListChooser {

	public ListChooser() {
		
	}
	
	/**
	 * Takes as parameters a string and a list 
	 * This method allows us to choose an element in a list by entering its index 
	 * @param <T> This is the type parameter
	 * @param question a question (String)
	 * @param list a list where the players picks his choices
	 * @return The element chosen is returned, or null if the index is 0
	 */
	
	public <T extends Object> T choose(String question, List<T> list) {
		
		int i = 1;
		for(T obj: list) {
			System.out.println(i++ + ". " + obj);
		}
		
		int value = ScannerInt.readInt(question, i);
		
		return (value != 0 ? list.get(value-1) : null);
		
	}
}
