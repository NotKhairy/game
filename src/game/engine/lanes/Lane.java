package game.engine.lanes;

import java.util.ArrayList;
import java.util.PriorityQueue;
import game.engine.base.Wall;
import game.engine.titans.Titan;
import game.engine.weapons.Weapon;

public class Lane implements Comparable<Lane>{
	private Wall laneWall;
	private int dangerLevel;

	private final PriorityQueue<Titan> titans;
	private final ArrayList<Weapon> weapons;
	
	public Lane(Wall laneWall) {
		this.laneWall = laneWall;
		this.dangerLevel = 0;
		this.titans = new PriorityQueue<>((titan1, titain2) -> titain2.getDistance() - titan1.getDistance());
		this.weapons = new ArrayList<>();
		
	}

	public int getDangerLevel() {
		return dangerLevel;
	}

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	public Wall getLaneWall() {
		return laneWall;
	}

	public PriorityQueue<Titan> getTitans() {
		return titans;
	}

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}
	public int compareTo(Lane o) {
		 return Integer.compare(this.dangerLevel, o.dangerLevel);
		
	}
	
	
	
	

}
