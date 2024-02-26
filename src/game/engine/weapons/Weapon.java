package game.engine.weapons;
import game.engine.interfaces.Attacker;
public abstract class Weapon implements Attacker { //Implements 3lshan hwa 2al "A weapon should be able to perform an attack."
	private int baseDamage;
	private final int WEAPON_CODE;
	public Weapon(int baseDamage, int WEAPON_CODE) {
		this.baseDamage = baseDamage;
		this.WEAPON_CODE = WEAPON_CODE;
	}

	@Override
	public int getDamage() {
		return this.baseDamage;
	}
	
	public int getWeaponCode() {
		return WEAPON_CODE;
	}

}
