package ua.com.foxminded.carmanadger;

public class Tractor implements Serviceable {

	String name;
	private int distance = 0;
	private int distanceOnService = 0;
	

	public Tractor(String name) {
		super();
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "Tractor [name=" + name + ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}


	@Override
	public boolean isReadyToServise() {
		if (distanceOnService > 80) {
			return true;
		}
		else
		return false;
	}

	@Override
	public int getDistanceOnService() {
		return distanceOnService;
	}

	@Override
	public int getDistance() {
		return distance;
	}

	@Override
	public void addDistance(int additionalDistance) {
		distance += additionalDistance;
		addDistanceOnService(additionalDistance);
	}

	@Override
	public void addDistance(double additionalDistance) {
		distance += Math.round(additionalDistance);
		addDistanceOnService(Math.round(additionalDistance));
	}


	@Override
	public void addDistanceOnService(int additoinalDistanceOnService) {
		distanceOnService += additoinalDistanceOnService;
		
	}


	@Override
	public void addDistanceOnService(double additionalDistanceOnService) {
		distanceOnService += additionalDistanceOnService;
	}

}
