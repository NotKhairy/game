package game.engine.titans;
import game.engine.interfaces.*;

public final class Titan implements Comparable, Attackee, Attacker, Mobil{
	private int baseHealth;
	public int getBaseHealth() {
		return baseHealth;
	}
	private int currentHealth = baseHealth;
	private int baseDamage;
	public int getBaseDamage() {
		return baseDamage;
	}
	private int heightInMeters;
	private int distanceFromBase;
	private int speed;
	private int resourcesValue;
	private int dangerLevel;
	
	
	
	private Titan() {}
	
	
	@Override
	public int getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDistance(int distance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrentHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCurrentHealth(int health) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getResourcesValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
