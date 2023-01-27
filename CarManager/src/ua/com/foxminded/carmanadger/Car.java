package ua.com.foxminded.carmanadger;

import java.util.Objects;
import java.lang.Math;

public abstract class Car implements Serviceable {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0; // у випадку якщо буде багато конструкторів і поле distance у всіх різне то
								// прописуємо в кожному конструкторі distance = 0;
	protected int distanceOnService = 0; //protected - рівень доступу поле буде доступне в середині класу і в всії класах що наслідуються від нього

	public Car(String name, int yearOfProduction, int price, int weight, String color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color); // .valueOf преобразует в нужный тип данных в даному випадку з String в
											// enum*/

	}


/*	public void addDistance(int additinalDistance) {
	if (additinalDistance < 0) {
			System.out.println("your additinalDistance < 0");
		} else {
			distance += additinalDistance;
			distanceOnService += additinalDistance;
		}
	}
	
	public void addDistance(double additinalDistance) { // якщо буде змінна float, то при виклику метода після
														// additinalDistance пишемо f

	if (additinalDistance < 0) {
			System.out.println("your additinalDistance < 0"); 
		}else { 
			distance += additinalDistance;
			distanceOnService += additinalDistance;     
		}	
	}  */

	
	public void addDistance (int additionalDistance) { //Викликаємо метод в методі щоб використати один int additionalDistance
		distance += additionalDistance;
		addDistanceOnService(additionalDistance);
	}
	public void addDistance (double additionalDistance ) {
		distance += Math.round(additionalDistance) ;
		addDistanceOnService(Math.round(additionalDistance));
	}
	public void addDistanceOnService(int additoinalDistanceOnService) {
		distanceOnService += additoinalDistanceOnService;
	}
	public void addDistanceOnService(double additionalDistanceOnService) {
		distanceOnService += additionalDistanceOnService;
	}
	
	public void servise() {    // метод дозволяє скинути пробіг на 0
		distanceOnService = 0;
	}
	
	
	
	public int getDistanceOnService() {
		return distanceOnService;
	}


	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + yearOfProduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color != other.color)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

}
//створити конструктор з полів Пкм -  sourse - generate constructor using Fields - галочка omit call to default
//вивести метод toString ПкМ - sourse - generate toString