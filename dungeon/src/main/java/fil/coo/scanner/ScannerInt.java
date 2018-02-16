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
