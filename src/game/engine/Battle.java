package game.engine;

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
	
}

}
