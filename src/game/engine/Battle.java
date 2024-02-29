package game.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

import game.engine.base.Wall;
import game.engine.lanes.Lane;
import game.engine.titans.Titan;
import game.engine.titans.TitanRegistry;
import game.engine.weapons.factory.WeaponFactory;

public class Battle {
final private int [][] PHASES_APPROACHING_TITANS;
final private int WALL_BASE_HEALTH = 1000;
private int numberOfTurns;
private int resourcesGathered;
private BattlePhase battlePhase;
private int numberOfTitansPerTurn = 1;
private int score;
private int titanSpawnDistance;
final private WeaponFactory weaponFactory;
private HashMap<Integer, TitanRegistry> titansArchives;
final private ArrayList<Titan> approachingTitans;
final private PriorityQueue<Lane> lanes;
final private  ArrayList<Lane> originalLanes;
private int initialNumOfLanes;
private int initialResourcesPerLane;

public Battle(int numberOfTurns, int score, int titanSpawnDistance, int initialNumOfLanes,
int initialResourcesPerLane) throws IOException{
	this.numberOfTurns = numberOfTurns;
	this.score=score;
	this.titanSpawnDistance=titanSpawnDistance;
	this.initialNumOfLanes=initialNumOfLanes;
	this.initialResourcesPerLane=initialResourcesPerLane;
	this.PHASES_APPROACHING_TITANS = null;
	this.weaponFactory = new WeaponFactory();
	this.lanes = new PriorityQueue<>();
	this.originalLanes = new ArrayList<>();
	this.approachingTitans = new ArrayList<>();
	
	
}
public int getNumberOfTitansPerTurn() {
	return numberOfTitansPerTurn;
}
public void setNumberOfTitansPerTurn(int numberOfTitansPerTurn) {
	this.numberOfTitansPerTurn = numberOfTitansPerTurn;
}
public PriorityQueue<Lane> getLanes() {
	return lanes;
}
public ArrayList<Titan> getApproachingTitans() {
	return approachingTitans;
}
public int getNumberOfTurns() {
	return numberOfTurns;
}
public void setNumberOfTurns(int numberOfTurns) {
	this.numberOfTurns = numberOfTurns;
}
public int getResourcesGathered() {
	return resourcesGathered;
}
public void setResourcesGathered(int resourcesGathered) {
	this.resourcesGathered = resourcesGathered;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getTitanSpawnDistance() {
	return titanSpawnDistance;
}
public void setTitanSpawnDistance(int titanSpawnDistance) {
	this.titanSpawnDistance = titanSpawnDistance;
}
private void initializeLanes(int numOfLanes) {
	 for (int i = 0; i < numOfLanes; i++) {
         Lane lane = new Lane(new Wall(WALL_BASE_HEALTH));
         originalLanes.add(lane);
         lanes.add(lane);
     }
}

}
