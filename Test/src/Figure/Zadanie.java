/**
 * 
 */
package Figure;

/**
 * @author 108304
 *
 */
public class Zadanie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure rec = new Square(4, 2, 5);
		System.out.println("Amount of sides: "+rec.numberOfSides+". First side size: "+rec.firstSideSize+". Second side size: "+rec.secondSideSize+".");
		rec.resetAllAttributes();
		System.out.println("Amount of sides: "+rec.numberOfSides+". First side size: "+rec.firstSideSize+". Second side size: "+rec.secondSideSize+".");
	}

}
