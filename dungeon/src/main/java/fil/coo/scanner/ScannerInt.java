/**
 * 
 */
package fil.coo.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author abassi_youva
 *
 */
public class ScannerInt {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public ScannerInt() {
		
	}
	
	/**
	 * read an integer from 0 (included) to n (excluded) from standard input
	 * input is repeated as long as it is not correct
	 * @param message a message
	 * @param n the upper (excluded) bound for input
	 * @return the valid read input
	 */
	public static int readInt(String message, int n) {
		
		int input = -1;
		
		while(input < 1 || input >= n) {
			System.out.println(message + " (1-" + (n-1) + ") ? ");
			
			try {
				input = sc.nextInt();
			} catch(InputMismatchException e) {
				sc.skip(".*");
			}
		}
		
		return input;
	}

}
