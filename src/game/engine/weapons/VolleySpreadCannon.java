package game.engine.weapons;

public class VolleySpreadCannon extends Weapon{
	private int minRange;
	private int maxRange;
	public VolleySpreadCannon(int baseDamage, int minRange, int maxRange) {
		super(baseDamage,3);
		this.minRange = minRange;
		this.maxRange = maxRange;
		
	}
	
	public int getMinRange() {
		return this.minRange;
	}
	public int getMaxRange() {
		return this.maxRange;
	}

}
