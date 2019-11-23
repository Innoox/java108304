/**
 * 
 */

package StrEnd;
import java.util.Scanner;

/**
 * @author 108304
 *
 */
public class StrEnd {
	
	//static String myParam = "";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myParam = "";
		String exitParam = "end";
		Scanner myScan = new Scanner(System.in);
		while (!myParam.equals(exitParam)) {
			System.out.println("Please prompt some data here:");
			myParam = myScan.nextLine();
			System.out.println("Prompted data is: "+myParam+".");
		}
	}

}
