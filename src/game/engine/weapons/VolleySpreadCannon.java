package game.engine.weapons;

public class VolleySpreadCannon extends Weapon{
	int minRange;
	int maxRange;
	public VolleySpreadCannon(int baseDamage, int minRange, int maxRange) {
		super(baseDamage);
		this.minRange = minRange;
		this.maxRange = maxRange;
		
	}

}
