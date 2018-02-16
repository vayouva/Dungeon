/**
 * 
 */
package fil.coo.items;

import java.util.List;

import fil.coo.scanner.ScannerInt;

/**
 * @author abassi_youva
 *
 */
public class ListChooser {

	
	public <T> T choose(String question, List<T> list) {
		
		int i = 1;
		for(T obj: list) {
			System.out.println(i++ + ". " + obj);
		}
		
		int value = ScannerInt.readInt(question, i);
		
		return (value != 0 ? list.get(value-1) : null);
		
	}
}
