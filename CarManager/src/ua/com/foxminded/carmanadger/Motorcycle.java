package ua.com.foxminded.carmanadger;

public class Motorcycle {
	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color typeColor;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;
	private int distanceOnServise = 0;
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, String newColor, String engineType,
			boolean isReadyToDrive) {
		super();
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.typeColor = Color.valueOf(newColor.toUpperCase().replace(" ", "")); //переформатовує в потрібний тип даних - стрінг в enum
		this.engineType = engineType; 
		this.isReadyToDrive = isReadyToDrive;
	
	}
	// метод додає дистанцію
	public void addDistance(int additionalDistance) { //Викликаємо метод в методі щоб використати один int additionalDistance
			distance += additionalDistance;
			addDistanceOnServise(additionalDistance);
			}
		
		
	public void addDistance(float additionalDistance  ) { 
		distance += Math.round(additionalDistance);	
		addDistanceOnServise(Math.round(additionalDistance));
	}
	
	public void addDistanceOnServise (int additionalDistanceOnServise) {
		distanceOnServise += additionalDistanceOnServise;
	}
	public void addDistanceOnServise (float additionalDistanceOnServise) {
		distanceOnServise += additionalDistanceOnServise;
	}
	
	
	public String isReadyToService () {
		if (distanceOnServise > 8000) {
			return "необходимость обслуживания после 8 тыс. км";
		}
		else
			return "необходимость обслуживания";
	}
			
			
			
			
		
	public int getDistanceOnServise() {
		return distanceOnServise;
	}
	public int getDistance() {
		return distance;
	
		
		
		//метод чинить поломаний мотоцикл
	}
	public void repair() {
		isReadyToDrive = true;
		
	}
	
	
	
	
	//метод руйнує мотоцикл після 200км
	public void destroyEngine() {
		if (distance > 200) {
			isReadyToDrive = false;
		}
		else isReadyToDrive = true;
	}
	
	
	
	
	
	//метод красить мотоцикл
	public void repaint (String repaintColor) {
		this.typeColor = Color.valueOf(repaintColor.toUpperCase());
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", typeColor=" + typeColor + ", engineType=" + engineType + ", isReadyToDrive="
				+ isReadyToDrive + ", distance=" + distance + ", distanceOnServise=" + distanceOnServise + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isReadyToDrive ? 1231 : 1237);
		result = prime * result + ((typeColor == null) ? 0 : typeColor.hashCode());
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
		Motorcycle other = (Motorcycle) obj;
		if (isReadyToDrive != other.isReadyToDrive)
			return false;
		if (typeColor != other.typeColor)
			return false;
		return true;
	}

}
//створити конструктор з полів Пкм -  sourse - generate constructor using Fields - галочка omit call to default
//вивести метод toString ПкМ - sourse - generate toString