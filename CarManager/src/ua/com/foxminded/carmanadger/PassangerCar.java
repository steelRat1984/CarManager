package ua.com.foxminded.carmanadger;

public class PassangerCar extends Car {

	public PassangerCar(String name, int yearOfProduction, int price, int weight, String color) {
		super(name, yearOfProduction, price, weight, color);
		
	}

	public boolean isReadyToServise() {
		if(distanceOnService > 10000) {
			return true;
		}
		else
			return false;
	
	}

}
