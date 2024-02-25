package game.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

import game.engine.lanes.Lane;
import game.engine.titans.Titan;
import game.engine.titans.TitanRegistry;
import game.engine.weapons.factory.WeaponFactory;

public class Battle {
private int [][] PHASES_APPROACHING_TITANS;
private int WALL_BASE_HEALTH;
private int numberOfTurns;
private int resourcesGathered;
private BattlePhase battlePhase;
private int numberOfTitansPerTurn;
private int score;
private int titanSpawnDistance;
private WeaponFactory weaponFactory;
private HashMap<Integer, TitanRegistry> titansArchives;
private ArrayList<Titan> approachingTitans;
private PriorityQueue<Lane> lanes;
private  ArrayList<Lane> originalLanes;

Battle(int numberOfTurns, int score, int titanSpawnDistance, int initialNumOfLanes,
int initialResourcesPerLane) throws IOException{
	this.numberOfTurns = numberOfTurns;
	this.score=score;
	this.titanSpawnDistance=titanSpawnDistance;
	this.initialNumOfLanes=initialNumOfLanes;
	this.initialResourcesPerLane=initialResourcesPerLane;
	
	
}
private void initializeLanes(int numOfLanes) {
	//note
}

}
