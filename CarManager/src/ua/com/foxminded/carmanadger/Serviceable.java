package ua.com.foxminded.carmanadger;

public interface Serviceable {
	public boolean isReadyToServise(); //створюємо абстрактний метод який вимушений будти у всіх класів які наслідуються
	// абстрактні методи можуть бути лише в авбстрактних класах та вони не мають тіла метода
	 
	 int getDistanceOnService() ;
	 int getDistance();
	 void addDistance (int additionalDistance);
	 void addDistance (double additionalDistance );
	 void addDistanceOnService(int additoinalDistanceOnService);
	 void addDistanceOnService(double additionalDistanceOnService);
	
}
