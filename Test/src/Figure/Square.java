/**
 * 
 */
package Figure;

/**
 * @author 108304
 *
 */
public class Square extends Figure implements Resetable {

	Square(int promptedNumberOfSides, int side1, int side2) {
		super(promptedNumberOfSides, side1, side2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void resetAllAttributes() {
		// TODO Auto-generated method stub
		super.firstSideSize = 0;
		super.secondSideSize = 0;
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return super.numberOfSides;
	}
	
	
}
