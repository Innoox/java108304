/**
 * 
 */
package exceptions;

/**
 * @author 108304
 *
 */
public class PointerException{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			NumberFormatException myE = new NumberFormatException("Error.");
			myE.initCause(new NullPointerException("An error exception throw."));
			throw myE;
		} catch(NumberFormatException myE) {
			System.out.println(myE);
			System.out.println(myE.getCause());
		}
	}

}
