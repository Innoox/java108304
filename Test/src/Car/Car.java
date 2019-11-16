package Car;

public abstract class Car {
	String model = "";
	
	Car(String carModel) {
		this.model = carModel;
	}
	
	abstract public String getCarModel();
}
