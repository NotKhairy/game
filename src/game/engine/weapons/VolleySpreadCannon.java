package game.engine.weapons;

public class VolleySpreadCannon extends Weapon{
	public final static int WEAPON_CODE=3;
	private int minRange;
	private int maxRange;
	public VolleySpreadCannon(int baseDamage, int minRange, int maxRange) {
		super(baseDamage);
		this.minRange = minRange;
		this.maxRange = maxRange;
		
	}
	
	public int getMinRange() {
		return this.minRange;
	}
	public int getMaxRange() {
		return this.maxRange;
	}
	public int getWeaponCode() {
		return WEAPON_CODE;
	}

}
