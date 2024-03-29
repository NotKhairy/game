package game.engine.titans;
import game.engine.interfaces.*;

public abstract class Titan implements Comparable<Titan>, Attacker, Attackee, Mobil {
	final private int baseHealth;
	private int currentHealth;
	final private int baseDamage;
	final private int heightInMeters;
	private int distanceFromBase;
	private int speed;
	final private int resourcesValue;
	final private int dangerLevel;
	
	public int getBaseHealth() {
		return baseHealth;
	}
	
	public int getHeightInMeters() {
		return heightInMeters;
	}
	
	public int getDangerLevel() {
		return dangerLevel;
	}
	
	@Override
	public int getDistance() {
		return distanceFromBase;
	}
	@Override
	public int getCurrentHealth() {
		return currentHealth;
	}
	@Override
	public void setCurrentHealth(int health) {
		
		if(health > 0) currentHealth = health;
		else currentHealth = 0;
	}	
	@Override
	public void setDistance(int distance) {
		distanceFromBase = distance;
	}
	@Override
	public int getDamage() {
		return baseDamage;
	}
	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public int getResourcesValue() {
		return resourcesValue;
	}


	@Override
	public int compareTo(Titan o) {
		return this.distanceFromBase - o.distanceFromBase;
	}
	
	
	public Titan(int baseHealth, int baseDamage, int heightInMeters, 
			int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
		this.baseDamage = baseDamage;
		this.heightInMeters = heightInMeters;
		this.distanceFromBase = distanceFromBase;
		this.speed = speed;
		this.resourcesValue = resourcesValue;
		this.dangerLevel = dangerLevel;
	}
	
	
}