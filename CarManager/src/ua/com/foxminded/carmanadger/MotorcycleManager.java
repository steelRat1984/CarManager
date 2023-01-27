package ua.com.foxminded.carmanadger;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleManager {

	public static void main(String[] args) {
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000" , 2021 , 16000 , 600 , " black" , "diesel" , true );
		Motorcycle yamaha = new Motorcycle("Yamaha  FZ1" , 2007 , 9000 , 700, "orangE " , "gas" , false);
		List<Motorcycle> motorcycle = new ArrayList<>();
		motorcycle.add(yamaha);
		motorcycle.add(suzuki);
		suzuki.addDistance(25000);
		suzuki.addDistance(11.5f);
		
		yamaha.addDistance(25000);
		yamaha.addDistance(-11.5f);
		
		suzuki.destroyEngine();
		yamaha.destroyEngine();
		
		
		suzuki.repair();
		yamaha.repair();
		
		yamaha.repaint("Black");
		
		
		
		
//		System.out.println(suzuki);
//		System.out.println(yamaha);
//		System.out.println(suzuki.equals(yamaha));
		System.out.println(suzuki.isReadyToService());
		System.out.println(motorcycle);
		
	
		
	}
}
	