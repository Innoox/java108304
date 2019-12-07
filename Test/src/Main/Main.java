/**
 * 
 */
package Main;

/**
 * @author 108304
 *
 */

public class Main {
	
	private <T> boolean contains(T array[], T element) {
		// TODO Auto-generated method stub
		for(T i : array) {
			if (i == element) {
				return true;
			}
		};
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"element", "item"};
	    String element1 = "element";
	    String element2 = "element2";
	    
	    Main main = new Main();
	    System.out.println(main.contains(array, element1));
	    System.out.println(main.contains(array, element2));

	}

}
