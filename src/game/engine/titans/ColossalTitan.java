package game.engine.titans;

public class ColossalTitan extends Titan {
	
	public ColossalTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, 
			int speed, int resourcesValue, int dangerLevel) {
		super(baseHealth,baseDamage,heightInMeters,distanceFromBase,speed,resourcesValue,dangerLevel,4);
	}
	
}
