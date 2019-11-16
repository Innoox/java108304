package Car;
/**
 * Zaproponuj implementacje klasy abstrakcyjnej Samochod oraz klasy dziedziczacej ja: Mercedes.
 * Stworz pola, metody, metody abstrakcyjne itp.
 * Zaprezentuj dzia³anie klasy w ZadanieCar.
 * */
public class ZadanieCar {
	public static void main(String[] args) {
		Car mercedes = new Mercedes("Mercedes");
		System.out.println("The model of created object is: "+mercedes.getCarModel()+".");
	}
}