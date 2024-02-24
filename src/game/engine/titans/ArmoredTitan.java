package game.engine.titans;

public class ArmoredTitan extends Titan{
	private static final int TITAN_CODE = 3;
	
	public ArmoredTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, 
			int speed, int resourcesValue, int dangerLevel) {
		super(baseHealth,baseDamage,heightInMeters,distanceFromBase,speed,resourcesValue,dangerLevel);
	}
	public int getTitanCode() {
		return TITAN_CODE;
}
}
