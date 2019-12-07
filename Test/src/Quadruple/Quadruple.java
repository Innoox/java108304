/**
 * 
 */
package Quadruple;

/**
 * @author 108304
 *
 */
public class Quadruple<F, S, T, L> {
	
	private F first;
	private S second;
	private T third;
	private L fourth;
	
	protected Quadruple(F first, S second, T third, L fourth) {
		this.setFirst(first);
		this.setSecond(second);
		this.setThird(third);
		this.setFourth(fourth);
	}
	
	public F getFirst() {
		return first;
	}

	public void setFirst(F first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}

	public T getThird() {
		return third;
	}

	public void setThird(T third) {
		this.third = third;
	}

	public L getFourth() {
		return fourth;
	}

	public void setFourth(L fourth) {
		this.fourth = fourth;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadruple<Character, String, Integer, Boolean> myTest = new Quadruple<Character, String, Integer, Boolean>('a', "Doe", 12, false);
		System.out.println(myTest.getFirst());
		System.out.println(myTest.getSecond());
		System.out.println(myTest.getThird());
		System.out.println(myTest.getFourth());
	}

}
