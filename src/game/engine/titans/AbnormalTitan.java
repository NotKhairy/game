package game.engine.titans;

public class AbnormalTitan extends Titan{
	
	public AbnormalTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, 
			int speed, int resourcesValue, int dangerLevel) {
		super(baseHealth,baseDamage,heightInMeters,distanceFromBase,speed,resourcesValue,dangerLevel);
		this.TITAN_CODE = 2;
	}
}
