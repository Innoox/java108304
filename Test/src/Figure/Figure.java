package Figure;

public abstract class Figure implements NumberOfSidesPrintable {
	int numberOfSides = 0;
	int firstSideSize = 0;
	int secondSideSize = 0;
	
	Figure(int promptedNumberOfSides, int length_1, int length_2){
		this.numberOfSides = promptedNumberOfSides;
		this.firstSideSize = length_1;
		this.secondSideSize = length_2;
	}
	
	public abstract int getNumberOfSides();
	
	public void printSidesNumber() {
		System.out.println(this.numberOfSides);
	}

	protected abstract void resetAllAttributes();
}
