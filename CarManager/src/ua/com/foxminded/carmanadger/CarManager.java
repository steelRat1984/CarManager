package ua.com.foxminded.carmanadger;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		Car toyotaPrius = new PassangerCar("Toyota Prius", 2008, 15000, 1200, String.valueOf(Color.BLACK));

		Car renaultLaguna = new Bus("Renault Laguna", 2000, 9700, 1600, String.valueOf(Color.BLUE));
		Car renaultLaguna2 = new Bus("Renault Laguna", 2000, 9700, 1600, String.valueOf(Color.BLUE));
		toyotaPrius.addDistance(500);
		toyotaPrius.addDistance(15000);
		toyotaPrius.addDistance(20.6);
		renaultLaguna.addDistance(15000);
		toyotaPrius.servise();
		toyotaPrius.addDistance(30);
		toyotaPrius.addDistance(50.6);
		toyotaPrius.addDistance(10000);
		renaultLaguna.addDistance(50000);

		List<Car> cars = new ArrayList<>();//створюэмо колекцію ArrayList cars
		cars.add(toyotaPrius);// додаємо до нашої коелкції
		cars.add(renaultLaguna);
		cars.add(renaultLaguna2);

//		System.out.println(toyotaPrius);
//		System.out.println(renaultLaguna);
//		System.out.println(toyotaPrius.equals(renaultLaguna2));
//		System.out.println(renaultLaguna.equals(renaultLaguna2));// метод equals() для того щоб зрівнювати обєкти
//		System.out.println(toyotaPrius.isReadyToServise());
//		System.out.println(renaultLaguna.isReadyToServise());

		Tractor tractor = new Tractor("Тарас");
		tractor.addDistance(50);
		tractor.addDistance(50.6);

//		System.out.println(tractor);
//		System.out.println(tractor.isReadyToServise());
		System.out.println(cars);

	}
}
