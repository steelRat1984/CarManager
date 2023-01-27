package ua.com.foxminded.carmanadger;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, String color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}
	public boolean isReadyToServise() {
		if(distanceOnService > 50000) {
			return true;
		}
		else
			return false;
	}   
	
}
